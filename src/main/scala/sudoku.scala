package dojoweekfourteen

class sudoku (sudokuBoard:String) {

	def isValidGrouping(sudokuGrouping:String)={
		var filteredRow = sudokuGrouping.replaceAll("\\.","")
		filteredRow.toList.distinct.size == filteredRow.toList.size
	}

	def getRow(index:Integer) = {
		sudokuBoard.substring(index*9-9,index*9)
	}

	val getGridRow = (index:Integer, row:String) => row.substring(((index -1) * 3), (3 * index))

	def getColumn(index:Integer) = {
		var column = ""
		var index0 = index-1
		for(row <-1 to 9) yield column = column.concat(String.valueOf(sudokuBoard.charAt(row*9+index0-9)))
		column
	}

	def getGrid(index:Integer) = {
		var row = ((((index-1) / 3) + 1) * 3) - 2
		var col = if (index % 3 == 0)  3 else index % 3
		getGridRow(col, getRow(row)) + getGridRow(col, getRow(row + 1)) + getGridRow(col, getRow(row + 2))
	}

	def isValid() = {
		var valid = true
		for(index <-1 to 9) yield valid = valid && (isValidGrouping(getRow(index))) && (isValidGrouping(getColumn(index))) && (isValidGrouping(getGrid(index)))
		valid
	}

}