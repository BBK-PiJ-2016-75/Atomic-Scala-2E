// Exercise03.sc
import com.atomicscala.AtomicTest._

val c = new Cycle
val b = new Bicycle

class Cycle {
  val wheels = 2

  def ride: String = "Riding"
}

class Bicycle extends Cycle

c.ride is "Riding"
b.ride is "Riding"
b.wheels is 2
