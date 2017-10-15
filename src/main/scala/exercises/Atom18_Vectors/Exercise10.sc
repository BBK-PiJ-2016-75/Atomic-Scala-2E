// Exercise10.sc
import com.atomicscala.AtomicTest._

val l1 = List(1, 2, 3, 4, 5)
l1.sum is 15
l1.min is 1
l1.max is 5
l1.reverse is List(5, 4, 3, 2, 1)

val s1 = Set(1, 2, 3, 4, 5)
s1.sum is 15
s1.min is 1
s1.max is 5
