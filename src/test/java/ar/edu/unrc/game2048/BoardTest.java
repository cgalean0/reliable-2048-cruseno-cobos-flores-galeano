package ar.edu.unrc.game2048;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

	@Test
	public void constructorDefaultTest(){
		Board board = new Board();

		assertEquals(Board.DEFAULT_SIZE, board.getSize());
		assertEquals(0, board.getScore());

		assertEquals(14, board.getEmptyPositions().size()); //Deben haber (16-2) celdas vacias
	}

	@Test
	public void constructorValidSizeTest(){
		Board board = new Board(6);

		assertEquals(6, board.getSize());
		assertEquals(0, board.getScore());
		assertEquals(34, board.getEmptyPositions().size()); 
	}

	@Test
	public void constructorCopyTest(){
		Board firstBoard = new Board();
		Board copiedBoard = new Board(firstBoard);

		assertEquals(firstBoard, copiedBoard);
		assertNotSame(firstBoard, copiedBoard);
	} 	

	@Test
	public void constructorInvalidSize(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Board(0);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new Board(-4);
		});
	}

	@Test
	public void initialTilesAreTwoOrFour(){
		Board board = new Board();
		int noEmptyCells = 0;

		for(int i = 0; i<board.getSize(); i++){
			for(int j = 0; j < board.getSize(); j++){
				Cell c = board.getCell(i, j);

				if(!c.isEmpty()){
					noEmptyCells++;
					int value = c.getValue();
					assertTrue(value == 2 || value == 4);

				}
			}
		}

		assertEquals(2, noEmptyCells);
	}

	@Test
	public void setAndGetTheSameValueTest() {
		Board board = new Board();
		Cell cell = new Cell(32);

		board.setCell(0,2,cell);
		assertTrue(cell.equals(board.getCell(0,2)));
	}

	@Test
	public void getCellNotNull() {
		Board board = new Board();
		for (int r = 0 ; r < board.getSize() ; r++) {
			for (int c = 0 ; c < board.getSize() ; c++) {
				assertNotNull(board.getCell(r, c));
			}
		}
	}

	@Test
	public void invalidGetCell() {
		Board board = new Board();
		assertThrows(IndexOutOfBoundsException.class, ()-> {
			board.getCell(0,4);
		});
		assertThrows(IndexOutOfBoundsException.class, ()-> {
			board.getCell(4,2);
		});
		assertThrows(IndexOutOfBoundsException.class, ()-> {
			board.getCell(-1,2);
		});
		assertThrows(IndexOutOfBoundsException.class, ()-> {
			board.getCell(1,-2);
		});
	}

	@Test
	public void setCellAlreadySetted() {
		Board board = new Board();
		Cell cell = new Cell(16);
		board.setCell(0,3,cell);
		assertEquals(cell, board.getCell(0,3));

		Cell newCell = new Cell(32);
		board.setCell(0, 3, newCell);
		assertEquals(newCell, board.getCell(0,3));
	}

	@Test
	public void setNotNullCellTest() {
		Board board = new Board();
		assertThrows(IllegalArgumentException.class, ()-> {
			board.setCell(0,0,null);
		});
	}

	@Test
	public void setCellOutofBoundsTest() {
		Board board = new Board();
		Cell cell = new Cell(2);
		assertThrows(IndexOutOfBoundsException.class, ()-> {
			board.setCell(4,0,cell);
		});
		assertThrows(IndexOutOfBoundsException.class, ()-> {
			board.setCell(0,4,cell);
		});
		assertThrows(IndexOutOfBoundsException.class, ()-> {
			board.setCell(-1,1,cell);
		});
		assertThrows(IndexOutOfBoundsException.class, ()-> {
			board.setCell(1,-1,cell);
		});
		assertThrows(IndexOutOfBoundsException.class, ()-> {
			board.setCell(-2,-3,cell);
		});
	}
}
