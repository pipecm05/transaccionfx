module co.uniquindio.transaccion {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.uniquindio.transaccion to javafx.fxml;
    exports co.uniquindio.transaccion;
}
