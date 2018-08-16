package org.sh4pe.euler.problems

import org.scalatest.FunSuite

class P7Test extends FunSuite {
  private val problem = new P7

  test("P7.calcResult") {
    assert(problem.calcResult === 104743)
  }
}
