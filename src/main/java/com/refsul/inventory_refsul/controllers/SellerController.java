package com.refsul.inventory_refsul.controllers;

import com.refsul.inventory_refsul.services.implementService.PersonalInformationServiceImpl;
import com.refsul.inventory_refsul.services.implementService.SellerServiceImpl;
import com.refsul.inventory_refsul.services.interfaces.PersonalInformationService;
import com.refsul.inventory_refsul.services.interfaces.SellerService;
import com.refsul.inventory_refsul.models.staff.Seller;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class SellerController
{
    private SellerService sellerService;
    private PersonalInformationService informationService;

    public SellerController()
    {
        this.sellerService = new SellerServiceImpl();
        this.informationService = new PersonalInformationServiceImpl();
    }

    public boolean login( String userName, String password ) throws SQLException {
        Optional<Seller> sellerOptional = this.sellerService.login( userName, password );
        return sellerOptional.get().getUserName() != null;
    }

    public boolean createUser( Seller seller )
    {
        try {
            this.informationService.create( seller.getPersonalInformation() );
            int lastId = this.informationService.getLastId();
            if( lastId != 0 ) {
                seller.getPersonalInformation().setIdInformation( lastId );
                this.sellerService.create( seller );
            }
            return true;
        } catch ( SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Seller> getSeller() throws SQLException
    {
        List<Seller> sellers = this.sellerService.findAll();
        return sellers;
    }

    public boolean updateSeller( Seller seller )
    {
        try {
            Optional<Seller> sellerOptional = this.sellerService.findById( seller.getIdSeller() );
            if( !sellerOptional.get().getIdSeller().equals( null ) )
            {
                seller.getPersonalInformation().setIdInformation( sellerOptional.get().getIdSeller() );
                this.informationService.update( seller.getPersonalInformation() );
                this.sellerService.update( seller );
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteSeller( int id )
    {
        try
        {
            Optional<Seller> sellerOptional = this.sellerService.findById( id );
            if( !sellerOptional.get().getIdSeller().equals( null ) )
            {
                this.sellerService.delete( sellerOptional.get().getIdSeller() );
                this.informationService.delete( sellerOptional.get().getPersonalInformation().getIdInformation() );
            }
            return true;
        } catch ( SQLException e )
        {
            e.printStackTrace();
            return false;
        }
    }
}