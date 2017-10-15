// Exercise01.sc

val sailboat = new Sailboat
val r1 = sailboat.raise()
val r2 = sailboat.lower()
assert(r1 == "Sails raised", "Expected: Sails raised, Got: " + r1)
assert(r2 == "Sails lowered", "Expected: Sails lowered, Got: " + r2)
println(r1, r2)
val motorboat = new Motorboat
val s1 = motorboat.on()
val s2 = motorboat.off()
assert(s1 == "Motor on", "Expected: Motor on, Got: " + s1)
assert(s2 == "Motor off", "Expected: Motor off, Got: " + s2)
println(s1, s2)

class Sailboat {
  def raise(): String = {
    "Sails raised"
  }

  def lower(): String = {
    "Sails lowered"
  }
}

class Motorboat {
  def on(): String = {
    "Motor on"
  }

  def off(): String = {
    "Motor off"
  }
}
