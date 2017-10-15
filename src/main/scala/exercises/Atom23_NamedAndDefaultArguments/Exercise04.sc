// Exercise04.sc
import com.atomicscala.AtomicTest._

val earth = new Planet(moons = 1, name = "Earth", description = "a hospitable planet")

class Planet(name: String, description: String, moons: Int = 1) {
  def hasMoon: Boolean = {
    if (moons > 0) {
      true
    } else {
      false
    }
  }
}

earth.hasMoon is true
