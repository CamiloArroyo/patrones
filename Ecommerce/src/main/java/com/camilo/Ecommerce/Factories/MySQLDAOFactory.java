package com.camilo.Ecommerce.Factories;

import com.camilo.Ecommerce.Dao.MySQLProductoDAO;
import com.camilo.Ecommerce.Dao.ProductoDAO;

public class MySQLDAOFactory extends DAOFactory
{
    @Override
    public ProductoDAO crearProductoDAO() {
        return new MySQLProductoDAO();
    }
}
