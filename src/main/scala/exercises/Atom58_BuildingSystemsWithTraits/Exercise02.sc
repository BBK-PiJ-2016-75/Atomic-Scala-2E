// Exercise02.sc
import com.atomicscala.AtomicTest._

val latte = new Latte(Single, Caf, Here, Skim)
val usual = new Coffee(Double, Caf, Here)

class Coffee(shots: Shots, caffeine: Caffeine, cup: Cup) {
  override def toString: String = s"Coffee($shots,$caffeine,$cup)"
}

class Latte(shots: Shots, caffeine: Caffeine, cup: Cup, milk: Milk) extends Coffee(shots, caffeine, cup) {
  override def toString: String = s"Latte($shots,$caffeine,$cup,$milk)"
}

import Caffeine._
import Cup._
import Milk._
import Shots._

object Shots extends Enumeration {
  type Shots = Value
  val Single, Double = Value
}

object Caffeine extends Enumeration {
  type Caffeine = Value
  val Caf, HalfCaf = Value
}

object Cup extends Enumeration {
  type Cup = Value
  val Here, ToGo = Value
}

object Milk extends Enumeration {
  type Milk = Value
  val Skim = Value
}
latte is "Latte(Single,Caf,Here,Skim)"
usual is "Coffee(Double,Caf,Here)"
