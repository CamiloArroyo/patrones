package com.camilo.vehiculo.domain;

public class FordMotor implements IMotor {
    private int potenciaMaxima;
    private String numeroPieza;
    private String tecnologia;

    public FordMotor(int potenciaMaxima, String numeroPieza, String tecnologia) {
        this.potenciaMaxima = potenciaMaxima;
        this.numeroPieza = numeroPieza;
        this.tecnologia = tecnologia;
    }

    @Override
    public int getPotenciaMaxima() { return potenciaMaxima; }

    @Override
    public String getNumeroPieza() { return numeroPieza; }

    @Override
    public String getTecnologia() { return tecnologia; }
}

