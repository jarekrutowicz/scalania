package pl.japila.scalania.s99

object S99_P19 {
  def rotate[T](n: Int, ts: Seq[T]): Seq[T] = {

    if (ts.isEmpty)
      ts
    else {
      def slice[T] = S99_P17.split[T] _

      val modN = n % ts.length
      val signN = if (modN >= 0) modN else ts.length + modN

      val slices = slice(signN, ts)
      slices._2 ++ slices._1 // concat should be O(n)
    }
  }

}
