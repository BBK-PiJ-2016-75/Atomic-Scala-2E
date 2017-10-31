// Exercise03.sc
import com.atomicscala.AtomicTest._

def convertToSize2(value: Any): Int = {
  value match {
    case i: Int => i
    case s: String => s length
    case _: Person => 1
    case f: Float => f round
    case _ => 0
  }
}

case class Person(name: String)

convertToSize2(45) is 45
convertToSize2("car") is 3
convertToSize2("truck") is 5
convertToSize2(Person("Joanna")) is 1
convertToSize2(45.6F) is 46
convertToSize2(Vector(1, 2, 3)) is 0
