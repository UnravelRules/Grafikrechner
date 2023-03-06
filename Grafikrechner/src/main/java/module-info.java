module com.example.grafikrechner {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.grafikrechner to javafx.fxml;
    exports com.example.grafikrechner;
}