// Exercise02.sc

val sd1 = getSquareDouble(1.2)
val sd2 = getSquareDouble(5.7)
assert(1.44 == sd1, "Expected: 1.44, Got: " + sd1)
assert(32.49 == sd2, "Expected: 32.49, Got: " + sd2)
println(sd1, sd2)

def getSquareDouble(value: Double): Double = {
  value * value
}
