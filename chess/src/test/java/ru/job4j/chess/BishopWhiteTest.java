package ru.job4j.chess;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.white.BishopWhite;

class BishopWhiteTest {

    @Test
    void whenPositionIsSet_thenPositionIsReturned() {
        BishopWhite bishop = new BishopWhite(Cell.C1);
        assertEquals(Cell.C1, bishop.position());
    }

    @Disabled("Diagonal movement logic not implemented yet")
    @Test
    void whenMoveDiagonally_thenReturnPath() {
        BishopWhite bishop = new BishopWhite(Cell.C1);
        Cell[] expectedPath = {Cell.D2, Cell.E3};
        assertArrayEquals(expectedPath, bishop.way(Cell.E3));
    }

    @Test
    void whenCopyToNewPosition_thenNewPositionIsSet() {
        BishopWhite bishop = new BishopWhite(Cell.C1);
        BishopWhite newBishop = (BishopWhite) bishop.copy(Cell.D2);
        assertEquals(Cell.D2, newBishop.position());
    }
}

