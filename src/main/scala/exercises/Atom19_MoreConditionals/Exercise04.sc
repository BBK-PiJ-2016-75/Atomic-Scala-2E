// Exercise04.sc
import com.atomicscala.AtomicTest._

def isPalIgnoreSpecial(str: String): Boolean = {
  var createdStr = ""
  for (c <- str) {
    val theValue = c.toInt
    if (theValue >= 65 && theValue <= 122) {
      createdStr += c
    }
    else if (theValue >= 48 && theValue <= 57) {
      createdStr += c
    }
  }
  createdStr.toLowerCase == createdStr.toLowerCase.reverse
}
isPalIgnoreSpecial("Madam I'm adam") is true
isPalIgnoreSpecial("trees") is false
