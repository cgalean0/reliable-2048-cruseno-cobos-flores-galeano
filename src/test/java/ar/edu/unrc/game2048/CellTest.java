package ar.edu.unrc.game2048;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//@DisplayName("Cell Tests")
public class CellTest {


    @Test
    //@DisplayName("should create empty cell with value 0")
    void testEmptyCell() {
        Cell cell = new Cell(0);
        assertTrue(cell.isEmpty());
        assertEquals(0, cell.getValue());
        assertEquals(Cell.EMPTY, cell);
    }

    @Test
    //@DisplayName("should create valid power-of-two cells")
    void testValidCell() {
        Cell cell2 = new Cell(2);
        assertFalse(cell2.isEmpty());
        assertEquals(2, cell2.getValue());
    }

    @Test
    public void createCellWithNegativeValue() {
        assertThrows(IllegalArgumentException.class, () -> new Cell(-5), "Cell value cannot be negative");
    }

    @Test
    public void createCellWithANotPowerOfTwo() {
        assertThrows(IllegalArgumentException.class, () -> new Cell(3), "Cell value must be a power of two.");
    }

	@Test
	public void createCellWithZero() {
		Cell cell = new Cell(0);
		assertEquals(0, cell.getValue());
	}

	@ParameterizedTest
	@ValueSource(ints = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048})
	public void createCellWithAPowerOfTwo(int value) {
		assertEquals(value, new Cell(value).getValue());
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

	@Test
	public void testHashCode() {
        // Dos celdas con el mismo valor deben tener el mismo hashCode
        Cell cell1 = new Cell(16);
        Cell cell2 = new Cell(16);
        assertEquals(cell1.hashCode(), cell2.hashCode());

        // El hashCode debe ser consistente (misma llamada = mismo resultado)
        int hash1 = cell1.hashCode();
        int hash2 = cell1.hashCode();
        assertEquals(hash1, hash2);

        // Celdas con diferente valor deben (probablemente) tener diferente hashCode
        Cell cell3 = new Cell(32);
        assertNotEquals(cell1.hashCode(), cell3.hashCode());

        // Cell.EMPTY debe tener hashCode válido
        Cell empty1 = Cell.EMPTY;
        Cell empty2 = new Cell(0);
        assertEquals(empty1.hashCode(), empty2.hashCode());
	}

	@Test
	public void testRepOK() {
        // repOK debe retornar true para valores válidos (potencias de 2)
        Cell cell0 = new Cell(0);
        assertTrue(cell0.repOK(), () -> "Cell(0) debe ser válida");

        Cell cell2 = new Cell(2);
        assertTrue(cell2.repOK(), () -> "Cell(2) debe ser válida");

        Cell cell4 = new Cell(4);
        assertTrue(cell4.repOK(), () -> "Cell(4) debe ser válida");

        Cell cell16 = new Cell(16);
        assertTrue(cell16.repOK(), () -> "Cell(16) debe ser válida");

        // repOK debe retornar true para Cell.EMPTY
        assertTrue(Cell.EMPTY.repOK(), () -> "Cell.EMPTY debe ser válida");

        // repOK debe retornar true después de operaciones válidas
        Cell merged = cell16.mergeWith(new Cell(16));
        assertTrue(merged.repOK(), () -> "Cell merged debe ser válida");
        assertEquals(32, merged.getValue());
        assertTrue(merged.repOK(), () -> "repOK debe seguir siendo true después de mergeWith");
	}

	@Test
	public void testRepOKAllPowersOfTwo() {

        int[] validPowers = {0, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};

        for (int power : validPowers) {
            Cell cell = new Cell(power);
            assertTrue(cell.repOK(),
                    () -> "Cell(" + power + ") debe cumplir repOK");
        }
	}

	@Test
	public void testRepOKInvalidValues() {

        assertThrows(IllegalArgumentException.class, () -> new Cell(-1),
                    () -> "Cell(-1) debe lanzar excepción");

        assertThrows(IllegalArgumentException.class, () -> new Cell(3),
                    () -> "Cell(3) debe lanzar excepción (no es potencia de 2)");

        assertThrows(IllegalArgumentException.class, () -> new Cell(5),
                    () -> "Cell(5) debe lanzar excepción");

        assertThrows(IllegalArgumentException.class, () -> new Cell(100),
                    () -> "Cell(100) debe lanzar excepción");
	}

	@Test
	public void testRepOKConsistency() {
        Cell cell = new Cell(256);

        boolean rep1 = cell.repOK();
        boolean rep2 = cell.repOK();
        boolean rep3 = cell.repOK();

        assertTrue(rep1 && rep2 && rep3,
                () -> "repOK debe ser consistente");
	}
}
