// Exercise01.sc
import com.atomicscala.AtomicTest._

object MonthName extends Enumeration {
  type MonthName = Value
  val January, February, March, April, May, June, July, August, September, October, November,
  December = Value
}

MonthName.February is "February"
MonthName.February.id is 1
