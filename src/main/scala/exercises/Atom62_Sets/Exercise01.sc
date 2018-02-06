// Exercise01.sc
import com.atomicscala.AtomicTest._

val meats = Set("beef", "chicken")
val fruits = Set("apple", "orange", "banana", "kiwi")
val vegetables = Set("beans", "peas", "carrots", "sweet potatoes", "asparagus", "spinach")
val groceryCart = Set("apple", "pretzels", "bread", "orange", "beef", "beans", "asparagus",
  "sweet potatoes", "spinach", "carrots")

def percentMeat(groceryList: Set[String]): Double = {
  (groceryList.intersect(meats).size / groceryList.size.toDouble) * 100
}

def percentFruit(groceryList: Set[String]): Double = {
  (groceryList.intersect(fruits).size / groceryList.size.toDouble) * 100
}

def percentVeggies(groceryList: Set[String]): Double = {
  (groceryList.intersect(vegetables).size / groceryList.size.toDouble) * 100
}

def percentOther(groceryList: Set[String]): Double = {
  (groceryList.diff(meats.union(fruits).union(vegetables)).size / groceryList.size.toDouble) * 100
}

percentMeat(groceryCart) is 10.0
percentFruit(groceryCart) is 20.0
percentVeggies(groceryCart) is 50.0
percentOther(groceryCart) is 20.0
