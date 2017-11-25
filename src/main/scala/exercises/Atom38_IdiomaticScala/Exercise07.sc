// Exercise07.sc
import com.atomicscala.AtomicTest._

val ca = new ClassArg(19)

class ClassArg(a: Int) {
  println(f)

  def f = a * 10
}

class Sum(args: Int*) {
  def result = {
    var total = 0
    for (n <- args) total += n
    total
  }
}

ca.f is 190
new Sum(13, 27, 44).result is 84
new Sum(1, 3, 5, 7, 9, 11).result is 36
