package ru.job4j.chess;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.*;
import ru.job4j.chess.ImpossibleMoveException;

import static org.junit.Assert.*;


class KingBlackTest {
    @Test
    void testKingBlackPosition() {
        KingBlack king = new KingBlack(Cell.E1);
        assertEquals(Cell.E1, king.position());
    }

    @Test
    void testKingBlackCopy() {
        KingBlack king = new KingBlack(Cell.E1);
        Figure newKing = king.copy(Cell.E2);
        assertEquals(Cell.E2, newKing.position());
    }

    @Test
    @Disabled("Not implemented: Single-step move validation.")
    void testKingBlackWay() {
        KingBlack king = new KingBlack(Cell.E1);
        // Placeholder test for future one-square movement logic
    }
}
