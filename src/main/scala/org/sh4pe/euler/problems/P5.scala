package org.sh4pe.euler.problems

import org.sh4pe.euler.lib.{Problem, PrimeFactors}
import scala.math.{max,pow}

class P5 extends Problem {
  def calcResult : Long = {
    val primeFactors = (2 to 20).map(PrimeFactors.frequencies(_))
    val combinedFactors = primeFactors.reduce((m1, m2) => {
      var res = m1
      m2.keySet.diff(m1.keySet).foreach( k => {
        res = res + (k -> m2(k))
      })
      m2.keySet.intersect(m1.keySet).foreach( k => {
        res = res + (k -> max(m1(k), m2(k)))
      })
      res
    })
    combinedFactors.foldLeft(1l)( (acc, p) => acc*pow(p._1,p._2).toLong )
  }

  override def run(args: Array[String]): Unit = {
    println(f"Result: $calcResult")
  }
}
