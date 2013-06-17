package ftp

/**
 * User: Julia Astakhova
 * Date: 5/31/13
 */
object Session {

  def main(ss: Array[String]) {
    def abs(x:Double) = if (x < 0) -x else x

    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def isGoodEnough(guess: Double, x: Double) =
      abs(guess*guess - x) < 0.001*Math.min(guess, x)

    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2

    def sqrt(x: Double) = println(sqrtIter(1.0, x))

    sqrt(2)
    sqrt(4)
    sqrt(1e-6)
    sqrt(1e60)
  }
}
