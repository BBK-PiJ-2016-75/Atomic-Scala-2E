// Exercise02.sc
import com.atomicscala.AtomicTest._

val c1 = Cycle(1)
val c2 = Cycle(2)
val cn = Cycle(5)

case class Cycle(wheels: Int) {
  override def toString: String = wheels match {
    case 1 => "Unicycle"
    case 2 => "Bicycle"
    case 3 => "Tricycle"
    case 4 => "Quadricycle"
    case _ => s"Cycle with $wheels wheels"
  }
}

c1 is "Unicycle"
c2 is "Bicycle"
cn is "Cycle with 5 wheels"
