package com.camilo.Ecommerce.Dao;

import com.camilo.Ecommerce.models.Producto;

import java.util.List;

public interface IProductoDAO {
    void crearProducto(Producto producto);
    Producto obtenerProducto(int id);
    List<Producto> obtenerTodosLosProductos();
    void actualizarProducto(Producto producto);
    void eliminarProducto(int id);
}