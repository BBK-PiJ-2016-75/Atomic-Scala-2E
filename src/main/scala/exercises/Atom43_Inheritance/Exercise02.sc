// Exercise02.sc
import com.atomicscala.AtomicTest._

def says(ape: GreatApe): String = "says " + ape.vocalize

class GreatApe {
  val weight = 100.0
  val age = 12

  def vocalize: String = "Grrr!"
}

class Bonobo extends GreatApe

class Chimpanzee extends GreatApe

class BonoboB extends Bonobo

says(new GreatApe) is "says Grrr!"
says(new Bonobo) is "says Grrr!"
says(new Chimpanzee) is "says Grrr!"
says(new BonoboB) is "says Grrr!"
