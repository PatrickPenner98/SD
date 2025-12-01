module com.example.pokememory {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pokememory to javafx.fxml;
    exports com.example.pokememory;
}