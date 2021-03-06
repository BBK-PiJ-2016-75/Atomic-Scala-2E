// Exercise01.sc
import com.atomicscala.AtomicTest._

val mo1 = new Overloading1
val mo2 = new Overloading2

class Overloading1 {
  def f(n: Int): Int = {
    88
  }

  def f(n: Int): Int = {
    n + 2
  }
}

class Overloading2 {
  def f(n: Int): Int = {
    99
  }

  def f(n: Int): Int = {
    n + 3
  }
}

mo1.f(0) is 88
mo1.f(11) is 13
mo2.f(0) is 99
mo2.f(11) is 14
