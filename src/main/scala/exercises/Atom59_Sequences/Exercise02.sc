// Exercise02.sc
import com.atomicscala.AtomicTest._

val people = Vector(Person("John", "Smith", "john@smith.com"),
  Person("Jane", "Smith", "jane@smith.com"), Person("Jessica", "Smith", "jessica@smith.com"))

case class Person(first: String, last: String, email: String) {
  def fullName: String = s"$first $last"
}

people.size is 3
