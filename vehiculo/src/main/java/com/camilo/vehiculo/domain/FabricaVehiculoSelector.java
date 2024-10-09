package com.camilo.vehiculo.domain;

public class FabricaVehiculoSelector {

    public static VehiculoFactory seleccionarFabrica(SolicitudVehiculo solicitud) {
        switch (solicitud.getMarca()) {
            case "Toyota":
                return new ToyotaFactory(solicitud);
            case "Ford":
                return new FordFactory(solicitud);
            case "Mazda":
                return new MazdaFactory(solicitud);
            default:
                throw new IllegalArgumentException("Marca no soportada: " + solicitud.getMarca());
        }
    }
}