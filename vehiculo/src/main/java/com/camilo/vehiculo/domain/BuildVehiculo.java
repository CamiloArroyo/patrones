package com.camilo.vehiculo.domain;

import java.util.Date;

public class BuildVehiculo {
    public Vehiculo ensamblarVehiculo(String marca, String color, String numeroEnsamblaje, VehiculoFactory factory) {
        IChasis chasis = factory.crearChasis();
        IMotor motor = factory.crearMotor();
        ICojineria cojineria = factory.crearCojineria();
        return new Vehiculo(marca, color, numeroEnsamblaje, new Date(), chasis, motor, cojineria);
    }
}
