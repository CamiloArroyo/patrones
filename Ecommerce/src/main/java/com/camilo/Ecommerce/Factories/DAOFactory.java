package com.camilo.Ecommerce.Factories;

import com.camilo.Ecommerce.Dao.MySQLProductoDAO;
import com.camilo.Ecommerce.Dao.OracleProductoDAO;
import com.camilo.Ecommerce.Dao.ProductoDAO;

public abstract class DAOFactory {
    public abstract ProductoDAO crearProductoDAO();

    public static DAOFactory obtenerFactory(String tipoBaseDeDatos) {
        switch (tipoBaseDeDatos) {
            case "MySQL":
                return new MySQLDAOFactory();
            case "Oracle":
                return new OracleDAOFactory();
            default:
                throw new IllegalArgumentException("Base de datos no soportada: " + tipoBaseDeDatos);
        }
    }
}
