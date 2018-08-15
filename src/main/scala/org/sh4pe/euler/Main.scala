package org.sh4pe.euler

import org.sh4pe.euler.problems._

object Main extends App {
  val problems = Map(
    "1" -> new P1,
    "2" -> new P2,
    "3" -> new P3,
    "4" -> new P4,
    "5" -> new P5,
  )

  if (args.length == 0) {
    println("Which problem should I run?")
  } else {
    val problemName = args(0)
    problems.get(problemName) match {
      case Some(problem) => problem.run(args.drop(1))
      case None => {
        println(f"I don't know problem '$problemName'")
        sys.exit(1)
      }
    }
  }
}