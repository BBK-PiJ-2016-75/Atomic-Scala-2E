// Exercise03.sc
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
    s"height: $height weight: $weight happy: $happy painted: $painted"
  }
}

gnome.show is "height: 20.0 weight: 110.0 happy: false painted: true"
bob.show is "height: 15.0 weight: 100.0 happy: true painted: true"
