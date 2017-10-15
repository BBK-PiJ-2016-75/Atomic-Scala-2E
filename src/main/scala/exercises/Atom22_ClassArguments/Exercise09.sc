// Exercise09.sc
import com.atomicscala.AtomicTest._

def squareThem(bases: Int*): Int = {
  var total = 0
  for (i <- bases) {
    total += (i * i)
  }
  total
}

squareThem(2) is 4
squareThem(2, 4) is 20
squareThem(1, 2, 4) is 21
