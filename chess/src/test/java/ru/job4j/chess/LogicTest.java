package ru.job4j.chess;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LogicTest {

    @Test
    public void whenMoveThenFigureNotFoundException() {
        Logic logic = new Logic();
        FigureNotFoundException exception = assertThrows(FigureNotFoundException.class, () -> {
            logic.move(Cell.C1, Cell.H6);
        });
        assertThat(exception.getMessage()).isEqualTo("Figure not found on the board.");
    }

    @Test
    @Disabled("Functionality not implemented yet")
    public void whenMoveToOccupiedCellThenOccupiedCellException() {
        Logic logic = new Logic();
        Figure bishop = new BishopBlack(Cell.C1);
        Figure otherPiece = new BishopBlack(Cell.G5);
        logic.add(bishop);
        logic.add(otherPiece);

        OccupiedCellException exception = assertThrows(OccupiedCellException.class, () -> {
            logic.move(Cell.C1, Cell.H6);
        });
        assertThat(exception.getMessage()).isEqualTo("Cell is occupied.");
    }

    @Test
    public void whenMoveInvalidWayThenImpossibleMoveException() {
        Logic logic = new Logic();
        Figure bishop = new BishopBlack(Cell.C1);
        logic.add(bishop);

        ImpossibleMoveException exception = assertThrows(ImpossibleMoveException.class, () -> {
            logic.move(Cell.C1, Cell.C2);
        });
        assertThat(exception.getMessage()).isEqualTo("Could not way by diagonal from C1 to C2");
    }

    @Test
    @Disabled("Functionality not implemented yet")
    public void whenValidMoveThenMoveSuccessful() throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        Figure bishop = new BishopBlack(Cell.C1);
        logic.add(bishop);

        logic.move(Cell.C1, Cell.G5);


        assertThat(bishop.position()).isEqualTo(Cell.G5);
    }
}
