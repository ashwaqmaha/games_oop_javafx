package ru.job4j.chess;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.white.KnightWhite;

class KnightWhiteTest {

    @Test
    void whenPositionIsSet_thenPositionIsReturned() {
        KnightWhite knight = new KnightWhite(Cell.B1);
        assertEquals(Cell.B1, knight.position());
    }

    @Disabled("L-shaped movement logic not implemented yet")
    @Test
    void whenMoveInLShape_thenReturnPath() {
        KnightWhite knight = new KnightWhite(Cell.B1);
        Cell[] expectedPath = {Cell.C3};
        assertArrayEquals(expectedPath, knight.way(Cell.C3));
    }

    @Test
    void whenCopyToNewPosition_thenNewPositionIsSet() {
        KnightWhite knight = new KnightWhite(Cell.B1);
        KnightWhite newKnight = (KnightWhite) knight.copy(Cell.C3);
        assertEquals(Cell.C3, newKnight.position());
    }
}

