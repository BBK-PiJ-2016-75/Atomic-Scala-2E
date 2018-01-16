// Exercise06.sc
import com.atomicscala.AtomicTest._

def checkLevel(level: Level): String = level match {
  case Overflow => ">>> Overflow!"
  case Empty | Dry => "Alert"
  case Pooling => "Warning!"
  case _: Any => s"Level $level OK"
}

import Level._

object Level extends Enumeration {
  type Level = Value
  val Overflow, High, Medium, Low, Empty = Value
  val Draining, Pooling, Dry = Value
}

Level.Draining is Draining
Level.Draining.id is 5
checkLevel(Low) is "Level Low OK"
checkLevel(Empty) is "Alert"
checkLevel(Draining) is "Level Draining OK"
checkLevel(Pooling) is "Warning!"
checkLevel(Dry) is "Alert"
