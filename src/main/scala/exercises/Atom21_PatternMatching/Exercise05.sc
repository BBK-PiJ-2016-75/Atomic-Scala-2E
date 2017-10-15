// Exercise05.sc

val sunnyData = Vector(100, 80, 50, 20, 0, 15)

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

for (i <- sunnyData) {
  println(forecast(i))
}
