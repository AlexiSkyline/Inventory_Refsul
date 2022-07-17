package com.refsul.inventory_refsul.controllers;

import com.refsul.inventory_refsul.models.staff.Provider;
import com.refsul.inventory_refsul.services.implementService.PersonalInformationServiceImpl;
import com.refsul.inventory_refsul.services.implementService.ProviderServiceImpl;
import com.refsul.inventory_refsul.services.interfaces.PersonalInformationService;
import com.refsul.inventory_refsul.services.interfaces.ProviderService;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class ProviderController
{
    private ProviderService prodiverService;
    private PersonalInformationService informationService;

    public ProviderController()
    {
        this.prodiverService = new ProviderServiceImpl();
        this.informationService = new PersonalInformationServiceImpl();
    }

    public boolean createProvider( Provider provider )
    {
        try {
            this.informationService.create( provider.getPersonalInformation() );
            int lastId = this.informationService.getLastId();

            if( lastId != 0 ) {
                provider.getPersonalInformation().setIdInformation( lastId );
                this.prodiverService.create( provider );
            }

            return true;
        } catch ( SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Provider> getProviders() throws SQLException
    {
        return ( List<Provider> ) this.prodiverService.findAll();
    }

    public boolean updateProvider( Provider provider )
    {
        try {
            Optional<Provider> providerOptional = this.prodiverService.findById( provider.getIdProvider() );
            Integer idProvider = providerOptional.get().getIdProvider();

            if( !idProvider.equals( null ) ) {
                Integer idInformation = providerOptional.get().getPersonalInformation().getIdInformation();
                provider.getPersonalInformation().setIdInformation( idInformation );

                this.informationService.update( provider.getPersonalInformation() );
                this.prodiverService.update( provider );
            }

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteProvider( int id )
    {
        try
        {
            Optional<Provider> providerOptional = this.prodiverService.findById( id );
            Integer idProvider = providerOptional.get().getIdProvider();

            if( !idProvider.equals( null ) ) {
                Integer idInformation = providerOptional.get().getPersonalInformation().getIdInformation();

                this.prodiverService.delete( providerOptional.get().getIdProvider() );
                this.informationService.delete( idInformation );
            }

            return true;
        } catch ( SQLException e )
        {
            e.printStackTrace();
            return false;
        }
    }
}