// Exercise04.sc
import com.atomicscala.AtomicTest._

def quantify(value: Any): String = {
  value match {
    case i: Int if i < 100 => "small"
    case i: Int if 100 <= i && i <= 1000 => "medium"
    case i: Int if i > 1000 => "large"
    case d: Double if d < 100.0 => "small"
    case d: Double if 100.0 <= d && d <= 1000.0 => "medium"
    case d: Double if d > 1000.0 => "large"
    case _ => "unknown type"
  }
}

quantify(100) is "medium"
quantify(20.56) is "small"
quantify(100000) is "large"
quantify(-15999) is "small"
