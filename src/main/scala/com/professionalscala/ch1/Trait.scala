package com.professionalscala.ch1

/**
  * These are dummy types so the code compiles
  */

class Controller
class Database
class UserId

object Config {
  def getDb: Database = ???
}

object Logger {
  def info(string: String) = println(string)
}

object Trait extends App {

  trait LoginSupport {self: Controller =>
    val database: Database
    def login(userId: UserId) = {
      //Code dealing with logging in goes here
      afterLogin()
    }

    def logout() = {
      //Code dealing with logging out goes here
    }

    def afterLogin(): Unit = {

    }
  }

  class ApplicationController(implicit val database: Database) extends LoginSupport {self: Controller =>

  }

  class ApplicationController2 extends LoginSupport {self: Controller =>
    lazy val database: Database = Config.getDb
  }


  class ApplicationController3(implicit val database: Database) extends LoginSupport{self: Controller =>
    override def afterLogin() = Logger.info("You have successfully logged in!")
  }
}
