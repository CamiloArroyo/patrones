package com.camilo.Ecommerce.Factories;

import com.camilo.Ecommerce.Dao.OracleProductoDAO;
import com.camilo.Ecommerce.Dao.ProductoDAO;

public class OracleDAOFactory extends DAOFactory{
    @Override
    public ProductoDAO crearProductoDAO() {
        return new OracleProductoDAO();
    }
}
