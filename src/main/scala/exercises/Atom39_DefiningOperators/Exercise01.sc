// Exercise01.sc
import com.atomicscala.AtomicTest._

val someT1 = new SimpleTime2(10, 30)
val someT2 = new SimpleTime2(9, 30)
val someST = someT1 - someT2
val someST2 = new SimpleTime2(10, 30) - new SimpleTime2(9, 45)

class SimpleTime2(val hours: Int, val minutes: Int) {
  def -(subtrahend: SimpleTime2): SimpleTime2 = {
    var newHours = 0
    var newMinutes = 0
    if (hours > subtrahend.hours) {
      newHours = hours - subtrahend.hours
    }
    if (minutes < subtrahend.minutes) {
      newHours -= 1
      newMinutes = 60 - (subtrahend.minutes - minutes)
    } else {
      newMinutes = minutes - subtrahend.minutes
    }
    new SimpleTime2(newHours, newMinutes)
  }
}

someST.hours is 1
someST.minutes is 0
someST2.hours is 0
someST2.minutes is 45
