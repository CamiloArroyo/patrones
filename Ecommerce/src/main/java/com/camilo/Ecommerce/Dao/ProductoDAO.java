package com.camilo.Ecommerce.Dao;

import com.camilo.Ecommerce.models.Producto;

import java.util.List;

public abstract class ProductoDAO implements IProductoDAO{
    public abstract void crearProducto(Producto producto);
    public abstract Producto obtenerProducto(int id);
    public abstract List<Producto> obtenerTodosLosProductos();
    public abstract void actualizarProducto(Producto producto);
    public abstract void eliminarProducto(int id);

}