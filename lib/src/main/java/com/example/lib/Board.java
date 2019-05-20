package com.example.lib;

import java.util.Random;


public class Board {

    public static final int MIN_DIMENSION = 5;

    public static final int MAX_DIMENSION = 25;

    private Cell[][] board;

    public Board(int setDimension) {

        board = new Cell[setDimension][setDimension];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j].setCell(false, false);
            }
        }

    }


    public static Cell[][] generateBoard(int setDimension) {

        Random random = new Random();

        Cell[][] randomBoard = new Cell[setDimension][setDimension];
        for (int i = 0; i < randomBoard.length; i++) {
            for (int j = 0; j < randomBoard[i].length; j++) {
                randomBoard[i][j].setCell(random.nextBoolean(), false);
            }
        }
        return randomBoard;
    }


}
