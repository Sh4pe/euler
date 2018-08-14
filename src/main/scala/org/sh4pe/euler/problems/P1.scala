package org.sh4pe.euler.problems

import org.sh4pe.euler.lib.Problem

class P1 extends Problem {
  def calcResult : Int = {
    val numbers = (3 to 1000 by 3).toSet union (5 to 999 by 5).toSet
    numbers.sum
  }

  override def run(args: Array[String]): Unit = {
    println(f"Result: ${calcResult}")
  }
}
