package pl.japila.scalania.s99

import scala.util.{ Failure, Success, Try }

object S99_P01 {

  def last[T](ts: Seq[T]): Try[T] = Try(ts.last)

  def last2[T](ts: Seq[T]): Try[T] = {
    ts match {
      case Nil => Failure(new NoSuchElementException)
      case lastElem+:Nil => Success(lastElem)
      case elem+: _ => last2(ts.tail)

    }
  }


}
