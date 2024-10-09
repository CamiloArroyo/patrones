package com.camilo.vehiculo.domain;

public class FordFactory implements VehiculoFactory {
    private SolicitudVehiculo solicitud;

    public FordFactory(SolicitudVehiculo solicitud) {
        this.solicitud = solicitud;
    }

    @Override
    public IChasis crearChasis() {
        return new FordChasis(solicitud.getNumeroEjes(), solicitud.getNumeroPiezaChasis(), solicitud.getTipoTransmision());
    }

    @Override
    public IMotor crearMotor() {
        return new FordMotor(solicitud.getPotenciaMaxima(), solicitud.getNumeroPiezaMotor(), solicitud.getTecnologia());
    }

    @Override
    public ICojineria crearCojineria() {
        return new FordCojineria(solicitud.getNumeroPiezaCojineria(), solicitud.getMaterialBase());
    }
}
