// Exercise05.sc
import com.atomicscala.AtomicTest._

val grid = new Grid

import Move._

class Cell {
  var entry = clear

  def set(e: Move): String = {
    if (entry == clear && (e == X || e == O)) {
      entry = e
      "successful move"
    } else {
      "invalid move"
    }
  }
}

class Grid {
  val cells = Vector(
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell)
  )

  def play(e: Move, x: Int, y: Int): String = {
    if (x < 0 || x > 2 || y < 0 || y > 2) {
      "invalid move"
    } else {
      cells(x)(y).set(e)
    }
  }
}

object Move extends Enumeration {
  type Move = Value
  val clear, X, O = Value
}

grid.play(Move.X, 1, 1) is "successful move"
grid.play(Move.X, 1, 1) is "invalid move"
grid.play(Move.O, 1, 3) is "invalid move"
grid.play(Move.O, 0, 0) is "successful move"
grid.play(Move.X, 2, 2) is "successful move"
