package com.refsul.inventory_refsul.controllers;

import com.refsul.inventory_refsul.models.Sales;
import com.refsul.inventory_refsul.services.implementService.SaleServiceImpl;
import com.refsul.inventory_refsul.services.interfaces.SaleService;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class SalesController
{
    private final SaleService service;

    @Inject
    public SalesController( SaleService service )
    {
        this.service = service;
    }

    public boolean createSale( Sales sales )
    {
        try {
            this.service.create( sales );
            return true;
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Sales> getSales() throws SQLException
    {
        return this.service.findAll();
    }

    public boolean updateSale( Sales sales )
    {
        try {
            Optional<Sales> salesOptional = this.service.findById( sales.getIdSale() );
            if( salesOptional.isPresent() ) {
                this.service.update( sales );
            }

            return salesOptional.isPresent();
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteSale( int id )
    {
        try {
            Optional<Sales> salesOptional = this.service.findById( id );
            if( salesOptional.isPresent() ) {
                this.service.delete( id );
            }

            return salesOptional.isPresent();
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public int getLastId() throws SQLException
    {
        return this.service.getLastId();
    }

    public String getLastFolio() throws SQLException
    {
        return this.service.getLastFolio();
    }
}
