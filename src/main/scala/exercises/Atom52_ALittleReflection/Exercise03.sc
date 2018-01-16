// Exercise03.sc
import com.atomicscala.AtomicTest._
import com.atomicscala.Name2

val reflectedToy3 = new ReflectedToy3("Flamingo", batteryOperated = false)

class ReflectedToy3(name: String, batteryOperated: Boolean) extends Name2

reflectedToy3 is "class ReflectedToy3"
