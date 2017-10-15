// Exercise02.sc
import com.atomicscala.AtomicTest._

val v1 = Vector(
  Vector('e', 'd', 'c', 'b', 'a'),
  Vector(5, 4, 3, 2, 1),
  Vector("five", "four", "three", "two", "one")
)
var v1String = ""
for (i <- v1) {
  for (j <- i) {
    v1String += j + " "
  }
}

v1String is "e d c b a 5 4 3 2 1 five four three two one "
