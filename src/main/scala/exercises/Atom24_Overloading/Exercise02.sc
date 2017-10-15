// Exercise02.sc
import com.atomicscala.AtomicTest._

def f: Int = {
  0
}
def f(i: Int): Int = {
  i
}
def f(i: Int, i1: Int): Int = {
  i + i1
}
def f(i: Int, i1: Int, i2: Int): Int = {
  i + i1 + i2
}
def f(i: Int, i1: Int, i2: Int, i3: Int): Int = {
  i + i1 + i2 + i3
}

f is 0
f(1) is 1
f(1, 2) is 3
f(1, 2, 3) is 6
f(1, 2, 3, 4) is 10
