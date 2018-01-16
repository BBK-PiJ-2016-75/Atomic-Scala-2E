// Exercise01.sc
import com.atomicscala.AtomicTest._
import com.atomicscala.Name

val toy = Toy("Teddy Bear", batteryOperated = false)
val reflectedToy = ReflectedToy("Bunny", batteryOperated = true)

case class Toy(name: String, batteryOperated: Boolean)

case class ReflectedToy(name: String, batteryOperated: Boolean) extends Name

toy is "Toy(Teddy Bear,false)"
reflectedToy is "ReflectedToy"
