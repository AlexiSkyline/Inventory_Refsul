package com.refsul.inventory_refsul.Repository;

import com.refsul.inventory_refsul.Repository.Interfaces.CrudRepository;
import com.refsul.inventory_refsul.models.Staff.Provider;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProviderRepository implements CrudRepository<Provider>
{
    private Connection connection;

    @Override
    public void setConnection( Connection connection )
    {
        this.connection = connection;
    }

    @Override
    public List<Provider> findAll() throws SQLException
    {
        String sqlQuery = "SELECT * FROM providers_view;";
        List<Provider> providers = new ArrayList<>();

        try (Statement statement = this.connection.createStatement();
             ResultSet resultSet = statement.executeQuery( sqlQuery ) )
        {
            while( resultSet.next() )
            {
                Provider provider = this.buildProvider( resultSet );
                providers.add( provider );
            }
        }

        return providers;
    }

    @Override
    public Provider findById( int id ) throws SQLException
    {
        String sqlQuery = "SELECT * FROM providers_view WHERE Id_Provider = ?;";
        Provider provider = null;

        try (PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, id );
            try ( ResultSet resultSet = preparedStatement.executeQuery() )
            {
                if( resultSet.next() )
                {
                    provider = this.buildProvider( resultSet );
                }
            }
        }

        return provider;
    }

    @Override
    public boolean create( Provider provider )
    {
        String sqlQuery = "INSERT INTO providers ( Personal_Information_Id ) VALUES ( ? );";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, provider.getIdInformation() );
            preparedStatement.executeUpdate();
            return true;
        }
        catch ( SQLException e )
        {
            return false;
        }
    }

    @Override
    public boolean update( Provider provider )
    {
        String sqlQuery = "UPDATE providers SET Personal_Information_Id = ? WHERE Id = ?;";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, provider.getIdInformation() );
            preparedStatement.setInt( 2, provider.getIdProvider() );
            preparedStatement.executeUpdate();
            return true;
        }
        catch ( SQLException e )
        {
            return false;
        }
    }

    @Override
    public boolean delete( int id )
    {
        String sqlQuery = "DELETE FROM providers WHERE Id = ?;";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, id );
            preparedStatement.executeUpdate();
            return true;
        }
        catch ( SQLException e )
        {
            return false;
        }
    }

    private Provider buildProvider( ResultSet resultSet ) throws SQLException
    {
        Provider provider = new Provider();
        provider.setIdProvider( resultSet.getInt( 1 ) );
        provider.setIdInformation( resultSet.getInt( 2 ) );
        provider.setName( resultSet.getString( 3 ) );
        provider.setLastName( resultSet.getString( 4 ) );
        provider.setRfc( resultSet.getString( 5 ) );
        provider.setAddress( resultSet.getString( 6 ) );
        provider.setEmail( resultSet.getString( 7 ) );
        provider.setPhoneNumber( resultSet.getString( 8 ) );
        provider.setStatus( resultSet.getBoolean( 9 ) );

        return provider;
    }
}