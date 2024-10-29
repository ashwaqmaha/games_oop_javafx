package ru.job4j.chess;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.white.QueenWhite;

class QueenWhiteTest {

    @Test
    void whenPositionIsSet_thenPositionIsReturned() {
        QueenWhite queen = new QueenWhite(Cell.D1);
        assertEquals(Cell.D1, queen.position());
    }

    @Disabled("Diagonal and straight movement logic not implemented yet")
    @Test
    void whenMoveDiagonallyOrStraight_thenReturnPath() {
        QueenWhite queen = new QueenWhite(Cell.D1);
        Cell[] expectedPath = {Cell.E2, Cell.F3};
        assertArrayEquals(expectedPath, queen.way(Cell.F3));
    }

    @Test
    void whenCopyToNewPosition_thenNewPositionIsSet() {
        QueenWhite queen = new QueenWhite(Cell.D1);
        QueenWhite newQueen = (QueenWhite) queen.copy(Cell.D4);
        assertEquals(Cell.D4, newQueen.position());
    }
}

