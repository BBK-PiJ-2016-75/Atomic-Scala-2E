// Exercise02.sc
import com.atomicscala.AtomicTest._

val numbers = Vector(1, 2, 3, 4)
var str = ""
numbers.foreach(num => str += num + ",")

str is "1,2,3,4,"
