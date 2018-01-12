// Exercise01.sc
import java.text.SimpleDateFormat

import com.atomicscala.AtomicTest._

val datePattern = new SimpleDateFormat("MM/dd/yy")
val mayDay = datePattern.parse("05/01/12")

mayDay.getDate is 1
mayDay.getMonth is 4
