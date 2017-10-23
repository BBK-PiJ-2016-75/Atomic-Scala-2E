// Exercise05.sc
import com.atomicscala.AtomicTest._

val v = Vector(1, 10, 100, 1000)
var sum = 0
for (i <- v) {
  sum += i
}

sum is 1111
