// Exercise03.sc
import com.atomicscala.AtomicTest._

val v = Vector(1, 2, 3, 5, 6, 7, 8, 10, 13, 14, 17)

def yielding3(v: Vector[Int]): Vector[Int] = {
  val result = for {
    n <- v
    if n < 10
    if n % 2 != 0
  } yield n * 10 + 2
  result
}

yielding3(v) is Vector(12, 32, 52, 72)
