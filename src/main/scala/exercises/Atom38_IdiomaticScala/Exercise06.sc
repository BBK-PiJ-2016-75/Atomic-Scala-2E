// Exercise06.sc
import com.atomicscala.AtomicTest._

val dog = new Dog
val cat = new Cat
val hamster = new Hamster

class Dog {
  def bark: String = "Yip!"
}

class Cat {
  def meow: String = "Mew!"
}

class Hamster {
  def exercise: String = speak + " Running on wheel!"

  def speak: String = "Squeak!"
}

dog.bark is "Yip!"
cat.meow is "Mew!"
hamster.exercise is "Squeak! Running on wheel!"
