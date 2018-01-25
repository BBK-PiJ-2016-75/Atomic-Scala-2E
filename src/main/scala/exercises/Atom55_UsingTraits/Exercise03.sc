// Exercise03.sc
import com.atomicscala.AtomicTest._

val c2 = new WIFICamera with Connections

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

trait WIFI {
  val address: String

  def reportStatus: String = "working"
}

class Camera {
  def showImage: String = "Showing video"
}

class WIFICamera extends Camera with WIFI {
  val address = "192.168.0.200"
}

c2.maxConnections is 5
c2.connect(true) is true
c2.connected is 1
c2.connect(false) is true
c2.connected is 0
c2.connect(false) is false
