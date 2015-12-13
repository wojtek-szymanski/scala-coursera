val x: Rational = new Rational(1, 3)
x.numer
x.denom

val y = new Rational(5, 7)
x + y

val z = new Rational(3, 2)
x.sub(z)

x.sub(y).sub(z)

x.less(y)
x.max(y)

x max y

//val strange = new Rational(1, 0)
//strange.add(strange)

new Rational(2)

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be nonzero")

  def this(x: Int) = this(x, 1)

  val numer = x / gcd(x, y)
  val denom = y / gcd(x, y)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  private def neg = new Rational(-numer, denom)

  def + (that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def sub(that: Rational) = this + that.neg

  def less(that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if (this.less(that)) that else this

  override def toString = numer + "/" + denom

}