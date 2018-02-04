// Exercise06.sc
import com.atomicscala.AtomicTest._

val friends3 = Vector(new Friend("Zach", "Smith", "zach@smith.com"),
  new Friend("Mary", "Add", "mary@add.com"), new Friend("Sally", "Taylor", "sally@taylor.com"),
  new Friend("Mary", "Smith", "mary@smith.com"))
val s3 = friends3.sortBy(_.last)
val s4 = s3.sortBy(_.first)

trait Contact {
  val email: String
}

class Person(val first: String, val last: String) {
  override def toString: String = s"$first $last"
}

class Friend(first: String, last: String, val email: String) extends Person(first, last) with Contact

s4 is "Vector(Mary Add, Mary Smith, Sally Taylor, Zach Smith)"
