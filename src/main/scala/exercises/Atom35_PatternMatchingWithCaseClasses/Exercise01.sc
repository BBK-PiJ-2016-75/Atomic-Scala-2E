// Exercise01.sc
import com.atomicscala.AtomicTest._

val travelers = Vector(Passenger("Harvey", "Rabbit"), Passenger("Dorothy", "Gale"))
val trip2 = Vector(Train(travelers, "Reading"), Plane(travelers, "B757"), Bus(travelers, 100))

def travel(transport: Any): String = {
  transport match {
    case Train(passengers, line) => s"Train line $line $passengers"
    case Bus(passengers, capacity) => s"Bus size $capacity $passengers"
    case Plane(passengers, model) => s"Plane $model $passengers"
    case Passenger => "Walking along"
    case what: Any => s"$what is in limbo!"
  }
}

case class Passenger(first: String, last: String)

case class Train(passengers: Vector[Passenger], line: String)

case class Bus(passengers: Vector[Passenger], capacity: Int)

case class Plane(passengers: Vector[Passenger], model: String)

travel(trip2(1)) is "Plane B757 Vector(Passenger(Harvey,Rabbit), Passenger(Dorothy,Gale))"
