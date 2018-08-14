package org.sh4pe.euler.problems

import org.scalatest.FunSuite

class P1Test extends FunSuite {
  private val problem = new P1

  test("P1.calcResult") {
    assert(problem.calcResult === 233168)
  }
}
