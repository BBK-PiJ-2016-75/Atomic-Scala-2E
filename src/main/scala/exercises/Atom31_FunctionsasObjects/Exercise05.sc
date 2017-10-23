// Exercise05.sc
import com.atomicscala.AtomicTest._

val v = Vector(1, 5, 7, 8)
var s = ""
v.foreach(num => s += num * 7 + " ")

s is "7 35 49 56 "
