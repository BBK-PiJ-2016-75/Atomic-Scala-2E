// Exercise01.sc
import com.atomicscala.AtomicTest._

val v1 = Vector(1, 2, 3, 4, 5)
val v2 = Vector(1.1, 2.2, 3.3, 4.4, 5.5)
val v3 = Vector("One", "Two", "Three", "Four", "Five")
val v4 = Vector(Range(0, 1), Range(1, 2), Range(2, 3), Range(3, 4), Range(4, 5))
v1 is Vector(1, 2, 3, 4, 5)
v2 is Vector(1.1, 2.2, 3.3, 4.4, 5.5)
v3 is Vector("One", "Two", "Three", "Four", "Five")
v4 is Vector(Range(0, 1), Range(1, 2), Range(2, 3), Range(3, 4), Range(4, 5))
