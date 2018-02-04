// Exercise03.sc
import com.atomicscala.AtomicTest._

def sumIt(ints: List[Int]): Int = {
  ints.reduce((sum, n) => sum + n)
}

sumIt(List(1, 2, 3)) is 6
sumIt(List(45, 45, 45, 60)) is 195
