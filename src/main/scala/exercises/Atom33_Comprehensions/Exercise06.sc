// Exercise06.sc
import com.atomicscala.AtomicTest._

val activities = Vector(
  Activity("01-01", "Run"),
  Activity("01-03", "Ski"),
  Activity("01-04", "Run"),
  Activity("01-10", "Ski"),
  Activity("01-03", "Run")
)

def getActivities(specifiedDate: String, allActivities: Vector[Activity]): Vector[String] = {
  for {
    n <- allActivities
    if n.date equals specifiedDate
  } yield n.activity
}

case class Activity(date: String, activity: String)

getActivities("01-01", activities) is Vector("Run")
getActivities("01-02", activities) is Vector()
getActivities("01-03", activities) is Vector("Ski", "Run")
getActivities("01-04", activities) is Vector("Run")
getActivities("01-10", activities) is Vector("Ski")
