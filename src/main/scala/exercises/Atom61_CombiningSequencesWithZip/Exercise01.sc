// Exercise01.sc
import com.atomicscala.AtomicTest._

val people = Vector("Sally Smith", "Dan Jones", "Tom Brown", "Betsy Blanc", "Stormy Morgan",
  "Hal Goodsen")

val group1 = people.take(3)
val group2 = people.takeRight(3)
val pairs = group1.zip(group2)

pairs is Vector(("Sally Smith", "Betsy Blanc"), ("Dan Jones", "Stormy Morgan"),
  ("Tom Brown", "Hal Goodsen"))
