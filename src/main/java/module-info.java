module com.examplebr.ind.galaxyfood.restaurants {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens br.ind.galaxyfood.restaurants to javafx.fxml;
    exports br.ind.galaxyfood.restaurants;
}