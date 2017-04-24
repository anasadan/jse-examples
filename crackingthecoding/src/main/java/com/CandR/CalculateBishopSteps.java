package com.CandR;

/**
 * Created by ehimnay on 01/04/2017.
 */
public class CalculateBishopSteps {

    public static void main(String...args) {
        printMoves(1, 1, 1, 1);
        printMoves(1, 1, 8, 8);
        printMoves(8, 8, 1, 1);
        printMoves(1, 8, 8, 1);
        printMoves(8, 1, 1, 8);
    }

    public static void printMoves(int startX, int startY, int destX, int destY) {

        if (startX == destX && startY == destY) {
            System.out.println(destX + " " + destY);
            return;
        }
        int stepX, stepY;
        if (destX > startX) {
            stepX = destX - 1;
        } else {
            stepX = destX + 1;
        }

        if (destY > startY) {
            stepY = destY - 1;
        } else {
            stepY = destY + 1;
        }

        printMoves(startX, startY, stepX, stepY);
        System.out.println(destX + " " + destY);
    }
}
