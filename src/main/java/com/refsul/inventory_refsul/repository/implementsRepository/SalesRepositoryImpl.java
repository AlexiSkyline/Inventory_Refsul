package com.refsul.inventory_refsul.repository.implementsRepository;

import com.refsul.inventory_refsul.models.Sales;
import com.refsul.inventory_refsul.repository.interfaces.SalesRepository;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class SalesRepositoryImpl implements SalesRepository
{
    private Connection connection;

    @Override
    public void setConnection( Connection connection )
    {
        this.connection = connection;
    }

    @Override
    public List<Sales> findAll() throws SQLException
    {
        String sqlQuery = "SELECT * FROM sales;";
        List<Sales> salesList = new LinkedList<>();

        try ( Statement statement = this.connection.createStatement();
              ResultSet resultSet = statement.executeQuery( sqlQuery ) )
        {
            while ( resultSet.next() ) {
                Sales sales = this.buildSales( resultSet );
                salesList.add( sales );
            }
        }

        return salesList;
    }

    @Override
    public Optional<Sales> findById( int id ) throws SQLException
    {
        String sqlQuery = "SELECT * FROM sales WHERE Id = ?;";
        Sales salesDB = new Sales();

        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, id );

            try ( ResultSet resultSet = preparedStatement.executeQuery() )
            {
                if( resultSet.next() ) {
                    salesDB = this.buildSales( resultSet );
                }
            }
        }

        return Optional.ofNullable( salesDB );
    }

    @Override
    public void create( Sales sales ) throws SQLException
    {
        String sqlQuery = "INSERT INTO sales ( Date, Folio, Total, Seller_Id, Custumer_Id, Payment_Method_Id ) VALUES ( ?, ?, ?, ?, ?, ? );";

        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            this.executePreparedStatement( preparedStatement, sales );
        }
    }

    @Override
    public void update( Sales sales ) throws SQLException
    {
        String sqlQuery = "UPDATE sales SET Folio = ?, Total = ?, Seller_Id = ?, Custumer_Id = ?, Payment_Method_Id = ? WHERE Id = ?;";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            this.executePreparedStatement( preparedStatement, sales );
        }
    }

    @Override
    public void delete( int id ) throws SQLException
    {
        String sqlQuery = "DELETE FROM sales WHERE Id = ?;";

        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, id );
            preparedStatement.executeUpdate();
        }
    }

    @Override
    public int getLastId() throws SQLException
    {
        String sqlQuery = "SELECT MAX(Id) FROM sales;";
        try ( Statement statement = this.connection.createStatement();
              ResultSet resultSet = statement.executeQuery( sqlQuery ) )
        {
            while ( resultSet.next() ) {
                return resultSet.getInt( 1 );
            }
        }

        return 0;
    }

    @Override
    public String getLastFolio() throws SQLException
    {
        String sqlQuery = "SELECT MAX(Folio) FROM sales;";
        String lastFolio = "";

        try ( Statement statement = this.connection.createStatement();
              ResultSet resultSet = statement.executeQuery( sqlQuery ) )
        {
            while ( resultSet.next() ) {
                lastFolio = resultSet.getString( 1 );
            }
        }

        return lastFolio;
    }

    private Sales buildSales( ResultSet resultSet ) throws SQLException
    {
        Sales sales = new Sales();
        sales.setIdSale( resultSet.getInt( 1 ) );
        sales.setDate( resultSet.getString( 2 ) );
        sales.setFolio( resultSet.getString( 3 ) );
        sales.setTotal( resultSet.getDouble( 4 ) );
        sales.setStatus( resultSet.getBoolean( 5 ) );
        sales.setIdSeller( resultSet.getInt( 6 ) );
        sales.setIdCustomer( resultSet.getInt( 7 ) );
        sales.setIdPaymentMethod( resultSet.getInt( 8 ) );

        return sales;
    }

    private void executePreparedStatement( PreparedStatement preparedStatement, Sales sales ) throws SQLException
    {
        preparedStatement.setString( 1, sales.getDate() );
        preparedStatement.setString( 2, sales.getFolio() );
        preparedStatement.setDouble( 3, sales.getTotal() );
        preparedStatement.setInt( 4, sales.getIdSeller() );
        preparedStatement.setInt( 5, sales.getIdCustomer() );
        preparedStatement.setInt( 6, sales.getIdPaymentMethod() );
        if( sales.getIdSale() != null && sales.getIdSale() > 0 )
        {
            preparedStatement.setInt( 7, sales.getIdSale() );
        }
        preparedStatement.executeUpdate();
    }
}