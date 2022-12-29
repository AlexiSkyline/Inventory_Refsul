package com.refsul.inventory_refsul.services.implementService;

import com.refsul.inventory_refsul.models.PersonalInformation;
import com.refsul.inventory_refsul.repository.implementsRepository.PersonalInfoRepositoryImpl;
import com.refsul.inventory_refsul.repository.interfaces.PersonalInformationRepository;
import com.refsul.inventory_refsul.services.interfaces.PersonalInformationService;
import com.refsul.inventory_refsul.utils.DataBaseConnection;

import javax.inject.Inject;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class PersonalInformationServiceImpl implements PersonalInformationService
{
    private final PersonalInformationRepository repository;

    @Inject
    public PersonalInformationServiceImpl( PersonalInformationRepository repository )
    {
        this.repository = repository;
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
    public List<PersonalInformation> findAll() throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            return this.repository.findAll();
        }
    }

    @Override
    public Optional<PersonalInformation> findById( int id ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            return this.repository.findById( id );
        }
    }

    @Override
    public void create( PersonalInformation personalInformation ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            if( connection.getAutoCommit() ) {
                connection.setAutoCommit( false );
            }

            try {
                this.repository.create( personalInformation );
                connection.commit();
            } catch ( SQLException e )
            {
                connection.rollback();
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update( PersonalInformation personalInformation ) throws SQLException
    {
        try ( Connection connection = DataBaseConnection.getConnection() )
        {
            this.repository.setConnection( connection );
            if( connection.getAutoCommit() ) {
                connection.setAutoCommit( false );
            }

            try {
                this.repository.update( personalInformation );
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