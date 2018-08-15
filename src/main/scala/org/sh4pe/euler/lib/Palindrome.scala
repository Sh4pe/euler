package org.sh4pe.euler.lib

object Palindrome {
  def isPalindromic(n: Long) : Boolean = {
    assert(n > 0)

    val nStr = n.toString()
    nStr == nStr.reverse
  }
}
