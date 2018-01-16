// Exercise02.sc
import com.atomicscala.AtomicTest._
import com.atomicscala.Name

val reflectedToy2 = new ReflectedToy2("Flamingo", batteryOperated = false)

class ReflectedToy2(name: String, batteryOperated: Boolean) extends Name

reflectedToy2 is "ReflectedToy2"
