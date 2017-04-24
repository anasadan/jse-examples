package com.jc.piece;

import com.jc.Board;
import com.jc.Position;

public class Pawn extends Position {

    public Pawn(final boolean available, final int x, final int y) {
        super(available, x, y);
    }

    @Override
    public boolean isValid(final Board board, final int fromX, final int fromY, final int toX, final int toY) {

        return false;
    }

}
