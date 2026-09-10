package main.java.ar.edu.unrc.game2048;

import ar.edu.unrc.game2048.*;
import ar.edu.unrc.game2048.Board.Position;
import java.util.Set;

/**
 * GenerateRandomCellStrategy
 */
public class GenerateRandomCellStrategy implements GenerateCellStrategy{

    public void addTile(Board b) {
        Set<Position> empty = b.getEmptyPositions();
        if (empty.isEmpty()) {
            throw new IllegalStateException("");
        }

        // Choose random position
        int randomIndex = (int) (Math.random() * empty.size());
        Position pos = empty.stream().skip(randomIndex).findFirst().get();

        // 90% chance of 2, 10% chance of 4 (standard 2048 rules)
        int value = Math.random() < 0.9 ? 2 : 4;
        b.setCell(pos.row, pos.col, new Cell(value));
    }

}
