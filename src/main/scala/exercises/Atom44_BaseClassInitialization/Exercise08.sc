// Exercise08.sc
import com.atomicscala.AtomicTest._

val st = new StudentTeacher("Fran")

case class Teacher(name: String)

// You can only inherit an ordinary class from a case class:
class StudentTeacher(name: String) extends Teacher(name)

st is "Teacher(Fran)"
