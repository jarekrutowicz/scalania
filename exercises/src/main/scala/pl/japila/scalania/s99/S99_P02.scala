package pl.japila.scalania.s99

object S99_P02 {
  def penultimate[T](ts: Seq[T]): Option[T] = {
    ts match {
      case Nil => None
      case el :: Nil => None
      case el1 :: el2 :: Nil => Some(el1)
      case _ => penultimate(ts.tail)
    }
  }

  def main(args: Array[String]) {
    val list = 1 :: 1 :: 2 :: 3 :: 4 :: 5 :: 8 :: Nil
    print(penultimate(list))
  }
}
