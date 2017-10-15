// Exercise01.sc
import com.atomicscala.AtomicTest._

val doubleHalfCaf = new Coffee(shots = 2, decaf = 1)
val tripleHalfCaf = new Coffee(shots = 3, decaf = 2)

class Coffee(val shots: Int = 2, val decaf: Int = 0, val milk: Boolean = false,
             val toGo: Boolean = false, val syrup: String = "") {
  val caf = shots - decaf
  var result = ""
  println(shots, decaf, milk, toGo, syrup)

  def getCup(): Unit = {
    if (toGo) {
      result += "ToGoCup "
    } else {
      result += "HereCup "
    }
  }

  def pourShots(): Unit = {
    for (_ <- 0 until decaf) {
      result += "decaf shot "
    }
    for (_ <- 0 until caf) {
      result += "shot "
    }
  }

  def addMilk(): Unit = {
    if (milk) {
      result += "milk "
    }
  }

  def addSyrup(): Unit = {
    result += syrup
  }

  getCup()
  pourShots()
  addMilk()
  addSyrup()
}

doubleHalfCaf.decaf is 1
doubleHalfCaf.caf is 1
doubleHalfCaf.shots is 2
tripleHalfCaf.decaf is 2
tripleHalfCaf.caf is 1
tripleHalfCaf.shots is 3
