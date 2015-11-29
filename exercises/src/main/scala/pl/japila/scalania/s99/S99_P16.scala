package pl.japila.scalania.s99

object S99_P16 {
  def drop[T](n: Int, ts: Seq[T]): Seq[T] = drop(n-1, n-1, ts, Nil)

  def drop[T](n: Int, i: Int, ts: Seq[T], acc: Seq[T]): Seq[T] =
    if (ts.isEmpty)
      acc.reverse
    else if (i == 0)
      drop(n, n, ts.tail, acc)
    else
      drop(n, i - 1, ts.tail, ts.head +: acc)

}
