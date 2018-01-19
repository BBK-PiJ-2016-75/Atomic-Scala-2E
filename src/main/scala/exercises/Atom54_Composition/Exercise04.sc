// Exercise04.sc
import com.atomicscala.AtomicTest._

val bot = new Robot(Vector(Mobility("Propeller"), Mobility("Legs"), Vision("UV"),
  Vision("Visible Spectrum"), Manipulator("Magnet"), Manipulator("Claw")))

trait Ability

case class Mobility(mobility: String) extends Ability

case class Vision(vision: String) extends Ability

case class Manipulator(manipulator: String) extends Ability

class Robot(abilities: Vector[Ability]) {
  override def toString: String = abilities.mkString(", ")
}

bot is "Mobility(Propeller), Mobility(Legs), Vision(UV), Vision(Visible Spectrum), " +
  "Manipulator(Magnet), Manipulator(Claw)"
