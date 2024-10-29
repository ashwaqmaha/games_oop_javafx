package ru.job4j.chess;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.*;
import ru.job4j.chess.ImpossibleMoveException;

import static org.junit.Assert.*;


class BishopBlackTest {
    @Test
    void testBishopBlackPosition() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        assertEquals(Cell.C1, bishop.position());
    }

    @Test
    void testBishopBlackCopy() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Figure newBishop = bishop.copy(Cell.D2);
        assertEquals(Cell.D2, newBishop.position());
    }

    @Test
    @Disabled("Not implemented: Diagonal way logic for Bishop.")
    void testBishopBlackWay() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        assertThrows(ImpossibleMoveException.class, () -> bishop.way(Cell.D1));
    }

    @Test
    @Disabled("Not implemented: Diagonal check logic.")
    void testBishopBlackIsDiagonal() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        assertFalse(bishop.isDiagonal(Cell.C1, Cell.D1));
    }
}