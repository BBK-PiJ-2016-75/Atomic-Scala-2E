// Exercise03.sc

trait EnergySource

trait BatteryPower {
  def monitor(charge: Int): String = charge match {
    case i: Int if i < 20 => "red"
    case i: Int if i < 40 => "yellow"
    case _ => "green"
  }
}

class Battery2 extends EnergySource with BatteryPower

object Battery2 extends App {
  val battery = new Battery2
  for (arg <- args)
    println(battery.monitor(arg.toInt))
}
