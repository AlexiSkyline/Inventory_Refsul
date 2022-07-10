package com.refsul.inventory_refsul.Repository.Implements.Business;

import com.refsul.inventory_refsul.Repository.Interfaces.CrudRepository;
import com.refsul.inventory_refsul.models.Business.PaymentMethod;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class PaymentMethodRepository implements CrudRepository<PaymentMethod>
{
    private Connection connection;

    @Override
    public void setConnection(Connection connection)
    {
        this.connection = connection;
    }

    @Override
    public List<PaymentMethod> findAll() throws SQLException
    {
        String sqlQuery = "SELECT * FROM payment_methods;";
        List<PaymentMethod> paymentMethods = new LinkedList<>();

        try ( Statement statement = this.connection.createStatement();
              ResultSet resultSet = statement.executeQuery( sqlQuery ) )
        {
            while ( resultSet.next() )
            {
                PaymentMethod method = this.buildPaymentMethod( resultSet );
                paymentMethods.add( method );
            }
        }

        return paymentMethods;
    }

    @Override
    public PaymentMethod findById( int id ) throws SQLException
    {
        String sqlQuery = "SELECT * FROM payment_methods WHERE Id = ?;";
        PaymentMethod method = null;

        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, id );
            try ( ResultSet resultSet = preparedStatement.executeQuery() )
            {
                if ( resultSet.next() )
                {
                    method = this.buildPaymentMethod( resultSet );
                }
            }
        }

        return method;
    }

    @Override
    public boolean create( PaymentMethod paymentMethod )
    {
        String sqlQuery = "INSERT INTO payment_methods ( Description ) VALUES ( ? )";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setString( 1, paymentMethod.getDescription() );
            preparedStatement.executeUpdate();
            return true;
        }
        catch ( SQLException e )
        {
            return false;
        }
    }

    @Override
    public boolean update( PaymentMethod paymentMethod )
    {
        String sqlQuery = "UPDATE payment_methods SET Description = ? WHERE Id = ?;";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setString( 1, paymentMethod.getDescription() );
            preparedStatement.setInt( 2, paymentMethod.getIdPaymentMethod() );
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
        String sqlQuery = "DELETE FROM payment_methods WHERE Id = ?";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, id );
            preparedStatement.executeUpdate();
        }
    }

    private PaymentMethod buildPaymentMethod( ResultSet resultSet ) throws SQLException
    {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.setIdPaymentMethod( resultSet.getInt( 1 ) );
        paymentMethod.setDescription( resultSet.getString( 2 ) );
        paymentMethod.setStatus( resultSet.getBoolean( 3 ) );

        return paymentMethod;
    }
}