package org.sh4pe.euler.lib

import org.scalatest.FunSuite

class PrimeIteratorTest extends FunSuite {
  test("PrimeIterator") {
    val pi = PrimeIterator.create()
    val piSeq = pi.take(10).toSeq
    assert(piSeq.toList === List(2,3,5,7,11,13,17,19,23,29))
  }
}
