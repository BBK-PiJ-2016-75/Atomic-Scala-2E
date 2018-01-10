// Exercise02.sc

class GreatApe2(val weight: Double, val age: Int, val gender: String) {
  def myWords: Vector[String] = Vector("Roar")
}

class Bonobo2(weight: Double, age: Int, gender: String) extends GreatApe2(weight, age, gender) {
  println(myWords ++ Vector("Hoot"))
}

new Bonobo2(150, 14, "Female")
