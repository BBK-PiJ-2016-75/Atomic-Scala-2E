// Exercise03.sc
import com.atomicscala.AtomicTest._

def monthNumber(name: MonthName): Int = name.id

import MonthName._

object MonthName extends Enumeration {
  type MonthName = Value
  val January = Value(1)
  val February, March, April, May, June, July, August, September, October, November, December = Value
}

July is "July"
monthNumber(July) is 7
