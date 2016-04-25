package com.professionalscala.ch1

object Collections extends App {

  {
    val l = List(3,6,2342,8)
    val s = Seq(3,6,2342,15)

    def listLength(l: List[_]) = l.length
    def sequenceLength(s : Seq[_]) = s.length

  }

  {
    val l = List(3,6,2342,8)
    l.map(int => int.toString)
  }

  {
    val m = Map(
      "3" -> "Bob",
      "6" -> "Alice",
      "10" -> "Fred",
      "15" -> "Yuki"
    )

    val keys = m.keys.map{key => key.toInt}.to[List]
    val values = m.values.map{name => name.toCharArray}
    (keys zip values).toMap

    m.map{case (key,name) => key.toInt -> name.toCharArray }

  }
}
