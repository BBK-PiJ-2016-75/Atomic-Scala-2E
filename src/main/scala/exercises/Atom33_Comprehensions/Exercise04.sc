// Exercise04.sc
import com.atomicscala.AtomicTest._

val v = Vector(1, 2, 3, 5, 6, 7, 8, 10, 13, 14, 17)

def yielding3(v: Vector[Int]): Vector[Int] = {
  for {
    n <- v // cannot be declared
    if n < 10
    isOdd = n % 2 != 0 // cannot be declared
    if isOdd
  } yield {
    val u = n * 10
    u + 2
  }
}

yielding3(v) is Vector(12, 32, 52, 72)
