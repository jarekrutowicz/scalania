package pl.japila.scalania.s99

import scala.util.Try

object S99_P02 {

  def penultimate[T](ts: Seq[T]): Option[T] = {
    Try(ts.reverse.tail.headOption).getOrElse(None)
  }

  def penultimate2[T](ts: Seq[T]): Option[T] = ts match {
    case _ :: _ => ts.reverse.tail.headOption
    case Seq() => None
  }

  def penultimate3[T](ts: Seq[T]): Option[T] = {
    ts match {
      case Nil => None
      case el +: Nil => None
      case el1 +: el2 +: Nil => Some(el1)
      case _ => penultimate3(ts.tail)
    }
  }

}
