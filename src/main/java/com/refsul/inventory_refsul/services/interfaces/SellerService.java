package com.refsul.inventory_refsul.services.interfaces;

import com.refsul.inventory_refsul.models.Seller;

import java.sql.SQLException;
import java.util.Optional;

public interface SellerService extends ServiceCrud<Seller>
{
    Optional<Seller> login( String userName, String password ) throws SQLException;
}