// Exercise04.sc
import com.atomicscala.AtomicTest._

def display(c: Colour): String = c match {
  case Red => s"It's $c"
  case Green => s"It's $c"
  case Blue => s"It's $c"
}

sealed trait Colour

case object Red extends Colour

case object Green extends Colour

case object Blue extends Colour

object Colour {
  val values = Vector(Red, Green, Blue, Red)
}

Colour.values.map(display) is "Vector(It's Red, It's Green, It's Blue, It's Red)"
