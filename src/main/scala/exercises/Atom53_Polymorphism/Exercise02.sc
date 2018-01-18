// Exercise02.sc
import com.atomicscala.AtomicTest._
import com.atomicscala.Name

val e = new Element
val in = new Inert
val wall = new Wall

class Element extends Name {
  def interact(other: Element): String = s"$this interact $other"

  def draw: String = "Drawing the element"
}

class Inert extends Element {
  override def draw: String = "Inert drawing!"
}

class Wall extends Inert

e.draw is "Drawing the element"
in.draw is "Inert drawing!"
wall.draw is "Inert drawing!"
