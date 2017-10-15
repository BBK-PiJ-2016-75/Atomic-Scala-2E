// Exercise04.sc
import com.atomicscala.AtomicTest._

val sentence = "The dog visited the firehouse "
val theString = sentence replace("firehouse ", "firehouse!")
theString is "The dog visited the firehouse!"
