package pl.japila.scalania.s99

import scala.util.{ Failure, Success, Try }

object S99_P01 {
  def last[T](ts: Seq[T]): Try[T] = {
    ts match {
      case Nil => Failure(new NoSuchElementException)
      case lastElem :: Nil => Success(lastElem)
      case list :: _ => last(ts.tail)
    }
  }

  def main(args: Array[String]) {
    val list = 1 :: 2 :: 3 :: 4 :: Nil
    print(last(list))
  }
}
