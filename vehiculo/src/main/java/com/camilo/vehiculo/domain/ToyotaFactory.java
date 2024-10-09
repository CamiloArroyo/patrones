package com.camilo.vehiculo.domain;

public class ToyotaFactory implements VehiculoFactory{
    private SolicitudVehiculo solicitud;

    public ToyotaFactory(SolicitudVehiculo solicitud) {
        this.solicitud = solicitud;
    }

    @Override
    public IChasis crearChasis() {
        return new ToyotaChasis(solicitud.getNumeroEjes(), solicitud.getNumeroPiezaChasis(), solicitud.getTipoTransmision());
    }

    @Override
    public IMotor crearMotor() {
        return new ToyotaMotor(solicitud.getPotenciaMaxima(), solicitud.getNumeroPiezaMotor(), solicitud.getTecnologia());
    }

    @Override
    public ICojineria crearCojineria() {
        return new ToyotaCojineria(solicitud.getNumeroPiezaCojineria(), solicitud.getMaterialBase());
    }
}
