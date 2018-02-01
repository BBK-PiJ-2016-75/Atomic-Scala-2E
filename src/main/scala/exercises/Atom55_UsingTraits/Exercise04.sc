// Exercise04.sc
// From wikipedia.org/wiki/Art_periods
// Pre-Renaissance: before 1300
// Renaissance: 1300-1599
// Baroque: 1600-1699
// Late Baroque: 1700-1789
// Romanticism: 1790-1880
// Modern: 1881-1970
// Contemporary: after 1971
import com.atomicscala.AtomicTest._

val art = new Object with ArtPeriod

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

art.period(1400) is "Renaissance"
art.period(1650) is "Baroque"
art.period(1279) is "Pre-Renaissance"
