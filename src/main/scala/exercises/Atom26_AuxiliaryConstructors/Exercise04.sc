// Exercise04.sc
import com.atomicscala.AtomicTest._

val washer = new ClothesWasher3("LG 100", 3.6)

class ClothesWasher3(val model: String, val capacity: Double) {
  def this(model: String) = {
    this(model, 0.0)
  }

  def this(capacity: Double) = {
    this("N/A", capacity)
  }

  def wash: String = {
    "Simple wash"
  }

  def wash(bleach: Int, fabricSoftener: Int): String = {
    "Wash used " + bleach + " bleach and " + fabricSoftener + " fabric softener"
  }
}

washer.wash(2, 1) is "Wash used 2 bleach and 1 fabric softener"
washer.wash is "Simple wash"
