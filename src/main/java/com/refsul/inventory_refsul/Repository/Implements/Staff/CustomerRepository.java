package com.refsul.inventory_refsul.Repository.Implements.Staff;

import com.refsul.inventory_refsul.Repository.Interfaces.CrudRepository;
import com.refsul.inventory_refsul.models.Staff.Customer;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class CustomerRepository implements CrudRepository<Customer>
{
    private Connection connection;

    @Override
    public void setConnection( Connection connection )
    {
        this.connection = connection;
    }

    @Override
    public List<Customer> findAll() throws SQLException
    {
        String sqlQuery = "SELECT * FROM customers_view;";
        List<Customer> customers = new LinkedList<>();

        try ( Statement statement = this.connection.createStatement();
              ResultSet resultSet = statement.executeQuery( sqlQuery ) )
        {
            while ( resultSet.next() ) {
                Customer customer = this.buildCustomer( resultSet );
                customers.add( customer );
            }
        }

        return customers;
    }

    @Override
    public Customer findById(int id ) throws SQLException
    {
        String sqlQuery = "SELECT * FROM customers_view WHERE Id_Custumer = ?;";
        Customer customer = null;

        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, id );
            try ( ResultSet resultSet = preparedStatement.executeQuery() )
            {
                if( resultSet.next() )
                {
                    customer = this.buildCustomer( resultSet );
                }
            }
        }

        return customer;
    }

    @Override
    public boolean create( Customer customer )
    {
        String sqlQuery = "INSERT INTO customers ( Personal_Information_Id ) VALUES ( ? );";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, customer.getIdInformation() );
            preparedStatement.executeUpdate();
            return true;
        }
        catch ( SQLException e )
        {
            return false;
        }
    }

    @Override
    public boolean update( Customer customer )
    {
        String sqlQuery = "UPDATE customers SET Personal_Information_Id = ? WHERE Id = ?";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, customer.getIdInformation() );
            preparedStatement.setInt( 2, customer.getIdCustomer() );
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
        String sqlQuery = "DELETE FROM customers WHERE Id = ?";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, id );
            preparedStatement.executeUpdate();
            return false;
        }
        catch ( SQLException e )
        {
            return false;
        }
    }

    private Customer buildCustomer( ResultSet resultSet ) throws  SQLException
    {
        Customer customer = new Customer();
        customer.setIdCustomer( resultSet.getInt( 1 ) );
        customer.setIdInformation( resultSet.getInt( 2 ) );
        customer.setName( resultSet.getString( 3 ) );
        customer.setLastName( resultSet.getString( 4 ) );
        customer.setRfc( resultSet.getString( 5 ) );
        customer.setAddress( resultSet.getString( 6 ) );
        customer.setEmail( resultSet.getString( 7 ) );
        customer.setPhoneNumber( resultSet.getString( 8 ) );
        customer.setStatus( resultSet.getBoolean( 9 ) );

        return customer;
    }
}