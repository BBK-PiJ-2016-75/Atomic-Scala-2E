// Exercise02.sc
import com.atomicscala.AtomicTest._

val v = Vector(1, 2, 3, 4)

v.foreach(n => n * 11 + 10) is Vector(21, 32, 43, 54)
