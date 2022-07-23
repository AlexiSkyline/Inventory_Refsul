package com.refsul.inventory_refsul.controllers;

import com.refsul.inventory_refsul.models.Sales;
import com.refsul.inventory_refsul.services.implementService.SaleServiceImpl;
import com.refsul.inventory_refsul.services.interfaces.SaleService;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class SalesController
{
    private SaleService saleService;

    public SalesController()
    {
        this.saleService = new SaleServiceImpl();
    }

    public boolean createSale( Sales sales )
    {
        try {
            this.saleService.create( sales );
            return true;
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Sales> getSales() throws SQLException
    {
        return this.saleService.findAll();
    }

    public boolean updateSale( Sales sales )
    {
        try {
            Optional<Sales> salesOptional = this.saleService.findById( sales.getIdSale() );
            if( salesOptional.isPresent() ) {
                this.saleService.update( sales );
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
            Optional<Sales> salesOptional = this.saleService.findById( id );
            if( salesOptional.isPresent() ) {
                this.saleService.delete( id );
            }

            return salesOptional.isPresent();
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public int getLastId() throws SQLException
    {
        return this.saleService.getLastId();
    }

    public String getLastFolio() throws SQLException
    {
        return this.saleService.getLastFolio();
    }
}
