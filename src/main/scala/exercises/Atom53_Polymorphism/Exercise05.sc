// Exercise05.sc
import com.atomicscala.AtomicTest._

val garden = new Garden(new Tomato, new Corn, new Zucchini)

class Seed

class Tomato extends Seed {
  override def toString: String = "Tomato"
}

class Corn extends Seed {
  override def toString: String = "Corn"
}

class Zucchini extends Seed {
  override def toString: String = "Zucchini"
}

class Garden(seeds: Seed*) {
  val gardenPlants = seeds.toVector

  override def toString: String = gardenPlants.mkString(", ")
}

garden is "Tomato, Corn, Zucchini"
