package ar.edu.unrc.game2048;

import java.util.List;

import ar.edu.unrc.game2048.*;
import ar.edu.unrc.game2048.Board.Position;

/**
 * GenerateDeterministicCellStrategy
 */
public class GenerateDeterministicCellStrategy implements GenerateCellStrategy{

    private List<Board.Position> pos;
    private List<Integer> values;

    public GenerateDeterministicCellStrategy(List<Board.Position> pos, List<Integer> values) {
        this.pos = pos;
        this.values = values;
    }

    public void addTile(Board board) {
        Position p = pos.get(0);
        Integer v = values.get(0);
        pos.remove(0);
        values.remove(0);
        board.setCell(p.row, p.col, new Cell(v));
    }
}
