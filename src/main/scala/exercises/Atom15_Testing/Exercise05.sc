// Exercise05.sc
import com.atomicscala.AtomicTest._

squareArea(1) is 1
squareArea(2) is 4
squareArea(5) is 25
rectangleArea(2, 2) is 4
rectangleArea(5, 4) is 20
trapezoidArea(2, 2, 4) is 8
trapezoidArea(3, 4, 1) is 3.5

def squareArea(x: Int): Int = {
  x * x
}

def rectangleArea(x: Int, y: Int): Int = {
  x * y
}

def trapezoidArea(x: Double, y: Double, h: Double): Double = {
  ((x + y) / 2) * h
}
