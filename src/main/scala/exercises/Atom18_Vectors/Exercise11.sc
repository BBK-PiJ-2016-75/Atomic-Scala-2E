// Exercise11.sc
import com.atomicscala.AtomicTest._

val l1 = List("This", "list", "is", "a", "list", "of", "words")
val s1 = Set("This", "set", "is", "a", "set", "of", "words")
var listSentence = ""
var setSentence = ""
for (i <- l1) {
  listSentence += i + " "
}
for (i <- s1) {
  setSentence += i + " "
}
listSentence is "This list is a list of words "
l1.sorted is List("This", "a", "is", "list", "list", "of", "words")
l1.reverse is List("words", "of", "list", "a", "is", "list", "This")
setSentence is "is This set a words of "
