package org.sh4pe.euler.problems

import org.sh4pe.euler.lib.{Problem, Fibonacci}

class P2 extends Problem {
  def calcResult : Long = {
    val fib = new Fibonacci(1,2)
    fib.takeWhile(_ < 4000000).filter(_ % 2 == 0).sum + 2
  }

  override def run(args: Array[String]): Unit = {
    println(f"Result: ${calcResult}")
  }
}
