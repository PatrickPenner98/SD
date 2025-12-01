package com.example.grundlagenjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class UebungEinstiegControl {

    @FXML
    private TextField txtEingabe;

    @FXML
    private Label lblAnzeige;

    @FXML
    private ListView<String> lstEintraege;

    @FXML
    private ComboBox<String> cboEintraege;

    @FXML
    private TextField txtAnzahlList;

    @FXML
    private TextField txtAnzahlCombo;

    @FXML
    private Label lblTest;

    @FXML
    private void btnUebernehmenClicked() {
        String eingabe = txtEingabe.getText();
        lblAnzeige.setText(eingabe);
    }

    @FXML
    private void btnListeFuellenClicked() {
        lstEintraege.getItems().clear();
        try {
            int anzahl = Integer.parseInt(txtAnzahlList.getText());
            for (int i = 1; i <= anzahl; i++) {
                lstEintraege.getItems().add("Eintrag " + i);
            }
        } catch (NumberFormatException e) {
            lblAnzeige.setText("Ungültige Zahl bei Liste!");
        }
    }


    @FXML
    private void btnListeLeerenClicked() {
        lstEintraege.getItems().clear();
    }

    @FXML
    private void btnAktuellerListEintragClicked() {
        String selected = lstEintraege.getSelectionModel().getSelectedItem();
        if (selected != null) {
            lblTest.setText(selected);
        } else {
            lblTest.setText("Kein Eintrag ausgewählt.");
        }
    }


    @FXML
    private void btnAlleListEintraegeClicked() {
        for (String s : lstEintraege.getItems()) {
            System.out.println(s);
        }
    }

    @FXML
    private void btnComboFuellenClicked() {
        cboEintraege.getItems().clear();
        try {
            int anzahl = Integer.parseInt(txtAnzahlCombo.getText());
            for (int i = 1; i <= anzahl; i++) {
                cboEintraege.getItems().add("bild" + i);
            }
        } catch (NumberFormatException e) {
            lblAnzeige.setText("Ungültige Zahl bei Combo!");
        }
    }


    @FXML
    private void btnComboLeerenClicked() {
        cboEintraege.getItems().clear();
    }

    @FXML
    private ImageView imgView;


    @FXML
    private void btnComboWertClicked() {
        String selected = cboEintraege.getValue(); // z.B. "bild1"
        lblAnzeige.setText(selected);

        if (selected != null && !selected.isEmpty()) {
            try {
                String imagePath = "/com/example/grundlagenjavafx/bilder/" + selected + ".png";
                Image image = new Image(getClass().getResourceAsStream(imagePath));
                imgView.setImage(image);
            } catch (Exception e) {
                lblAnzeige.setText("Bild konnte nicht geladen werden.");
                e.printStackTrace();
            }
        }
    }

}
