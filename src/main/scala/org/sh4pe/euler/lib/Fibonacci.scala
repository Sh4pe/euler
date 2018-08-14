package org.sh4pe.euler.lib

class Fibonacci(var last: Long, var current: Long) extends Iterator[Long] {

  def hasNext = true

  def next : Long = {
    val nxt = last + current
    last = current
    current = nxt
    nxt
  }
}
