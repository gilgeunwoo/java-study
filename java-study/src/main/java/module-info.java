module com.example.javastudy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javastudy to javafx.fxml;
    exports com.example.javastudy;
}