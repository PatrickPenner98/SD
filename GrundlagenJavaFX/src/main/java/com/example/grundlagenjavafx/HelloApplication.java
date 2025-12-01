package com.example.grundlagenjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        try {
            //Parent helloView = FXMLLoader.load(getClass().getResource("/com/example/grundlagenjavafx/hello-view.fxml"));
            Parent uebungView = FXMLLoader.load(getClass().getResource("/com/example/grundlagenjavafx/EinstiegControlUebung.fxml"));
            //Parent galgenmaennchen = FXMLLoader.load(getClass().getResource("/com/example/grundlagenjavafx/Galgenmaennchen.fxml"));


            VBox vbox = new VBox(/*helloView, galgenmaennchen, */ uebungView);

            Scene scene = new Scene(vbox);
            stage.setTitle("Grundelemente + Übung");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace(); // zeigt dir genau, was schiefläuft
        }
    }


    public static void main(String[] args) {
        launch();
    }
}
