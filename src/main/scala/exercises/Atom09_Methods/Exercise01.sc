// Exercise01.sc

val a = getSquare(3)
val b = getSquare(6)
val c = getSquare(5)
assert(a == 9, "Expected: 9, Got: " + a)
assert(b == 36, "Expected: 36, Got: " + b)
assert(c == 25, "Expected: 25, Got: " + c)
println(a, b, c)

def getSquare(value: Int): Int = {
  value * value
}
