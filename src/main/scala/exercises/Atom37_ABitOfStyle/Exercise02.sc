// Exercise02.sc
import com.atomicscala.AtomicTest._

val e2 = new Exclaim2("yes")

class Exclaim2(s: String) {
  val noParens = s + "!"

  def parens(): String = s + "!"
}

e2.noParens is "yes!"
e2.parens() is "yes!"
