package com.professionalscala.ch1

object ManualTypeInference extends App {
  def doSomething(input: String): String = {
    val l: List[Int] = List(1,3,5)
    val summed: Int = l.sum
    val asString: String = summed.toString + input
    asString.toUpperCase()
  }
}
