// Exercise06.sc
import com.atomicscala.AtomicTest._

val auxT1 = new SimpleTimeAux(10, 5)
val auxT2 = new SimpleTimeAux(6)
val auxST = auxT1.subtract(auxT2)
val auxST2 = new SimpleTimeAux(12).subtract(new SimpleTimeAux(9, 45))

class SimpleTimeAux(val hours: Int, val minutes: Int) {
  def this(hours: Int) = {
    this(hours, 0)
  }

  def subtract(subtrahend: SimpleTimeAux): SimpleTimeAux = {
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
    new SimpleTimeAux(newHours, newMinutes)
  }
}

auxST.hours is 4
auxST.minutes is 5
auxST2.hours is 2
auxST2.minutes is 15
