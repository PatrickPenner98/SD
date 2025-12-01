package com.example.tictactoe;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                final int r = row;
                final int c = col;
                view.getButton(r, c).setOnAction(e -> handleMove(r, c));
            }
        }

        view.getStage().show();
    }

    private void handleMove(int row, int col) {
        if (model.makeMove(row, col)) {
            view.getButton(row, col).setText(model.getCurrentPlayer());
            if (model.checkWin()) {
                view.getStatusLabel().setText("Spieler " + model.getCurrentPlayer() + " gewinnt!");
                disableAllButtons();
            } else {
                model.switchPlayer();
                view.getStatusLabel().setText("Spieler " + model.getCurrentPlayer() + " ist am Zug");
            }
        }
    }

    private void disableAllButtons() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                view.getButton(row, col).setDisable(true);
            }
        }
    }
}