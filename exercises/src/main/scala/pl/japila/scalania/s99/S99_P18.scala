package pl.japila.scalania.s99

object S99_P18 {
  def slice[T](from: Int, to: Int, ts: Seq[T]): Seq[T] = {

    def sliceAcc(i: Int, inTs: Seq[T], acc: Seq[T]): Seq[T] =
      if (inTs.isEmpty | i > to)
        acc.reverse
      else {
        val newAcc = if (i <= from) acc else inTs.head +: acc
        sliceAcc(i+1, inTs.tail, newAcc)
      }

    sliceAcc(1, ts , Nil)
  }

  def main(args: Array[String]) {
    val actual = slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    println(actual)
  }
}
