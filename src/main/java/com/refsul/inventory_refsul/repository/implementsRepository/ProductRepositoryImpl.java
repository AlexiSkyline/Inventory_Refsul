package com.refsul.inventory_refsul.repository.implementsRepository;

import com.refsul.inventory_refsul.models.Product;
import com.refsul.inventory_refsul.repository.interfaces.CrudRepository;
import com.refsul.inventory_refsul.repository.interfaces.ProductRepository;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class ProductRepositoryImpl implements ProductRepository
{
    private Connection connection;

    @Override
    public void setConnection( Connection connection )
    {
        this.connection = connection;
    }

    @Override
    public List<Product> findAll() throws SQLException
    {
        String sqlQuery = "SELECT * FROM products_view;";
        List<Product> products = new LinkedList<>();

        try ( Statement statement = this.connection.createStatement();
             ResultSet resultSet = statement.executeQuery( sqlQuery ) )
        {
            while( resultSet.next() )
            {
                Product product = this.buildProduct( resultSet );
                products.add( product );
            }
        }

        return products;
    }

    @Override
    public Optional<Product> findById( int id ) throws SQLException
    {
        String sqlQuery = "SELECT * FROM products_view WHERE Id = ?;";
        Product product = null;

        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, id );

            try ( ResultSet resultSet = preparedStatement.executeQuery() )
            {
                if( resultSet.next() ) {
                    product = this.buildProduct( resultSet );
                }
            }
        }

        return Optional.ofNullable( product );
    }

    @Override
    public void create( Product product ) throws SQLException
    {
        String sqlQuery = "INSERT INTO products ( Name, Description, Price, Stock, Unit_Measurement_Id, Brand_Id, Provider_Id ) " +
                "VALUES ( ?, ?, ?, ?, ?, ?, ? );";

        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            this.executePreparedStatement( preparedStatement, product );
        }
    }

    @Override
    public void update( Product product ) throws SQLException
    {
        String sqlQuery = "UPDATE products SET Name = ?, Description = ?, Price = ?, Stock = ?, Unit_Measurement_Id = ?, Brand_Id = ?, Provider_Id = ? WHERE Id = ?;";

        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            this.executePreparedStatement( preparedStatement, product );
        }
    }

    @Override
    public void delete( int id ) throws SQLException
    {
        String sqlQuery = "DELETE FROM products WHERE Id = ?;";

        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, id );
            preparedStatement.executeUpdate();
        }
    }

    @Override
    public void updateProductStock( int id, int quantity ) throws SQLException
    {
        String sqlQuery = "UPDATE products SET Stock = ? WHERE Id = ?;";

        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, quantity );
            preparedStatement.setInt( 2, id );
            preparedStatement.executeUpdate();
        }
    }

    private Product buildProduct( ResultSet resultSet ) throws SQLException
    {
        Product product = new Product();
        product.setIdProduct( resultSet.getInt( 1 ) );
        product.setName( resultSet.getString( 2 ) );
        product.setDescription( resultSet.getString( 3 ) );
        product.setPrice( resultSet.getDouble( 4 ) );
        product.setStock( resultSet.getInt( 5 ) );
        product.setStatus( resultSet.getBoolean( 6 ) );
        product.setIdUnitMeasurement( resultSet.getInt( 7 ) );
        product.setUnitMeasurementDescription( resultSet.getString( 8 ) );
        product.setIdBrand( resultSet.getInt( 9 ) );
        product.setBrandDescription( resultSet.getString( 10 ) );
        product.setIdProvider( resultSet.getInt(  11 ) );
        product.setProviderName( resultSet.getString( 12 ) );

        return product;
    }

    private void executePreparedStatement( PreparedStatement preparedStatement, Product product ) throws SQLException
    {
        preparedStatement.setString( 1, product.getName() );
        preparedStatement.setString( 2, product.getDescription() );
        preparedStatement.setDouble( 3, product.getPrice() );
        preparedStatement.setInt( 4, product.getStock() );
        preparedStatement.setInt( 5, product.getIdUnitMeasurement() );
        preparedStatement.setInt( 6, product.getIdBrand() );
        preparedStatement.setInt( 7, product.getIdProvider() );
        if( product.getIdProduct() != null && product.getIdProduct() > 0 )
        {
            preparedStatement.setInt( 8, product.getIdProduct() );
        }
        preparedStatement.executeUpdate();
    }
}