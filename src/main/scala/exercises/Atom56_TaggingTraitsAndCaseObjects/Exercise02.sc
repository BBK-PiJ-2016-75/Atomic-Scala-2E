// Exercise02.sc
import com.atomicscala.AtomicTest._

object EnumColour extends Enumeration {
  type EnumColour = Value
  val Red, Blue, Green = Value
}

EnumColour.Red is "Red"
EnumColour.Blue is "Blue"
EnumColour.Green is "Green"
