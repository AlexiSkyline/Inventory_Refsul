package com.refsul.inventory_refsul.repository.implementsRepository;

import com.refsul.inventory_refsul.models.PersonalInformation;
import com.refsul.inventory_refsul.repository.interfaces.SellerRepository;
import com.refsul.inventory_refsul.models.Seller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SellerRepositoryImpl implements SellerRepository
{
    private Connection connection;

    @Override
    public void setConnection( Connection connection )
    {
        this.connection = connection;
    }

    @Override
    public Optional<Seller> login( String userName, String password ) throws SQLException
    {
        String sqlQuery = "SELECT * FROM sellers WHERE User_Name = ? AND Password = ?;";
        Seller seller = new Seller();

        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setString( 1, userName );
            preparedStatement.setString( 2, password );

            try ( ResultSet resultSet = preparedStatement.executeQuery() )
            {
                if( resultSet.next() )
                {
                    seller.setIdSeller( resultSet.getInt( 1 ) );
                    seller.setUserName( resultSet.getString( 2 ) );
                }
            }
        }

        return Optional.ofNullable( seller );
    }

    @Override
    public List<Seller> findAll() throws SQLException
    {
        String sqlQuery = "SELECT * FROM seller_view;";
        List<Seller> sellers = new ArrayList<>();

        try ( Statement statement = this.connection.createStatement();
              ResultSet resultSet = statement.executeQuery( sqlQuery ); )
        {
            while( resultSet.next() )
            {
                Seller seller = this.buildSeller( resultSet );
                sellers.add( seller );
            }
        }

        return sellers;
    }

    @Override
    public Optional<Seller> findById(int id ) throws SQLException
    {
        String sqlQuery = "SELECT * FROM seller_view WHERE Id_Seller = ?;";
        Seller seller = null;

        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery) )
        {
            preparedStatement.setInt( 1, id );

            try ( ResultSet resultSet = preparedStatement.executeQuery() )
            {
                if( resultSet.next() )
                {
                    seller = this.buildSeller( resultSet );
                }
            }
        }

        return Optional.ofNullable( seller );
    }

    @Override
    public void create( Seller seller ) throws SQLException
    {
        String sqlQuery = "INSERT INTO sellers ( User_Name, Password, Personal_Information_Id ) VALUES ( ?, ?, ? );";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ); )
        {
            this.executePreparedStatement( preparedStatement, seller );
        }
    }

    @Override
    public void update( Seller seller ) throws SQLException
    {
        String sqlQuery = "UPDATE sellers SET User_Name= ?, Password= ?, Personal_Information_Id= ? WHERE Id= ?;";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ); )
        {
            this.executePreparedStatement( preparedStatement, seller );
        }
    }

    @Override
    public void delete( int id ) throws SQLException
    {
        String sqlQuery = "DELETE FROM sellers WHERE Id= ?;";
        try ( PreparedStatement preparedStatement = this.connection.prepareStatement( sqlQuery ) )
        {
            preparedStatement.setInt( 1, id );
            preparedStatement.executeUpdate();
        }
    }

    private Seller buildSeller( ResultSet resultSet ) throws SQLException
    {
        Seller seller = new Seller();
        seller.setIdSeller( resultSet.getInt( 1 ) );
        seller.setUserName( resultSet.getString( 2 ) );
        seller.setPassword( resultSet.getString( 3 ) );

        PersonalInformation personalInformation = new PersonalInformation();
        personalInformation.setIdInformation( resultSet.getInt( 4 ) );
        personalInformation.setName( resultSet.getString( 5 ) );
        personalInformation.setLastName( resultSet.getString( 6 ) );
        personalInformation.setRfc( resultSet.getString( 7 ) );
        personalInformation.setAddress( resultSet.getString( 8 ) );
        personalInformation.setEmail( resultSet.getString( 9 ) );
        personalInformation.setPhoneNumber( resultSet.getString( 10 ) );
        personalInformation.setStatus( resultSet.getBoolean( 11 ) );

        seller.setPersonalInformation( personalInformation );

        return seller;
    }

    private void executePreparedStatement( PreparedStatement preparedStatement, Seller seller ) throws SQLException
    {
        preparedStatement.setString( 1, seller.getUserName() );
        preparedStatement.setString( 2, seller.getPassword() );
        preparedStatement.setInt( 3, seller.getPersonalInformation().getIdInformation() );
        if( seller.getIdSeller() != null && seller.getIdSeller() > 0 )
        {
            preparedStatement.setInt( 4, seller.getIdSeller() );
        }
        preparedStatement.executeUpdate();
    }
}