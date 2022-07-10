package com.refsul.inventory_refsul.Repository.Interfaces;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface CrudRepository<T>
{
     void setConnection( Connection connection );
     List<T> findAll() throws SQLException;
     T findById( int id ) throws SQLException;
     boolean create( T t );
     boolean update( T t );
     void delete( int id ) throws SQLException;
}