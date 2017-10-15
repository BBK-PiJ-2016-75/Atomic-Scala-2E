// Exercise02.sc
import com.atomicscala.AtomicTest._

val v = Vector(1)
val v2 = Vector(3, 4)

def oneOrTheOther(bool: Boolean): String = {
  bool match {
    case true => "True!"
    case _ => "It's false"
  }
}

oneOrTheOther(v == v.reverse) is "True!"
oneOrTheOther(v2 == v2.reverse) is "It's false"
