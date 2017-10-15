// Exercise03.sc
import com.atomicscala.AtomicTest._

def checkTruth(bool1: Boolean, bool2: Boolean): String = {
  bool1 match {
    case true => if (bool2) {
      "Both are true"
    } else {
      "First: true, Second: false"
    }
    case _ => if (bool2) {
      "First: false, Second: true"
    } else {
      "Both are false"
    }
  }
}

checkTruth(true || false, true) is "Both are true"
checkTruth(1 > 0 && -1 < 0, 1 == 2) is "First: true, Second: false"
checkTruth(1 >= 2, 1 >= 1) is "First: false, Second: true"
checkTruth(true && false, false && true) is "Both are false"
