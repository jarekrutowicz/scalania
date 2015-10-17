package pl.japila.scalania.s99

object S99_P07 {
  def flatten(ls: Seq[Any]): Seq[Any] = ???

  def flattenAcc(ls: Seq[Any], acc: Seq[Any]) : Seq[Any] = {
    if (ls.isEmpty) {
      acc
    }
    else {
      ls.head match {
        case s : Seq[Any] => flattenAcc(ls.tail, flattenAcc(s, acc)  )
        case elem : Any => flattenAcc(ls.tail, elem+:acc)
      }
    }
  }


  def main(args: Array[String]) {

  }
}