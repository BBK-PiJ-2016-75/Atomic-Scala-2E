// Exercise08.sc
import com.atomicscala.AtomicTest._

val cup5 = new Cup5(0)

class Cup5(var percentFull: Int) {
  val min = 0
  val max = 100

  def add(increase: Int*): Int = {
    for (i <- increase) {
      percentFull += i
      if (percentFull < min) {
        percentFull = min
      }
      if (percentFull > max) {
        percentFull = max
      }
    }
    percentFull
  }
}

cup5.add(20, 30, 50, 20, 10, -10, -40, 10, 50) is 100
cup5.add(10, 10, -10, 10, 90, 70, -70) is 30
