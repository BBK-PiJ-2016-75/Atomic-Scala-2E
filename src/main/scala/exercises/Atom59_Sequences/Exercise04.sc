// Exercise04.sc
import com.atomicscala.AtomicTest._

val friends = Vector(new Friend("Zach", "Smith", "zach@smith.com"),
  new Friend("Mary", "Add", "mary@add.com"), new Friend("Sally", "Taylor", "sally@taylor.com"))
val sorted = friends.sortBy(_.email)

trait Contact {
  val email: String
}

class Person(val first: String, val last: String) {
  override def toString: String = s"$first $last"
}

class Friend(first: String, last: String, val email: String) extends Person(first, last) with Contact

sorted is "Vector(Mary Add, Sally Taylor, Zach Smith)"
