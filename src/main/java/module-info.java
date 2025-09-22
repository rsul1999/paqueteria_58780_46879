module com.example.paqueteria {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.paqueteria to javafx.fxml;
    exports com.example.paqueteria;
}