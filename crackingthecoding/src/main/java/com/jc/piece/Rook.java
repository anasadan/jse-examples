package com.jc.piece;

import com.jc.Board;
import com.jc.Position;

public class Rook extends Position {

    public Rook(final boolean available, final int x, final int y) {
        super(available, x, y);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean isValid(final Board board, final int fromX, final int fromY, final int toX, final int toY) {
        if (super.isValid(board, fromX, fromY, toX, toY) == false)
            return false;
        if (toX == fromX)
            return true;
        if (toY == fromY)
            return true;
        return false;
    }
}