module com.example.javaanatomiaclasse {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaanatomiaclasse to javafx.fxml;
    exports com.example.javaanatomiaclasse;
}