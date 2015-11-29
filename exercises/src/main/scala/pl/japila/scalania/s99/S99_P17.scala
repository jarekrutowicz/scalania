package pl.japila.scalania.s99

object S99_P17 {
  def split[T](n: Int, ts: Seq[T]): (Seq[T], Seq[T]) =
    split(n, 0, ts, Nil, Nil)

  def split[T](n: Int, i: Int, ts: Seq[T], acc1: Seq[T], acc2: Seq[T]): (Seq[T], Seq[T]) =
    if (ts.isEmpty)
      (acc1.reverse, acc2.reverse)
    else if (i < n)
      split(n, i+1, ts.tail, ts.head +: acc1, acc2)
    else
      split(n, i+1, ts.tail, acc1, ts.head +: acc2)
}
