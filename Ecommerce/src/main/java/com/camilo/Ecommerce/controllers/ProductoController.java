package com.camilo.Ecommerce.controllers;
import com.camilo.Ecommerce.Configuracion;
import com.camilo.Ecommerce.Dao.ProductoDAO;
import com.camilo.Ecommerce.Factories.DAOFactory;
import com.camilo.Ecommerce.models.Producto;
import lombok.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoDAO productoDAO;

    public ProductoController() {
        Configuracion configuracion = new Configuracion("Oracle");
        DAOFactory daoFactory = DAOFactory.obtenerFactory(configuracion.BaseDeDatos);
        this.productoDAO = daoFactory.crearProductoDAO();
    }

    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable int id) {
        return productoDAO.obtenerProducto(id);
    }

    @GetMapping
    public List<Producto> obtenerTodosLosProductos() {
        return productoDAO.obtenerTodosLosProductos();
    }

    @PostMapping
    public void crearProducto(@RequestBody Producto producto) {
        productoDAO.crearProducto(producto);
    }

    @PutMapping("/{id}")
    public void actualizarProducto(@PathVariable int id, @RequestBody Producto producto) {
        producto.setId(id);
        productoDAO.actualizarProducto(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable int id) {
        productoDAO.eliminarProducto(id);
    }
}