// Exercise01.sc
import com.atomicscala.AtomicTest._

val t = new SimpleTime(hours = 5, minutes = 30)

class SimpleTime(val hours: Int, val minutes: Int)

t.hours is 5
t.minutes is 30
