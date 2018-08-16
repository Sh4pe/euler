package org.sh4pe.euler.problems

import org.sh4pe.euler.lib.{PrimeIterator, Problem}

class P7 extends Problem {
  def calcResult : Long = {
    PrimeIterator.create().take(10001).toSeq.last
  }

  override def run(args: Array[String]): Unit = {
    println(f"Result: $calcResult")
  }
}
