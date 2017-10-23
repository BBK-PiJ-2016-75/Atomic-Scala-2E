// Exercise04.sc
import com.atomicscala.AtomicTest._

import scala.collection.immutable.VectorBuilder

val v = Vector(1, 2, 3, 4)
var newV = new VectorBuilder[Int]
for (i <- v) {
  newV += i + 1
}

newV.result is Vector(2, 3, 4, 5)
