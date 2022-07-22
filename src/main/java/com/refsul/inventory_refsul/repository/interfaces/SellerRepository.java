package com.refsul.inventory_refsul.repository.interfaces;

import com.refsul.inventory_refsul.models.Seller;

import java.sql.SQLException;
import java.util.Optional;

public interface SellerRepository extends CrudRepository<Seller>
{
    Optional<Seller> login( String userName, String password ) throws SQLException;
}