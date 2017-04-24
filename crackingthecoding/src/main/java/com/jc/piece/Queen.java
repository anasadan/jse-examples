package com.jc.piece;

import com.jc.Board;
import com.jc.Position;

public class Queen extends Position {

    public Queen(final boolean available, final int x, final int y) {
        super(available, x, y);
    }

    @Override
    public boolean isValid(final Board board, final int fromX, final int fromY, final int toX, final int toY) {
        if (super.isValid(board, fromX, fromY, toX, toY) == false)
            return false;
        //diagonal
        if (toX - fromX == toY - fromY)
            return true;
        if (toX == fromX)
            return true;
        if (toY == fromY)
            return true;

        return false;
    }

}