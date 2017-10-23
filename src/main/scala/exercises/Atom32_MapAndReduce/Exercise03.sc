// Exercise03.sc
import com.atomicscala.AtomicTest._

import scala.collection.immutable.VectorBuilder

val v = Vector(1, 2, 3, 4)
var newV = new VectorBuilder[Int]
for (i <- v) {
  newV += i * 11 + 10
}

newV.result is Vector(21, 32, 43, 54)
