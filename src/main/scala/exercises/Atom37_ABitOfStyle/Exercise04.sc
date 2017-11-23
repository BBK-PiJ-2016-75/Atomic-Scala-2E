// Exercise04.sc
import com.atomicscala.AtomicTest._

val e4 = new Exclaim4("counting")

class Exclaim4(s: String) {
  var count = 0

  def exclamation(): String = {
    count += 1
    s + "!"
  }
}

e4.exclamation() is "counting!" // Call exclamation method
e4.exclamation() is "counting!" // Call exclamation method again
e4.count is 2
