// Exercise06.sc

val m1 = manyTimesString("abc", 3)
val m2 = manyTimesString("123", 2)
assert("abcabcabc" == m1, "Expected: abcabcabc, Got: " + m1)
assert("123123" == m2, "Expected: 123123, Got: " + m2)
println(m1, m2)

def manyTimesString(str: String, i: Int): String = {
  str * i
}
