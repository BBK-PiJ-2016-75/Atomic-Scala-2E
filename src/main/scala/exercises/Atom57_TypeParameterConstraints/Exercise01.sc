// Exercise01.sc
import com.atomicscala.AtomicTest._

trait Building

trait Room

trait Storage

trait Sink

trait Storable

trait Store[T <: Storable]

trait Cook[T]

trait Cleanable

trait Clean[T <: Cleanable]

trait Edible extends Cleanable with Storable

trait Food[F <: Edible] extends Store[F] with Clean[F] with Cook[F]

trait Holdable extends Cleanable with Storable

trait Utensil[U <: Holdable] extends Store[U] with Clean[U] with Cook[U]

trait Kitchen extends Room {
  val storage: Storage
  val sinks: Vector[Sink]
  val food: Food[Edible]
  val utensils: Vector[Utensil[Holdable]]
}

case class House() extends Building {
  val kitchens = Vector[Kitchen]()
}

object Fruit extends Enumeration {
  type Fruit = _Val
  val apple, orange, banana = _Val()

  case class _Val() extends Val with Edible

}

object Meat extends Enumeration {
  type Meat = _Val
  val beef, chicken, pork = _Val()

  case class _Val() extends Val with Edible

}

object Cutlery extends Enumeration {
  type Cutlery = _Val
  val knife, fork, spoon = _Val()

  case class _Val() extends Val with Holdable

}

object Crockery extends Enumeration {
  type Crockery = _Val
  val plate, bowl, mug = _Val()

  case class _Val() extends Val with Holdable

}

House is "House"
