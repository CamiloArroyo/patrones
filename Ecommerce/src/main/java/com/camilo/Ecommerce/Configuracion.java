package com.camilo.Ecommerce;

import com.camilo.Ecommerce.Dao.IProductoDAO;
import com.camilo.Ecommerce.Dao.MySQLProductoDAO;
import com.camilo.Ecommerce.Dao.OracleProductoDAO;


public class Configuracion {
    public String BaseDeDatos;

    public String getBaseDeDatos() {
        return BaseDeDatos;
    }

    public void setBaseDeDatos(String baseDeDatos) {
        BaseDeDatos = baseDeDatos;
    }

    public Configuracion(String baseDeDatos)
    {
        BaseDeDatos = baseDeDatos;
    }
}