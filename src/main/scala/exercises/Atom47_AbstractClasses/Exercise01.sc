// Exercise01.sc
import com.atomicscala.AtomicTest._

val duck = new Duck
val cow = new Cow

abstract class Animal {
  def templateMethod: String = s"The $animal goes $sound"

  def animal: String

  def sound: String

  def food: String
}

class Duck extends Animal {
  def animal: String = "Duck"

  def sound: String = "Quack"

  def food: String = "plants"
}

class Cow extends Animal {
  def animal: String = "Cow"

  def sound: String = "Moo"

  def food: String = "grass"
}

duck.templateMethod is "The Duck goes Quack"
duck.food is "plants"
cow.templateMethod is "The Cow goes Moo"
cow.food is "grass"
