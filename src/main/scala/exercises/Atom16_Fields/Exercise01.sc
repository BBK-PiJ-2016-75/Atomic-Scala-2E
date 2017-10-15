// Exercise01.sc
import com.atomicscala.AtomicTest._

val cup2 = new Cup2
cup2.add(45) is 45
cup2.add(-15) is 30
cup2.add(-50) is -20

class Cup2 {
  val max = 100
  var percentFull = 0

  def add(increase: Int): Int = {
    percentFull += increase
    if (percentFull > max) {
      percentFull = max
    }
    percentFull
  }
}
