package com.example.paqueteria;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Alert;


public class Vista2Controller {

    @FXML private RadioButton rbDHL, rbFedEx, rbEstafeta, rbCorreos;

    @FXML
    private void siguientePaso2() {
        Cotizacion cot = Cotizacion.getInstance();

        if (rbDHL.isSelected()) { cot.setEmpresa("DHL"); cot.setCosto(250); }
        else if (rbFedEx.isSelected()) { cot.setEmpresa("FedEx"); cot.setCosto(200); }
        else if (rbEstafeta.isSelected()) { cot.setEmpresa("Estafeta"); cot.setCosto(150); }
        else if (rbCorreos.isSelected()) { cot.setEmpresa("Correos de México"); cot.setCosto(100); }
        else { mostrarError("Debes seleccionar una empresa de envío."); return; }

        SceneManager.cambiarEscena("Vista3.fxml");
    }

    @FXML private void atrasPaso2() { SceneManager.cambiarEscena("Vista1.fxml"); }

    private void mostrarError(String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Error"); alerta.setHeaderText(null); alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
