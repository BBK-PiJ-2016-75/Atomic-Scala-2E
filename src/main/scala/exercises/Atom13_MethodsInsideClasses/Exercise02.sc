// Exercise02.sc

val flare = new Flare
val f1 = flare.light()

class Flare {
  def light(): String = {
    "Flare used!"
  }
}

assert(f1 == "Flare used!", "Expected: Flare used!, Got: " + f1)
println(f1)
