package org.sh4pe.euler.lib

import org.scalatest.FunSuite

class PalindromeTest extends FunSuite {
  test("Palindrome.isPalindromic") {
    assert(Palindrome.isPalindromic(1))
    assert(Palindrome.isPalindromic(9))
    assert(!Palindrome.isPalindromic(10))
    assert(Palindrome.isPalindromic(101))
  }
}
