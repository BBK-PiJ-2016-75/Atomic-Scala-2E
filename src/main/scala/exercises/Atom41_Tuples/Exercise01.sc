// Exercise01.sc
import com.atomicscala.AtomicTest._

val tuple1 = (65, "Sunny", "Stars")
val (temp1, sky1, view1) = tuple1
temp1 is 65
sky1 is "Sunny"
view1 is "Stars"

val tuple2 = (78, "Cloudy", "Satellites")
val (temp2, sky2, view2) = tuple2
temp2 is 78
sky2 is "Cloudy"
view2 is "Satellites"

val tuple3 = (51, "Blue", "Night")
val (temp3, sky3, view3) = tuple3
temp3 is 51
sky3 is "Blue"
view3 is "Night"
