package pl.japila.scalania.s99

import scala.util.Try

object S99_P03 {

  def nth[T](n: Int, ts: Seq[T]): Option[T] =
    if (n < 0 || ts.isEmpty)
      None
    else if (n == 0)
      ts.headOption
    else
      nth(n-1, ts.tail)

  def nth2[T](n: Int, ts: Seq[T]): Option[T] =
    Try(Some(ts(n))).getOrElse(None)

  /*
  // jacek
  def nth[T](n: Int, ts: Seq[T]): Option[T] = (n, ts) match {
    case (0, h :: _) => Some(h)
    case (_, _ :: tail) => nth(n - 1, tail)
    case (_, Nil) => None
  }
   */
}
