package com.jc;

/**
 * Each square is represent by its position co-ordinate X and Y and logic to validate the position i.e. Position
 */
public class Square {
    private final int x;
    private final int y;
    private Position piece;

    public Square(final int x, final int y) {
        super();
        this.x = x;
        this.y = y;
        piece = null;
    }

    public void occupySpot(final Position piece) {
        //if piece already here, delete it, i. e. set it dead
        if (this.piece != null)
            this.piece.setAvailable(false);
        //place piece here
        this.piece = piece;
    }

    public boolean isOccupied() {
        if (piece != null)
            return true;
        return false;
    }

    public Position releaseSpot() {
        final Position releasedPiece = this.piece;
        this.piece = null;
        return releasedPiece;
    }

}
