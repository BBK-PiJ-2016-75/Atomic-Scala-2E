// Exercise02.sc
import com.atomicscala.AtomicTest._

val walker = new Robot(Mobility("Legs"), Vision("Visible Spectrum"), Manipulator("Magnet"))
val crawler = new Robot(Mobility("Treads"), Vision("Infrared"), Manipulator("Claw"))
val arial = new Robot(Mobility("Propeller"), Vision("UV"), Manipulator("None"))

case class Mobility(mobility: String)

case class Vision(vision: String)

case class Manipulator(manipulator: String)

class Robot(mobility: Mobility, vision: Vision, manipulator: Manipulator) {
  override def toString: String = s"$mobility, $vision, $manipulator"
}

walker is "Mobility(Legs), Vision(Visible Spectrum), Manipulator(Magnet)"
crawler is "Mobility(Treads), Vision(Infrared), Manipulator(Claw)"
arial is "Mobility(Propeller), Vision(UV), Manipulator(None)"
