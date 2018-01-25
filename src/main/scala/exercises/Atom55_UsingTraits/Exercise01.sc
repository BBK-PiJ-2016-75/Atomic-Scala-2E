// Exercise01.sc
import com.atomicscala.AtomicTest._

val webcam = new WIFICamera

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

webcam.showImage is "Showing video"
webcam.address is "192.168.0.200"
webcam.reportStatus is "working"
