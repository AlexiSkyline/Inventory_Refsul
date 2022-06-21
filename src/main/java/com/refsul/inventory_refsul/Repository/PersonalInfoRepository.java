package com.refsul.inventory_refsul.Repository;

import com.refsul.inventory_refsul.Repository.Interfaces.PersonalInformationRepository;
import com.refsul.inventory_refsul.models.Staff.PersonalInformation;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonalInfoRepository implements PersonalInformationRepository<PersonalInformation>
{
    private Connection connection;

    @Override
    public void setConnection( Connection connection )
    {
        this.connection = connection;
    }

    @Override
    public List<PersonalInformation> findAll() throws SQLException
    {
        String sqlQuery = "SELECT * FROM personal_informations;";
        List<PersonalInformation> personalInformations = new ArrayList<>();

        try ( Statement statement = this.connection.createStatement();
             ResultSet resultSet = statement.executeQuery( sqlQuery ); )
        {
            while( resultSet.next() )
            {
                PersonalInformation personalInformation = this.buildPersonalInformation( resultSet );
                personalInformations.add( personalInformation );
            }
        }

        return personalInformations;
    }

    @Override
    public PersonalInformation findById( int id ) throws SQLException
    {
        String sqlQuery = "SELECT * FROM personal_informations WHERE Id = ?;";
        PersonalInformation personalInformation = null;

        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery) )
        {
            preparedStatement.setInt(  1, id );

            try ( ResultSet resultSet = preparedStatement.executeQuery() )
            {
                if( resultSet.next() ) {
                    personalInformation = this.buildPersonalInformation( resultSet );
                }
            }
        }

        return personalInformation;
    }

    @Override
    public boolean create( PersonalInformation personalInformation ) throws SQLException
    {
        String sqlQuery = "INSERT INTO personal_informations ( Name, Last_Name, RFC, Address, Email, " +
                "Phone_Number ) VALUES ( ?, ?, ?, ?, ?, ? );";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            this.executePreparedStatement( preparedStatement, personalInformation );
            return true;
        } catch ( SQLException e )
        {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update( PersonalInformation personalInformation ) throws SQLException
    {
        return false;
    }

    @Override
    public boolean delete( int id ) throws SQLException
    {
        return false;
    }

    @Override
    public int getLastId() throws SQLException
    {
        return 0;
    }

    private PersonalInformation buildPersonalInformation( ResultSet resultSet ) throws SQLException
    {
        PersonalInformation personalInformation = new PersonalInformation();
        personalInformation.setIdInformation( resultSet.getInt( 1 ) );
        personalInformation.setName( resultSet.getString( 2 ) );
        personalInformation.setLastName( resultSet.getString( 3 ) );
        personalInformation.setRfc( resultSet.getString( 4 ) );
        personalInformation.setAddress( resultSet.getString( 5 ) );
        personalInformation.setEmail( resultSet.getString( 6 ) );
        personalInformation.setPhoneNumber( resultSet.getString( 7 ) );
        personalInformation.setStatus( resultSet.getBoolean( 8 ) );

        return personalInformation;
    }

    private void executePreparedStatement( PreparedStatement preparedStatement, PersonalInformation personalInformation ) throws SQLException
    {
        preparedStatement.setString( 1, personalInformation.getName() );
        preparedStatement.setString( 2, personalInformation.getLastName() );
        preparedStatement.setString( 3, personalInformation.getRfc() );
        preparedStatement.setString( 4, personalInformation.getAddress() );
        preparedStatement.setString( 5, personalInformation.getEmail() );
        preparedStatement.setString( 6, personalInformation.getPhoneNumber() );
        if( personalInformation.getIdInformation() > 0 )
        {
            preparedStatement.setInt( 7, personalInformation.getIdInformation() );
        }
        preparedStatement.executeUpdate();
    }
}