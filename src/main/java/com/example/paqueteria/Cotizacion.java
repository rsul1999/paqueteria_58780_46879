package com.example.paqueteria;

public class Cotizacion {
    private static Cotizacion instance = new Cotizacion();

    // Paso 1
    private double largo, ancho, alto, peso;
    private String cpOrigen, cpDestino;

    // Paso 2
    private String empresa;
    private double costo;

    // Paso 3
    private String nombreRemitente, ciudadRemitente, calleRemitente, coloniaRemitente, telefonoRemitente;
    private String nombreDestinatario, ciudadDestinatario, calleDestinatario, coloniaDestinatario, referencia, telefonoDestinatario;

    private Cotizacion() {}

    public static Cotizacion getInstance() { return instance; }

    // Getters y Setters Paso 1
    public double getLargo() { return largo; }
    public void setLargo(double largo) { this.largo = largo; }
    public double getAncho() { return ancho; }
    public void setAncho(double ancho) { this.ancho = ancho; }
    public double getAlto() { return alto; }
    public void setAlto(double alto) { this.alto = alto; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public String getCpOrigen() { return cpOrigen; }
    public void setCpOrigen(String cpOrigen) { this.cpOrigen = cpOrigen; }
    public String getCpDestino() { return cpDestino; }
    public void setCpDestino(String cpDestino) { this.cpDestino = cpDestino; }

    // Getters y Setters Paso 2
    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }
    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }

    // Getters y Setters Paso 3
    public String getNombreRemitente() { return nombreRemitente; }
    public void setNombreRemitente(String nombreRemitente) { this.nombreRemitente = nombreRemitente; }
    public String getCiudadRemitente() { return ciudadRemitente; }
    public void setCiudadRemitente(String ciudadRemitente) { this.ciudadRemitente = ciudadRemitente; }
    public String getCalleRemitente() { return calleRemitente; }
    public void setCalleRemitente(String calleRemitente) { this.calleRemitente = calleRemitente; }
    public String getColoniaRemitente() { return coloniaRemitente; }
    public void setColoniaRemitente(String coloniaRemitente) { this.coloniaRemitente = coloniaRemitente; }
    public String getTelefonoRemitente() { return telefonoRemitente; }
    public void setTelefonoRemitente(String telefonoRemitente) { this.telefonoRemitente = telefonoRemitente; }

    public String getNombreDestinatario() { return nombreDestinatario; }
    public void setNombreDestinatario(String nombreDestinatario) { this.nombreDestinatario = nombreDestinatario; }
    public String getCiudadDestinatario() { return ciudadDestinatario; }
    public void setCiudadDestinatario(String ciudadDestinatario) { this.ciudadDestinatario = ciudadDestinatario; }
    public String getCalleDestinatario() { return calleDestinatario; }
    public void setCalleDestinatario(String calleDestinatario) { this.calleDestinatario = calleDestinatario; }
    public String getColoniaDestinatario() { return coloniaDestinatario; }
    public void setColoniaDestinatario(String coloniaDestinatario) { this.coloniaDestinatario = coloniaDestinatario; }
    public String getReferencia() { return referencia; }
    public void setReferencia(String referencia) { this.referencia = referencia; }
    public String getTelefonoDestinatario() { return telefonoDestinatario; }
    public void setTelefonoDestinatario(String telefonoDestinatario) { this.telefonoDestinatario = telefonoDestinatario; }
}
