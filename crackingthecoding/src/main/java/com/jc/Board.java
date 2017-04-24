package com.jc;

/**
 * Build board using 8 * 8 matrix square.
 */
public class Board {
    private final Square[][] squares = new Square[8][8];

    public Board() {
        super();
        for (int i = 1; i <= squares.length; i++) {
            for (int j = 1; j <= squares.length; j++) {
                this.squares[i][j] = new Square(i, j);
            }
        }
    }

    public Square getSpot(final int x, final int y) {
        return squares[x][y];
    }

}