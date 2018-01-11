// Exercise04.sc
import com.atomicscala.AtomicTest._

val myNum = MyAdder(15)

abstract class Adder(x: Int) {
  def add(y: Int): Int
}

case class MyAdder(x: Int) extends Adder(x) {
  def add(y: Int): Int = x + y
}

myNum.add(20) is 35
