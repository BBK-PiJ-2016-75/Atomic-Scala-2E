// Exercise06.sc
import com.atomicscala.AtomicTest._

val map1 = Map("English" -> "en", "French" -> "fr", "Spanish" -> "es", "German" -> "de",
  "Chinese" -> "zh")
val map2 = map1 - "Spanish"

map1.size is 5
map1.contains("Spanish") is true
map2.size is 4
map2.contains("Spanish") is false
