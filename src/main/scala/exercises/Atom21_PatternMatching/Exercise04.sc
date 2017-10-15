// Exercise04.sc
import com.atomicscala.AtomicTest._

def forecast(temperature: Int): String = {
  temperature match {
    case 0 => "Cloudy"
    case 20 => "Mostly Cloudy"
    case 50 => "Partly Sunny"
    case 80 => "Mostly Sunny"
    case 100 => "Sunny"
    case _ => "Unknown"
  }
}

forecast(100) is "Sunny"
forecast(80) is "Mostly Sunny"
forecast(50) is "Partly Sunny"
forecast(20) is "Mostly Cloudy"
forecast(0) is "Cloudy"
forecast(15) is "Unknown"
