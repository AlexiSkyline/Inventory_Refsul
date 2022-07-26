package com.refsul.inventory_refsul.repository.interfaces;

import com.refsul.inventory_refsul.models.Product;
import com.refsul.inventory_refsul.repository.interfaces.CrudRepository;

import java.sql.SQLException;

public interface ProductRepository extends CrudRepository<Product>
{
    void updateProductStock( int id, int quantity ) throws SQLException;
}
