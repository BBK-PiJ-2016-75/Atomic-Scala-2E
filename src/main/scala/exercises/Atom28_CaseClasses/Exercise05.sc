// Exercise05.sc
import com.atomicscala.AtomicTest._

val c = Dimension1(5, 7)

case class Dimension1(height: Int, var width: Int)

c.height is 5
//c.height = 10 // Doesn't work
//c.height is 10
c.width = 19
c.width is 19
