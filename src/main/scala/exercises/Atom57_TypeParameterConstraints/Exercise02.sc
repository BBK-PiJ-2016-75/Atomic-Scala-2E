// Exercise02.sc
import com.atomicscala.AtomicTest._

def callF[T <: WithF](t: T, n: Int): Int = t.f(n)

class WithF {
  def f(n: Int): Int = n * 11
}

callF(new WithF, 2) is 22
callF(new WithF {
  override def f(n: Int): Int = n * 7
}, 2) is 14
