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
}
