package ru.job4j.chess;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.*;
import ru.job4j.chess.ImpossibleMoveException;

import static org.junit.Assert.*;


class PawnBlackTest {
    @Test
    void testPawnBlackPosition() {
        PawnBlack pawn = new PawnBlack(Cell.A7);
        assertEquals(Cell.A7, pawn.position());
    }

    @Test
    void testPawnBlackCopy() {
        PawnBlack pawn = new PawnBlack(Cell.A7);
        Figure newPawn = pawn.copy(Cell.A6);
        assertEquals(Cell.A6, newPawn.position());
    }

    @Test
    @Disabled("Not implemented: Pawn-specific movement validation.")
    void testPawnBlackWay() {
        PawnBlack pawn = new PawnBlack(Cell.A7);
        // Placeholder test for pawn's move behavior
    }
}
