package com.refsul.inventory_refsul.services.interfaces;

import java.sql.SQLException;
import java.util.Optional;

public interface SellerService<Seller> extends ServiceCrud<Seller>
{
    Optional<Seller> login( String userName, String password ) throws SQLException;
}