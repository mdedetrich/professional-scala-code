package com.professionalscala.ch1

case class ApiKey(id: String) extends AnyVal

class AnyValAnyRef extends App {

  case class Example(s: String)
  Example("test") == Example("test") // returns true
  val a = Example("test")
  val b = Example("test")
  a == b // Also returns true
  class Example2(s:String)
  val c = new Example2("test")
  val d = new Example2("test")
  c == d // Returns false
}
