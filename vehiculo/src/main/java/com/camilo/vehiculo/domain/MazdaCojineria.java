package com.camilo.vehiculo.domain;

public class MazdaCojineria implements ICojineria {
    private String numeroPieza;
    private String materialBase;

    public MazdaCojineria(String numeroPieza, String materialBase) {
        this.numeroPieza = numeroPieza;
        this.materialBase = materialBase;
    }

    @Override
    public String getNumeroPieza() { return numeroPieza; }

    @Override
    public String getMaterialBase() { return materialBase; }
}

