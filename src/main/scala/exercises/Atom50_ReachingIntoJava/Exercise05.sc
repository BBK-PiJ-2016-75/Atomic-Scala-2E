// Exercise05.sc
import com.atomicscala.AtomicTest._
import org.apache.commons.math3.stat.descriptive.SummaryStatistics

val s = new SummaryStatistics
s.addValue(10)
s.addValue(20)
s.addValue(30)
s.addValue(80)
s.addValue(90)
s.addValue(100)
s.getMean is 55

s.getStandardDeviation is 39.370039370059054
