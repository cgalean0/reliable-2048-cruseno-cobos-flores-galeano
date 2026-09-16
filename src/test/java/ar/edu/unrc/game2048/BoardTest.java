package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class BoardTest {

    // ----- CONSTRUCTOR -----

    @Test
    public void constructorDefaultTest() {
        Board board = new Board();

        assertEquals(Board.DEFAULT_SIZE, board.getSize());
        assertEquals(0, board.getScore());

        assertEquals(14, board.getEmptyPositions().size()); //Deben haber (16-2) celdas vacias
	    assertTrue(board.repOk());
    }

    @Test
    public void constructorValidSizeTest() {
        Board board = new Board(6);

        assertEquals(6, board.getSize());
        assertEquals(0, board.getScore());
        assertEquals(34, board.getEmptyPositions().size());
	    assertTrue(board.repOk());
    }

    @Test
    public void constructorCopyTest() {
        Board firstBoard = new Board();
        Board copiedBoard = new Board(firstBoard);

        assertEquals(firstBoard, copiedBoard);
        assertNotSame(firstBoard, copiedBoard);

	    assertTrue(firstBoard.repOk());
	    assertTrue(copiedBoard.repOk());
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

	@Test
	void winingBoardTestTwo() {
	    Board b = new Board();
		b.setCell(3, 3, new Cell(2048));
		assertTrue(b.isWinningBoard());
	}

	@Test
	void winingBoardTest() {
	    Board b = new Board();
		b.setCell(0, 3, new Cell(2048));
		assertTrue(b.isWinningBoard());
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
		assertEquals(4, board.getCell(3, 0).getValue());
		assertEquals(2, board.getCell(2, 0).getValue());
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
    clearBoard(board);
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
		assertTrue(board.repOk());
	}

	@Test
	public void invalidGetCell() {
		Board board = new Board(4);
		assertThrows(IndexOutOfBoundsException.class, ()->{
			board.getCell(0,4);
		});
		assertThrows(IndexOutOfBoundsException.class, ()->{
			board.getCell(4,2);
		});
		assertThrows(IndexOutOfBoundsException.class, ()->{
			board.getCell(-1,2);
		});
		assertThrows(IndexOutOfBoundsException.class, ()->{
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
		Board board = new Board(4);
		Cell cell = new Cell(2);
		assertThrows(IndexOutOfBoundsException.class, ()->{
			board.setCell(4,0,cell);
		});
		assertThrows(IndexOutOfBoundsException.class, ()->{
			board.setCell(0,4,cell);
		});
		assertThrows(IndexOutOfBoundsException.class, ()->{
			board.setCell(-1,1,cell);
		});
		assertThrows(IndexOutOfBoundsException.class, ()->{
			board.setCell(1,-1,cell);
		});
		assertThrows(IndexOutOfBoundsException.class, ()->{
			board.setCell(-2,-3,cell);
		});
	}

	//EQUALS

	@Test
	public void equalsSameObjectTest() {
		Board board = new Board();
		assertEquals(board, board);
	}

	@Test
	public void equalsNullTest() {
		Board board = new Board();
		assertFalse(board.equals(null));
	}

	@Test
	public void equalsDifferentTypeTest() {
		Board board = new Board();
		Cell cell = new Cell(2);
		assertFalse(board.equals(cell));
	}

	@Test
	public void equalsDifferentSizeTest() {
		Board boardOf4 = new Board(4);
		Board boardOf3 = new Board(3);
		assertNotEquals(boardOf4, boardOf3);
	}

	@Test
	public void equalsIdenticalBoardsTest() {
		GenerateDeterministicCellStrategy s1 = new GenerateDeterministicCellStrategy(
				new ArrayList<>(Arrays.asList(new Board.Position(0, 0), new Board.Position(1, 1))),
				new ArrayList<>(Arrays.asList(2, 4)));
		GenerateDeterministicCellStrategy s2 = new GenerateDeterministicCellStrategy(
				new ArrayList<>(Arrays.asList(new Board.Position(0, 0), new Board.Position(1, 1))),
				new ArrayList<>(Arrays.asList(2, 4)));
		Board board1 = new Board(4, s1);
		Board board2 = new Board(4, s2);
		assertEquals(board1, board2);
	}

	@Test
	public void equalsSameGridDifferentScoreTest() {
		Board boardWithScore = new Board(4);
		Board boardNoScore = new Board(4);

		clearBoard(boardWithScore);
		clearBoard(boardNoScore);

		boardWithScore.setCell(0, 0, new Cell(2));
		boardWithScore.setCell(1, 0, new Cell(2));
		boardWithScore.moveUp();
		clearBoard(boardWithScore);

		boardWithScore.setCell(0, 0, new Cell(2));
		boardWithScore.setCell(1, 1, new Cell(4));

		boardNoScore.setCell(0, 0, new Cell(2));
		boardNoScore.setCell(1, 1, new Cell(4));

		assertNotEquals(boardWithScore, boardNoScore);
	}

	@Test
	public void equalsDifferentGridSameSizeTest() {
		GenerateDeterministicCellStrategy s1 = new GenerateDeterministicCellStrategy(
				new ArrayList<>(Arrays.asList(new Board.Position(0, 0), new Board.Position(1, 1))),
				new ArrayList<>(Arrays.asList(2, 4)));

		GenerateDeterministicCellStrategy s2 = new GenerateDeterministicCellStrategy(
				new ArrayList<>(Arrays.asList(new Board.Position(0, 0), new Board.Position(1, 1))),
				new ArrayList<>(Arrays.asList(4, 2)));

		Board board1 = new Board(4, s1);
		Board board2 = new Board(4, s2);

		assertNotEquals(board1, board2);
	}

	//HASH CODE

	@Test
	public void hashCodeEqualBoardsTest() {
		GenerateDeterministicCellStrategy s1 = new GenerateDeterministicCellStrategy(
				new ArrayList<>(Arrays.asList(new Board.Position(0, 0), new Board.Position(1, 1))),
				new ArrayList<>(Arrays.asList(2, 4)));

		GenerateDeterministicCellStrategy s2 = new GenerateDeterministicCellStrategy(
				new ArrayList<>(Arrays.asList(new Board.Position(0, 0), new Board.Position(1, 1))),
				new ArrayList<>(Arrays.asList(2, 4)));

		Board board1 = new Board(4, s1);
		Board board2 = new Board(4, s2);

		assertEquals(board1.hashCode(), board2.hashCode());
	}

	@Test
	public void hashCodeDifferentBoardsTest() {
		GenerateDeterministicCellStrategy s1 = new GenerateDeterministicCellStrategy(
				new ArrayList<>(Arrays.asList(new Board.Position(0, 0), new Board.Position(1, 1))),
				new ArrayList<>(Arrays.asList(2, 4)));

		GenerateDeterministicCellStrategy s2 = new GenerateDeterministicCellStrategy(
				new ArrayList<>(Arrays.asList(new Board.Position(0, 0), new Board.Position(1, 1))),
				new ArrayList<>(Arrays.asList(4, 2)));

		Board board1 = new Board(4, s1);
		Board board2 = new Board(4, s2);

		assertNotEquals(board1.hashCode(), board2.hashCode());
	}

	//TO STRING

	@Test
	public void toStringTest() {
		Board board = new Board(4);

		clearBoard(board);
		board.setCell(0, 0, new Cell(2));
		board.setCell(0, 1, new Cell(4));
		board.setCell(3, 3, new Cell(2048));

		String expected = "Score: 0\n" +
				"+-----+-----+-----+-----+\n" +
				"|    2|    4|     |     |\n" +
				"+-----+-----+-----+-----+\n" +
				"|     |     |     |     |\n" +
				"+-----+-----+-----+-----+\n" +
				"|     |     |     |     |\n" +
				"+-----+-----+-----+-----+\n" +
				"|     |     |     | 2048|\n" +
				"+-----+-----+-----+-----+\n";

		assertEquals(expected, board.toString());
	}

	@Test
	public void toStringEmptyBoardTest() {
		Board board = new Board(2);

		clearBoard(board);

		String expected = "Score: 0\n" +
				"+-----+-----+\n" +
				"|     |     |\n" +
				"+-----+-----+\n" +
				"|     |     |\n" +
				"+-----+-----+\n";

		assertEquals(expected, board.toString());
	}

	//BOARD.POSITION

	@Test
	public void positionEqualsReflexiveTest() {
		Board.Position p = new Board.Position(0, 0);
		assertEquals(p, p);
	}

	@Test
	public void positionEqualsNullTest() {
		Board.Position p = new Board.Position(0, 0);
		assertFalse(p.equals(null));
	}

	@Test
	public void positionEqualsSameCoordinatesTest() {
		assertEquals(new Board.Position(2, 3), new Board.Position(2, 3));
	}

	@Test
	public void positionEqualsDifferentRowTest() {
		assertNotEquals(new Board.Position(1, 3), new Board.Position(2, 3));
	}

	@Test
	public void positionEqualsDifferentColumnTest() {
		assertNotEquals(new Board.Position(2, 1), new Board.Position(2, 3));
	}

	@Test
	public void positionHashCodeEqualPositionsTest() {
		assertEquals(new Board.Position(1, 5).hashCode(), new Board.Position(1, 5).hashCode());
	}

	@Test
	public void positionHashCodeDifferentPositionsTest() {
		assertNotEquals(new Board.Position(0, 1).hashCode(), new Board.Position(0, 0).hashCode());
	}

	@Test
	public void positionToStringTest() {
		assertEquals("(0, 0)", new Board.Position(0, 0).toString());
		assertEquals("(12, 7)", new Board.Position(12, 7).toString());
	}

	//TILE GENERATION STRATEGIES

	@Test
	public void deterministicStrategyBoardTest() {
		GenerateDeterministicCellStrategy strategy = new GenerateDeterministicCellStrategy(
				new ArrayList<>(Arrays.asList(new Board.Position(0, 0), new Board.Position(2, 3))),
				new ArrayList<>(Arrays.asList(2, 4)));
		Board board = new Board(4, strategy);

		assertEquals(2, board.getCell(0, 0).getValue());
		assertEquals(4, board.getCell(2, 3).getValue());
		assertEquals(14, board.getEmptyPositions().size());
	}

	@Test
	public void addRandomTileTest() {
		Board board = new Board(4);
		clearBoard(board);

		GenerateRandomCellStrategy strategy = new GenerateRandomCellStrategy();
		strategy.addTile(board);

		int nonEmpty = 0;
		for (int r = 0; r < board.getSize(); r++) {
			for (int c = 0; c < board.getSize(); c++) {
				Cell cell = board.getCell(r, c);
				if (!cell.isEmpty()) {
					nonEmpty++;
					assertTrue(cell.getValue() == 2 || cell.getValue() == 4);
				}
			}
		}
		assertEquals(1, nonEmpty);
		assertEquals(15, board.getEmptyPositions().size());
	}

	@Test
	public void addTileToFullBoardThrowsTest() {
		Board board = new Board(4);
		clearBoard(board);
		for (int r = 0; r < board.getSize(); r++) {
			for (int c = 0; c < board.getSize(); c++) {
				board.setCell(r, c, new Cell(2));
			}
		}

		GenerateRandomCellStrategy strategy = new GenerateRandomCellStrategy();
		assertThrows(IllegalStateException.class, () -> strategy.addTile(board));
	}

	@Test
	public void randomTilePlacementVariesTest() {
		Set<Board.Position> seenPositions = new HashSet<>();
		for (int i = 0; i < 50; i++) {
			Board board = new Board(4);
			clearBoard(board);
			GenerateRandomCellStrategy strategy = new GenerateRandomCellStrategy();
			strategy.addTile(board);
			for (int r = 0; r < board.getSize(); r++) {
				for (int c = 0; c < board.getSize(); c++) {
					if (!board.getCell(r, c).isEmpty()) {
						seenPositions.add(new Board.Position(r, c));
					}
				}
			}
		}
		assertTrue(seenPositions.size() > 1);
	}

	//FULL / EMPTY / WIN / LOSE EDGE CASES

	@Test
	public void hasEmptyCellsTrueTest() {
		Board board = new Board(2);
		clearBoard(board);
		assertTrue(board.hasEmptyCells());
	}

	@Test
	public void hasEmptyCellsFalseTest() {
		Board board = new Board(2);
		fillBoard(board, 2);
		assertFalse(board.hasEmptyCells());
		assertTrue(board.isFull());
	}

	@Test
	public void isFullFalseTest() {
		Board board = new Board(2);
		clearBoard(board);
		assertFalse(board.isFull());
	}

	@Test
	public void isWinningBoardReturnsFalseWithoutWinningValue() {
		Board board = new Board(4);
		clearBoard(board);
		board.setCell(0, 0, new Cell(2));
		board.setCell(0, 1, new Cell(4));
		assertFalse(board.isWinningBoard());
	}

	@Test
	public void isLosingBoardWithEmptyCells() {
		Board board = new Board(4);
		clearBoard(board);
		board.setCell(0, 0, new Cell(2));
		board.setCell(1, 1, new Cell(4));
		assertFalse(board.isLosingBoard());
	}

	@Test
	public void isLosingBoardRWithNoMovesPossible() {
		Board board = new Board(2);

		board.setCell(0, 0, new Cell(2));
		board.setCell(0, 1, new Cell(4));
		board.setCell(1, 0, new Cell(4));
		board.setCell(1, 1, new Cell(2));

		assertTrue(board.isLosingBoard());
	}

	@Test
	public void isLosingBoardWithVerticalMerge() {
		Board board = new Board(2);
		board.setCell(0, 0, new Cell(2));
		board.setCell(0, 1, new Cell(4));
		board.setCell(1, 0, new Cell(2));
		board.setCell(1, 1, new Cell(8));
		assertFalse(board.isLosingBoard());
	}

	@Test
	public void isLosingBoardWithHorizontalMerge() {
		Board board = new Board(2);
		board.setCell(0, 0, new Cell(2));
		board.setCell(0, 1, new Cell(2));
		board.setCell(1, 0, new Cell(4));
		board.setCell(1, 1, new Cell(8));
		assertFalse(board.isLosingBoard());
	}

	//Moves

	@Test
	public void moveUpAddsRandomTile() {
		Board board = new Board(4);
		Cell cell = new Cell(2);

		clearBoard(board);
		board.setCell(3, 0, cell);
		int emptyBefore = board.getEmptyPositions().size();
		boolean moved = board.moveUp();

		assertTrue(moved);
		assertEquals(emptyBefore - 1, board.getEmptyPositions().size());
	}


	//repOk()
	@Test
	void repOkTest() {
		Board board = new Board(4, new GenerateRandomCellStrategy());
		assertTrue(board.repOk());
	}

	@Test
	void positionEqualsSelf() {
		Board.Position pos = new Board.Position(1, 2);
		assertEquals(pos, pos);
	}

	//direction
	@Test
	void directionEnumExists() {
		assertEquals(4, Board.Direction.values().length);
		assertNotNull(Board.Direction.UP);
		assertNotNull(Board.Direction.DOWN);
		assertNotNull(Board.Direction.LEFT);
		assertNotNull(Board.Direction.RIGHT);
	}


	// ----- AUX METHODS -----


	/**
	 * Fills every cell of the board with the given value.
	 */
	private void fillBoard(Board board, int value) {
		for (int r = 0; r < board.getSize(); r++) {
			for (int c = 0; c < board.getSize(); c++) {
				board.setCell(r, c, new Cell(value));
			}
		}
	}
}
