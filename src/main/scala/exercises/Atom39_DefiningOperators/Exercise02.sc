// Exercise02.sc
import com.atomicscala.AtomicTest._

val a1 = new FancyNumber1(2)
val b1 = new FancyNumber1(10)

class FancyNumber1(base: Int) {
  def power(n: Int): Int = math.pow(base, n) toInt
}

a1.power(3) is 8
b1.power(2) is 100
