package com.refsul.inventory_refsul.services.implementService;

import com.refsul.inventory_refsul.models.UnitMeasurement;
import com.refsul.inventory_refsul.repository.interfaces.CrudRepository;
import com.refsul.inventory_refsul.services.interfaces.UnitMeasurementService;
import com.refsul.inventory_refsul.utils.DataBaseConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class UnitMeasurementServiceImpl implements UnitMeasurementService
{
    private final CrudRepository<UnitMeasurement> repository;

    public UnitMeasurementServiceImpl(CrudRepository<UnitMeasurement> repository)
    {
        this.repository = repository;
    }

    @Override
    public List<UnitMeasurement> findAll() throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            return this.repository.findAll();
        }
    }

    @Override
    public Optional<UnitMeasurement> findById( int id ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            return this.repository.findById( id );
        }
    }

    @Override
    public void create( UnitMeasurement unitMeasurement ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            if( connection.getAutoCommit() ) {
                connection.setAutoCommit( false );
            }

            try
            {
                this.repository.create( unitMeasurement );
                connection.commit();
            } catch ( SQLException e )
            {
                connection.rollback();
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update( UnitMeasurement unitMeasurement ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            if( connection.getAutoCommit() ) {
                connection.setAutoCommit( false );
            }

            try
            {
                this.repository.update( unitMeasurement );
                connection.commit();
            } catch ( SQLException e )
            {
                connection.rollback();
                e.printStackTrace();
            }
        }
    }

    @Override
    public void delete( int id ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            if( connection.getAutoCommit() ) {
                connection.setAutoCommit( false );
            }

            try
            {
                this.repository.delete( id );
                connection.commit();
            } catch ( SQLException e )
            {
                connection.rollback();
                e.printStackTrace();
            }
        }
    }
}