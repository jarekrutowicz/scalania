package pl.japila.scalania.s99

import org.specs2.mutable._
import S99_P17.split

object P17Spec extends Specification {
  "P17 solution" should {
    "P17 solution" should {
      "Split a list into two parts." in {
        val expected = split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
        expected._1 === List('a, 'b, 'c)
        expected._2 === List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
      }
    }
    "Return work for 0 case" in {
      val expected = split(0, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      expected._1 === List()
      expected._2 === List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    }
  }
}