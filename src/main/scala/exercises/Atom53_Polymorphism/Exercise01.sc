// Exercise01.sc
import com.atomicscala.AtomicTest._

def movable(mobile: Mobile): String = {
  mobile.move
}

trait Mobile {
  def move: String = "Movement"
}

class Animal extends Mobile {
  override def move: String = "Biological " + super.move
}

class Vehicle extends Mobile {
  override def move: String = "Mechanical " + super.move
}

movable(new Animal) is "Biological Movement"
movable(new Vehicle) is "Mechanical Movement"
