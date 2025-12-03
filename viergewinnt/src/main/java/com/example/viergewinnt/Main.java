package com.example.viergewinnt;
import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Model model = new Model("Spieler 1", "Spieler 2", Color.RED, Color.YELLOW);
        View view = new View(model, stage);
        new Controller(model, view);
    }

    public static void main(String[] args) {
        launch(args);
    }
}