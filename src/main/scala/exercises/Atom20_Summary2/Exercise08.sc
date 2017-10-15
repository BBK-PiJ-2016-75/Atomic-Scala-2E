// Exercise08.sc
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
  var moves = 0

  def play(e: Char, x: Int, y: Int): String = {
    val moveResult = {
      if (x < 0 || x > 2 || y < 0 || y > 2) {
        "invalid move"
      } else {
        cells(x)(y).set(e)
      }
    }
    if (moveResult == "successful move") {
      moves += 1
    }
    displayBoard()
    determineWin()
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

  def determineWin(): Unit = {
    var win = false
    for (rows <- cells) {
      if (connect3(rows)) {
        win = true
      }
    }
    for (columns <- cells.transpose) {
      if (connect3(columns)) {
        win = true
      }
    }
    val diagonalGrave = Vector(cells(0)(0), cells(1)(1), cells(2)(2))
    if (connect3(diagonalGrave)) {
      win = true
    }
    val diagonalAcute = Vector(cells(0)(2), cells(1)(1), cells(2)(0))
    if (connect3(diagonalAcute)) {
      win = true
    }
    if (moves == 9 && !win) {
      println("We have a draw.")
    } else if (win) {
      println("We have a winner!")
    }
  }

  def connect3(line: Vector[Cell]): Boolean = {
    var totalX = 0
    var totalO = 0
    for (i <- line) {
      if (i.entry == 'X') {
        totalX += 1
      } else if (i.entry == 'O') {
        totalO += 1
      }
    }
    if (totalX == 3 || totalO == 3) {
      true
    } else {
      false
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
grid.play('O', 1, 2) is "successful move"
grid.play('X', 2, 2) is "successful move"
grid.play('O', 2, 1) is "successful move"
grid.play('X', 0, 1) is "successful move"
