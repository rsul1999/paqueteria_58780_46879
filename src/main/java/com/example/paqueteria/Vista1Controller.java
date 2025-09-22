package com.example.paqueteria;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

public class Vista1Controller {

    @FXML private TextField txtLargo, txtAncho, txtAlto, txtPeso, txtCPOrigen, txtCPDestino;

    @FXML
    private void siguientePaso1() {
        try {
            double largo = Double.parseDouble(txtLargo.getText());
            double ancho = Double.parseDouble(txtAncho.getText());
            double alto = Double.parseDouble(txtAlto.getText());
            double peso = Double.parseDouble(txtPeso.getText());

            if (largo <= 0 || ancho <= 0 || alto <= 0 || peso <= 0) {
                mostrarError("Las dimensiones y el peso deben ser números positivos.");
                return;
            }

            String cpOrigen = txtCPOrigen.getText().trim();
            String cpDestino = txtCPDestino.getText().trim();
            if (!cpOrigen.matches("\\d{5}") || !cpDestino.matches("\\d{5}")) {
                mostrarError("Los códigos postales deben tener 5 dígitos.");
                return;
            }

            Cotizacion cot = Cotizacion.getInstance();
            cot.setLargo(largo); cot.setAncho(ancho); cot.setAlto(alto); cot.setPeso(peso);
            cot.setCpOrigen(cpOrigen); cot.setCpDestino(cpDestino);

            SceneManager.cambiarEscena("Vista2.fxml");
        } catch (NumberFormatException e) {
            mostrarError("Por favor ingresa números válidos para dimensiones y peso.");
        }
    }

    private void mostrarError(String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Error"); alerta.setHeaderText(null); alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
