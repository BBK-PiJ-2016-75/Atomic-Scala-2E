// Exercise02.sc
import com.atomicscala.AtomicTest._

val myClothesWasher2a = new ClothesWasher2(model = "Hotpoint")
val myClothesWasher2b = new ClothesWasher2(capacity = 50.0)

class ClothesWasher2(val model: String = "N/A", val capacity: Double = 0.0)

myClothesWasher2a.model is "Hotpoint"
myClothesWasher2a.capacity is 0.0
myClothesWasher2b.model is "N/A"
myClothesWasher2b.capacity is 50.0
