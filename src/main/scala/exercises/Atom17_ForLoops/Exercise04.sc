// Exercise04.sc
import com.atomicscala.AtomicTest._

var totalEvens = 0
for (i <- 1 to 10) {
  if (i % 2 == 0) {
    totalEvens += i
  }
}
totalEvens is 30
