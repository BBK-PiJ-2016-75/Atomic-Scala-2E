// Exercise01.sc
import com.atomicscala.AtomicTest._

val d = new Derived

abstract class Base {
  val d1: Int
  val d2: Int
  var d3: Int
  var n = 1

  def f1: Int

  def f2: Int
}

class Derived extends Base {
  val d1 = 1
  // Can't do this; must be a val:
  // def d2 = 1
  val d2 = 1
  val f2 = 1 // Was def, now val
  def f1: Int = 1

  def d3: Int = n

  def d3_=(newVal: Int): Unit = n = newVal
}

d.d3 is 1 // Calls getter (line 20)
d.d3 = 42 // Calls setter (line 21)
d.d3 is 42
