module com.example.computergraphics {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.computergraphics to javafx.fxml;
    exports com.example.computergraphics;
}