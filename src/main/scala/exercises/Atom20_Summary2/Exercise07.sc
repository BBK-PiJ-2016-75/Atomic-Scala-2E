// Exercise07.sc
import com.atomicscala.AtomicTest._

val grid = new Grid

class Cell {
  var entry = ' '

  def set(e: Char): String = {
    if (entry == ' ' && (e == 'X' || e == 'O')) {
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

  def play(e: Char, x: Int, y: Int): String = {
    val moveResult = {
      if (x < 0 || x > 2 || y < 0 || y > 2) {
        "invalid move"
      } else {
        cells(x)(y).set(e)
      }
    }
    displayBoard()
    moveResult
  }

  def displayBoard(): Unit = {
    for (row <- cells) {
      for (column <- row) {
        print(column.entry + "|")
      }
      println
    }
  }
}

grid.play('X', 1, 1) is "successful move"
grid.play('X', 1, 1) is "invalid move"
grid.play('O', 1, 3) is "invalid move"
grid.play('O', 0, 0) is "successful move"
grid.play('X', 0, 2) is "successful move"
grid.play('O', 2, 0) is "successful move"
grid.play('X', 1, 0) is "successful move"
grid.play('O', 2, 2) is "successful move"
grid.play('X', 0, 1) is "successful move"
grid.play('O', 2, 1) is "successful move"
