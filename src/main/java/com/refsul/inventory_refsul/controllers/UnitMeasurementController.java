package com.refsul.inventory_refsul.controllers;

import com.refsul.inventory_refsul.models.UnitMeasurement;
import com.refsul.inventory_refsul.services.implementService.UnitMeasurementServiceImpl;
import com.refsul.inventory_refsul.services.interfaces.UnitMeasurementService;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class UnitMeasurementController
{
    private UnitMeasurementService service;

    public UnitMeasurementController()
    {
        this.service = new UnitMeasurementServiceImpl();
    }

    public boolean createUnitMeasurement( UnitMeasurement unitMeasurement )
    {
        try {
            this.service.create( unitMeasurement );
            return true;
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public List<UnitMeasurement> getUnitMeasurements() throws SQLException
    {
        return this.service.findAll();
    }

    public boolean updateUnitMeasurement( UnitMeasurement unitMeasurement )
    {
        try {
            Optional<UnitMeasurement> unitMeasurementOptional = this.service.findById( unitMeasurement.getIdUnitMeasurement() );
            if( unitMeasurementOptional.isPresent() ) {
                this.service.update( unitMeasurement );
            }

            return unitMeasurementOptional.isPresent();
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteUnitMeasurement( int id )
    {
        try {
            Optional<UnitMeasurement> unitMeasurementOptional = this.service.findById( id );
            if( unitMeasurementOptional.isPresent() ) {
                this.service.delete( id );
            }

            return unitMeasurementOptional.isPresent();
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }
}