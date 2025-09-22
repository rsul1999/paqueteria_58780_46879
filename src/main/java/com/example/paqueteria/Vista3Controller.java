package com.example.paqueteria;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

public class Vista3Controller {

    @FXML private TextField nombreRemitenteField, ciudadRemitenteField, calleRemitenteField, coloniaRemitenteField, telefonoRemitenteField;
    @FXML private TextField nombreDestinatarioField, ciudadDestinatarioField, calleDestinatarioField, coloniaDestinatarioField, referenciaField, telefonoDestinatarioField;

    @FXML
    private void siguientePaso3() {
        Cotizacion cot = Cotizacion.getInstance();

        if (nombreRemitenteField.getText().isEmpty() || ciudadRemitenteField.getText().isEmpty() ||
                calleRemitenteField.getText().isEmpty() || coloniaRemitenteField.getText().isEmpty() ||
                telefonoRemitenteField.getText().isEmpty() ||
                nombreDestinatarioField.getText().isEmpty() || ciudadDestinatarioField.getText().isEmpty() ||
                calleDestinatarioField.getText().isEmpty() || coloniaDestinatarioField.getText().isEmpty() ||
                referenciaField.getText().isEmpty() || telefonoDestinatarioField.getText().isEmpty()) {
            mostrarError("Todos los campos de remitente y destinatario deben estar completos."); return;
        }

        if (!telefonoRemitenteField.getText().matches("\\d{10}") || !telefonoDestinatarioField.getText().matches("\\d{10}")) {
            mostrarError("Los teléfonos deben tener 10 dígitos."); return;
        }

        if (telefonoRemitenteField.getText().equals(telefonoDestinatarioField.getText())) {
            mostrarError("El teléfono del remitente y destinatario no pueden ser el mismo.");
            return;
        }

        // Guardar datos
        cot.setNombreRemitente(nombreRemitenteField.getText().trim());
        cot.setCiudadRemitente(ciudadRemitenteField.getText().trim());
        cot.setCalleRemitente(calleRemitenteField.getText().trim());
        cot.setColoniaRemitente(coloniaRemitenteField.getText().trim());
        cot.setTelefonoRemitente(telefonoRemitenteField.getText().trim());

        cot.setNombreDestinatario(nombreDestinatarioField.getText().trim());
        cot.setCiudadDestinatario(ciudadDestinatarioField.getText().trim());
        cot.setCalleDestinatario(calleDestinatarioField.getText().trim());
        cot.setColoniaDestinatario(coloniaDestinatarioField.getText().trim());
        cot.setReferencia(referenciaField.getText().trim());
        cot.setTelefonoDestinatario(telefonoDestinatarioField.getText().trim());

        SceneManager.cambiarEscena("Vista4.fxml");
    }

    @FXML private void atrasPaso3() { SceneManager.cambiarEscena("Vista2.fxml"); }

    private void mostrarError(String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Error"); alerta.setHeaderText(null); alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
