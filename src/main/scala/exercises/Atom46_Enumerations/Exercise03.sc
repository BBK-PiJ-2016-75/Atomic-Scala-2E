// Exercise03.sc
import com.atomicscala.AtomicTest._

object MonthName extends Enumeration {
  type MonthName = Value
  val January = Value(1)
  val February, March, April, May, June, July, August, September, October, November, December = Value
}

import MonthName._

def monthNumber(name: MonthName): Int = name.id

July is "July"
monthNumber(July) is 7
