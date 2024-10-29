package ru.job4j.chess;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.white.RookWhite;

class RookWhiteTest {

    @Test
    void whenPositionIsSet_thenPositionIsReturned() {
        RookWhite rook = new RookWhite(Cell.A1);
        assertEquals(Cell.A1, rook.position());
    }

    @Disabled("Straight-line movement logic not implemented yet")
    @Test
    void whenMoveStraight_thenReturnPath() {
        RookWhite rook = new RookWhite(Cell.A1);
        Cell[] expectedPath = {Cell.A2, Cell.A3, Cell.A4};
        assertArrayEquals(expectedPath, rook.way(Cell.A4));
    }

    @Test
    void whenCopyToNewPosition_thenNewPositionIsSet() {
        RookWhite rook = new RookWhite(Cell.A1);
        RookWhite newRook = (RookWhite) rook.copy(Cell.A4);
        assertEquals(Cell.A4, newRook.position());
    }
}

