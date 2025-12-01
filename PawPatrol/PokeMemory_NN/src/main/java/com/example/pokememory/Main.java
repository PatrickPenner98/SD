package com.example.pokememory;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException
    {
        Model model = new Model();
        View view = new View(model, stage);
        new Controller(model, view);
    }

    public static void main(String[] args) {
        launch();
    }
}