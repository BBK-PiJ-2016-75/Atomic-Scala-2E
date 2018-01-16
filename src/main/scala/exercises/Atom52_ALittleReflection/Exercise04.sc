// Exercise04.sc
import com.atomicscala.AtomicTest._
import com.atomicscala.Name2

val x = new AllAbstract with PartialAbstract with Concrete with Name2

trait AllAbstract {
  val d: Double

  def f(n: Int): Int
}

trait PartialAbstract {
  val d: Double
  val j = 42

  def f(n: Int): Int

  def g(s: String): String = s"($s)"
}

trait Concrete {
  val d = 1.61803

  def f(n: Int): Int = n * 11
}

x is "$anon"
