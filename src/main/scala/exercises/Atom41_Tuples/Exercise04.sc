// Exercise04.sc
import com.atomicscala.AtomicTest._

val (heat1, moisture1) = weather(81, 45)
val (heat2, moisture2) = weather(27, 55)

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

heat1 is "Hot"
moisture1 is "Humid"
heat2 is "Cold"
moisture2 is "Damp"
