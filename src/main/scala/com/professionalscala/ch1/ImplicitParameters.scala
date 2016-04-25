package com.professionalscala.ch1

object ImplicitParameters extends App {
  case class ApiKey(id: String)

  case class User(name: String)

  import scala.concurrent.Future
  def getUser(userId: Long)(implicit apiKey: ApiKey): Future[Option[User]] = ???

  object Config {
    implicit val apiKey = ApiKey(System.getenv("apiKey"))

    {
      val userId = args(0).toLong
      getUser(userId)
    }

    {
      val userId = args(0).toLong
      val apiKey = ApiKey(args(1))
      getUser(userId)(apiKey)
    }
  }

}
