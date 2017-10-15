// Exercise03.sc
import com.atomicscala.AtomicTest._

var total = 0
for (i <- 0 to 10) {
  total += i
}
total is 55
