package ru.job4j.chess;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.white.PawnWhite;

class PawnWhiteTest {

    @Test
    void whenPositionIsSet_thenPositionIsReturned() {
        PawnWhite pawn = new PawnWhite(Cell.D2);
        assertEquals(Cell.D2, pawn.position());
    }

    @Disabled("Pawn movement logic not implemented yet")
    @Test
    void whenMoveForwardOne_thenReturnPath() {
        PawnWhite pawn = new PawnWhite(Cell.D2);
        Cell[] expectedPath = {Cell.D3};
        assertArrayEquals(expectedPath, pawn.way(Cell.D3));
    }

    @Test
    void whenCopyToNewPosition_thenNewPositionIsSet() {
        PawnWhite pawn = new PawnWhite(Cell.D2);
        PawnWhite newPawn = (PawnWhite) pawn.copy(Cell.D3);
        assertEquals(Cell.D3, newPawn.position());
    }
}

