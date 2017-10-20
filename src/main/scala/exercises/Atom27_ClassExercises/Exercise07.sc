// Exercise07.sc
import com.atomicscala.AtomicTest._

val namedST = new SimpleTimeNamed(hours = 9)
val anotherNamedST = new SimpleTimeNamed(minutes = 30)

class SimpleTimeNamed(val hours: Int = 0, val minutes: Int = 0) {
  def subtract(subtrahend: SimpleTimeNamed): SimpleTimeNamed = {
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
    new SimpleTimeNamed(newHours, newMinutes)
  }
}

namedST.hours is 9
namedST.minutes is 0
anotherNamedST.hours is 0
anotherNamedST.minutes is 30
