// Exercise03.sc
import com.atomicscala.AtomicTest._

def isPalIgnoreCase(str: String): Boolean = {
  str.toLowerCase == str.toLowerCase.reverse
}
isPalIgnoreCase("Bob") is true
isPalIgnoreCase("DAD") is true
isPalIgnoreCase("Blob") is false
