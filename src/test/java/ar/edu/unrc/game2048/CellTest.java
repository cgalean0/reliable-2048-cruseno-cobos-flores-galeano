package ar.edu.unrc.game2048;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CellTest {

  @Test
  public void testEmptyCell() {
    Cell cell = new Cell(0);
    assertTrue(cell.isEmpty());
    assertEquals(0, cell.getValue());
    assertEquals(Cell.EMPTY, cell);
  }

  @Test
  public void testValidCell() {
    Cell cell2 = new Cell(2);
    assertFalse(cell2.isEmpty());
    assertEquals(2, cell2.getValue());
  }

  @Test
  public void createCellWithNegativeValue() {
    assertThrows("Cell value cannot be negative", IllegalArgumentException.class, () -> new Cell(-5));
  }

  @Test
  public void createCellWithANotPowerOfTwo() {
    assertThrows("Cell value must be a power of two.", IllegalArgumentException.class, () -> new Cell(3));
  }

  @Test
  public void createCellWithZero() {
    Cell cell = new Cell(0);
    assertEquals(0, cell.getValue());
  }

  // JUnit 4 no tiene @ParameterizedTest/@ValueSource: se reemplaza por un loop.
  @Test
  public void createCellWithAPowerOfTwo() {
    int[] values = { 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048 };
    for (int value : values) {
      assertEquals("Cell(" + value + ") debe conservar su valor", value, new Cell(value).getValue());
    }
  }

  @Test
  public void canMergeWithInvalid() {
    // Arrange
    Cell cell = new Cell(2);
    Cell cell2 = new Cell(4);
    // Assert
    assertFalse(cell.canMergeWith(cell2));
  }

  @Test
  public void canMergeWithOtherNull() {
    // Arrange
    Cell cell = new Cell(2);
    Cell cell2 = null;
    // Assert
    assertThrows("Cannot read field value because other is null.", IllegalArgumentException.class,
        () -> cell.canMergeWith(cell2));
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
    assertTrue("Cell(0) debe ser válida", cell0.repOK());

    Cell cell2 = new Cell(2);
    assertTrue("Cell(2) debe ser válida", cell2.repOK());

    Cell cell4 = new Cell(4);
    assertTrue("Cell(4) debe ser válida", cell4.repOK());

    Cell cell16 = new Cell(16);
    assertTrue("Cell(16) debe ser válida", cell16.repOK());

    // repOK debe retornar true para Cell.EMPTY
    assertTrue("Cell.EMPTY debe ser válida", Cell.EMPTY.repOK());

    // repOK debe retornar true después de operaciones válidas
    Cell merged = cell16.mergeWith(new Cell(16));
    assertTrue("Cell merged debe ser válida", merged.repOK());
    assertEquals(32, merged.getValue());
    assertTrue("repOK debe seguir siendo true después de mergeWith", merged.repOK());
  }

  @Test
  public void testRepOKAllPowersOfTwo() {

    int[] validPowers = { 0, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048 };

    for (int power : validPowers) {
      Cell cell = new Cell(power);
      assertTrue("Cell(" + power + ") debe cumplir repOK", cell.repOK());
    }
  }

  @Test
  public void testRepOKInvalidValues() {

    assertThrows("Cell(-1) debe lanzar excepción", IllegalArgumentException.class,
        () -> new Cell(-1));

    assertThrows("Cell(3) debe lanzar excepción (no es potencia de 2)", IllegalArgumentException.class,
        () -> new Cell(3));

    assertThrows("Cell(5) debe lanzar excepción", IllegalArgumentException.class,
        () -> new Cell(5));

    assertThrows("Cell(100) debe lanzar excepción", IllegalArgumentException.class,
        () -> new Cell(100));
  }

  @Test
  public void testRepOKConsistency() {
    Cell cell = new Cell(256);

    boolean rep1 = cell.repOK();
    boolean rep2 = cell.repOK();
    boolean rep3 = cell.repOK();

    assertTrue("repOK debe ser consistente", rep1 && rep2 && rep3);
  }
}
