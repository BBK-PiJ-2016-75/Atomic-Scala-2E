// Exercise02.sc
import com.atomicscala.AtomicTest._

class WalkActivity2

object WalkActivity2 {
  var log = ""

  def start(name: String): Unit = log += s"[$name] Activity started."

  def stop(name: String): Unit = log += s"[$name] Activity stopped."
}

WalkActivity2.start("Jane")
WalkActivity2.stop("Jane")
WalkActivity2.start("John")
WalkActivity2.log is "[Jane] Activity started.[Jane] Activity stopped.[John] Activity started."
