package com.refsul.inventory_refsul.Repository;

import com.refsul.inventory_refsul.models.Staff.Seller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SellerRepository implements CrudRepository<Seller>
{
    private Connection connection;

    @Override
    public void setConnection( Connection connection )
    {
        this.connection = connection;
    }

    @Override
    public List<Seller> findAll() throws SQLException
    {
        String sqlQuery = "SELECT * FROM seller_view;";
        List<Seller> sellers = new ArrayList<>();

        try ( Statement statement = this.connection.createStatement();
              ResultSet resultSet = statement.executeQuery( sqlQuery ); )
        {
            while( resultSet.next() ) {
                Seller seller = this.buildSeller( resultSet );
                sellers.add( seller );
            }
        }

        return sellers;
    }

    @Override
    public Seller findById( int id ) throws SQLException
    {
        return null;
    }

    @Override
    public boolean create( Seller seller )
    {
        return false;
    }

    @Override
    public boolean update( Seller seller )
    {
        return false;
    }

    @Override
    public boolean delete( int id )
    {
        return false;
    }

    private Seller buildSeller( ResultSet resultSet ) throws SQLException
    {
        Seller seller = new Seller();
        seller.setIdSeller( resultSet.getInt( 1 ) );
        seller.setUserName( resultSet.getString( 2 ) );
        seller.setPassword( resultSet.getString( 3 ) );
        seller.setIdInformation( resultSet.getInt( 4 ) );
        seller.setNames( resultSet.getString( 5 ) );
        seller.setLastName( resultSet.getString( 6 ) );
        seller.setRfc( resultSet.getString( 7 ) );
        seller.setAddress( resultSet.getString( 8 ) );
        seller.setEmail( resultSet.getString( 9 ) );
        seller.setNumberPhone( resultSet.getString( 10 ) );
        seller.setStatus( resultSet.getBoolean( 11 ) );

        return seller;
    }
}
