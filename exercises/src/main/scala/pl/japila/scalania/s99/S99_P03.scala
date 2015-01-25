package pl.japila.scalania.s99

import scala.Option._

object S99_P03 {
  def nth2[T](n: Int, ts: Seq[T]): Option[T] = {
    if (n < 0 | ts.isEmpty)
      empty
    else if (n == 0)
      ts.headOption
    else
      nth(n - 1, ts.tail)
  }

  def nth[T](n: Int, ts: Seq[T]): Option[T] =
    if (n < 0)
      None
    else
      ts.drop(n).headOption
}
