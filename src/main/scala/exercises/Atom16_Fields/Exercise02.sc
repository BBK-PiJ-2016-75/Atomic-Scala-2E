// Exercise02.sc
import com.atomicscala.AtomicTest._

val cup3 = new Cup3
cup3.add(45) is 45
cup3.add(-55) is 0
cup3.add(10) is 10
cup3.add(-9) is 1
cup3.add(-2) is 0

class Cup3 {
  val max = 100
  var percentFull = 0

  def add(increase: Int): Int = {
    percentFull += increase
    if (percentFull < 0) {
      percentFull = 0
    } else if (percentFull > max) {
      percentFull = max
    }
    percentFull
  }
}
