package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class PawnBlack implements Figure {
    private final Cell position;

    public PawnBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) throws ImpossibleMoveException {
        // Check if the destination is a valid move for a pawn
        if (!isValidMove(dest)) {
            throw new ImpossibleMoveException(
                    String.format("Pawn cannot move to %s from %s", dest, this.position)
            );
        }

        // Determine path (only one cell for regular moves)
        int deltaX = dest.getX() - this.position.getX();
        int deltaY = dest.getY() - this.position.getY();

        if (deltaY == 1 && deltaX == 0) {
            // Move one cell forward
            return new Cell[] {dest};
        } else if (deltaY == 2 && deltaX == 0 && this.position.getY() == 1) {
            // Double move only from starting position (second row for black pawns)
            return new Cell[] {Cell.findBy(this.position.getX(), this.position.getY() + 1), dest};
        } else if (Math.abs(deltaX) == 1 && deltaY == 1) {
            // Capture diagonally
            return new Cell[] {dest};
        }

        // Default case: no movement allowed
        throw new ImpossibleMoveException("Invalid move for pawn.");
    }

    private boolean isValidMove(Cell dest) {
        int deltaX = dest.getX() - this.position.getX();
        int deltaY = dest.getY() - this.position.getY();

        // Single cell forward move
        if (deltaY == 1 && deltaX == 0) {
            return true;
        }
        // Double forward move from starting row
        if (deltaY == 2 && deltaX == 0 && this.position.getY() == 1) {
            return true;
        }
        // Diagonal capture
        if (Math.abs(deltaX) == 1 && deltaY == 1) {
            return true;
        }
        return false;
    }


//    @Override
//    public Cell[] way(Cell dest) {
//        return new Cell[] {
//                dest
//        };
//    }

    @Override
    public Figure copy(Cell dest) {
        return new PawnBlack(dest);
    }
}
