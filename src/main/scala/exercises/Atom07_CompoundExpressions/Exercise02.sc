// Exercise02.sc

val a = 1
val b = 6
val c = 5

if (a <= c && b <= c) {
  println("both are!")
} else if (a <= c || b <= c) {
  println("one is and one isn't!")
}
