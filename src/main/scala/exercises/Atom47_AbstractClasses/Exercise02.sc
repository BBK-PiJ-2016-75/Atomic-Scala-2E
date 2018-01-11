// Exercise02.sc
import com.atomicscala.AtomicTest._

val duck = new Duck
val cow = new Cow
val chicken = new Chicken
val pig = new Pig

abstract class Animal {
  def templateMethod: String = s"The $animal goes $sound"

  def animal: String

  def sound: String

  def food: String
}

class Duck extends Animal {
  override def animal: String = "Duck"

  override def sound: String = "Quack"

  override def food: String = "plants"
}

class Cow extends Animal {
  override def animal: String = "Cow"

  override def sound: String = "Moo"

  override def food: String = "grass"
}

class Chicken extends Animal {
  override def animal: String = "Chicken"

  override def sound: String = "Bawk"

  override def food: String = "insects"
}

class Pig extends Animal {
  override def animal: String = "Pig"

  override def sound: String = "Oink"

  override def food: String = "anything"
}

duck.templateMethod is "The Duck goes Quack"
duck.food is "plants"
cow.templateMethod is "The Cow goes Moo"
cow.food is "grass"
chicken.templateMethod is "The Chicken goes Bawk"
chicken.food is "insects"
pig.templateMethod is "The Pig goes Oink"
pig.food is "anything"
