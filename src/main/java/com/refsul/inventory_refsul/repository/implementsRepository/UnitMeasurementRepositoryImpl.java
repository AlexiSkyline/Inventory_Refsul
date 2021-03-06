package com.refsul.inventory_refsul.repository.implementsRepository;

import com.refsul.inventory_refsul.repository.interfaces.CrudRepository;
import com.refsul.inventory_refsul.models.UnitMeasurement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UnitMeasurementRepositoryImpl implements CrudRepository<UnitMeasurement>
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
    public Optional<UnitMeasurement> findById(int id ) throws SQLException
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

        return Optional.ofNullable( unitMeasurement );
    }

    @Override
    public void create( UnitMeasurement unitMeasurement ) throws SQLException
    {
        String sqlQuery = "INSERT INTO units_measurements ( Description ) VALUES ( ? );";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setString( 1, unitMeasurement.getDescription() );
            preparedStatement.executeUpdate();
        }
    }

    @Override
    public void update( UnitMeasurement unitMeasurement ) throws SQLException
    {
        String sqlQuery = "UPDATE units_measurements SET Description = ? WHERE Id = ?;";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setString( 1, unitMeasurement.getDescription() );
            preparedStatement.setInt( 2, unitMeasurement.getIdUnitMeasurement() );
            preparedStatement.executeUpdate();
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