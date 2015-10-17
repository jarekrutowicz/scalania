package pl.japila.scalania.s99

object S99_P10 {

  def encode[T](ts: Seq[T]): Seq[(Int, T)] =
    if (ts.isEmpty)
      Nil
    else
      encodeAcc(ts.tail, (1, ts.head), Nil)

  def encodeAcc[T](ts: Seq[T], current: (Int, T), acc: Seq[(Int, T)]): Seq[(Int, T)] = {
    val reversedResult =
      if (ts.isEmpty)
        current+:acc
      else if (ts.head == current._2)
        encodeAcc(ts.tail, (current._1+1, current._2), acc)
      else
        encodeAcc(ts.tail, (1, ts.head), current+:acc)

    reversedResult.reverse
  }

}
