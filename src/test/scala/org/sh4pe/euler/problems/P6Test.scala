package org.sh4pe.euler.problems

import org.scalatest.FunSuite

class P6Test extends FunSuite {
  private val problem = new P6

  test("P6.calcResult") {
    assert(problem.calcResult === 25164150)
  }
}
