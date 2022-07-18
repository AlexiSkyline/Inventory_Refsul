package com.refsul.inventory_refsul.repository.implementsRepository.staff;

import com.refsul.inventory_refsul.models.staff.PersonalInformation;
import com.refsul.inventory_refsul.repository.interfaces.CrudRepository;
import com.refsul.inventory_refsul.models.staff.Customer;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class CustomerRepositoryImpl implements CrudRepository<Customer>
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
    public Optional<Customer> findById(int id ) throws SQLException
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

        return Optional.ofNullable( customer );
    }

    @Override
    public void create( Customer customer ) throws SQLException
    {
        String sqlQuery = "INSERT INTO customers ( Personal_Information_Id ) VALUES ( ? );";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, customer.getPersonalInformation().getIdInformation() );
            preparedStatement.executeUpdate();
        }
    }

    @Override
    public void update( Customer customer ) throws SQLException
    {
        String sqlQuery = "UPDATE customers SET Personal_Information_Id = ? WHERE Id = ?";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, customer.getPersonalInformation().getIdInformation() );
            preparedStatement.setInt( 2, customer.getIdCustomer() );
            preparedStatement.executeUpdate();
        }
    }

    @Override
    public void delete( int id ) throws SQLException
    {
        String sqlQuery = "DELETE FROM customers WHERE Id = ?";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, id );
            preparedStatement.executeUpdate();
        }
    }

    private Customer buildCustomer( ResultSet resultSet ) throws  SQLException
    {
        Customer customer = new Customer();
        customer.setIdCustomer( resultSet.getInt( 1 ) );

        PersonalInformation personalInformation = new PersonalInformation();
        personalInformation.setIdInformation( resultSet.getInt( 2 ) );
        personalInformation.setName( resultSet.getString( 3 ) );
        personalInformation.setLastName( resultSet.getString( 4 ) );
        personalInformation.setRfc( resultSet.getString( 5 ) );
        personalInformation.setAddress( resultSet.getString( 6 ) );
        personalInformation.setEmail( resultSet.getString( 7 ) );
        personalInformation.setPhoneNumber( resultSet.getString( 8 ) );
        personalInformation.setStatus( resultSet.getBoolean( 9 ) );

        customer.setPersonalInformation( personalInformation );

        return customer;
    }
}