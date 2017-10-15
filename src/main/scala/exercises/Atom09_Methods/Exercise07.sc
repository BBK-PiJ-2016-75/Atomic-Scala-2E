// Exercise07.sc

val normal = bmiStatus(160, 68)
val overweight = bmiStatus(180, 60)
val underweight = bmiStatus(100, 68)
assert("Normal weight" == normal, "Expected: Normal weight, Got: " + normal)
assert("Overweight" == overweight, "Expected: Overweight, Got: " + overweight)
assert("Underweight" == underweight, "Expected: Underweight, Got: " + underweight)
println(normal, overweight, underweight)

def bmiStatus(weight: Double, height: Double): String = {
  val bmi = weight / (height * height) * 703.07
  if (bmi < 18.5) {
    "Underweight"
  } else if (bmi < 25) {
    "Normal weight"
  } else {
    "Overweight"
  }
}
