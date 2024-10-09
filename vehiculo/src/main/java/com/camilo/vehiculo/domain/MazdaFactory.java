package com.camilo.vehiculo.domain;

public class MazdaFactory implements VehiculoFactory {
    private SolicitudVehiculo solicitud;

    public MazdaFactory(SolicitudVehiculo solicitud) {
        this.solicitud = solicitud;
    }

    @Override
    public IChasis crearChasis() {
        return new MazdaChasis(solicitud.getNumeroEjes(), solicitud.getNumeroPiezaChasis(), solicitud.getTipoTransmision());
    }

    @Override
    public IMotor crearMotor() {
        return new MazdaMotor(solicitud.getPotenciaMaxima(), solicitud.getNumeroPiezaMotor(), solicitud.getTecnologia());
    }

    @Override
    public ICojineria crearCojineria() {
        return new MazdaCojineria(solicitud.getNumeroPiezaCojineria(), solicitud.getMaterialBase());
    }
}
