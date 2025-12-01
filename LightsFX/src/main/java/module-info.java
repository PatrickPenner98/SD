module com.example.lightsfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lightsfx to javafx.fxml;
    exports com.example.lightsfx;
}