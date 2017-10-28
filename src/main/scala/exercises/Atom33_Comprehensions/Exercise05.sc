// Exercise05.sc
import com.atomicscala.AtomicTest._

val activities = Vector(
  Activity("01-01", "Run"),
  Activity("01-03", "Ski"),
  Activity("01-04", "Run"),
  Activity("01-10", "Ski"),
  Activity("01-03", "Run")
)

def getDates(specifiedActivity: String, allActivities: Vector[Activity]): Vector[String] = {
  for {
    n <- allActivities
    if n.activity equals specifiedActivity
  } yield n.date
}

case class Activity(date: String, activity: String)

getDates("Ski", activities) is Vector("01-03", "01-10")
getDates("Run", activities) is Vector("01-01", "01-04", "01-03")
getDates("Bike", activities) is Vector()
