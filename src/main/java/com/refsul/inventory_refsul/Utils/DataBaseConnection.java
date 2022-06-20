package com.refsul.inventory_refsul.Utils;

import io.github.cdimascio.dotenv.Dotenv;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DataBaseConnection
{
    private static final String url = Dotenv.load().get( "URL_DATA_SOURCE" );
    private static final String user = Dotenv.load().get( "USER_NAME" );
    private static final String password = Dotenv.load().get( "PASSWORD" );
    private static BasicDataSource pool;

    private DataBaseConnection() {}

    private static BasicDataSource getInstance() throws SQLException
    {
        if( pool == null ) {
            pool = new BasicDataSource();
            pool.setUrl( url );
            pool.setUsername( user );
            pool.setPassword( password );
            pool.setInitialSize( 3 );
            pool.setMinIdle( 3 );
            pool.setMaxIdle( 8 );
            pool.setMaxTotal( 8 );
        }

        return pool;
    }

    public static Connection getConnection() throws SQLException
    {
        return getInstance().getConnection();
    }
}