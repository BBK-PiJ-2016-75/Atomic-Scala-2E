// Exercise05.sc
import com.atomicscala.AtomicTest._

def forecast(temperature: Int): String = {
  temperature match {
    case _ if temperature > 80 => "Sunny"
    case _ if temperature > 50 => "Mostly Sunny"
    case _ if temperature > 20 => "Partly Sunny"
    case _ if temperature > 0 => "Mostly Cloudy"
    case 0 => "Cloudy"
    case _ => "Unknown"
  }
}

forecast(100) is "Sunny"
forecast(81) is "Sunny"
forecast(80) is "Mostly Sunny"
forecast(51) is "Mostly Sunny"
forecast(50) is "Partly Sunny"
forecast(21) is "Partly Sunny"
forecast(20) is "Mostly Cloudy"
forecast(1) is "Mostly Cloudy"
forecast(0) is "Cloudy"
forecast(-1) is "Unknown"
