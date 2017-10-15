// Exercise02.sc
import com.atomicscala.AtomicTest._

val family3 = new FlexibleFamily("Mom", "Dad", "Sally", "Dick")
val family4 = new FlexibleFamily("Dad", "Mom", "Harry")

class FlexibleFamily(parent1: String, parent2: String, children: String*) {
  def familySize: Int = {
    var size = 2
    for (_ <- children) {
      size += 1
    }
    size
  }
}

family3.familySize is 4
family4.familySize is 3
