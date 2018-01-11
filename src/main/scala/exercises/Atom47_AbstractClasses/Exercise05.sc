// Exercise05.sc
import com.atomicscala.AtomicTest._

val dino = new PrehistoricAnimal

abstract class Animal {
  def templateMethod: String = s"The $animal goes $sound"

  def animal: String

  def sound: String

  def food: String
}

class PrehistoricAnimal extends Animal {
  override def sound: String = "Roar"

  override def food: String = "other dinosaurs"

  def namedAnimal(name: String): String = s"$animal: $name"

  override def animal: String = "Dinosaur"
}

dino.namedAnimal("T-Rex") is "Dinosaur: T-Rex"
dino.templateMethod is "The Dinosaur goes Roar"
dino.food is "other dinosaurs"
