// Exercise06.sc
import com.atomicscala.AtomicTest._

val myTemperature = new Temperature

class Temperature {
  var current = 0.0
  var scale = "f"

  def getFahrenheit: Double = {
    if (scale == "f") {
      current
    } else {
      var currentTemp = current
      if (scale == "k") {
        currentTemp -= 273.15
      }
      currentTemp * 9.0 / 5.0 + 32
    }
  }

  def setFahrenheit(now: Double): Unit = {
    current = now
    scale = "f"
  }

  def getKelvin: Double = {
    if (scale == "k") {
      current
    } else {
      getCelsius + 273.15
    }
  }

  def getCelsius: Double = {
    if (scale == "c") {
      current
    } else if (scale == "k") {
      current - 273.15
    } else {
      (current - 32) * 5.0 / 9.0
    }
  }

  def setCelsius(now: Double): Unit = {
    current = now
    scale = "c"
  }

  def setKelvin(now: Double): Unit = {
    current = now
    scale = "k"
  }
}

myTemperature.setFahrenheit(0)
myTemperature.getFahrenheit is 0
myTemperature.getCelsius is -17.77777777777778
myTemperature.getKelvin is 255.3722222222222
myTemperature.setCelsius(0)
myTemperature.getFahrenheit is 32
myTemperature.getCelsius is 0
myTemperature.getKelvin is 273.15
myTemperature.setKelvin(0)
myTemperature.getFahrenheit is -459.66999999999996
myTemperature.getCelsius is -273.15
myTemperature.getKelvin is 0
