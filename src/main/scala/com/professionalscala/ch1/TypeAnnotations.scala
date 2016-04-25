package com.professionalscala.ch1

object TypeAnnotations extends App {
  val s: String = ??? // type definition on variable declaration
  def doSomething(s: String) = ??? // type definition in a parameter
  def doSomething: String = ??? // type definition for return type of a function
  class SomeClass(s: String) // type definition in a class constructor definition
  type MyString = String // type aliasing
}
