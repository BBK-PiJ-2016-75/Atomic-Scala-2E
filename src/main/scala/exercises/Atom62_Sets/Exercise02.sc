// Exercise02.sc
import com.atomicscala.AtomicTest._

val meats = Set("beef", "chicken")
val vegetarian = Set("kidney beans", "black beans", "tofu")
val protein = meats.union(vegetarian)
val groceryCart2 = Set("apple", "pretzels", "bread", "orange", "beef", "beans", "asparagus",
  "sweet potatoes", "kidney beans", "black beans")

def percentMeat(groceryList: Set[String]): Double = {
  (groceryList.intersect(meats).size / groceryList.size.toDouble) * 100
}

def percentVegetarian(groceryList: Set[String]): Double = {
  (groceryList.intersect(vegetarian).size / groceryList.size.toDouble) * 100
}

def percentProtein(groceryList: Set[String]): Double = {
  (groceryList.intersect(protein).size / groceryList.size.toDouble) * 100
}

percentMeat(groceryCart2) is 10.0
percentVegetarian(groceryCart2) is 20.0
percentProtein(groceryCart2) is 30.0
