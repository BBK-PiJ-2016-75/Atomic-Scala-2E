// Exercise01.sc
import com.atomicscala.AtomicTest._

val p = Person("Jane", "Smile", "jane@smile.com")

case class Person(first: String, last: String, email: String)

p.first is "Jane"
p.last is "Smile"
p.email is "jane@smile.com"
