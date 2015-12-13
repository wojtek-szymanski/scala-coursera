package demo

import org.scalatest.FlatSpec

class TailRecursionTest extends FlatSpec {

  val tailRecursion = new TailRecursion

  "gcd for 2 and 4" should "return 2" in {
    assert(tailRecursion.gcd(4, 2) == 2)
  }

  "3!" should "return 6" in {
    assert(tailRecursion.factorial(3) == 6)
  }

  "Tail recursive 3!" should "return 6" in {
    assert(tailRecursion.factorialTailRecursive(3) == 6)
  }
}
