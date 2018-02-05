// Exercise04.sc
import com.atomicscala.AtomicTest._

def number(s: String): Seq[(Int, Char)] = s.zip(Range(0, s.length)).map { case (char, int) => (int, char) }

number("Howdy") is Vector((0, 'H'), (1, 'o'), (2, 'w'), (3, 'd'), (4, 'y'))
