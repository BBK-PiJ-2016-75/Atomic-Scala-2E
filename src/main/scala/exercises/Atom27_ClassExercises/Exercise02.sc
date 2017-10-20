// Exercise02.sc
import com.atomicscala.AtomicTest._

val info = new Info("stuff", "Something")

class Info(val name: String, var description: String)

info.name is "stuff"
info.description is "Something"
info.description = "Something else"
info.description is "Something else"
