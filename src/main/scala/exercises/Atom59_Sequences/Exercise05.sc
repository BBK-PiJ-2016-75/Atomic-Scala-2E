// Exercise05.sc
import com.atomicscala.AtomicTest._

val friends2 = Vector(new Friend("Zach", "Smith", "zach@smith.com"),
  new Friend("Mary", "Add", "mary@add.com"), new Friend("Sally", "Taylor", "sally@taylor.com"),
  new Friend("Mary", "Smith", "mary@smith.com"))
val s1 = friends2.sortBy(_.first)
val s2 = s1.sortBy(_.last)

trait Contact {
  val email: String
}

class Person(val first: String, val last: String) {
  override def toString: String = s"$first $last"
}

class Friend(first: String, last: String, val email: String) extends Person(first, last) with Contact

s2 is "Vector(Mary Add, Mary Smith, Zach Smith, Sally Taylor)"
