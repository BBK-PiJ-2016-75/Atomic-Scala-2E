// Exercise03.sc
import com.atomicscala.AtomicTest._

val tea = new Tea2
val lemonZinger = new Tea2(decaf = true, name = "Lemon Zinger")
val sweetGreen = new Tea2(name = "Jasmine Green", sugar = true)
val teaLatte = new Tea2(sugar = true, milk = true)

class Tea2(val decaf: Boolean = false, val name: String = "Earl Grey", val sugar: Boolean = false,
           val milk: Boolean = false) {
  var totalCalories = 0
  var description = name

  def describe: String = {
    if (decaf) {
      description += " decaf"
    }
    if (milk) {
      description += " + milk"
    }
    if (sugar) {
      description += " + sugar"
    }
    description
  }

  def calories: Int = {
    if (milk) {
      totalCalories += 100
    }
    if (sugar) {
      totalCalories += 16
    }
    totalCalories
  }
}

tea.describe is "Earl Grey"
tea.calories is 0
tea.name is "Earl Grey"
lemonZinger.describe is "Lemon Zinger decaf"
lemonZinger.calories is 0
lemonZinger.decaf is true
sweetGreen.describe is "Jasmine Green + sugar"
sweetGreen.calories is 16
sweetGreen.sugar is true
teaLatte.describe is "Earl Grey + milk + sugar"
teaLatte.calories is 116
teaLatte.milk is true
