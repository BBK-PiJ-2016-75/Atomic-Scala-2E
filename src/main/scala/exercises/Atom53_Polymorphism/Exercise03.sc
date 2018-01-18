// Exercise03.sc
import com.atomicscala.AtomicTest._
import com.atomicscala.Name

val wall = new Wall

class Element extends Name {
  def interact(other: Element): String = s"$this interact $other"

  def draw: String = "Drawing the element"
}

class Inert extends Element {
  override def draw: String = "Inert drawing!"
}

class Wall extends Inert {
  override def draw: String = "Don't draw on the wall!"
}

wall.draw is "Don't draw on the wall!"
