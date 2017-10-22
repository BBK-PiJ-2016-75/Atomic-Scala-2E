// Exercise02.sc
import com.atomicscala.AtomicTest._

val gnome = new GardenGnome(20.0, 50.0, false)
val bob = new GardenGnome("Bob")

class GardenGnome(val height: Double, val weight: Double, val happy: Boolean) {
  val painted = true

  def this(height: Double) = {
    this(height, 100.0, true)
  }

  def this(name: String) = {
    this(15.0)
    painted is true
  }

  def show(level: Int): String = {
    s"${magic(level)} $happy $painted"
  }

  def magic(level: Int): String = {
    "Poof! " + level
  }
}

gnome.show(87) is "Poof! 87 false true"
bob.show(25) is "Poof! 25 true true"
