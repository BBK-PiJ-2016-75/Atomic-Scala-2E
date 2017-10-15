// Exercise01.sc
import com.atomicscala.AtomicTest._

val v1 = Vector('e', 'd', 'c', 'b', 'a')
val v2 = Vector(5, 4, 3, 2, 1)
val v3 = Vector("five", "four", "three", "two", "one")
var v1String = ""
var v2String = ""
var v3String = ""
for (i <- v1.sorted) {
  v1String += i + " "
}
for (i <- v2.sorted) {
  v2String += i + " "
}
for (i <- v3.sorted) {
  v3String += i + " "
}

v1.sorted is Vector('a', 'b', 'c', 'd', 'e')
v1.min is 'a'
v1.max is 'e'
v1String is "a b c d e "
v2.sorted is Vector(1, 2, 3, 4, 5)
v2.min is 1
v2.max is 5
v2String is "1 2 3 4 5 "
v3.sorted is Vector("five", "four", "one", "three", "two")
v3.min is "five"
v3.max is "two"
v3String is "five, four, one, three, two "
