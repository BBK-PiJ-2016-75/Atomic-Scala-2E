// Exercise04.sc
import com.atomicscala.AtomicTest._

val a3 = new FancyNumber3(2)
val b3 = new FancyNumber3(10)

class FancyNumber3(base: Int) {
  def ^(n: Int): Int = math.pow(base, n) toInt

  def **(n: Int): Int = math.pow(base, n) toInt
}

a3.^(3) is 8
a3.**(3) is 8
b3 ^ 2 is 100
b3 ** 2 is 100
