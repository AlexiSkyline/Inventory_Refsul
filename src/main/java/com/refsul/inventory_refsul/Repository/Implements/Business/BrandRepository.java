package com.refsul.inventory_refsul.Repository.Implements.Business;

import com.refsul.inventory_refsul.Repository.Interfaces.CrudRepository;
import com.refsul.inventory_refsul.models.Business.Brand;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class BrandRepository implements CrudRepository<Brand>
{
    private Connection connection;

    @Override
    public void setConnection( Connection connection )
    {
        this.connection = connection;
    }

    @Override
    public List<Brand> findAll() throws SQLException
    {
       String sqlQuery = "SELECT * FROM brands;";
       List<Brand> brands = new LinkedList<>();

       try ( Statement statement = this.connection.createStatement();
             ResultSet resultSet = statement.executeQuery( sqlQuery ) )
       {
           while( resultSet.next() ) {
               Brand brand = this.buildBrand( resultSet );
               brands.add( brand );
           }
       }

       return brands;
    }

    @Override
    public Brand findById( int id ) throws SQLException
    {
        String sqlQuery = "SELECT * FROM brands WHERE Id = ?;";
        Brand brand = null;

        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, id );
            try( ResultSet resultSet = preparedStatement.executeQuery() )
            {
                if( resultSet.next() )
                {
                    brand = this.buildBrand( resultSet );
                }
            }
        }

        return brand;
    }

    @Override
    public boolean create( Brand brand )
    {
        String sqlQuery = "INSERT INTO brands ( Description ) VALUES (?);";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery )  )
        {
            preparedStatement.setString( 1, brand.getDescription() );
            preparedStatement.executeUpdate();
            return true;
        }
        catch ( SQLException e )
        {
            return false;
        }
    }

    @Override
    public boolean update( Brand brand )
    {
        String sqlQuery = "UPDATE brands SET Description = ? WHERE Id = ?";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setString( 1, brand.getDescription() );
            preparedStatement.setInt( 2, brand.getIdBrand() );
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
        String sqlQuery = "DELETE FROM brands WHERE Id = ?";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, id );
            preparedStatement.executeUpdate();
        }
    }

    private Brand buildBrand( ResultSet resultSet ) throws SQLException
    {
        Brand brand = new Brand();
        brand.setIdBrand( resultSet.getInt( 1 ) );
        brand.setDescription( resultSet.getString( 2 ) );
        brand.setStatus( resultSet.getBoolean( 3 ) );

        return brand;
    }
}