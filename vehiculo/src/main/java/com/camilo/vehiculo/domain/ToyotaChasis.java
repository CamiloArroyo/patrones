package com.camilo.vehiculo.domain;

public class ToyotaChasis implements IChasis{
    private int numeroEjes;
    private String numeroPieza;
    private String tipoTransmision;

    public ToyotaChasis(int numeroEjes, String numeroPieza, String tipoTransmision) {
        this.numeroEjes = numeroEjes;
        this.numeroPieza = numeroPieza;
        this.tipoTransmision = tipoTransmision;
    }

    @Override
    public int getNumeroEjes() { return numeroEjes; }

    @Override
    public String getNumeroPieza() { return numeroPieza; }

    @Override
    public String getTipoTransmision() { return tipoTransmision; }
}
