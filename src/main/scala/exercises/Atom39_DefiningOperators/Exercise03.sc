// Exercise03.sc
import com.atomicscala.AtomicTest._

val a2 = new FancyNumber2(2)
val b2 = new FancyNumber2(10)

class FancyNumber2(base: Int) {
  def ^(n: Int): Int = math.pow(base, n) toInt
}

a2.^(3) is 8
b2 ^ 2 is 100
