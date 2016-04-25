package com.professionalscala.ch1

object PackagesCompanionObjectAndScoping extends App {

  object MyObject {
    // Implementation goes here
  }

  def doSomething(myObject: MyObject.type) = {

  }

  trait LoggerImplementation {
    def publishLog(level:String, message: String)
  }

  object ConsoleLogger extends LoggerImplementation {
    def publishLog(level: String, message: String) = {
      println(s"level: $level, message: $message")
    }
    object Implicits {
      implicit lazy val consoleLogger = ConsoleLogger
    }
  }


  trait Logger {
    def log(level: String, message: String)(implicit loggerImplementation:
    LoggerImplementation) = {
      loggerImplementation.publishLog(level,message)
    }
  }

  import ConsoleLogger.Implicits._

  object Main extends App with Logger {
    log("info","This is a log statement")
  }

  object MyClass {
    private val statement = "This is a statement"
  }
  case class MyClass (additionalStatement: String) {
    def printStatement = println(s"$additionalStatement ${MyClass.statement}")
  }

}
