// Exercise01.sc
import com.atomicscala.AtomicTest._

val forTwo = Bicycle(2)

case class Bicycle(riders: Int) {
  override def toString: String = "Bicycle built for " + riders
}

forTwo is "Bicycle built for 2"
