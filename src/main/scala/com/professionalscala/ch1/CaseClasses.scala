package com.professionalscala.ch1

object CaseClasses extends App {
  case class User(id: Int, firstName: String, lastName: String)
  User(1,"Bob","Elvin").copy(lastName = "Jane") // returns User(1,"Bob","Jane")


  User(1,"Bob","Elvin").toString // returns "User(1,Bob,Elvin)"

  val userData = (5,"Maria", "Florence") //This will have type Tuple3 [Int,String,String]

  val userData2: Tuple3[Int,String,String] = User.unapply(User(15,"Shelly","Sherbert")).get
  val constructedUserData: User = User.tupled.apply(userData2) // Will be User(15,"Shelly","Sherbert").

  val (id, firstName, lastName) = userData2
}
