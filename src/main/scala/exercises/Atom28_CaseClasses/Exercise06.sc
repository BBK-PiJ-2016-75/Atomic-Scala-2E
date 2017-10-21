// Exercise06.sc
import com.atomicscala.AtomicTest._

val anotherT1 = SimpleTimeDefault(10, 30)
val anotherT2 = SimpleTimeDefault(9)
val anotherST = anotherT1.subtract(anotherT2)
val anotherST2 = SimpleTimeDefault(10).subtract(SimpleTimeDefault(9, 45))

case class SimpleTimeDefault(hours: Int, minutes: Int = 0) {
  def subtract(subtrahend: SimpleTimeDefault): SimpleTimeDefault = {
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
    SimpleTimeDefault(newHours, newMinutes)
  }
}

anotherST.hours is 1
anotherST.minutes is 30
anotherST2.hours is 0
anotherST2.minutes is 15
