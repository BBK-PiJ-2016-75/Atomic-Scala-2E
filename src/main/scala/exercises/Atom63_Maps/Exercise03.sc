// Exercise03.sc
import com.atomicscala.AtomicTest._

val m = Map("sally@taylor.com" -> Name("Sally", "Taylor"))
val m2 = m + ("jiminy@cricket.com" -> Name("Jiminy", "Cricket"))

case class Name(firstName: String, lastName: String)

m2("jiminy@cricket.com") is Name("Jiminy", "Cricket")
m2("sally@taylor.com") is Name("Sally", "Taylor")
