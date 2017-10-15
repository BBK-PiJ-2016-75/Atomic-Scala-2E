// Exercise02.sc
import com.atomicscala.pythagorean.EquilateralTriangle

val et = new EquilateralTriangle
println(et.area(2))
assert(Math.sqrt(3) == et.area(2))
