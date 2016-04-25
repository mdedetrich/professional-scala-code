package com.professionalscala.ch1

object ForComprehension extends App {
  import scala.util._
  def firstTry: Try[String] = Success { "first response" }
  def secondTry(string: String): Try[Int] = Failure { new
      IllegalArgumentException(s"Invalid length ${string.length}")
  }
  def finalTry(int: Int): Try[String] = Success { int.toString }
  firstTry.map{result =>
    s"value from firstResult: $result"
  }.flatMap{anotherResult =>
    secondTry(anotherResult).map{finalResult =>
      finalTry(finalResult).map(_.toUpperCase)
    }
  }

  for {
    result <- firstTry
    anotherResult = s"value from firstResult: $result"
    secondResult <- secondTry(anotherResult)
    finalResult <- finalTry(secondResult)
  } yield finalResult.toUpperCase()

  for (i <- 1 to 10000 if i % 2 == 0 ) yield i

  (1 to 10000).withFilter(i => i % 2 == 0)

}
