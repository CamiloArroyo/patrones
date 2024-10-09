package com.camilo.Ecommerce.Dao;
import com.camilo.Ecommerce.models.Producto;
import java.util.ArrayList;
import java.util.List;

public class MySQLProductoDAO extends ProductoDAO {
    private List<Producto> productos;

    public MySQLProductoDAO() {
        productos = new ArrayList<>();
        productos.add(new Producto(1, "Producto MySQL 1", 10.0));
        productos.add(new Producto(2, "Producto MySQL 2", 20.0));
    }

    @Override
    public void crearProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public Producto obtenerProducto(int id) {
        return productos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return productos;
    }

    @Override
    public void actualizarProducto(Producto producto) {
        Producto prod = obtenerProducto(producto.getId());
        if (prod != null) {
            prod.setDescripcion(producto.getDescripcion());
            prod.setPrecio(producto.getPrecio());
        }
    }

    @Override
    public void eliminarProducto(int id) {
        productos.removeIf(p -> p.getId() == id);
    }
}