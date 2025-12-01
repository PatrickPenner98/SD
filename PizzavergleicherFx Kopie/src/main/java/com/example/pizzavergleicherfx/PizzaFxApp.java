package com.example.pizzavergleicherfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PizzaFxApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                PizzaFxApp.class.getResource("/com/example/pizzavergleicherfx/hello-view.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Datum Validator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        System.setProperty("prism.allowhidpi", "false"); // optional für macOS
        launch();
    }
}