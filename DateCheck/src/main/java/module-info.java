module com.example.datecheck {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.datecheck to javafx.fxml;
    exports com.example.datecheck;
}