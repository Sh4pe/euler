package org.sh4pe.euler.problems

import org.sh4pe.euler.lib.{Problem, Palindrome}

class P4 extends Problem {
  def calcResult : Int = {
    val pairs = for (a <- 999 to 100 by -1; b <- (a-1) to 100 by -1 ) yield (a,b)
    val products = pairs.map(t => t._1 * t._2)
    val palindromes = products.filter(Palindrome.isPalindromic(_)).toSeq
    palindromes.max
  }

  override def run(args: Array[String]): Unit = {
    println(f"Result: ${calcResult}")
  }
}
