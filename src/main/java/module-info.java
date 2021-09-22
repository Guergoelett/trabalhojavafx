module com.example.trabalho_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.trabalho_javafx to javafx.fxml;
    exports com.example.trabalho_javafx;
}