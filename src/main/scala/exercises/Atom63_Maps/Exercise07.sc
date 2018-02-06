// Exercise07.sc
import com.atomicscala.AtomicTest._

val m = Map(Person("Janice") -> "CFO")

case class Person(name: String)

m(Person("Janice")) is "CFO"
