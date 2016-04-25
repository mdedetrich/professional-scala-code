package com.professionalscala.ch1

object log {
  def info(string: String) = print(string)
}

object StringInterpolation {
  val s = "fifty"

  val someString = s"the value of this variable is $s"

  case class User(id: Long)

  val user = User(3)

  log.info(s"The id of the current user is ${user.id}")
}
