package ru.job4j.chess;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.*;
import ru.job4j.chess.ImpossibleMoveException;

import static org.junit.Assert.*;


class QueenBlackTest {
    @Test
    void testQueenBlackPosition() {
        QueenBlack queen = new QueenBlack(Cell.D8);
        assertEquals(Cell.D8, queen.position());
    }

    @Test
    void testQueenBlackCopy() {
        QueenBlack queen = new QueenBlack(Cell.D8);
        Figure newQueen = queen.copy(Cell.D1);
        assertEquals(Cell.D1, newQueen.position());
    }

    @Test
    @Disabled("Not implemented: Diagonal and straight move validation.")
    void testQueenBlackWay() {
        QueenBlack queen = new QueenBlack(Cell.D8);
        // Placeholder test for future movement logic
    }
}