// Exercise01.sc
import com.atomicscala.AtomicTest._

val c = new Dimension(5, 7)

class Dimension(var height: Int, var width: Int)

c.height is 5
c.height = 10
c.height is 10
c.width = 19
c.width is 19
