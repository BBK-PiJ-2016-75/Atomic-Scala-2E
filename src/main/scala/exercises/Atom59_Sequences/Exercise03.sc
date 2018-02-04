// Exercise03.sc
import com.atomicscala.AtomicTest._

val people = Vector(Person("Zach", "Smith", "zach@smith.com"), Person("Mary", "Add", "mary@add.com"),
  Person("Sally", "Taylor", "sally@taylor.com")
)
val sorted = people.sortBy(_.last)

case class Person(first: String, last: String, email: String) {
  def fullName: String = s"$first $last"
}

sorted is "Vector(Person(Mary,Add,mary@add.com), Person(Zach,Smith,zach@smith.com), " +
  "Person(Sally,Taylor,sally@taylor.com))"
