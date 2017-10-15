// Exercise03.sc
import com.atomicscala.AtomicTest._

val cup3 = new Cup3
cup3.percentFull = 56
cup3.percentFull is 56

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
