// Exercise03.sc
import com.atomicscala.AtomicTest._

def assignResult3(arg: Boolean): Int =
  if (arg) 42 else 47

assignResult3(true) is 42
assignResult3(false) is 47
