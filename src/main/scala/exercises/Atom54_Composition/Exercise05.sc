// Exercise05.sc
import com.atomicscala.AtomicTest._

val bot = new Robot

case class Mobility(mobility: String)

case class Vision(vision: String)

case class Manipulator(manipulator: String)

class Robot {
  var mobilities = Vector[Mobility]()
  var visions = Vector[Vision]()
  var manipulators = Vector[Manipulator]()

  def addMobility(mobility: Mobility): Unit = mobilities = mobilities :+ mobility

  def addVision(vision: Vision): Unit = visions = visions :+ vision

  def addManipulator(manipulator: Manipulator): Unit = manipulators = manipulators :+ manipulator

  override def toString: String = mobilities.mkString(", ") + " | " + visions.mkString(", ") +
    " | " + manipulators.mkString(", ")
}

bot.addMobility(Mobility("Propeller"))
bot.addMobility(Mobility("Legs"))
bot.addVision(Vision("UV"))
bot.addVision(Vision("Visible Spectrum"))
bot.addManipulator(Manipulator("Magnet"))
bot.addManipulator(Manipulator("Claw"))

bot is "Mobility(Propeller), Mobility(Legs) | Vision(UV), Vision(Visible Spectrum) | " +
  "Manipulator(Magnet), Manipulator(Claw)"
