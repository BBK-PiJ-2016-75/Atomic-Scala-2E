// Exercise03.sc
import com.atomicscala.pythagorean.{EquilateralTriangle, RightTriangle}

val rt = new RightTriangle
println(rt.hypotenuse(3, 4))
println(rt.area(3, 4))
assert(rt.hypotenuse(3, 4) == 5)
assert(rt.area(3, 4) == 6)

val et = new EquilateralTriangle
println(et.area(2))
assert(et.area(2) == Math.sqrt(3))
