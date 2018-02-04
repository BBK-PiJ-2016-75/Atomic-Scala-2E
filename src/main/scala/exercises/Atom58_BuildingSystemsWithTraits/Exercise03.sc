// Exercise03.sc
import com.atomicscala.AtomicTest._

val mocha = new Mocha(Double, Caf, ToGo, Skim)

trait Flavour

trait Amount {
  val pumps: Int
}

trait Taste[F <: Flavour] extends Amount {
  val flavour: F
}

class Coffee(shots: Shots, caffeine: Caffeine, cup: Cup) {
  override def toString: String = s"Coffee($shots,$caffeine,$cup)"
}

class Latte(shots: Shots, caffeine: Caffeine, cup: Cup, milk: Milk) extends Coffee(shots, caffeine,
  cup) {
  override def toString: String = s"Latte($shots,$caffeine,$cup,$milk)"
}

class Mocha(shots: Shots, caffeine: Caffeine, cup: Cup, milk: Milk) extends Latte(shots, caffeine,
  cup, milk) {
  val syrup = Choc

  override def toString: String = s"Mocha($shots,$caffeine,$cup,$milk,$syrup)"
}

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

object Syrup extends Enumeration {
  type Syrup = _Val
  val Choc, NoFlavour = _Val()

  case class _Val() extends Val with Flavour

}

import Caffeine._
import Cup._
import Milk._
import Shots._
import Syrup._

mocha is "Mocha(Double,Caf,ToGo,Skim,Choc)"
