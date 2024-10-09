package com.camilo.Ecommerce.Dao;
import com.camilo.Ecommerce.models.Producto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OracleProductoDAO extends ProductoDAO {
    private Map<Integer, Producto> productos;

    public OracleProductoDAO() {
        productos = new HashMap<>();
        productos.put(1, new Producto(1, "Producto Oracle 1", 15.0));
        productos.put(2, new Producto(2, "Producto Oracle 2", 25.0));
    }

    @Override
    public void crearProducto(Producto producto) {
        productos.put(producto.getId(), producto);
    }

    @Override
    public Producto obtenerProducto(int id) {
        return productos.get(id);
    }

    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return productos.values().stream().collect(Collectors.toList());
    }

    @Override
    public void actualizarProducto(Producto producto) {
        productos.put(producto.getId(), producto);
    }

    @Override
    public void eliminarProducto(int id) {
        productos.remove(id);
    }
}