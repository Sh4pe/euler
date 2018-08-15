package org.sh4pe.euler.lib

import org.scalatest.FunSuite

class PrimeFactorsTest extends FunSuite {

  test("PrimeFactors cannot be constructed for values <= 1") {
    assertThrows[AssertionError] { PrimeFactors.of(-1) }
    assertThrows[AssertionError] { PrimeFactors.of(0) }
    assertThrows[AssertionError] { PrimeFactors.of(1) }
    PrimeFactors.of(2)
  }

  test("PrimeFactors.factorize") {
    assert(PrimeFactors.factorize(2) == (2,1))
    assert(PrimeFactors.factorize(3) == (3,1))
    assert(PrimeFactors.factorize(4) == (2,2))
    assert(PrimeFactors.factorize(5) == (5,1))
    assert(PrimeFactors.factorize(6) == (2,3))
  }

  test("PrimeFactors iterator") {
    assert(PrimeFactors.of(5).toList === List(5))
    assert(PrimeFactors.of(6).toList === List(2,3))
    assert(PrimeFactors.of(7).toList === List(7))
    assert(PrimeFactors.of(8).toList === List(2,2,2))
  }

  test("PrimeFactors.frequencies") {
    assert(PrimeFactors.frequencies(5) === Map(5 -> 1))
    assert(PrimeFactors.frequencies(6) === Map(2 -> 1, 3 -> 1))
    assert(PrimeFactors.frequencies(7) === Map(7 -> 1))
    assert(PrimeFactors.frequencies(8) === Map(2 -> 3))
    assert(PrimeFactors.frequencies(12) === Map(2 -> 2, 3 -> 1))
  }
}
