// Exercise02.sc
import com.atomicscala.AtomicTest._

trait EnergySource

trait BatteryPower {
  def monitor(charge: Int): String = charge match {
    case i: Int if i < 20 => "red"
    case i: Int if i < 40 => "yellow"
    case _ => "green"
  }
}

class Battery1 extends EnergySource with BatteryPower

object Battery1 extends App {
  val battery = new Battery1
  battery.monitor(80) is "green"
  battery.monitor(30) is "yellow"
  battery.monitor(10) is "red"
}
