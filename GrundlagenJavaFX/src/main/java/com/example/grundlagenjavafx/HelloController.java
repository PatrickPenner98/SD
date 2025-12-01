package com.example.grundlagenjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.application.Platform;

public class HelloController {
    @FXML
    private Label lblFarbe;

    @FXML
    private Label lblErsterText;

    @FXML
    private Label lblZweiterText;

    @FXML
    private Button btnBeenden;

    @FXML
    private Button btnTextAnzeigen;

    @FXML
    private RadioButton optBlau;

    @FXML
    private RadioButton optGruen;

    @FXML
    private RadioButton optRot;

    @FXML
    private Slider sliSlider;

    @FXML
    private Label lblSliderwert;

    @FXML
    public void initialize() {
        // Farbauswahl
        ToggleGroup farbenGruppe = new ToggleGroup();
        optBlau.setToggleGroup(farbenGruppe);
        optGruen.setToggleGroup(farbenGruppe);
        optRot.setToggleGroup(farbenGruppe);

        farbenGruppe.selectedToggleProperty().addListener((obs, alt, neu) -> {
            if (neu == optBlau) {
                lblFarbe.setStyle("-fx-background-color: blue;");
            } else if (neu == optGruen) {
                lblFarbe.setStyle("-fx-background-color: green;");
            } else if (neu == optRot) {
                lblFarbe.setStyle("-fx-background-color: red;");
            }
        });


        // Sliderwert anzeigen
        lblSliderwert.setText(String.format("%.0f", sliSlider.getValue()));

        sliSlider.valueProperty().addListener((obs, alt, neu) -> {
            lblSliderwert.setText(String.format("%.0f", neu.doubleValue()));
        });
    }

    @FXML
    private ComboBox<String> cboEintraege;

    @FXML
    private ListView<String> lstEintraege;

    @FXML
    private TextField txtEingabe;

    @FXML
    private void btnTextAnzeigenClicked(ActionEvent event) {
        String eingabeText = txtEingabe.getText();

        if (eingabeText != null && !eingabeText.trim().isEmpty()) {
            // In die ListView und ComboBox einfügen
            lstEintraege.getItems().add(eingabeText);
            cboEintraege.getItems().add(eingabeText);

            // Label anzeigen
            lblErsterText.setText(eingabeText);

            // Eingabe zurücksetzen
            txtEingabe.clear();
        }
    }


    @FXML
    private CheckBox chkErsterText;

    @FXML
    private CheckBox chkZweiterText;

    @FXML
    private void btnBeendenClicked (ActionEvent actionEvent){
        Platform.exit();
    }
}
