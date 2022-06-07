module com.example.javastudy2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javastudy2 to javafx.fxml;
    exports com.example.javastudy2;
}