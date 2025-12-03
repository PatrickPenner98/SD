package com.example.viergewinnt;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        for (int c = 0; c < Model.NUMBER_OF_COLUMNS; c++) {
            int col = c;
            view.getButton(c).setOnAction(e -> {
                boolean won = model.Move(col);
                view.update();
                if (won) {
                    view.getStage().setTitle("Gewonnen: " + model.getActingPlayer());
                    for (int i = 0; i < Model.NUMBER_OF_COLUMNS; i++) {
                        view.getButton(i).setDisable(true);
                    }
                }
            });
        }

        view.update();
    }

    public void update() {
        view.update();
    }
}
