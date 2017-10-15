// Exercise04.sc
import com.atomicscala.AtomicTest._

val cup4 = new Cup4
cup4.set(56)
cup4.get() is 56

class Cup4 {
  var percentFull = 0

  def set(setPercent: Int): Unit = {
    percentFull = setPercent
  }

  def get(): Int = {
    percentFull
  }
}
