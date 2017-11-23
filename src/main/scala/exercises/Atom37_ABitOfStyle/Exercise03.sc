// Exercise03.sc
import com.atomicscala.AtomicTest._

val e3 = new Exclaim3("yes")

class Exclaim3(s: String) {
  def noParens: String = s + "!"
}

e3.noParens is "yes!"
