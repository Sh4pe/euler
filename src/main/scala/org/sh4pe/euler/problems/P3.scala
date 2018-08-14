package org.sh4pe.euler.problems

import org.sh4pe.euler.lib.{Problem, PrimeFactors}

class P3 extends Problem {
  def calcResult : Long = {
    PrimeFactors.of(600851475143l).toList.last
  }

  override def run(args: Array[String]): Unit = {
    println(f"Result: ${calcResult}")
  }
}
