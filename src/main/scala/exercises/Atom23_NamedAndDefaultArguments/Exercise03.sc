// Exercise03.sc
import com.atomicscala.AtomicTest._

val p = new Planet(name = "Mercury", description = "small and hot planet", moons = 0)

class Planet(name: String, description: String, moons: Int = 1) {
  def hasMoon: Boolean = {
    if (moons > 0) {
      true
    } else {
      false
    }
  }
}

p.hasMoon is false
