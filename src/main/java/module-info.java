module com.example.primeiroo_projeto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primeiroo_projeto to javafx.fxml;
    exports com.example.primeiroo_projeto;
}