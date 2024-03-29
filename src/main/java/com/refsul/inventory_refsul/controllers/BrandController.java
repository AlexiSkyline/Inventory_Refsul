package com.refsul.inventory_refsul.controllers;

import com.refsul.inventory_refsul.models.Brand;
import com.refsul.inventory_refsul.services.interfaces.BrandService;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class BrandController
{
    private final BrandService service;

    @Inject
    public BrandController( BrandService service )
    {
        this.service = service;
    }

    public boolean createBrand( Brand brand )
    {
        try {
            this.service.create( brand );
            return true;
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Brand> getBrands() throws SQLException
    {
        return this.service.findAll();
    }

    public boolean updateBrand( Brand brand )
    {
        try {
            Optional<Brand> brandOptional = this.service.findById( brand.getIdBrand() );
            if( brandOptional.isPresent() ) {
                this.service.update( brand );
            }

            return brandOptional.isPresent();
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteBrand( int id )
    {
        try {
            Optional<Brand> brandOptional = this.service.findById( id );
            if( brandOptional.isPresent() ) {
                this.service.delete( id );
            }

            return brandOptional.isPresent();
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }
}