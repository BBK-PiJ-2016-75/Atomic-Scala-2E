// Exercise07.sc
import com.atomicscala.AtomicTest._

val v1 = Vector(1, 2, 3, 4, 5)
val v2 = Vector(1.1, 2.2, 3.3, 4.4, 5.5)
v1.sum is 15
v1.min is 1
v1.max is 5
v2.sum is 16.5
v2.min is 1.1
v2.max is 5.5
