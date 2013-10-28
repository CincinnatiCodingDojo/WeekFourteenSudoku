package dojoweekthirteen

class sudoku (sudokuBoard:String) {




	def isValidGrouping(sudokuGrouping:String)={
		var filteredRow = sudokuGrouping.replaceAll("\\.","")
		filteredRow.toList.distinct.size == filteredRow.toList.size
	}

	def getRow(index:Integer) = {
		sudokuBoard.substring(index*9-9,index*9)
	}

	def getColumn(index:Integer) = {
		var column = "";
		var index0 = index-1
		for(row <-1 to 9) yield column = column.concat(String.valueOf(sudokuBoard.charAt(row*9+index0-9)))
		column
	}

	def getGrid(row:Integer, col:Integer) = {
		"4...3...."
	}

}