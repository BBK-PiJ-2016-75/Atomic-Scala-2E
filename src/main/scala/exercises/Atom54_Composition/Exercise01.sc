// Exercise01.sc
import com.atomicscala.AtomicTest._

val walker = new Robot("Legs", "Visible Spectrum", "Magnet")
val crawler = new Robot("Treads", "Infrared", "Claw")
val arial = new Robot("Propeller", "UV", "None")

trait Mobility {
  def mobility: String
}

trait Vision {
  def vision: String
}

trait Manipulator {
  def manipulator: String
}

class Robot(val mobility: String, val vision: String, val manipulator: String) extends Mobility
  with Vision with Manipulator {
  override def toString: String = s"$mobility, $vision, $manipulator"
}

walker is "Legs, Visible Spectrum, Magnet"
crawler is "Treads, Infrared, Claw"
arial is "Propeller, UV, None"
