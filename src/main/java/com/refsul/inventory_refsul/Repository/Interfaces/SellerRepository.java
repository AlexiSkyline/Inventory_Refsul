package com.refsul.inventory_refsul.Repository.Interfaces;

import java.sql.SQLException;
import java.util.Optional;

public interface SellerRepository<Seller> extends CrudRepository<Seller>
{
    Optional<Seller> login( String userName, String password ) throws SQLException;
}
