package com.example.tictactoe;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Model model = new Model();
        View view = new View(primaryStage);
        new Controller(model, view);
    }

    public static void main(String[] args) {
        launch(args);
    }
}