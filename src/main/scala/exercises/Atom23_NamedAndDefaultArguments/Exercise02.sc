// Exercise02.sc
import com.atomicscala.AtomicTest._

val t2 = new SimpleTime2(hours = 10)

class SimpleTime2(val hours: Int, val minutes: Int = 0)

t2.hours is 10
t2.minutes is 0
