package com.jc.piece;

import com.jc.Board;
import com.jc.Position;

public class King extends Position {

    public King(final boolean available, final int x, final int y) {
        super(available, x, y);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if (super.isValid(board, fromX, fromY, toX, toY) == false)
            return false;
        if (Math.sqrt(Math.pow(Math.abs((toX - fromX)), 2)) + Math.pow(Math.abs((toY - fromY)), 2) != Math.sqrt(2)) {
            return false;
        }
        return false;
    }

}
