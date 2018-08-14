package org.sh4pe.euler.problems

import org.scalatest.FunSuite

class P2Test extends FunSuite {
  val problem = new P2

  test("P2.calcResult") {
    assert(problem.calcResult === 4613732)
  }
}
