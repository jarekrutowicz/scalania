package pl.japila.scalania.s99

object S99_P04 {
  def length2[T](ts: Seq[T]): Int = ts.length

  def length[T](ts: Seq[T]): Int = length(ts, 0)

  def length[T](ts: Seq[T], len: Int): Int =
    ts match {
      case Nil => len
      case _ => length(ts.tail, len + 1)
    }

}
