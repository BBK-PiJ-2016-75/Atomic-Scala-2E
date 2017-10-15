// Exercise03.sc

val sailboat2 = new Sailboat2
val signal1 = sailboat2.signal()
val motorboat2 = new Motorboat2
val signal2 = motorboat2.signal()
assert(signal1 == "Flare used!", "Expected: Flare used!, Got: " + signal1)
assert(signal2 == "Flare used!", "Expected: Flare used!, Got: " + signal2)
println(signal1, signal2)

class Flare {
  def light(): String = {
    "Flare used!"
  }
}

class Sailboat2 {
  def signal(): String = {
    new Flare().light()
  }
}

class Motorboat2 {
  def signal(): String = {
    new Flare().light()
  }
}
