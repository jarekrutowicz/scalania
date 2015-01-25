package pl.japila.scalania.s99

object S99_P10 {
  def encode[T](ts: Seq[T]): Seq[(Int, T)] =
    encodeAcc(ts, Option.empty[(Int, T)], Nil)

  def encodeAcc[T](ts: Seq[T], current:Option[(Int, T)], acc:Seq[(Int, T)]) : Seq[(Int, T)] =
    if (ts.isEmpty) {
      val result = if (current.isEmpty) acc else current.get +: acc
      result.reverse
    } else{
      if (current.isEmpty) {
        encodeAcc(ts.tail, Option((1, ts.head)), acc)
      } else {
        val currentValue = current.get
        if (currentValue._2 == ts.head) {
          encodeAcc(ts.tail, Option((currentValue._1 + 1, currentValue._2)), acc)
        } else {
          encodeAcc(ts, Option.empty[(Int, T)], currentValue+:acc)
        }
      }
    }
}
