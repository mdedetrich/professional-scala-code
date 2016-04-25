package com.professionalscala.ch1

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object Http {
  def get(s: String) = Future { "some response" }
}

object PatternMatching extends App {
  sealed abstract class SomeRepresentation
  case class NumberRepr(number: Double) extends SomeRepresentation
  case class StringRepr(s: String) extends SomeRepresentation
  val s: SomeRepresentation = NumberRepr(998534)

  s match {
    case NumberRepr(n) if n > 10 => println("number is greater than 10, number is $n")
    case NumberRepr(n) => println("number is not greater than 10, number is $n")
    case StringRepr(s) => println("is a string, value is $s")
  }

  val l: List[Any] = ??? // List of values/references of any possible type
  l.collect{
    case i: Int if i % 2 == 0 => i
    case s: String => s.length
  }

  val param: Option[String] = ???
  param match {
    case Some(s) => "parameter found, its value is $s"
    case None => "no parameter is found"
  }

  import scala.concurrent.Future
  val parameter: Option[String] = ???
  val httpCall: Future[String] = parameter match {
    case Some(s) => Http.get("/api/doSomething/$s")
    case None => Future("No parameter supplied")
  }

}
