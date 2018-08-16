package org.sh4pe.euler.lib

/** Infinite iterator that iterates over all primes
  *
  * @param current Starting prime number
  */
class PrimeIterator(var current: Long) extends Iterator[Long] {
  override def hasNext: Boolean = true

  override def next(): Long = {
    if (current == 2) {
      val res = current
      current = 3
      res
    }
    else {
      val res = current
      var candidate = current + 2
      while (!PrimeFactors.isPrime(candidate)) {
        candidate += 2
      }
      current = candidate
      res
    }
  }
}

object PrimeIterator {
  def create() : PrimeIterator = {
    new PrimeIterator(2)
  }
}
