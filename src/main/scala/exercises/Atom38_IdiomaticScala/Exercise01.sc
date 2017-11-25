// Exercise01.sc
import com.atomicscala.AtomicTest._

val z = false
val result = if (99 > 100) 4 else 42
var zString = ""

if (z) zString = "It's true" else zString = "It's false"

zString is "It's false"
result is 42
