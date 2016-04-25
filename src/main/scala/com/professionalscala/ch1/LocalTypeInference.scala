package com.professionalscala.ch1

object LocalTypeInference extends App {
  def doSomething(input: String) = {
    val l = List(1,3,5)
    val summed = l.sum
    val asString = summed.toString + input
    asString.toUpperCase
  }
}
