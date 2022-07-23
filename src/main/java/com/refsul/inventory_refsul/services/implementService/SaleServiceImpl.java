package com.refsul.inventory_refsul.services.implementService;

import com.refsul.inventory_refsul.models.Sales;
import com.refsul.inventory_refsul.repository.implementsRepository.SalesRepositoryImpl;
import com.refsul.inventory_refsul.repository.interfaces.SalesRepository;
import com.refsul.inventory_refsul.services.interfaces.SaleService;
import com.refsul.inventory_refsul.utils.DataBaseConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class SaleServiceImpl implements SaleService
{
    private SalesRepository repository;

    public SaleServiceImpl()
    {
        this.repository = new SalesRepositoryImpl();
    }

    @Override
    public List<Sales> findAll() throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            return this.repository.findAll();
        }
    }

    @Override
    public Optional<Sales> findById( int id ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            return this.repository.findById( id );
        }
    }

    @Override
    public void create( Sales sales ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            if( connection.getAutoCommit() ) {
                connection.setAutoCommit( false );
            }

            try {
                this.repository.create( sales );
                connection.commit();
            } catch ( SQLException e ) {
                connection.rollback();
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update( Sales sales ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            if( connection.getAutoCommit() ) {
                connection.setAutoCommit( false );
            }

            try {
                this.repository.update( sales );
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

    @Override
    public int getLastId() throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            return this.repository.getLastId();
        }
    }

    @Override
    public String getLastFolio() throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            return this.repository.getLastFolio();
        }
    }
}
