package com.refsul.inventory_refsul.Repository;

import java.util.List;

public interface CrudRepository<T>
{
     List<T> findAll();
     T findById( Long id );
     boolean create( T t );
     boolean update( T t );
     boolean delete( Long id );
}