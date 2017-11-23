// Exercise01.sc
import com.atomicscala.AtomicTest._

val e = new Exclaim("yes")

class Exclaim(s: String) {
  def noParens: String = s + "!"

  def parens(): String = s + "!"
}

e.noParens is "yes!"
e.parens() is "yes!"
