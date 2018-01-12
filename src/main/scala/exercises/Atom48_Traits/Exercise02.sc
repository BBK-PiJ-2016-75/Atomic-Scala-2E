// Exercise02.sc
import com.atomicscala.AtomicTest._

val toy = new BatteryPoweredToy

trait Toy

trait BatteryPower {
  def monitor(charge: Int): String = charge match {
    case i: Int if i < 20 => "red"
    case i: Int if i < 40 => "yellow"
    case _ => "green"
  }
}

class BatteryPoweredToy extends Toy with BatteryPower

toy.monitor(50) is "green"
