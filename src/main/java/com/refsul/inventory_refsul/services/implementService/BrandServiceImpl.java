package com.refsul.inventory_refsul.services.implementService;

import com.refsul.inventory_refsul.models.Brand;
import com.refsul.inventory_refsul.repository. interfaces.CrudRepository;
import com.refsul.inventory_refsul.services. interfaces.BrandService;
import com.refsul.inventory_refsul.utils.DataBaseConnection;

import javax.inject.Inject;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class BrandServiceImpl implements BrandService
{
    private final CrudRepository<Brand> repository;

    @Inject
    public BrandServiceImpl( CrudRepository<Brand> crudRepository )
    {
        this.repository = crudRepository;
    }

    @Override
    public List<Brand> findAll() throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            return this.repository.findAll();
        }
    }

    @Override
    public Optional<Brand> findById( int id ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            return this.repository.findById( id );
        }
    }

    @Override
    public void create( Brand brand ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            if( connection.getAutoCommit() ) {
                connection.setAutoCommit( false );
            }

            try {
                this.repository.create( brand );
                connection.commit();
            } catch ( SQLException e ) {
                connection.rollback();
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update( Brand brand ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            if( connection.getAutoCommit() ) {
                connection.setAutoCommit( false );
            }

            try {
                this.repository.update( brand );
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