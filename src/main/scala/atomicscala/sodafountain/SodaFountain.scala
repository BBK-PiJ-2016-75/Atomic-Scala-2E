// SodaFountain.scala
package com.atomicscala.sodafountain

object Quantity extends Enumeration {
  type Quantity = Value
  val None, Small, Regular,
  Extra, Super = Value
}

import com.atomicscala.sodafountain.Quantity._

object Holder extends Enumeration {
  type Holder = Value
  val Bowl, Cup, Cone, WaffleCone = Value
}

trait Flavor

object Syrup extends Enumeration {

  type Syrup = _Val
  val Chocolate, HotFudge,
  Butterscotch, Caramel = _Val()

  case class _Val() extends Val
    with Flavor

}

import com.atomicscala.sodafountain.Syrup._

object IceCream extends Enumeration {

  type IceCream = _Val
  val Chocolate, Vanilla, Strawberry,
  Coffee, MochaFudge, RumRaisin,
  ButterPecan = _Val()

  case class _Val() extends Val
    with Flavor

}

import com.atomicscala.sodafountain.IceCream._

object Sprinkle extends Enumeration {

  type Sprinkle = _Val
  val None, Chocolate, Rainbow = _Val()

  case class _Val() extends Val
    with Flavor

}

import com.atomicscala.sodafountain.Sprinkle._

trait Amount {
  val quant: Quantity
}

trait Taste[F <: Flavor] extends Amount {
  val flavor: F
}

case class
Scoop(quant: Quantity, flavor: IceCream)
  extends Taste[IceCream]

trait Topping

case class
Sprinkles(quant: Quantity, flavor: Sprinkle)
  extends Taste[Sprinkle] with Topping

case class
Sauce(quant: Quantity, flavor: Syrup)
  extends Taste[Syrup] with Topping

case class WhippedCream(quant: Quantity)
  extends Amount with Topping

case class Nuts(quant: Quantity)
  extends Amount with Topping

class Cherry extends Topping
