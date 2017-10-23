// Exercise06.sc
import com.atomicscala.AtomicTest._

def sumIt(num: Int*): Int = {
  num.reduce((sum, n) => sum + n)
}

sumIt(1, 2, 3) is 6
sumIt(45, 45, 45, 60) is 195
