// Exercise04.sc
import com.atomicscala.AtomicTest._

val t1 = new SimpleTime(10, 30)
val t2 = new SimpleTime(9, 30)
val st = t1.subtract(t2)
val st2 = new SimpleTime(10, 30).subtract(new SimpleTime(9, 45))
val st3 = new SimpleTime(9, 30).subtract(new SimpleTime(10, 0))

class SimpleTime(val hours: Int, val minutes: Int) {
  def subtract(subtrahend: SimpleTime): SimpleTime = {
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
    new SimpleTime(newHours, newMinutes)
  }
}

st.hours is 1
st.minutes is 0
st2.hours is 0
st2.minutes is 45
st3.hours is 0
st3.minutes is 0
