package pl.japila.scalania.s99

object S99_P12 {
  def decode[T](its: Seq[(Int, T)]): Seq[T] = {
    def decodeAcc[T](its: Seq[(Int, T)], acc: Seq[T]): Seq[T] =
      if (its.isEmpty)
        acc
      else {
        if (its.head._1 == 1)
          decodeAcc(its.tail, its.head._2+:acc)
        else
          decodeAcc((its.head._1-1, its.head._2)+:its.tail, its.head._2+:acc)
      }

      decodeAcc(its, Nil).reverse
  }

  object Solution2 { // jacek laskowski
    def decode[T](its: Seq[(Int, T)]): Seq[T] = its.flatMap(e => List.fill(e._1)(e._2))
  }
}
