// Exercise03.sc
import com.atomicscala.AtomicTest._

val sally = new WalkActivity3

class WalkActivity3 {
  def calories(lbs: Int, mins: Int, mph: Double = 3): Long =
    math.round((WalkActivity3.MET * 3.5 * lbs * 0.45) / 200.0 * mins)
}

object WalkActivity3 {
  val MET = 2.3
  var log = ""

  def start(name: String): Unit = log += s"[$name] Activity started."

  def stop(name: String): Unit = log += s"[$name] Activity stopped."
}

sally.calories(150, 30) is 82
