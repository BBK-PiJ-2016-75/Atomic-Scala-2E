// Exercise07.sc
import com.atomicscala.AtomicTest._

val cup4 = new Cup4(0)

class Cup4(var percentFull: Int) {
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

cup4.percentFull = 40
cup4.percentFull is 40
