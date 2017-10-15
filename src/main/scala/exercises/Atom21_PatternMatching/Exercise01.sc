// Exercise01.sc
import com.atomicscala.AtomicTest._

def matchColour(colour: String): String = {
  if (colour == "red") {
    "RED"
  } else if (colour == "blue") {
    "BLUE"
  } else if (colour == "green") {
    "GREEN"
  } else {
    "UNKNOWN COLOUR: " + colour
  }
}

matchColour("white") is "UNKNOWN COLOUR: white"
matchColour("blue") is "BLUE"
