package com.refsul.inventory_refsul.services.implementService.staff;

import com.refsul.inventory_refsul.repository.implementsRepository.staff.SellerRepositoryImpl;
import com.refsul.inventory_refsul.repository.interfaces.SellerRepository;
import com.refsul.inventory_refsul.services.interfaces.SellerService;
import com.refsul.inventory_refsul.utils.DataBaseConnection;
import com.refsul.inventory_refsul.models.staff.Seller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class SellerServiceImpl implements SellerService
{
    private SellerRepository repository;

    public SellerServiceImpl()
    {
        this.repository = new SellerRepositoryImpl();
    }

    @Override
    public Optional<Seller> login( String userName, String password ) throws SQLException
    {
        try( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            return this.repository.login( userName, password );
        }
    }

    @Override
    public List<Seller> findAll() throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            return this.repository.findAll();
        }
    }

    @Override
    public Optional<Seller> findById( int id ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            return this.repository.findById( id );
        }
    }

    @Override
    public void create( Seller seller ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            if( connection.getAutoCommit() ) {
                connection.setAutoCommit( false );
            }

            try {
                this.repository.create( seller );
                connection.commit();
            } catch ( SQLException e ) {
                connection.rollback();
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update( Seller seller ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            if( connection.getAutoCommit() ) {
                connection.setAutoCommit( false );
            }

            try
            {
                this.repository.update( seller );
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