package com.camilo.vehiculo.domain;

public class ToyotaCojineria implements ICojineria{
    private String numeroPieza;
    private String materialBase;

    public ToyotaCojineria(String numeroPieza,String materialBase){
        this.numeroPieza = numeroPieza;
        this.materialBase = materialBase;
    }
    @Override
    public String getNumeroPieza() {
        return  numeroPieza;
    }

    @Override
    public String getMaterialBase() {
        return materialBase;
    }
}
