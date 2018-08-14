package org.sh4pe.euler.lib

import scala.math.sqrt

class PrimeFactors(var smallestFactor: Long, var rest: Long) extends Iterator[Long] {

  def hasNext : Boolean = rest > 0

  def next : Long = {
    val ret = smallestFactor
    if (rest == 1) {
      smallestFactor = 1
      rest = 0
    } else {
      val (newSmallestFactor, newRest) = PrimeFactors.factorize(rest)
      smallestFactor = newSmallestFactor
      rest = newRest
    }
    ret
  }
}

object PrimeFactors {
  def of(n : Long) : PrimeFactors = {
    assert(n > 1, "Cannot calculate prime factors of numbers <= 1")
    val (a,b) = factorize(n)
    new PrimeFactors(a,b)
  }

  // returns the smallest prime factor and quotient
  def factorize(n : Long) : (Long, Long) = {
    if (n % 2 == 0) {
      (2, n / 2)
    } else if (n % 3 == 0) {
      (3, n / 3)
    } else {
      val upperBound : Long = sqrt(n).toLong
      (5l to upperBound by 2l).find( n % _ == 0) match {
        case Some(x) => (x, n / x)
        case None => (n, 1)
      }
    }
  }
}
