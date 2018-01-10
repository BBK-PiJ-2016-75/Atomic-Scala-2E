// Exercise04.sc
import com.atomicscala.AtomicTest._

val v = new VacationHouse("MI", "49431", 6, 8)

class House(val address: String, val state: String, val zip: String) {
  def this(state: String, zip: String) = this("address?", state, zip)

  def this(zip: String) = this("address?", "state?", zip)
}

class VacationHouse(state: String, zip: String, val startMonth: Int, val endMonth: Int)
  extends House(state, zip) {
  override def toString = "Rented house in " + state + " for months of " + monthName(startMonth) +
    " through " + monthName(endMonth) + "."

  def monthName(month: Int): String = month match {
    case 1 => "January"
    case 2 => "February"
    case 3 => "March"
    case 4 => "April"
    case 5 => "May"
    case 6 => "June"
    case 7 => "July"
    case 8 => "August"
    case 9 => "September"
    case 10 => "October"
    case 11 => "November"
    case 12 => "December"
    case _ => month.toString
  }
}

v is "Rented house in MI for months of June through August."
