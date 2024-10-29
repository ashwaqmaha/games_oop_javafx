package ru.job4j.chess;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.*;
import ru.job4j.chess.ImpossibleMoveException;

class RookBlackTest {
    @Test
    void testRookBlackPosition() {
        RookBlack rook = new RookBlack(Cell.A8);
        assertEquals(Cell.A8, rook.position());
    }

    @Test
    void testRookBlackCopy() {
        RookBlack rook = new RookBlack(Cell.A8);
        Figure newRook = rook.copy(Cell.A1);
        assertEquals(Cell.A1, newRook.position());
    }

    @Test
    @Disabled("Not implemented: Way logic for rook movement.")
    void testRookBlackWay() {
        RookBlack rook = new RookBlack(Cell.A8);
        // Placeholder test for future movement implementation
    }
}
