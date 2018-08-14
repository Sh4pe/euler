package org.sh4pe.euler.problems

import org.scalatest.FunSuite

class P3Test extends FunSuite {
  val problem = new P3
  test("P3.calcResult") {
    assert(problem.calcResult === 6857)
  }
}
