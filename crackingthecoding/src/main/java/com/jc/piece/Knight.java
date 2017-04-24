package com.jc.piece;

import com.jc.Board;
import com.jc.Position;

public class Knight extends Position {

    public Knight(final boolean available, final int x, final int y) {
        super(available, x, y);
    }

    @Override
    public boolean isValid(final Board board, final int fromX, final int fromY, final int toX, final int toY) {
        if (super.isValid(board, fromX, fromY, toX, toY) == false)
            return false;

        if (toX != fromX - 1 && toX != fromX + 1 && toX != fromX + 2 && toX != fromX - 2)
            return false;
        if (toY != fromY - 2 && toY != fromY + 2 && toY != fromY - 1 && toY != fromY + 1)
            return false;

        return true;
    }

}