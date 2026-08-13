
package ar.edu.unrc.game2048;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

    @Test
    public void createCellWithNegativeValue() {
        assertThrows(IllegalArgumentException.class, () -> new Cell(-5), "Cell value cannot be negative");
    }

    @Test
    public void createCellWithANotPowerOfTwo() {
        assertThrows(IllegalArgumentException.class, () -> new Cell(3), "Cell value must be a power of two.");
    }

    @Test
    public void canMergeWithInvalid() {
        // Arrange
        Cell cell  = new Cell(2);
        Cell cell2 = new Cell(4);
        // Assert
        assertFalse(cell.canMergeWith(cell2));
    }

    @Test
    public void canMergeWithOtherNull() {
        // Arrange
        Cell cell  = new Cell(2);
        Cell cell2 = null;
        // Assert
        assertThrows(IllegalArgumentException.class,() -> cell.canMergeWith(cell2), "Cannot read field value because other is null.");
    }
	@Test
	public void nonEqualsTest() {
		Cell cell = new Cell(2);
		Cell otherCell = new Cell(4);

		assertNotEquals(cell, otherCell);
	}

	@Test
	public void equalsTest() {
		Cell cell = new Cell(32);
		Cell otherCell = new Cell(32);
		assertEquals(cell, otherCell);
	}

	@Test
	public void equalToNull() {
		Cell cell = new Cell(16);
		assertFalse(cell.equals(null));
	}

	@Test
	public void equalToItself() {
		Cell cell = new Cell(16);
		assertTrue(cell.equals(cell));
	}

	@Test
	public void equalToOtherType() {
		int value = 32;
		Cell cell = new Cell(value);
		assertFalse(cell.equals(value));
	}

	@Test
	public void equalToCellEmpty() {
		Cell cell = new Cell(0);
		assertTrue(cell.equals(Cell.EMPTY));
	}
}
