// Exercise02.sc
import com.atomicscala.AtomicTest._

def convertToSize(value: Any): Any = {
  value match {
    case i: Int => i
    case s: String => s length
    case _: Person => 1
    case f: Float => f
    case _ => 0
  }
}

case class Person(name: String)

convertToSize(45) is 45
convertToSize("car") is 3
convertToSize("truck") is 5
convertToSize(Person("Joanna")) is 1
convertToSize(45.6F) is 45.6F
convertToSize(Vector(1, 2, 3)) is 0
