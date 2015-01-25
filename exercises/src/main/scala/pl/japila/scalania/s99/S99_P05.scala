package pl.japila.scalania.s99

object S99_P05 {
  def reverse2[T](ts: Seq[T]): Seq[T] =
    ts.reverse

  def reverse[T](ts: Seq[T]): Seq[T] = reverseAcc(ts, Seq.empty[T])

  def reverseAcc[T](ts: Seq[T], rev: Seq[T]): Seq[T] =
    ts match {
      case Nil => rev
      case _ => reverseAcc(ts.tail, ts.head +: rev)
    }

}
