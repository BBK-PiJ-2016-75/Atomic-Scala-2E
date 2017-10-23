// Exercise08.sc
import com.atomicscala.AtomicTest._

val pluralize = (word: String) => word + "s"

pluralize("cat") is "cats"
pluralize("dog") is "dogs"
pluralize("silly") is "sillys"
