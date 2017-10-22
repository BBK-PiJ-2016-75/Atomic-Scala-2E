// Exercise01.sc
import com.atomicscala.AtomicTest._

val gnome = new GardenGnome(20.0, 110.0, false)
val bob = new GardenGnome("Bob")

class GardenGnome(val height: Double, val weight: Double, val happy: Boolean) {
  val painted = true

  def magic(level: Int): String = {
    "Poof! " + level
  }

  def this(height: Double) = {
    this(height, 100.0, true)
  }

  def this(name: String) = {
    this(15.0)
    painted is true
  }

  def show: String = {
    s"$height $weight $happy $painted"
  }
}

gnome.show is "20.0 110.0 false true"
bob.show is "15.0 100.0 true true"
