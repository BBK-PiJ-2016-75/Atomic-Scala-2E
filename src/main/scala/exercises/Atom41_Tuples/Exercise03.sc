// Exercise03.sc
import com.atomicscala.AtomicTest._

def weather(temperature: Int, humidity: Int): (String, String) = {
  if (humidity > 40) {
    if (temperature > 80) {
      ("Hot", "Humid")
    } else if (temperature < 50) {
      ("Cold", "Damp")
    } else {
      ("Temperate", "Humid")
    }
  } else {
    if (temperature > 80) {
      ("Hot", "Pleasant")
    } else if (temperature < 50) {
      ("Cold", "Pleasant")
    } else {
      ("Temperate", "Pleasant")
    }
  }
}

weather(81, 45) is("Hot", "Humid")
weather(50, 45) is("Temperate", "Humid")
