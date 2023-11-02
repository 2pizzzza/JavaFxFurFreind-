module com.example.simple {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simple to javafx.fxml;
    exports com.example.simple;
}