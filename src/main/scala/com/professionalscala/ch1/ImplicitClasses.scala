package com.professionalscala.ch1

object ImplicitClasses extends App {
  object Implicits {
    implicit class StringExtensionMethods(string: String) {
      def replaceSpaceWithUnderScore = string.replaceAll(" ","_")
    }
  }

  import Implicits._
  "test this string".replaceSpaceWithUnderScore // returns test_this_string
}
