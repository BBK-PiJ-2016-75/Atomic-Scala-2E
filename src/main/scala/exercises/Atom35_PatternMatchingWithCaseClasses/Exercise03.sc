// Exercise03.sc
import com.atomicscala.AtomicTest._

def travel2(transport: Any): String = {
  transport match {
    case Passenger(first, _) => s"$first is walking"
    case what: Any => s"$what is in limbo!"
  }
}

case class Passenger(first: String, last: String)

case class Kitten(name: String)

travel2(Kitten("Kitty")) is "Kitten(Kitty) is in limbo!"
