// Exercise04.sc
import com.atomicscala.AtomicTest._

val weather = Vector(100, 80, 20, 100, 20)

def historicalData(temperatures: Vector[Int]): String = {
  var mostlyCloudy = 0
  var mostlySunny = 0
  var sunny = 0

  for (i <- temperatures) {
    i match {
      case 20 => mostlyCloudy += 1
      case 80 => mostlySunny += 1
      case 100 => sunny += 1
    }
  }

  s"Sunny=$sunny, Mostly Sunny=$mostlySunny, Mostly Cloudy=$mostlyCloudy"
}

historicalData(weather) is "Sunny=2, Mostly Sunny=1, Mostly Cloudy=2"
