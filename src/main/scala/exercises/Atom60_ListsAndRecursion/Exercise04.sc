// Exercise04.sc
import com.atomicscala.AtomicTest._

val animalList = List("cat", "dog", "cat", "bird", "cat", "cat", "kitten", "mouse")

def calcFreq(stringList: List[String], stringToCount: String, total: Int = 0): Int = {
  if (stringList.isEmpty) {
    total
  } else if (stringList.head == stringToCount) {
    calcFreq(stringList.tail, stringToCount, total + 1)
  } else {
    calcFreq(stringList.tail, stringToCount, total)
  }
}

calcFreq(animalList, "cat") is 4
calcFreq(animalList, "dog") is 1
