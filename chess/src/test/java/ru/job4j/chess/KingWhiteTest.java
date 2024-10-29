package ru.job4j.chess;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.white.KingWhite;

class KingWhiteTest {

    @Test
    void whenPositionIsSet_thenPositionIsReturned() {
        KingWhite king = new KingWhite(Cell.E1);
        assertEquals(Cell.E1, king.position());
    }

    @Disabled("Complete movement logic not implemented yet")
    @Test
    void whenMoveOneSquare_thenReturnPath() {
        KingWhite king = new KingWhite(Cell.E1);
        Cell[] expectedPath = {Cell.E2};
        assertArrayEquals(expectedPath, king.way(Cell.E2));
    }

    @Test
    void whenCopyToNewPosition_thenNewPositionIsSet() {
        KingWhite king = new KingWhite(Cell.E1);
        KingWhite newKing = (KingWhite) king.copy(Cell.E2);
        assertEquals(Cell.E2, newKing.position());
    }
}

