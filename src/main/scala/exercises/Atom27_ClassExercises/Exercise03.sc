// Exercise03.sc
import com.atomicscala.AtomicTest._

val info = new Info("stuff", "Something")

class Info(var name: String, var description: String)

info.name is "stuff"
info.description is "Something"
info.description = "Something else"
info.description is "Something else"
info.name = "This is the new name"
info.name is "This is the new name"
