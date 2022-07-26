package com.refsul.inventory_refsul.controllers;

import com.refsul.inventory_refsul.models.Product;
import com.refsul.inventory_refsul.models.Seller;
import com.refsul.inventory_refsul.services.implementService.ProductServiceImpl;
import com.refsul.inventory_refsul.services.interfaces.ProductService;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class ProductController
{
    private ProductService service;

    public ProductController()
    {
        this.service = new ProductServiceImpl();
    }

    public boolean createProduct( Product product )
    {
        try {
            this.service.create( product );
            return true;
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Product> getProducts() throws SQLException
    {
        return this.service.findAll();
    }

    public Optional<Product> getProductById(int id ) throws SQLException
    {
        return this.service.findById( id );
    }

    public boolean updateProduct( Product product )
    {
        try {
            Optional<Product> productOptional = this.service.findById( product.getIdProduct() );
            if( productOptional.isPresent() ) {
                this.service.update( product );
            }

            return productOptional.isPresent();
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteProduct( int id )
    {
        try {
            Optional<Product> productOptional = this.service.findById( id );
            if( productOptional.isPresent() ) {
                this.service.delete( id );
            }

            return productOptional.isPresent();
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateProductStock( int id, int quantity )
    {
        try {
            this.service.updateProductStock( id, quantity );
            return true;
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }
}