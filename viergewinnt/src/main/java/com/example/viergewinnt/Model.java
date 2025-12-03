package com.example.viergewinnt;

import javafx.scene.paint.Color;

public class Model {
    public static final int NUMBER_OF_ROWS = 6;
    public static final int NUMBER_OF_COLUMNS = 7;

    private final int[][] matrix = new int[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
    private final String[] names = new String[2];
    private final Color[] colors = new Color[2];
    private int acting_player = 0;

    public Model(String name0, String name1, Color color0, Color color1) {
        names[0] = name0;
        names[1] = name1;
        colors[0] = color0;
        colors[1] = color1;
    }

    public String getActingPlayer() {
        return names[acting_player];
    }

    public Color getFieldColor(int iRow, int iColumn) {
        int value = matrix[iRow][iColumn];
        return value == 0 ? Color.WHITE : colors[value - 1];
    }

    public boolean Move(int iColumn) {
        for (int i = NUMBER_OF_ROWS - 1; i >= 0; i--) {
            if (matrix[i][iColumn] == 0) {
                matrix[i][iColumn] = acting_player + 1;
                if (isGameWon(acting_player + 1)) return true;
                nextPlayer();
                return false;
            }
        }
        return false;
    }

    public String Winner() {
        return isGameWon(1) ? names[0] : isGameWon(2) ? names[1] : null;
    }

    public int getFieldContent(int iRow, int iColumn) {
        return matrix[iRow][iColumn];
    }

    public boolean checkForQuadruplet(int playernumber, int iRow, int iCol, int dx, int dy) {
        for (int i = 0; i < 4; i++) {
            int r = iRow + i * dy;
            int c = iCol + i * dx;
            if (r < 0 || r >= NUMBER_OF_ROWS || c < 0 || c >= NUMBER_OF_COLUMNS || matrix[r][c] != playernumber) {
                return false;
            }
        }
        return true;
    }

    public boolean isGameWon(int playernumber) {
        for (int r = 0; r < NUMBER_OF_ROWS; r++) {
            for (int c = 0; c < NUMBER_OF_COLUMNS; c++) {
                if (checkForQuadruplet(playernumber, r, c, 1, 0) ||
                        checkForQuadruplet(playernumber, r, c, 0, 1) ||
                        checkForQuadruplet(playernumber, r, c, 1, 1) ||
                        checkForQuadruplet(playernumber, r, c, 1, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void nextPlayer() {
        acting_player = 1 - acting_player;
    }
}
