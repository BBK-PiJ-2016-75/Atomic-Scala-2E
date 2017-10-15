// Exercise06.sc
import com.atomicscala.AtomicTest._

val cup3 = new Cup3(0)

class Cup3(var percentFull: Int) {
  val min = 0
  val max = 100

  def add(increase: Int): Int = {
    percentFull += increase
    if (percentFull < min) {
      percentFull = min
    }
    if (percentFull > max) {
      percentFull = max
    }
    percentFull
  }
}

cup3.add(50) is 50
cup3.add(70) is 100
cup3.add(-15) is 85
cup3.add(-50) is 35
cup3.add(-40) is 0
