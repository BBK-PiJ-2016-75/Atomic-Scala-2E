// Exercise05.sc
import com.atomicscala.AtomicTest._

val map1 = Map("English" -> "en", "French" -> "fr", "Spanish" -> "es", "German" -> "de",
  "Chinese" -> "zh")
val map2 = map1 + ("French" -> "fr")

map1.size is 5
map2.size is 5
map2.contains("English") is true
map2.contains("French") is true
