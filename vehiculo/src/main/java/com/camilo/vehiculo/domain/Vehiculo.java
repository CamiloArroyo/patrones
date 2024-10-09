package com.camilo.vehiculo.domain;

import java.util.Date;

public class Vehiculo {
    private String marca;
    private String color;
    private String numeroEnsamblaje;
    private Date fechaEnsamblaje;
    private IChasis chasis;
    private IMotor motor;
    private ICojineria cojineria;
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

    public Date getFechaEnsamblaje() {
        return fechaEnsamblaje;
    }

    public void setFechaEnsamblaje(Date fechaEnsamblaje) {
        this.fechaEnsamblaje = fechaEnsamblaje;
    }

    public IChasis getChasis() {
        return chasis;
    }

    public void setChasis(IChasis chasis) {
        this.chasis = chasis;
    }

    public IMotor getMotor() {
        return motor;
    }

    public void setMotor(IMotor motor) {
        this.motor = motor;
    }

    public ICojineria getCojineria() {
        return cojineria;
    }

    public void setCojineria(ICojineria cojineria) {
        this.cojineria = cojineria;
    }



    public Vehiculo(String marca, String color, String numeroEnsamblaje, Date fechaEnsamblaje,
                    IChasis chasis, IMotor motor, ICojineria cojineria) {
        this.marca = marca;
        this.color = color;
        this.numeroEnsamblaje = numeroEnsamblaje;
        this.fechaEnsamblaje = fechaEnsamblaje;
        this.chasis = chasis;
        this.motor = motor;
        this.cojineria = cojineria;
    }
}
