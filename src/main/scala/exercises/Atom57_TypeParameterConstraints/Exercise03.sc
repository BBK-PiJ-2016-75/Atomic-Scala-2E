// Exercise03.sc
import com.atomicscala.AtomicTest._

def f1[T <: Base](t: T): String = "f1 " + t
def f2[T <: Derived](t: T): String = "f2 " + t
def f3[T <: Most](t: T): String = "f3 " + t

class Base {
  override def toString: String = "Base"
}

class Derived extends Base {
  override def toString: String = "Derived"
}

class Most extends Derived {
  override def toString: String = "Most"
}

f1(new Base) is "f1 Base"
f1(new Derived) is "f1 Derived"
f1(new Most) is "f1 Most"
f2(new Derived) is "f2 Derived"
f2(new Most) is "f2 Most"
f3(new Most) is "f3 Most"
