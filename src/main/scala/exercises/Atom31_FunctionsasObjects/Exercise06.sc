// Exercise06.sc
import com.atomicscala.AtomicTest._

val between = (temperature: Int, low: Int, high: Int) => low < temperature && temperature < high

between(70, 80, 90) is false
between(70, 60, 90) is true
