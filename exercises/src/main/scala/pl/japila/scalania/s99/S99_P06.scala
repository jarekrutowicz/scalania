package pl.japila.scalania.s99

object S99_P06 {
  def isPalindrome[T](ts: Seq[T]): Boolean = {
    val pal = ts.splitAt(ts.length / 2)
    val pLeft = pal._1
    val pRight =
      if (pLeft.length == pal._2.length)
        pal._2.reverse
      else
        pal._2.tail.reverse
    pLeft.equals(pRight)
  }

}
