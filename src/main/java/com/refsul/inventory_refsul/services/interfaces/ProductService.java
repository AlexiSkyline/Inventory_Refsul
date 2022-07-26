package com.refsul.inventory_refsul.services.interfaces;

import com.refsul.inventory_refsul.models.Product;

import java.sql.SQLException;

public interface ProductService extends ServiceCrud<Product>
{
    void updateProductStock( int id, int quantity ) throws SQLException;
}