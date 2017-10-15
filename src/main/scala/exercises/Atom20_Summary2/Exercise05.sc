// Exercise05.sc
import com.atomicscala.AtomicTest._
import com.atomicscala.{EveryBody, NoBody, SomeBody}

val myNoBody = new NoBody
myNoBody.anyBody is "Nobody"

val mySomeBody = new SomeBody
mySomeBody.anyBody is "Jane Doe"

val myEveryBody = new EveryBody
var names = ""
for (i <- myEveryBody.all) {
  names += i.anyBody + ", "
}
names is "Jane Doe, Jane Doe, Jane Doe, "
