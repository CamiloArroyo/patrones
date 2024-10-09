package com.camilo.vehiculo.domain;

public class ToyotaMotor implements IMotor{

    private int potencia;
    private String numeroPieza;
    private String tegnologia;
    public ToyotaMotor(int potencia, String numeroPieza, String tegnologia){
        this.potencia = potencia;
        this.numeroPieza = numeroPieza;
        this.tegnologia = tegnologia;
    }
    @Override
    public int getPotenciaMaxima() {
        return potencia;
    }

    @Override
    public String getNumeroPieza() {
        return numeroPieza;
    }

    @Override
    public String getTecnologia() {
        return tegnologia;
    }
}
