package org.sh4pe.euler.problems

import org.sh4pe.euler.lib.Problem
import scala.math.pow

class P6 extends Problem {
  def calcResult : Long = {
    val inputSeq = 1l to 100l
    val squares = inputSeq.map( (x: Long) => x*x )

    pow(inputSeq.sum, 2).toLong - squares.sum
  }

  override def run(args: Array[String]): Unit = {
    println(f"Result: ${calcResult}")
  }
}
