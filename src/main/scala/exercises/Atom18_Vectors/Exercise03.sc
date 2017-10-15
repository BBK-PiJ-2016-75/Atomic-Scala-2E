// Exercise03.sc
import com.atomicscala.AtomicTest._

val v1 = Vector("The", "dog", "visited", "the", "firehouse")
var sentence = ""
for (i <- v1) {
  sentence += i + " "
}
sentence is "The dog visited the firehouse "
