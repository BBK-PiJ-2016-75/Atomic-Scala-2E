// Exercise01.sc
import com.atomicscala.AtomicTest._

def plus1(value: Any): Any = {
  value match {
    case s: String => s + "s"
    case i: Int => i + 1
    case p: Person => "Person(" + p.name + ") + guest"
    case _ => "Unknown value"
  }
}

case class Person(name: String)

plus1("car") is "cars"
plus1(67) is 68
plus1(Person("Joanna")) is "Person(Joanna) + guest"
