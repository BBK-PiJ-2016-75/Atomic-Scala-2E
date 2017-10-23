// Exercise07.sc
import com.atomicscala.AtomicTest._

val numbers = Vector(1, 2, 5, 3, 7)
var s = ""
numbers.foreach(num => s += num * num + " ")

s is "1 4 25 9 49 "
