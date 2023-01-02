module com.example.search_engine_a {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.sql;


    opens com.example.search_engine_a to javafx.fxml;
    exports com.example.search_engine_a;
}