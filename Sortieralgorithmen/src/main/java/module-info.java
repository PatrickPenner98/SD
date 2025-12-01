module org.example.sortieralgorithmen {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.sortieralgorithmen to javafx.fxml;
    exports org.example.sortieralgorithmen;
}