package com.refsul.inventory_refsul.controllers;

import com.refsul.inventory_refsul.services.implementService.SellerServiceImpl;
import com.refsul.inventory_refsul.services.interfaces.SellerService;
import com.refsul.inventory_refsul.models.staff.Seller;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class SellerController
{
    private SellerService service;

    public SellerController()
    {
        this.service = new SellerServiceImpl();
    }

    public boolean login( String userName, String password ) throws SQLException {
        Optional<Seller> sellerOptional = this.service.login( userName, password );
        return sellerOptional.get().getUserName() != null;
    }

    public List<Seller> getSeller() throws SQLException {
        List<Seller> sellers = this.service.findAll();
        return sellers;
    }
}