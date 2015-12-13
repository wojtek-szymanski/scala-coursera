package demo

class Currying {

  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int = {
      if (a > b) 0 else f(a) + sumF(a + 1, b)
    }
    sumF
  }

  def sumInline(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sumInline(f)(a + 1, b)

  def sumInts = sum(x => x)

  def sumCubes = sum(cube)

  def cube(x: Int): Int = x * x * x;

  //  def product(a: Int, b: Int): Int = {
  //    if (a > b) 1 else a * product(a+1, b);
  //  }

  //  def product(f: Int => Int)(a: Int, b: Int): Int = {
  //    if (a > b) 1 else f(a) * product(f)(a + 1, b);
  //  }

  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)

  def fact(n: Int) = product(x => x)(1, n);

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
  }
}
