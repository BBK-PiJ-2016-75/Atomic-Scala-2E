// Exercise04.sc
import com.atomicscala.AtomicTest._
import com.atomicscala.sodafountain.IceCream._

case class TakeHome(container: Container, iceCream: IceCream)

import Container._

object Container extends Enumeration {
  type Container = Value
  val Pint, Quart, HalfGallon = Value
}

TakeHome(Pint, Chocolate) is "TakeHome(Pint,Chocolate)"
TakeHome(Quart, Strawberry) is "TakeHome(Quart,Strawberry)"
TakeHome(HalfGallon, Vanilla) is "TakeHome(HalfGallon,Vanilla)"
