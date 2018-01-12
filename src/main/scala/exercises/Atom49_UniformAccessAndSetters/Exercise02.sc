// Exercise02.sc
import com.atomicscala.AtomicTest._

val d = new Derived(1)

class Base(var d3: Int) {
  val d1: Int = 99
  val d2: Int = 99
  var n = 1

  def f1: Int = 99

  def f2: Int = 99
}

class Derived(d3: Int) extends Base(d3) {
  override val d1 = 1
  // Can't do this; must be a val:
  // def d2 = 1
  override val d2 = 1
  override val f2 = 1 // Was def, now val
  override def f1: Int = 1
}

d.d3 is 1 // Calls getter (line 20)
d.d3 = 42 // Calls setter (line 21)
d.d3 is 42
