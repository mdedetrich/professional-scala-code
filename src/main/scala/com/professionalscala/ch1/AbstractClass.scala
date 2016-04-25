package com.professionalscala.ch1

object AbstractClass extends App {
  sealed abstract class Hemisphere
  case object North extends Hemisphere
  case object South extends Hemisphere
  sealed abstract class Continent(name: String, hemisphere: Hemisphere)
  case object NorthAmerica extends Continent("North America", North)
  case object SouthAmerica extends Continent("South America", South)
  case object Europe extends Continent("Europe", North)
  case object Asia extends Continent("Asia", North)
  case object Africa extends Continent("Africa", South)
  case object Australia extends Continent("Australia", South)

  val continent: Continent = NorthAmerica


  continent match {
    case Asia => println("Found asia")
    case _ =>
  }
}
