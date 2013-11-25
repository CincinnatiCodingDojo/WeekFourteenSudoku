package dojoweekfourteen

import org.scalatest._

class sudokuTest extends FunSuite {

  val validBoard = "4.....8.5.3..........7......2.....6.....8.4......1.......6.3.7.5..2.....1.4......";
  

  test("should be a dummy test") {
    assert(true)
  }
  
  test("empty grouboard is valid") {
     var obj = new sudoku(validBoard)
     assert(obj.isValidGrouping("........."))

  }
  test("grouping with duplicates is invalid") {
    var board = new sudoku(validBoard)
    assert(!board.isValidGrouping("1..2..1.."))
  }

  test("can get board row") {
    var sudokuBoard = new sudoku(validBoard)
    assert(sudokuBoard.getRow(1) == "4.....8.5")
    assert(sudokuBoard.getRow(2) == ".3.......")
    assert(sudokuBoard.getRow(3) == "...7.....")
  }

  test("can get board column") {
    var sudokuBoard = new sudoku(validBoard)
    assert(sudokuBoard.getColumn(1) == "4......51")
    assert(sudokuBoard.getColumn(2) == ".3.2.....")
    assert(sudokuBoard.getColumn(3) == "........4")
  }

  test("can get board grid") {
    var sudokuBoard = new sudoku(validBoard)
    assert(sudokuBoard.getGrid(1)=="4...3....")
    assert(sudokuBoard.getGrid(5)=="....8..1.")
    assert(sudokuBoard.getGrid(8)=="6.32.....")
  }

  test("board is valid") {
    var sudokuBoard = new sudoku(validBoard)
    assert(sudokuBoard.isValid())
  }

  test("board is invalid") {
    val inValidColumnBoard = "4.....8.543..........7......2.....6.....8.4......1.......6.3.7.5..2.....1.4......";
    assert(!new sudoku(inValidColumnBoard).isValid())

    val inValidRowBoard = "4.....8.5.3..........7......2.....6.....8.4......1.......6.3.7.5..2.....1.4.4....";
    assert(!new sudoku(inValidRowBoard).isValid())

    val inValidGridBoard = "4.....8.5.4..........7......2.....6.....8.4......1.......6.3.7.5..2.....1.4......";
    assert(!new sudoku(inValidGridBoard).isValid())
  }

  test("can set number") {
    
  }

    
}