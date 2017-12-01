// Exercise01.sc
import com.atomicscala.AtomicTest._

val ape1 = new GreatApe
val ape2 = new Bonobo
val ape3 = new Chimpanzee

class GreatApe {
  val weight = 100.0
  val age = 12

  def vocalize: String = "Grrr!"
}

class Bonobo extends GreatApe

class Chimpanzee extends GreatApe

class BonoboB extends Bonobo

ape1.vocalize is "Grrr!"
ape2.vocalize is "Grrr!"
ape3.vocalize is "Grrr!"
