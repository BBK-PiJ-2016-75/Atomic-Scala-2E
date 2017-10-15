// Exercise03.sc

val t1 = isArg1GreaterThanArg2(4.1, 4.12)
val t2 = isArg1GreaterThanArg2(2.1, 1.2)
assert(!t1, "Expected: false, Got: " + t1)
assert(t2, "Expected: true, Got: " + t2)
println(t1, t2)

def isArg1GreaterThanArg2(arg1: Double, arg2: Double): Boolean = {
  arg1 > arg2
}
