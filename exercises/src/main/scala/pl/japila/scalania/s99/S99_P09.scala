package pl.japila.scalania.s99

object S99_P09 {
  def pack[T](ts: Seq[T]): Seq[Seq[T]] = {
    packAcc(ts, Nil, Nil)
  }

  def packAcc[T](ts: Seq[T], currentSeq:Seq[T], acc: Seq[Seq[T]]): Seq[Seq[T]] =
    if (ts.isEmpty) {
      val result = if (currentSeq.isEmpty) acc else currentSeq +: acc
      result.reverse
    }
    else {
      if (currentSeq.isEmpty) {
        packAcc(ts.tail, Seq(ts.head), acc)
      }
      else {
        if (currentSeq.head == ts.head) {
          packAcc(ts.tail, ts.head +: currentSeq, acc)
        } else {
          packAcc(ts, Nil, currentSeq +: acc)
        }
      }
    }

}
