// Exercise06.sc
import com.atomicscala.AtomicTest._

val flour = new Item(name = "flour", 4)
val sunscreen = new Item(name = "sunscreen", 3)
val tv = new Item(name = "television", 500)

class Item(name: String, price: Int) {
  def cost(grocery: Boolean = false, medication: Boolean = false, taxRate: Double = 0.1): Double = {
    if (grocery || medication) {
      price
    } else {
      price + (price * taxRate)
    }
  }
}

flour.cost(grocery = true) is 4
sunscreen.cost() is 3.3
tv.cost(taxRate = 0.06) is 530
