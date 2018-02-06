// Exercise04.sc
import com.atomicscala.AtomicTest._

val map1 = Map("English" -> "en", "French" -> "fr", "Spanish" -> "es", "German" -> "de",
  "Chinese" -> "zh")
val map2 = map1 + ("Turkish" -> "tr")

map1.size is 5
map2.size is 6
map2.contains("English") is true
map2.contains("Turkish") is true
