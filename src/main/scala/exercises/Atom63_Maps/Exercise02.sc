// Exercise02.sc
import com.atomicscala.AtomicTest._

val m = Map("sally@taylor.com" -> Name("Sally", "Taylor"))

case class Name(firstName: String, lastName: String)

m("sally@taylor.com") is Name("Sally", "Taylor")
