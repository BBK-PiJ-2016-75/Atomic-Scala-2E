// Exercise03.sc
import com.atomicscala.AtomicTest._

val familyNoKids = new FlexibleFamily("Mom", "Dad")

class FlexibleFamily(parent1: String, parent2: String, children: String*) {
  def familySize: Int = {
    var size = 2
    for (_ <- children) {
      size += 1
    }
    size
  }
}

familyNoKids.familySize is 2
