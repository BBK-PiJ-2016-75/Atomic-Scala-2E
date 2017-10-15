// Exercise01.sc
import com.atomicscala.AtomicTest._

val v1 = Vector(1, 2, 3, 2, 1)
val v2 = Vector(1, 2, 3, 3, 2, 1)
v1 is v1.reverse
v2 is v2.reverse
