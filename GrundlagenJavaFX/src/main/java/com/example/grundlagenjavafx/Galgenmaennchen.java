package com.example.grundlagenjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Galgenmaennchen {

    @FXML
    private HBox buchstabenBox;

    @FXML
    private TextField textField;

    @FXML
    private ImageView imageView;

    @FXML
    private Button btnStart;

    @FXML
    private Button btnEnd;

    private List<String> ratewoerter;
    private String aktuellesWort;
    private Set<Character> richtigeBuchstaben;
    private Set<Character> falscheBuchstaben;
    private final int MAX_FEHLER = 7;

    @FXML
    public void initialize() {
        System.out.println("Controller wurde initialisiert.");
        ladeRatewoerter();
        spielStarten();

        if (textField != null) {
            textField.setOnAction(e -> verarbeiteEingabe());
        } else {
            System.err.println("❗ TextField wurde nicht korrekt aus FXML geladen.");
        }
    }

    private void ladeRatewoerter() {
        try {
            URL resource = Galgenmaennchen.class.getResource("/Ratewoerter.txt");
            if (resource == null) {
                throw new RuntimeException("Datei 'Ratewoerter.txt' nicht gefunden!");
            }

            Path path = Path.of(resource.toURI());
            ratewoerter = Files.readAllLines(path);
            System.out.println("Ratewörter erfolgreich geladen: " + ratewoerter.size() + " Wörter.");
        } catch (Exception e) {
            e.printStackTrace();
            ratewoerter = List.of("DEFAULT"); // Fallback
        }
    }

    private void spielStarten() {
        if (ratewoerter == null || ratewoerter.isEmpty()) {
            ratewoerter = List.of("DEFAULT");
        }

        aktuellesWort = ratewoerter.get(new Random().nextInt(ratewoerter.size())).toUpperCase();
        richtigeBuchstaben = new HashSet<>();
        falscheBuchstaben = new HashSet<>();

        if (textField != null) {
            textField.clear();
        }

        aktualisiereBuchstabenAnzeigen();
        aktualisiereBild();
    }

    private void verarbeiteEingabe() {
        if (textField == null) return;

        String eingabe = textField.getText().toUpperCase().trim();
        textField.clear();

        if (eingabe.length() != 1 || !eingabe.matches("[A-ZÄÖÜ]")) {
            return;
        }

        char buchstabe = eingabe.charAt(0);

        if (aktuellesWort.contains(String.valueOf(buchstabe))) {
            richtigeBuchstaben.add(buchstabe);
        } else {
            falscheBuchstaben.add(buchstabe);
        }

        aktualisiereBuchstabenAnzeigen();
        aktualisiereBild();
        prüfeSpielende();
    }

    private void aktualisiereBuchstabenAnzeigen() {
        buchstabenBox.getChildren().clear();

        for (char c : aktuellesWort.toCharArray()) {
            Label label = new Label();
            label.setFont(Font.font(28));
            label.setText(richtigeBuchstaben.contains(c) ? String.valueOf(c) : "_");
            buchstabenBox.getChildren().add(label);
        }
    }

    private void aktualisiereBild() {
        int fehler = falscheBuchstaben.size();
        int bildIndex = MAX_FEHLER - fehler;
        String bildPfad = "/Bilder/Bild" + bildIndex + ".jpg";
        URL imageUrl = getClass().getResource(bildPfad);

        if (imageUrl != null) {
            imageView.setImage(new Image(imageUrl.toExternalForm()));
        } else {
            System.err.println("Bild nicht gefunden: " + bildPfad);
        }
    }

    private void prüfeSpielende() {
        if (istWortVollständig()) {
            zeigeDialog("Herzlichen Glückwunsch! Du hast das Wort erraten. Nochmal?");
        } else if (falscheBuchstaben.size() >= MAX_FEHLER) {
            zeigeDialog("Game Over! Das Wort war: " + aktuellesWort + ". Nochmal?");
        }
    }

    private boolean istWortVollständig() {
        for (char c : aktuellesWort.toCharArray()) {
            if (!richtigeBuchstaben.contains(c)) {
                return false;
            }
        }
        return true;
    }

    private void zeigeDialog(String nachricht) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Spielende – Nochmal?");
        alert.setContentText(nachricht);
        alert.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            spielStarten();
        } else {
            onEndClicked();
        }
    }

    @FXML
    private void onRestartClicked() {
        spielStarten();
    }

    @FXML
    private void onEndClicked() {
        System.exit(0);
    }
}
