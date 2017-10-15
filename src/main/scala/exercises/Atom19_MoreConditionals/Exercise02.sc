// Exercise02.sc
import com.atomicscala.AtomicTest._

def isPalindrome(str: String): Boolean = {
  str == str.reverse
}
isPalindrome("mom") is true
isPalindrome("dad") is true
isPalindrome("street") is false
