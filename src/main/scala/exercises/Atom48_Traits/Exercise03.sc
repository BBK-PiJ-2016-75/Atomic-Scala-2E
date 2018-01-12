// Exercise03.sc
import com.atomicscala.AtomicTest._

val toy2 = new Toy with BatteryPower

trait Toy

trait BatteryPower {
  def monitor(charge: Int): String = charge match {
    case i: Int if i < 20 => "red"
    case i: Int if i < 40 => "yellow"
    case _ => "green"
  }
}

toy2.monitor(50) is "green"
