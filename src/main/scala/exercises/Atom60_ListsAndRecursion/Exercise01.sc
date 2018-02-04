// Exercise01.sc
import com.atomicscala.AtomicTest._

val aList = List(10, 20, 45, 15, 30)

def max(ints: List[Int]): Int = {
  if (ints.isEmpty) {
    0
  } else {
    val tailMax = max(ints.tail)
    if (ints.head > tailMax) {
      ints.head
    } else {
      tailMax
    }
  }
}

max(aList) is 45
