package com.refsul.inventory_refsul.services.interfaces;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface ServiceCrud<T> {
    List<T> findAll() throws SQLException;
    Optional<T> findById( int id ) throws SQLException;
    void create( T t ) throws SQLException;
    void update( T t ) throws SQLException;
    void delete( int id ) throws SQLException;
}