// Exercise05.sc
import com.atomicscala.AtomicTest._

val painting = new Painting("The Starry Night", 1889)

trait ArtPeriod {
  def period(year: Int): String = {
    year match {
      case y: Int if y > 1970 => "Contemporary"
      case y: Int if y > 1880 => "Modern"
      case y: Int if y > 1789 => "Romanticism"
      case y: Int if y > 1699 => "Late Baroque"
      case y: Int if y > 1599 => "Baroque"
      case y: Int if y > 1299 => "Renaissance"
      case _ => "Pre-Renaissance"
    }
  }
}

class Painting(title: String, year: Int) extends Object with ArtPeriod {
  def period: String = this.period(year)
}

painting.period is "Modern"
