// Exercise01.sc
import com.atomicscala.AtomicTest._

def display(ape: GreatApe): String = s"weight: ${ape.weight} age: ${ape.age} gender: ${ape.gender}"

class GreatApe(val weight: Double, val age: Int, val gender: String)

class Bonobo(weight: Double, age: Int, gender: String) extends GreatApe(weight, age, gender)

class Chimpanzee(weight: Double, age: Int, gender: String) extends GreatApe(weight, age, gender)

class BonoboB(weight: Double, age: Int, gender: String) extends Bonobo(weight, age, gender)

class BonoboC(weight: Double, age: Int, gender: String) extends BonoboB(weight, age, gender)

display(new GreatApe(100, 12, "Male")) is "weight: 100.0 age: 12 gender: Male"
display(new Bonobo(100, 12, "Female")) is "weight: 100.0 age: 12 gender: Female"
display(new Chimpanzee(100, 12, "Male")) is "weight: 100.0 age: 12 gender: Male"
display(new BonoboB(100, 12, "Female")) is "weight: 100.0 age: 12 gender: Female"
display(new BonoboC(100, 12, "Male")) is "weight: 100.0 age: 12 gender: Male"
