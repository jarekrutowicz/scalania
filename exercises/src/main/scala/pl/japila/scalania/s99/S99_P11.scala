package pl.japila.scalania.s99

object S99_P11 {
  def encodeModified[T](ts: Seq[T]): Seq[Any] =
    if (ts.isEmpty)
      Nil
    else
      encodeModifiedAcc(ts.tail, (1, ts.head), Nil).reverse

  def encodeModifiedAcc[T](ts: Seq[T], current: (Int, T), acc: Seq[Any]): Seq[Any] =
    if (ts.isEmpty)
      current +: acc
    else if (ts.head == current._2)
      encodeModifiedAcc(ts.tail, (current._1 + 1, current._2), acc)
    else {
      val newElem : Any = if (current._1 == 1) current._2 else current
      encodeModifiedAcc(ts.tail, (1, ts.head), newElem +: acc)
    }
}
