package com.refsul.inventory_refsul.repository.implementsRepository;

import com.refsul.inventory_refsul.models.PersonalInformation;
import com.refsul.inventory_refsul.repository.interfaces.CrudRepository;
import com.refsul.inventory_refsul.models.Provider;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProviderRepositoryImpl implements CrudRepository<Provider>
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
    public Optional<Provider> findById(int id ) throws SQLException
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

        return Optional.ofNullable( provider );
    }

    @Override
    public void create( Provider provider ) throws SQLException
    {
        String sqlQuery = "INSERT INTO providers ( Personal_Information_Id ) VALUES ( ? );";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, provider.getPersonalInformation().getIdInformation() );
            preparedStatement.executeUpdate();
        }
    }

    @Override
    public void update( Provider provider ) throws SQLException
    {
        String sqlQuery = "UPDATE providers SET Personal_Information_Id = ? WHERE Id = ?;";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, provider.getPersonalInformation().getIdInformation() );
            preparedStatement.setInt( 2, provider.getIdProvider() );
            preparedStatement.executeUpdate();
        }
    }

    @Override
    public void delete( int id ) throws SQLException
    {
        String sqlQuery = "DELETE FROM providers WHERE Id = ?;";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, id );
            preparedStatement.executeUpdate();
        }
    }

    private Provider buildProvider( ResultSet resultSet ) throws SQLException
    {
        Provider provider = new Provider();
        provider.setIdProvider( resultSet.getInt( 1 ) );

        PersonalInformation personalInformation = new PersonalInformation();
        personalInformation.setIdInformation( resultSet.getInt( 2 ) );
        personalInformation.setName( resultSet.getString( 3 ) );
        personalInformation.setLastName( resultSet.getString( 4 ) );
        personalInformation.setRfc( resultSet.getString( 5 ) );
        personalInformation.setAddress( resultSet.getString( 6 ) );
        personalInformation.setEmail( resultSet.getString( 7 ) );
        personalInformation.setPhoneNumber( resultSet.getString( 8 ) );
        personalInformation.setStatus( resultSet.getBoolean( 9 ) );

        provider.setPersonalInformation( personalInformation );

        return provider;
    }
}