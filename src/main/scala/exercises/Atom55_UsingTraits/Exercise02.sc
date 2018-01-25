// Exercise02.sc
import com.atomicscala.AtomicTest._

val c = new Object with Connections

trait Connections {
  val maxConnections = 5
  var connected = 0

  def connect(connection: Boolean): Boolean = {
    if (connection) {
      if (connected < maxConnections) {
        connected += 1
        true
      } else {
        false
      }
    } else {
      if (connected > 0) {
        connected -= 1
        true
      } else {
        false
      }
    }
  }
}

c.maxConnections is 5
c.connect(true) is true
c.connected is 1
for (_ <- 0 to 3) c.connect(true) is true
c.connect(true) is false
c.connect(false) is true
c.connected is 4
for (_ <- 0 to 3) c.connect(false) is true
c.connected is 0
c.connect(false) is false
