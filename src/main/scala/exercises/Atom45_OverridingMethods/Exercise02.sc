// Exercise02.sc
import com.atomicscala.AtomicTest._

val roaringApe = new GreatApe2(112, 9, "Male")
val chattyBonobo = new Bonobo2(150, 14, "Female")

class GreatApe2(val weight: Double, val age: Int, val gender: String) {
  def myWords: Vector[String] = Vector("Roar")
}

class Bonobo2(weight: Double, age: Int, gender: String) extends GreatApe2(weight, age, gender) {
  override def myWords: Vector[String] = super.myWords ++ Vector("Hello")
}

roaringApe.myWords is Vector("Roar")
chattyBonobo.myWords is Vector("Roar", "Hello")
