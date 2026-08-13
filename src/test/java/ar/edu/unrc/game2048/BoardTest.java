package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BoardTest {

    // ----- CONSTRUCTOR -----

    @Test
    public void constructorDefaultTest() {
        Board board = new Board();

        assertEquals(Board.DEFAULT_SIZE, board.getSize());
        assertEquals(0, board.getScore());

        assertEquals(14, board.getEmptyPositions().size()); //Deben haber (16-2) celdas vacias
    }

    @Test
    public void constructorValidSizeTest() {
        Board board = new Board(6);

        assertEquals(6, board.getSize());
        assertEquals(0, board.getScore());
        assertEquals(34, board.getEmptyPositions().size());
    }

    @Test
    public void constructorCopyTest() {
        Board firstBoard = new Board();
        Board copiedBoard = new Board(firstBoard);

        assertEquals(firstBoard, copiedBoard);
        assertNotSame(firstBoard, copiedBoard);
    }

    @Test
    public void constructorInvalidSize() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Board(0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Board(-4);
        });
    }

    @Test
    public void initialTilesAreTwoOrFour() {
        Board board = new Board();
        int noEmptyCells = 0;

        for (int i = 0; i < board.getSize(); i++) {
            for (int j = 0; j < board.getSize(); j++) {
                Cell c = board.getCell(i, j);

                if (!c.isEmpty()) {
                    noEmptyCells++;
                    int value = c.getValue();
                    assertTrue(value == 2 || value == 4);
                }
            }
        }

        assertEquals(2, noEmptyCells);
    }

    // ----- LOSING BOARD -----

    @Test
    public void isLosingBoardTest() {
        // Arrange
        // Create an Oraculus Board with size 4x4
        Board board = new Board(2);
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(2));
        board.setCell(1, 0, new Cell(4));
        board.setCell(1, 1, new Cell(4));

        /*
            The board generated is this.
            +------+------+
            |  2   |   2  |
            +------+------+
            |  4   |   4  |
            +------+------+
            Is a valid Board.
        */

        // Act
        boolean result   = board.isLosingBoard();
        boolean expected = false;

        // Assert
        assertEquals(expected, result);
    }

	@Test
	public  void isLosingBoardFailedMergedInLastColumn(){
		Board board = new Board();
		int[][] values = {
        {2, 4, 8, 8},
        {32, 64, 128, 256},
        {512, 1024, 2048, 2},
        {4, 8, 16, 32}
    	};

		for (int r = 0; r < 4; r++) {
			for (int c = 0; c < 4; c++) {
				board.setCell(r, c, new Cell(values[r][c]));
			}
    	}

		assertFalse(board.isLosingBoard());
	}


	// ----- MOVE UP/DOWN/LEFT/RIGHT -----

	// ----- Single Tile -----

	@Test
	public void testMoveUpSingleTile(){
		Board board = new Board();
		clearBoard(board);

		board.setCell(2, 0, new Cell(2));
		
		boolean moved = board.moveUp();

		assertTrue(moved);
		assertEquals(2, board.getCell(0, 0).getValue());
		assertEquals(0, board.getScore());
	}

	@Test
	public void testMoveDownSingleTile(){
		Board board = new Board();
		clearBoard(board);

		board.setCell(1, 0, new Cell(2));

		boolean moved = board.moveDown();

		assertTrue(moved);
		assertEquals(2, board.getCell(3, 0).getValue());
		assertEquals(0, board.getScore());

	}

	@Test
	public void testMoveRightSingleTile(){
		Board board = new Board();
		clearBoard(board);

		board.setCell(1, 0, new Cell(2));

		boolean moved = board.moveRight();

		assertTrue(moved);
		assertEquals(2, board.getCell(1, 3).getValue());
		assertEquals(0, board.getScore());

	}

	@Test
	public void testMoveLeftSingleTile(){
		Board board = new Board();
		clearBoard(board);

		board.setCell(1, 3, new Cell(2));

		boolean moved = board.moveLeft();

		assertTrue(moved);
		assertEquals(2, board.getCell(1, 0).getValue());
		assertEquals(0, board.getScore());

	}

	// ----- Two Equal Tiles -----

	@Test
	public void testMoveUpTwoEqualTiles(){
		Board board = new Board();
		clearBoard(board);

		board.setCell(1, 0, new Cell(2));
		board.setCell(3, 0, new Cell(2));

		boolean moved = board.moveUp();

		assertTrue(moved);
		assertEquals(4, board.getCell(0, 0).getValue());
		assertEquals(4, board.getScore());
	}

	@Test
	public void testMoveDownTwoEqualTiles(){
		Board board = new Board();
		clearBoard(board);

		board.setCell(1, 0, new Cell(2));
		board.setCell(3, 0, new Cell(2));

		boolean moved = board.moveDown();

		assertTrue(moved);
		assertEquals(4, board.getCell(3, 0).getValue());
		assertEquals(4, board.getScore());

	}

	@Test
	public void testMoveRightTwoEqualTiles(){
		Board board = new Board();
		clearBoard(board);

		board.setCell(1, 0, new Cell(2));
		board.setCell(1, 3, new Cell(2));

		boolean moved = board.moveRight();

		assertTrue(moved);
		assertEquals(4, board.getCell(1, 3).getValue());
		assertEquals(4, board.getScore());

	}

	@Test
	public void testMoveLeftTwoEqualTiles(){
		Board board = new Board();
		clearBoard(board);

		board.setCell(1, 0, new Cell(2));
		board.setCell(1, 3, new Cell(2));

		boolean moved = board.moveLeft();

		assertTrue(moved);
		assertEquals(4, board.getCell(1, 0).getValue());
		assertEquals(4, board.getScore());

	}

	// ----- Three Equal Tiles -----

	@Test
	public void moveUpThreeEqualTiles(){
		Board board = new Board();
		clearBoard(board);

		board.setCell(0, 0, new Cell(2));
		board.setCell(1, 0, new Cell(2));
		board.setCell(2, 0, new Cell(2));

		boolean moved = board.moveUp();

		assertTrue(moved);
		assertEquals(4, board.getCell(0, 0).getValue());
		assertEquals(2, board.getCell(1, 0).getValue());
		assertEquals(4, board.getScore());
	}

	@Test
	public void moveDownThreeEqualTiles(){
		Board board = new Board();
		clearBoard(board);

		board.setCell(0, 0, new Cell(2));
		board.setCell(1, 0, new Cell(2));
		board.setCell(2, 0, new Cell(2));

		boolean moved = board.moveDown();

		assertTrue(moved);
		assertEquals(4, board.getCell(0, 3).getValue());
		assertEquals(2, board.getCell(0, 2).getValue());
		assertEquals(4, board.getScore());
	}

	@Test
	public void moveRightThreeEqualTiles(){
		Board board = new Board();
		clearBoard(board);

		board.setCell(0, 0, new Cell(2));
		board.setCell(0, 1, new Cell(2));
		board.setCell(0, 2, new Cell(2));

		boolean moved = board.moveRight();

		assertTrue(moved);
		assertEquals(4, board.getCell(0, 3).getValue());
		assertEquals(2, board.getCell(0, 2).getValue());
		assertEquals(4, board.getScore());
	}

	@Test
	public void moveLeftThreeEqualTiles(){
		Board board = new Board();
		clearBoard(board);

		board.setCell(0, 0, new Cell(2));
		board.setCell(0, 1, new Cell(2));
		board.setCell(0, 2, new Cell(2));

		boolean moved = board.moveLeft();

		assertTrue(moved);
		assertEquals(4, board.getCell(0, 0).getValue());
		assertEquals(2, board.getCell(0, 1).getValue());
		assertEquals(4, board.getScore());
	}
	// ----- Four Equal Tiles -----

	@Test
	public void moveUpFourEqualTiles(){
		Board board = new Board();
		clearBoard(board);

		board.setCell(0, 0, new Cell(2));
		board.setCell(1, 0, new Cell(2));
		board.setCell(2, 0, new Cell(2));
		board.setCell(3, 0, new Cell(2));

		boolean moved = board.moveUp();

		assertTrue(moved);
		assertEquals(4, board.getCell(0, 0).getValue());
		assertEquals(4, board.getCell(1, 0).getValue());
		assertEquals(8, board.getScore());
	}

    @Test
	public void moveDownFourEqualTiles(){
		Board board = new Board();
		clearBoard(board);

		board.setCell(0, 0, new Cell(2));
		board.setCell(1, 0, new Cell(2));
		board.setCell(2, 0, new Cell(2));
		board.setCell(3, 0, new Cell(2));

		boolean moved = board.moveDown();

		assertTrue(moved);
		assertEquals(4, board.getCell(3, 0).getValue());
		assertEquals(4, board.getCell(2, 0).getValue());
		assertEquals(8, board.getScore());
	}

	@Test
	public void moveRightFourEqualTiles(){
		Board board = new Board();
		clearBoard(board);

		board.setCell(0, 0, new Cell(2));
		board.setCell(0, 1, new Cell(2));
		board.setCell(0, 2, new Cell(2));
		board.setCell(0, 3, new Cell(2));

		boolean moved = board.moveRight();

		assertTrue(moved);
		assertEquals(4, board.getCell(0, 3).getValue());
		assertEquals(4, board.getCell(0, 2).getValue());
		assertEquals(8, board.getScore());
	}

	@Test
	public void moveLeftFourEqualTiles(){
		Board board = new Board();
		clearBoard(board);

		board.setCell(0, 0, new Cell(2));
		board.setCell(0, 1, new Cell(2));
		board.setCell(0, 2, new Cell(2));
		board.setCell(0, 3, new Cell(2));

		boolean moved = board.moveLeft();

		assertTrue(moved);
		assertEquals(4, board.getCell(0, 0).getValue());
		assertEquals(4, board.getCell(0, 1).getValue());
		assertEquals(8, board.getScore());
	}

	@Test
	public void moveDowndoesNotProccesTopRow(){
		Board board = new Board();
		board.setCell(0, 0, new Cell(2));
    	board.setCell(1, 0, new Cell(2));
    	board.setCell(2, 0, Cell.EMPTY);
    	board.setCell(3, 0, Cell.EMPTY);

		int initScore = board.getScore();
		board.moveDown();

		assertEquals(initScore + 4, board.getScore());
		assertEquals(4, board.getCell(3, 0).getValue());
	}


	// ----- AUX METHODS -----

	/**
	 * Set all tiles to empty
	 */
	private void clearBoard(Board board){
		for(int i = 0; i < board.getSize(); i++){
			for(int j = 0; j < board.getSize(); j++){
				board.setCell(i, j, Cell.EMPTY);
			}
		}
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
