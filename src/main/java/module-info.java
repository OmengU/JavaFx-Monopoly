module com.example.monopoly {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.monopoly to javafx.fxml;
    exports com.example.monopoly;
}