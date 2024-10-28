//package ru.job4j.chess;
//
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Test;
//import ru.job4j.chess.firuges.Cell;
//import ru.job4j.chess.firuges.black.BishopBlack;
//
//import static org.assertj.core.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//@Disabled("Тесты отключены. Удалить аннотацию после реализации всех методов по заданию.")
//public class LogicTest {
//
//    @Test
//    public void whenMoveThenFigureNotFoundException()
//            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
//        Logic logic = new Logic();
//        FigureNotFoundException exception = assertThrows(FigureNotFoundException.class, () -> {
//            logic.move(Cell.C1, Cell.H6);
//        });
//        assertThat(exception.getMessage()).isEqualTo("Figure not found on the board.");
//    }
//}

package ru.job4j.chess;

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
    public void whenMoveToOccupiedCellThenOccupiedCellException() {
        Logic logic = new Logic();
        Figure bishop = new BishopBlack(Cell.C1);
        Figure otherPiece = new BishopBlack(Cell.H6);
        logic.add(bishop);
        logic.add(otherPiece);

        ImpossibleMoveException exception = assertThrows(ImpossibleMoveException.class, () -> {
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
        assertThat(exception.getMessage()).isEqualTo("Could not move the bishop this way.");
    }

    @Test
    public void whenValidMoveThenMoveSuccessful() throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        Figure bishop = new BishopBlack(Cell.C1);
        logic.add(bishop);

        logic.move(Cell.C1, Cell.G5);


        assertThat(bishop.position()).isEqualTo(Cell.G5);
    }
}
