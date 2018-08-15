package org.sh4pe.euler.problems

import org.scalatest.FunSuite

class P4Test extends FunSuite {
  private val problem = new P4

  test("P1.calcResult") {
    assert(problem.calcResult === 906609)
  }
}
