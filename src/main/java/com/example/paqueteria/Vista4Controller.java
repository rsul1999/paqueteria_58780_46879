package com.example.paqueteria;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Vista4Controller {

    @FXML private Label servicioLabel, remitenteLabel, destinatarioLabel, direccionLabel, telefonoDestinatarioLabel;

    @FXML
    private void initialize() {
        Cotizacion cot = Cotizacion.getInstance();
        servicioLabel.setText("Servicio seleccionado: " + cot.getEmpresa() + " ($" + cot.getCosto() + ")");
        remitenteLabel.setText("Remitente: " + cot.getNombreRemitente() + ", " + cot.getCiudadRemitente());
        destinatarioLabel.setText("Destinatario: " + cot.getNombreDestinatario() + ", " + cot.getCiudadDestinatario());
        direccionLabel.setText("Dirección del destinatario: " + cot.getCalleDestinatario() + ", " + cot.getColoniaDestinatario() + ", Ref: " + cot.getReferencia());
        telefonoDestinatarioLabel.setText("Telefono del destinatario: "+ cot.getTelefonoDestinatario());
    }

    @FXML
    private void nuevaCotizacion() {
        Cotizacion cot = Cotizacion.getInstance();
        // borrar datos
        cot.setLargo(0); cot.setAncho(0); cot.setAlto(0); cot.setPeso(0);
        cot.setCpOrigen(""); cot.setCpDestino("");
        cot.setEmpresa(""); cot.setCosto(0);
        cot.setNombreRemitente(""); cot.setCiudadRemitente(""); cot.setCalleRemitente(""); cot.setColoniaRemitente(""); cot.setTelefonoRemitente("");
        cot.setNombreDestinatario(""); cot.setCiudadDestinatario(""); cot.setCalleDestinatario(""); cot.setColoniaDestinatario(""); cot.setReferencia(""); cot.setTelefonoDestinatario("");

        SceneManager.cambiarEscena("Vista1.fxml");
    }

    @FXML private void atrasPaso4() { SceneManager.cambiarEscena("Vista3.fxml"); }
}
