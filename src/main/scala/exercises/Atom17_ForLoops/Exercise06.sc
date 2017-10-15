// Exercise06.sc
import com.atomicscala.AtomicTest._

var evens = 0
var odds = 0
for (i <- Range(1, 10).inclusive) {
  if (i % 2 == 0) {
    evens += i
  } else {
    odds += i
  }
}
evens is 30
odds is 25
(evens + odds) is 55
