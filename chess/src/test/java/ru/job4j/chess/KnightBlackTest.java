package ru.job4j.chess;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.*;
import ru.job4j.chess.ImpossibleMoveException;

import static org.junit.Assert.*;


class KnightBlackTest {
    @Test
    void testKnightBlackPosition() {
        KnightBlack knight = new KnightBlack(Cell.G8);
        assertEquals(Cell.G8, knight.position());
    }

    @Test
    void testKnightBlackCopy() {
        KnightBlack knight = new KnightBlack(Cell.G8);
        Figure newKnight = knight.copy(Cell.F6);
        assertEquals(Cell.F6, newKnight.position());
    }

    @Test
    @Disabled("Not implemented: L-shaped move validation.")
    void testKnightBlackWay() {
        KnightBlack knight = new KnightBlack(Cell.G8);
        // Placeholder test for future L-shaped movement implementation
    }
}

