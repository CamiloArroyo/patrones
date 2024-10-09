package com.camilo.vehiculo.domain;

public interface VehiculoFactory {
    IChasis crearChasis();
    IMotor crearMotor();
    ICojineria crearCojineria();
}
