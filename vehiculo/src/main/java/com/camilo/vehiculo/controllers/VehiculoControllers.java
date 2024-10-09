package com.camilo.vehiculo.controllers;

import com.camilo.vehiculo.domain.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class VehiculoControllers {
    @PostMapping
    public Vehiculo ensamblarVehiculo(SolicitudVehiculo solicitud) {
        // Usamos la clase FabricaVehiculoSelector para seleccionar la fábrica adecuada
        VehiculoFactory factory = FabricaVehiculoSelector.seleccionarFabrica(solicitud);

        // Ensamblar el vehículo
        BuildVehiculo ensamblador = new BuildVehiculo();
        return ensamblador.ensamblarVehiculo(
                solicitud.getMarca(),
                solicitud.getColor(),
                solicitud.getNumeroEnsamblaje(),
                factory
        );
    }
    @GetMapping
    public String Saludar(){
        return "Hola mundo";
    }
}
