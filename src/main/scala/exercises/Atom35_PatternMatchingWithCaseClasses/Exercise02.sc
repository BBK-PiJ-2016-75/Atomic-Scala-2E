// Exercise02.sc
import com.atomicscala.AtomicTest._

def travel2(transport: Any): String = {
  transport match {
    case Passenger(first, _) => s"$first is walking"
    case what: Any => s"$what is in limbo!"
  }
}

case class Passenger(first: String, last: String)

travel2(Passenger("Sally", "Marie")) is "Sally is walking"
