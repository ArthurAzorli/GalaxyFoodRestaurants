module com.examplebr.ind.galaxyfood.restaurants {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.examplebr.ind.galaxyfood.restaurants to javafx.fxml;
    exports com.examplebr.ind.galaxyfood.restaurants;
}