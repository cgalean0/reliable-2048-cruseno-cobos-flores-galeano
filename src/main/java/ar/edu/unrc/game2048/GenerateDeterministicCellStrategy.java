package ar.edu.unrc.game2048;

import java.util.List;

import ar.edu.unrc.game2048.*;
import ar.edu.unrc.game2048.Board.Position;

/**
 * GenerateDeterministicCellStrategy
 */
public class GenerateDeterministicCellStrategy implements GenerateCellStrategy{

    private int[] values;
    private int count = 0;

    public GenerateDeterministicCellStrategy(int[] values) {
        this.values = values;
    }

   public void addTile(Board board) {
    int row = Math.abs(nextInt()) % board.getSize();
    int col = Math.abs(nextInt()) % board.getSize();
    int rawValue = Math.abs(nextInt());
    int value = (rawValue == 0 || (rawValue & (rawValue - 1)) != 0) ? 2 : rawValue;
    board.setCell(row, col, new Cell(value));
    }

    public void reset() {
        this.count = 0;
    }

    private int nextInt() {
        return values[count++ % values.length];
    }
}
