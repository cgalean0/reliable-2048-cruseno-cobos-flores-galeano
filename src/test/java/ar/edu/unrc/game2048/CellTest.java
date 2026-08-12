
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
}
