// Exercise01.sc
import com.atomicscala.AtomicTest._

def explicitDouble(d1: Double, d2: Double, d3: Double): Vector[Double] = {
  Vector(d1, d2, d3)
}

explicitDouble(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)
