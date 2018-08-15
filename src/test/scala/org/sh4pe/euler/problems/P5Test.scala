package org.sh4pe.euler.problems

import org.scalatest.FunSuite

class P5Test extends FunSuite {
  private val problem = new P5

  test("P1.calcResult") {
    assert(problem.calcResult === 232792560)
  }
}
