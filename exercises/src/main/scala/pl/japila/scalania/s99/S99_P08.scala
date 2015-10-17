package pl.japila.scalania.s99

object S99_P08 {

  def compress[T](ts: Seq[T]): Seq[T] =
    compressAcc(ts, Nil)

  def compressAcc[T](ts: Seq[T], acc: List[T]): Seq[T] =
    if (ts.isEmpty)
      acc.reverse.toSeq
    else if (!acc.isEmpty && ts.head == acc.head)
      compressAcc(ts.tail, acc)
    else
      compressAcc(ts.tail, ts.head :: acc)


  object SimpleNoTailRecSolution {
    def compress[T](ts: Seq[T]): Seq[T] =
      if (ts.isEmpty || ts.tail.isEmpty)
        ts
      else if (ts.head == ts.tail.head)
        compress(ts.tail)
      else
        ts.head +: compress(ts.tail)
  }

}
