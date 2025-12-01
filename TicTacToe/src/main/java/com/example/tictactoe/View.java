package com.example.tictactoe;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View {
    private Button[][] buttons = new Button[3][3];
    private Label statusLabel = new Label("Spieler X beginnt");
    private Stage stage;

    public View(Stage stage) {
        this.stage = stage;
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Button button = new Button("");
                button.setPrefSize(100, 100);
                buttons[row][col] = button;
                grid.add(button, col, row);
            }
        }

        VBox root = new VBox(10, statusLabel, grid);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 400, 450);
        stage.setScene(scene);
        stage.setTitle("Tic Tac Toe");
    }

    public Button getButton(int row, int col) {
        return buttons[row][col];
    }

    public Label getStatusLabel() {
        return statusLabel;
    }

    public Stage getStage() {return stage;}
}