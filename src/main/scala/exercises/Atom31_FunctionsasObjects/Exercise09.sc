// Exercise09.sc
import com.atomicscala.AtomicTest._

val pluralize = (word: String) => word + "s"
var s = ""
val words = Vector("word", "cat", "animal")
words.foreach(vectorWord => s += pluralize(vectorWord) + " ")

s is "words cats animals "
