// Exercise04.sc
import com.atomicscala.AtomicTest._

val r2 = addMultiply(7, 9, "Inside addMultiply")

def addMultiply(x: Int, y: Double, s: String) = {
  println(s)
  (x + y) * 2.1
}

r2 is 33.6
