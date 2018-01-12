// Exercise03.sc
import com.atomicscala.AtomicTest._

val fun = new FunStuff

class FunStuff {
  var internal = "all the fun happens here"

  def x: String = internal

  def x_=(newVal: String): Unit = internal = newVal
}

fun.x is "all the fun happens here"
fun.x = "make it so"
fun.x is "make it so"
