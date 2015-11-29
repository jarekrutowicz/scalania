package pl.japila.scalania.s99

object S99_P15 {
  def duplicateN[T](n: Int, ts: Seq[T]): Seq[T] = duplicateN(n, n, ts, Nil)

  def duplicateN[T](n: Int, i: Int, ts: Seq[T], acc: Seq[T]): Seq[T] =
    if (ts.isEmpty)
      acc.reverse
    else {
      if (i > 0)
        duplicateN(n, i-1, ts, ts.head+:acc)
      else
        duplicateN(n, n, ts.tail, acc)
    }
}
