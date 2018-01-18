// Exercise04.sc
import com.atomicscala.AtomicTest._
import com.atomicscala.Name

val d = new Dragon("Puff")

class Element extends Name {
  def interact(other: Element): String = s"$this interact $other"
}

class Character(val player: String = "None") extends Element

// Change the next line
class Dragon(val dragonPlayer: String) extends Character(dragonPlayer)

d.player is "Puff"
