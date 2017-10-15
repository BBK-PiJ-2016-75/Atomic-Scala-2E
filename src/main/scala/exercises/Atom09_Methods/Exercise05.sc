// Exercise05.sc

val s1 = addStrings("abc", "def")
val s2 = addStrings("zyx", "abc")
assert(s1 == "abcdef", "Expected: abcdef, Got: " + s1)
assert(s2 == "zyxabc", "Expected: zyxabc, Got: " + s2)
println(s1, s2)

def addStrings(str1: String, str2: String): String = {
  str1 + str2
}
