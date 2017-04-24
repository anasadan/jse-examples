package com.jc;

/**
 * Board and NoOfPiece
 */
public class Game {
    private Board board = new Board();
    private NoOfPiece white;
    private NoOfPiece black;

    public Game() {
        super();
    }

    public void setColorWhite(final NoOfPiece noOfPiece) {
        this.white = noOfPiece;
    }

    public void setColorBlack(final NoOfPiece noOfPiece) {
        this.black = noOfPiece;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(final Board board) {
        this.board = board;
    }

    public NoOfPiece getWhite() {
        return white;
    }

    public void setWhite(final NoOfPiece white) {
        this.white = white;
    }

    public NoOfPiece getBlack() {
        return black;
    }

    public void setBlack(final NoOfPiece black) {
        this.black = black;
    }

    public boolean initializeBoardGivenPlayers() {
        if (this.black == null || this.white == null)
            return false;
        this.board = new Board();
        for (int i = 0; i < black.getPieces().size(); i++) {
            board.getSpot(black.getPieces().get(i).getX(), black.getPieces().get(i).getY()).occupySpot(black.getPieces().get(i));
        }
        return true;
    }

}