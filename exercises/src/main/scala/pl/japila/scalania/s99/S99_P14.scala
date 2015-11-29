package pl.japila.scalania.s99

object S99_P14 {
  def duplicate[T](ts: Seq[T]): Seq[T] = duplicate(ts, Nil)

  def duplicate[T](ts: Seq[T], acc: Seq[T]): Seq[T] =
    if (ts.isEmpty)
      acc.reverse
    else
      duplicate(ts.tail, ts.head+:ts.head+:acc)

}
