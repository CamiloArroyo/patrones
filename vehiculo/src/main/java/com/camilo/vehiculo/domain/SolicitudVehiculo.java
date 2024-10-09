package com.camilo.vehiculo.domain;

public class SolicitudVehiculo {
    private String marca;
    private String color;
    private String numeroEnsamblaje;

    // Datos del chasis
    private int numeroEjes;
    private String numeroPiezaChasis;
    private String tipoTransmision;

    // Datos del motor
    private int potenciaMaxima;
    private String numeroPiezaMotor;
    private String tecnologia;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumeroEnsamblaje() {
        return numeroEnsamblaje;
    }

    public void setNumeroEnsamblaje(String numeroEnsamblaje) {
        this.numeroEnsamblaje = numeroEnsamblaje;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public String getNumeroPiezaChasis() {
        return numeroPiezaChasis;
    }

    public void setNumeroPiezaChasis(String numeroPiezaChasis) {
        this.numeroPiezaChasis = numeroPiezaChasis;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public String getNumeroPiezaMotor() {
        return numeroPiezaMotor;
    }

    public void setNumeroPiezaMotor(String numeroPiezaMotor) {
        this.numeroPiezaMotor = numeroPiezaMotor;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getNumeroPiezaCojineria() {
        return numeroPiezaCojineria;
    }

    public void setNumeroPiezaCojineria(String numeroPiezaCojineria) {
        this.numeroPiezaCojineria = numeroPiezaCojineria;
    }

    public String getMaterialBase() {
        return materialBase;
    }

    public void setMaterialBase(String materialBase) {
        this.materialBase = materialBase;
    }

    // Datos de la cojinería
    private String numeroPiezaCojineria;
    private String materialBase;

}
