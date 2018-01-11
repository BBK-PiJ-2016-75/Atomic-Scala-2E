// Exercise03.sc
import com.atomicscala.AtomicTest._

val num = new NumericAdder(5)

abstract class Adder(x: Int) {
  def add(y: Int): Int
}

class NumericAdder(val x: Int) extends Adder(x) {
  def add(y: Int): Int = x + y
}

num.add(10) is 15
