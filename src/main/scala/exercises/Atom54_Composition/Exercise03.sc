// Exercise03.sc
import com.atomicscala.AtomicTest._

val bot = new Robot(
  Vector(Mobility("Propeller"), Mobility("Legs")),
  Vector(Vision("UV"), Vision("Visible Spectrum")),
  Vector(Manipulator("Magnet"), Manipulator("Claw"))
)

case class Mobility(mobility: String)

case class Vision(vision: String)

case class Manipulator(manipulator: String)

class Robot(mobilities: Vector[Mobility], visions: Vector[Vision],
            manipulators: Vector[Manipulator]) {
  override def toString: String = mobilities.mkString(", ") + " | " + visions.mkString(", ") +
    " | " + manipulators.mkString(", ")
}

bot is "Mobility(Propeller), Mobility(Legs) | Vision(UV), Vision(Visible Spectrum) | " +
  "Manipulator(Magnet), Manipulator(Claw)"
