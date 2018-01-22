// Exercise06.sc
import com.atomicscala.AtomicTest._

val bot = new Robot + Mobility("Propeller") + Mobility("Legs") + Vision("UV") +
  Vision("Visible Spectrum") + Manipulator("Magnet") + Manipulator("Claw")

case class Mobility(mobility: String)

case class Vision(vision: String)

case class Manipulator(manipulator: String)

class Robot {
  var mobilities = Vector[Mobility]()
  var visions = Vector[Vision]()
  var manipulators = Vector[Manipulator]()

  def +(mobility: Mobility): Robot = {
    mobilities = mobilities :+ mobility
    this
  }

  def +(vision: Vision): Robot = {
    visions = visions :+ vision
    this
  }

  def +(manipulator: Manipulator): Robot = {
    manipulators = manipulators :+ manipulator
    this
  }

  override def toString: String = mobilities.mkString(", ") + " | " + visions.mkString(", ") +
    " | " + manipulators.mkString(", ")
}

bot is "Mobility(Propeller), Mobility(Legs) | Vision(UV), Vision(Visible Spectrum) | " +
  "Manipulator(Magnet), Manipulator(Claw)"
