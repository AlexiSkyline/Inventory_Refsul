package com.refsul.inventory_refsul.controllers;

import com.refsul.inventory_refsul.services.interfaces.PersonalInformationService;
import com.refsul.inventory_refsul.services.interfaces.SellerService;
import com.refsul.inventory_refsul.models.Seller;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class SellerController
{
    private final SellerService sellerService;
    private final PersonalInformationService informationService;

    @Inject
    public SellerController( SellerService sellerService, PersonalInformationService personalInformationService )
    {
        this.sellerService = sellerService;
        this.informationService = personalInformationService;
    }

    public boolean login( String userName, String password ) throws SQLException
    {
        Optional<Seller> sellerOptional = this.sellerService.login( userName, password );
        return sellerOptional.get().getUserName() != null;
    }

    public boolean createSeller( Seller seller )
    {
        try {
            this.informationService.create( seller.getPersonalInformation() );
            int lastId = this.informationService.getLastId();

            if( lastId != 0 ) {
                seller.getPersonalInformation().setIdInformation( lastId );
                this.sellerService.create( seller );
            }

            return true;
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Seller> getSellers() throws SQLException
    {
        return this.sellerService.findAll();
    }

    public Optional<Seller> getSellerById(int id ) throws SQLException
    {
        return this.sellerService.findById( id );
    }

    public boolean updateSeller( Seller seller )
    {
        try {
            Optional<Seller> sellerOptional = this.sellerService.findById( seller.getIdSeller() );
            if( sellerOptional.isPresent() ) {
                Integer idInformation = sellerOptional.get().getPersonalInformation().getIdInformation();
                seller.getPersonalInformation().setIdInformation( idInformation );

                this.informationService.update( seller.getPersonalInformation() );
                this.sellerService.update( seller );
            }

            return sellerOptional.isPresent();
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteSeller( int id )
    {
        try {
            Optional<Seller> sellerOptional = this.sellerService.findById( id );
            if( sellerOptional.isPresent() ) {
                Integer idInformation = sellerOptional.get().getPersonalInformation().getIdInformation();

                this.sellerService.delete( sellerOptional.get().getIdSeller() );
                this.informationService.delete( idInformation );
            }

            return sellerOptional.isPresent();
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }
}