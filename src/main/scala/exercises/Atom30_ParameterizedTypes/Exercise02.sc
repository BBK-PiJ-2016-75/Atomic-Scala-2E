// Exercise02.sc
import com.atomicscala.AtomicTest._

def explicitList(v: Vector[Double]): List[Double] = {
  v.toList
}

explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)
