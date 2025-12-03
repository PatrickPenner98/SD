package com.example.viergewinnt;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class View {
    private final int FIELD_SIZE = 100;
    private final int BORDER_SIZE = FIELD_SIZE / 10;

    private final Stage stage;
    private final GridPane gridPane = new GridPane();
    private final Button[] buttons = new Button[Model.NUMBER_OF_COLUMNS];
    private final Canvas[][] canvasses = new Canvas[Model.NUMBER_OF_ROWS][Model.NUMBER_OF_COLUMNS];
    private final Model model;

    public View(Model model, Stage stage) {
        this.model = model;
        this.stage = stage;

        for (int c = 0; c < Model.NUMBER_OF_COLUMNS; c++) {
            Button btn = new Button("↓");
            btn.setPrefWidth(FIELD_SIZE);
            buttons[c] = btn;
            gridPane.add(btn, c, 0);
        }

        for (int r = 0; r < Model.NUMBER_OF_ROWS; r++) {
            for (int c = 0; c < Model.NUMBER_OF_COLUMNS; c++) {
                Canvas canvas = new Canvas(FIELD_SIZE, FIELD_SIZE);
                canvasses[r][c] = canvas;
                gridPane.add(canvas, c, r + 1);
            }
        }

        stage.setScene(new Scene(gridPane));
        stage.setTitle("Vier Gewinnt");
        stage.show();
    }

    public void update() {
        for (int r = 0; r < Model.NUMBER_OF_ROWS; r++) {
            for (int c = 0; c < Model.NUMBER_OF_COLUMNS; c++) {
                Canvas canvas = canvasses[r][c];
                var gc = canvas.getGraphicsContext2D();
                gc.clearRect(0, 0, FIELD_SIZE, FIELD_SIZE);
                gc.setFill(model.getFieldColor(r, c));
                gc.fillOval(BORDER_SIZE, BORDER_SIZE, FIELD_SIZE - 2 * BORDER_SIZE, FIELD_SIZE - 2 * BORDER_SIZE);
            }
        }
    }

    public Stage getStage() {
        return stage;
    }

    public Button getButton(int iColumn) {
        return buttons[iColumn];
    }
}
