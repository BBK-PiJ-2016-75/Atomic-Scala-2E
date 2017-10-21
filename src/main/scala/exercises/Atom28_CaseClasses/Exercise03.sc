// Exercise03.sc
import com.atomicscala.AtomicTest._

val dogs = Vector(
  Dog("Fido", "Golden Lab"),
  Dog("Ruff", "Alaskan Malamute"),
  Dog("Fifi", "Miniature Poodle")
)

case class Dog(name: String, breed: String)

dogs(0) is "Dog(Fido,Golden Lab)"
dogs(1) is "Dog(Ruff,Alaskan Malamute)"
dogs(2) is "Dog(Fifi,Miniature Poodle)"
