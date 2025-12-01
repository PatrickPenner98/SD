package com.example.pizzavergleicherfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;

import java.util.function.UnaryOperator;
import java.util.regex.Pattern;


public class PizzaController {

    @FXML
    private Button ValidBtn;

    @FXML
    private Label Validlbl;

    @FXML
    private TextField ValidtxtField;

    @FXML
    public void initialize() {
        // Regex-Pattern für Teil-Eingaben: erlaubt nur Zahlen und Punkte
        Pattern datePattern = Pattern.compile("\\d{0,2}(\\.\\d{0,2}(\\.\\d{0,4})?)?");
        UnaryOperator<TextFormatter.Change> filter = change -> {
            String newText = change.getControlNewText();
            if (datePattern.matcher(newText).matches()) return change;
            return null;
        };
        ValidtxtField.setTextFormatter(new TextFormatter<>(filter));

        ValidBtn.setOnAction(e -> onClickCheckValid());
    }

    public void onClickCheckValid() {
        String text = ValidtxtField.getText();
        String[] parts = text.split("\\.");
        if (parts.length != 3) {
            Validlbl.setText("Format muss tt.mm.yyyy sein");
            return;
        }

        int tag, monat, jahr;
        try {
            tag = Integer.parseInt(parts[0]);
            monat = Integer.parseInt(parts[1]);
            jahr = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            Validlbl.setText("Nur Zahlen erlaubt");
            return;
        }

        if (monat < 1 || monat > 12) {
            Validlbl.setText("Monat muss zwischen 1 und 12 liegen");
            return;
        }

        boolean schaltjahr = (jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0);

        int tageImMonat;
        switch (monat) {
            case 1, 3, 5, 7, 8, 10, 12 -> tageImMonat = 31;
            case 4, 6, 9, 11 -> tageImMonat = 30;
            case 2 -> tageImMonat = schaltjahr ? 29 : 28;
            default -> tageImMonat = 0;
        }

        if (tag < 1 || tag > tageImMonat) {
            Validlbl.setText("Ungültiger Tag! Monat " + monat + " hat nur " + tageImMonat + " Tage");
            return;
        }

        if (jahr < 1 || jahr > 9999) {
            Validlbl.setText("Jahr muss zwischen 0001 und 9999 liegen");
            return;
        }

        Validlbl.setText("Gültiges Datum: " + text + (schaltjahr ? " (Schaltjahr)" : ""));
    }
}