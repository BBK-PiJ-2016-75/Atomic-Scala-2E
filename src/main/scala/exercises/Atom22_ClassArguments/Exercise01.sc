// Exercise01.sc
import com.atomicscala.AtomicTest._

val family1 = new Family("Mom", "Dad", "Sally", "Dick")
val family2 = new Family("Dad", "Mom", "Harry")

class Family(names: String*) {
  def familySize: Int = {
    var size = 0
    for (_ <- names) {
      size += 1
    }
    size
  }
}

family1.familySize is 4
family2.familySize is 3
