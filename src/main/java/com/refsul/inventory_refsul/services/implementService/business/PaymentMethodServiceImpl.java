package com.refsul.inventory_refsul.services.implementService.business;

import com.refsul.inventory_refsul.models.business.PaymentMethod;
import com.refsul.inventory_refsul.repository.implementsRepository.business.PaymentMethodRepositoryImpl;
import com.refsul.inventory_refsul.repository.interfaces.CrudRepository;
import com.refsul.inventory_refsul.services.interfaces.PaymentMethodService;
import com.refsul.inventory_refsul.utils.DataBaseConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class PaymentMethodServiceImpl implements PaymentMethodService
{
    private CrudRepository repository;

    public PaymentMethodServiceImpl()
    {
        this.repository = new PaymentMethodRepositoryImpl();
    }

    @Override
    public List<PaymentMethod> findAll() throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            return this.repository.findAll();
        }
    }

    @Override
    public Optional<PaymentMethod> findById( int id ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            return this.repository.findById( id );
        }
    }

    @Override
    public void create( PaymentMethod paymentMethod ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            if( connection.getAutoCommit() ) {
                connection.setAutoCommit( false );
            }

            try
            {
                this.repository.create( paymentMethod );
                connection.commit();
            } catch ( SQLException e )
            {
                connection.rollback();
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update( PaymentMethod paymentMethod ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            if( connection.getAutoCommit() ) {
                connection.setAutoCommit( false );
            }

            try {
                this.repository.update( paymentMethod );
                connection.commit();
            } catch ( SQLException e ) {
                connection.rollback();
                e.printStackTrace();
            }
        }
    }

    @Override
    public void delete( int id ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            if( connection.getAutoCommit() ) {
                connection.setAutoCommit( false );
            }

            try {
                this.repository.delete( id );
                connection.commit();
            } catch ( SQLException e ) {
                connection.rollback();
                e.printStackTrace();
            }
        }
    }
}