package com.refsul.inventory_refsul.Repository.Implements.Business;

import com.refsul.inventory_refsul.Repository.Interfaces.CrudRepository;
import com.refsul.inventory_refsul.models.Business.UnitMeasurement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UnitMeasurementRepository implements CrudRepository<UnitMeasurement>
{
    private Connection connection;

    @Override
    public void setConnection( Connection connection )
    {
        this.connection = connection;
    }

    @Override
    public List<UnitMeasurement> findAll() throws SQLException
    {
        String sqlQuery = "SELECT * FROM units_measurements;";
        List<UnitMeasurement> measurements = new ArrayList<>();

        try ( Statement statement = this.connection.createStatement();
              ResultSet resultSet = statement.executeQuery( sqlQuery ) )
        {
            while ( resultSet.next() )
            {
                UnitMeasurement unitMeasurement = this.buildUnitMeasurement( resultSet );
                measurements.add( unitMeasurement );
            }
        }

        return measurements;
    }

    @Override
    public UnitMeasurement findById( int id ) throws SQLException
    {
        String sqlQuery = "SELECT * FROM units_measurements WHERE Id = ?;";
        UnitMeasurement unitMeasurement = null;

        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, id );
            try ( ResultSet resultSet = preparedStatement.executeQuery() )
            {
                if ( resultSet.next() )
                {
                    unitMeasurement = this.buildUnitMeasurement( resultSet );
                }
            }
        }

        return unitMeasurement;
    }

    @Override
    public boolean create( UnitMeasurement unitMeasurement )
    {
        String sqlQuery = "INSERT INTO units_measurements ( Description ) VALUES ( ? );";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setString( 1, unitMeasurement.getDescription() );
            preparedStatement.executeUpdate();
            return true;
        }
        catch ( SQLException e )
        {
            return false;
        }
    }

    @Override
    public boolean update( UnitMeasurement unitMeasurement )
    {
        String sqlQuery = "UPDATE units_measurements SET Description = ? WHERE Id = ?;";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setString( 1, unitMeasurement.getDescription() );
            preparedStatement.setInt( 2, unitMeasurement.getIdUnitMeasurement() );
            preparedStatement.executeUpdate();
            return true;
        }
        catch ( SQLException e )
        {
            return false;
        }
    }

    @Override
    public void delete( int id ) throws SQLException
    {
        String sqlQuery = "DELETE FROM units_measurements WHERE Id = ?;";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, id );
            preparedStatement.executeUpdate();
        }
    }

    public UnitMeasurement buildUnitMeasurement( ResultSet resultSet ) throws SQLException
    {
        UnitMeasurement measurement = new UnitMeasurement();
        measurement.setIdUnitMeasurement( resultSet.getInt(1) );
        measurement.setDescription( resultSet.getString( 2 ) );
        measurement.setStatus( resultSet.getBoolean( 3 ) );

        return measurement;
    }
}