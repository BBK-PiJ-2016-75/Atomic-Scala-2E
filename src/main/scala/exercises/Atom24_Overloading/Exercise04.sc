// Exercise04.sc
import com.atomicscala.AtomicTest._

val myOverloaded = new Overloaded

class Overloaded {
  def f: Int = {
    0
  }

  def f: Double = {
    0
  }

  def f(i: Int): Int = {
    i
  }

  def f(i: Int): Double = {
    i
  }

  def f(i: Int, i1: Int): Int = {
    i + i1
  }

  def f(i: Int, i1: Int): Double = {
    i + i1
  }

  def f(i: Int, i1: Int, i2: Int): Int = {
    i + i1 + i2
  }

  def f(i: Int, i1: Int, i2: Int): Double = {
    i + i1 + i2
  }

  def f(i: Int, i1: Int, i2: Int, i3: Int): Int = {
    i + i1 + i2 + i3
  }

  def f(i: Int, i1: Int, i2: Int, i3: Int): Double = {
    i + i1 + i2 + i3
  }
}

myOverloaded.f is 0
myOverloaded f 1 is 1
myOverloaded f(1, 2) is 3
myOverloaded f(1, 2, 3) is 6
myOverloaded f(1, 2, 3, 4) is 10
