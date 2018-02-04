// Exercise01.sc
import com.atomicscala.AtomicTest._

val p = Person("John", "Smith", "john@smith.com")

case class Person(first: String, last: String, email: String) {
  def fullName: String = s"$first $last"
}

p.fullName is "John Smith"
p.first is "John"
p.email is "john@smith.com"
