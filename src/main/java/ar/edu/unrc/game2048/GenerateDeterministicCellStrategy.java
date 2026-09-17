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
        int row = nextInt();
        int col = nextInt();
        Integer value = nextInt();
        if (row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize()) {
                throw new IllegalStateException(
                    "Deterministic strategy produced invalid position: (" + row + "," + col + ")"
            );
        }
        board.setCell(row, col, new Cell(value));
    }

    public void reset() {
        this.count = 0;
    }

    private int nextInt() {
        return values[count++ % values.length];
    }
}
