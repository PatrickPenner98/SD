module pizzavergleicherfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.pizzavergleicherfx to javafx.fxml, javafx.graphics;
    // falls du weitere Packages mit FXML hast:
    // opens com.example.datumvalid to javafx.fxml;
}