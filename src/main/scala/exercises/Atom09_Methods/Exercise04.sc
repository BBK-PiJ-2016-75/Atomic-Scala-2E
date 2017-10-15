// Exercise04.sc

val g1 = getMe("abraCaDabra")
val g2 = getMe("zyxwVUT")
assert("abracadabra" == g1, "Expected: abracadabra, Got: " + g1)
assert("zyxwvut" == g2, "Expected: zyxwvut, Got: " + g2)
println(g1, g2)

def getMe(str: String): String = {
  str.toLowerCase
}
