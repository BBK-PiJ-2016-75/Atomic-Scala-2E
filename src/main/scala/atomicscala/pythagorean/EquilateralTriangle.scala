// EquilateralTriangle.scala
package com.atomicscala.pythagorean

class EquilateralTriangle {
  def area(side: Double): Double = {
    (Math.sqrt(3) / 4) * (side * side)
  }
}
