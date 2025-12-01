package com.example.tictactoe;

public class Model {
    private String[][] board = new String[3][3];
    private String currentPlayer = "X";

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean makeMove(int row, int col) {
        if (board[row][col] == null) {
            board[row][col] = currentPlayer;
            return true;
        }
        return false;
    }

    public void switchPlayer() {
        currentPlayer = currentPlayer.equals("X") ? "O" : "X";
    }

    public String getCell(int row, int col) {
        return board[row][col];
    }

    public void reset() {
        board = new String[3][3];
        currentPlayer = "X";
    }

    public boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (same(board[i][0], board[i][1], board[i][2]) ||
                    same(board[0][i], board[1][i], board[2][i])) return true;
        }
        return same(board[0][0], board[1][1], board[2][2]) ||
                same(board[0][2], board[1][1], board[2][0]);
    }

    private boolean same(String a, String b, String c) {
        return a != null && a.equals(b) && a.equals(c);
    }
}