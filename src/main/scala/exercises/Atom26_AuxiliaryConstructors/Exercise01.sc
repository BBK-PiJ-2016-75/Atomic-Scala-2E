// Exercise01.sc
import com.atomicscala.AtomicTest._

val myClothesWasher1 = new ClothesWasher("Hotpoint")
val myClothesWasher2 = new ClothesWasher(50)

class ClothesWasher(val model: String, val capacity: Double) {
  def this(model: String) = {
    this(model, 0)
  }

  def this(capacity: Double) = {
    this("N/A", capacity)
  }
}

myClothesWasher1.model is "Hotpoint"
myClothesWasher1.capacity is 0
myClothesWasher2.model is "N/A"
myClothesWasher2.capacity is 50
