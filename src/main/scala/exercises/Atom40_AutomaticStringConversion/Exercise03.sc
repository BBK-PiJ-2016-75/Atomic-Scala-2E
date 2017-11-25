// Exercise03.sc
import com.atomicscala.AtomicTest._

case class Cycle(wheels: Int) {
  override def toString: String = wheels match {
    case 1 => "Unicycle"
    case 2 => "Bicycle"
    case 3 => "Tricycle"
    case 4 => "Quadricycle"
    case neg: Int if neg < 0 => "That's not a cycle!"
    case _ => s"Cycle with $wheels wheels"
  }
}

Cycle(-2) is "That's not a cycle!"
