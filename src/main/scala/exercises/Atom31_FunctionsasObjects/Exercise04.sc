// Exercise04.sc
import com.atomicscala.AtomicTest._

val v = Vector(1, 5, 7, 8)
val dogYears = (age: Int) => age * 7
var s = ""
v.foreach(n => s += dogYears(n) + " ")

s is "7 35 49 56 "
