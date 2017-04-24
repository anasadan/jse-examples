package com.jc;
/**
 * Maintain the position of the piece i.e king, queen, bishop, knight, rook and pawns.
 *
 * Logic to validate if the co-ordinate x and Y is right.
 *
 */
public class Position {
    private boolean available;
    private int x;
    private int y;

    public Position(final boolean available, final int x, final int y) {
        super();
        this.available = available;
        this.x = x;
        this.y = y;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(final boolean available) {
        this.available = available;
    }

    public int getX() {
        return x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(final int y) {
        this.y = y;
    }

    public boolean isValid(final Board board, final int fromX, final int fromY, final int toX, final int toY) {
        if (toX == fromX && toY == fromY)
            return false; //cannot move nothing
        if (toX < 0 || toX > 7 || fromX < 0 || fromX > 7 || toY < 0 || toY > 7 || fromY < 0 || fromY > 7)
            return false;
        return true;
    }

}