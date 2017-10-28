// Exercise02.sc
import com.atomicscala.AtomicTest._

val theList = List(1, 2, 3, 5, 6, 7, 8, 10, 13, 14, 17)

def yielding2(v: List[Int]): List[Int] = {
  for {
    n <- v
    if n < 10
    isOdd = n % 2 != 0
    if isOdd
  } yield n
}

yielding2(theList) is List(1, 3, 5, 7)
