// Exercise01.sc
import com.atomicscala.AtomicTest._

trait Flavour

trait Amount {
  val pumps: Int
}

trait Taste[F <: Flavour] extends Amount {
  val flavour: F
}

case class Coffee(shots: Shots, caffeine: Caffeine, cup: Cup, milk: Milk, syrup: Syrup)

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
  val Skim, NoMilk = Value
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

Coffee(Single, Caf, Here, Skim, Choc) is "Coffee(Single,Caf,Here,Skim,Choc)"
Coffee(Double, Caf, Here, NoMilk, NoFlavour) is "Coffee(Double,Caf,Here,NoMilk,NoFlavour)"
Coffee(Double, HalfCaf, ToGo, Skim, Choc) is "Coffee(Double,HalfCaf,ToGo,Skim,Choc)"
