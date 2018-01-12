// Exercise04.sc
import com.atomicscala.AtomicTest._
import org.apache.commons.math3.stat.Frequency

val f = new Frequency
f.addValue("cat")
f.addValue("dog")
f.addValue("cat")
f.addValue("bird")
f.addValue("cat")
f.addValue("cat")
f.addValue("kitten")
f.addValue("mouse")

f.getCount("cat") is 4
