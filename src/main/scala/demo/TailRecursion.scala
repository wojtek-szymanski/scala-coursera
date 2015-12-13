package demo

import scala.annotation.tailrec

class TailRecursion {

  @tailrec
  final def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  def factorial(n: Int): Int = {
    if (n == 0) 1 else n * factorial(n - 1);
  }
  
  def factorialTailRecursive(n: Int): Int = {
    @tailrec
    def loop(acc: Int, n: Int): Int = {
      if (n == 0) acc else loop(acc * n, n - 1)
    }
    loop(1, n);
  }
}
