package pl.japila.scalania.s99

object S99_P13 {
  /**
   * Implement the so-called run-length encoding data compression method directly, i.e.
   * don't use other methods you've written (like P09's pack); do all the work directly.
   *
   * scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
   * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
   */
  def encodeDirect[T](ts: Seq[T]): Seq[(Int, T)] = {
    def encodeDirectAcc[T](ts: Seq[T], current: (Int, T), acc: Seq[(Int, T)]): Seq[(Int, T)] = {
      if (ts.isEmpty)
        current +: acc
      else if (ts.head == current._2)
        encodeDirectAcc(ts.tail, (current._1 + 1, current._2), acc)
      else
        encodeDirectAcc(ts.tail, (1, ts.head), current +: acc)
    }

    if (ts.isEmpty)
      Nil
    else
      encodeDirectAcc(ts.tail, (1, ts.head), Nil).reverse
  }


}
