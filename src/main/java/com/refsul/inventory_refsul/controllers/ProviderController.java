package com.refsul.inventory_refsul.controllers;

import com.refsul.inventory_refsul.models.Provider;
import com.refsul.inventory_refsul.services.interfaces.PersonalInformationService;
import com.refsul.inventory_refsul.services.interfaces.ProviderService;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class ProviderController
{
    private final ProviderService providerService;
    private final PersonalInformationService informationService;

    @Inject
    public ProviderController( ProviderService providerService, PersonalInformationService personalInformationService )
    {
        this.providerService = providerService;
        this.informationService = personalInformationService;
    }

    public boolean createProvider( Provider provider )
    {
        try {
            this.informationService.create( provider.getPersonalInformation() );
            int lastId = this.informationService.getLastId();

            if( lastId != 0 ) {
                provider.getPersonalInformation().setIdInformation( lastId );
                this.providerService.create( provider );
            }

            return true;
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Provider> getProviders() throws SQLException
    {
        return ( List<Provider> ) this.providerService.findAll();
    }

    public boolean updateProvider( Provider provider )
    {
        try {
            Optional<Provider> providerOptional = this.providerService.findById( provider.getIdProvider() );
            if( providerOptional.isPresent() ) {
                Integer idInformation = providerOptional.get().getPersonalInformation().getIdInformation();
                provider.getPersonalInformation().setIdInformation( idInformation );

                this.informationService.update( provider.getPersonalInformation() );
                this.providerService.update( provider );
            }

            return providerOptional.isPresent();
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteProvider( int id )
    {
        try {
            Optional<Provider> providerOptional = this.providerService.findById( id );
            if( providerOptional.isPresent() ) {
                Integer idInformation = providerOptional.get().getPersonalInformation().getIdInformation();

                this.providerService.delete( providerOptional.get().getIdProvider() );
                this.informationService.delete( idInformation );
            }

            return providerOptional.isPresent();
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }
}