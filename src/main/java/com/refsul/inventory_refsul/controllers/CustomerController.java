package com.refsul.inventory_refsul.controllers;

import com.refsul.inventory_refsul.models.Customer;
import com.refsul.inventory_refsul.services.implementService.CustomerServiceImpl;
import com.refsul.inventory_refsul.services.implementService.PersonalInformationServiceImpl;
import com.refsul.inventory_refsul.services.interfaces.CustomerService;
import com.refsul.inventory_refsul.services.interfaces.PersonalInformationService;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class CustomerController
{
    private CustomerService customerService;
    private PersonalInformationService informationService;

    @Inject
    public CustomerController( CustomerService customerService, PersonalInformationService personalInformationService )
    {
        this.customerService = customerService;
        this.informationService = personalInformationService;
    }

    public boolean createCustomer( Customer customer )
    {
        try {
            this.informationService.create( customer.getPersonalInformation() );
            int lastId = this.informationService.getLastId();

            if( lastId != 0 ) {
                customer.getPersonalInformation().setIdInformation( lastId );
                this.customerService.create( customer );
            }

            return true;
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Customer> getCustomers() throws SQLException
    {
        return ( List<Customer> ) this.customerService.findAll();
    }

    public Optional<Customer> getCustomerById( int id ) throws SQLException
    {
        return this.customerService.findById( id );
    }

    public boolean updateCustomer( Customer customer )
    {
        try {
            Optional<Customer> customerOptional = this.customerService.findById( customer.getIdCustomer() );
            if( customerOptional.isPresent() ) {
                Integer idInformation = customerOptional.get().getPersonalInformation().getIdInformation();
                customer.getPersonalInformation().setIdInformation( idInformation );

                this.informationService.update( customer.getPersonalInformation() );
                this.customerService.update( customer );
            }

            return customerOptional.isPresent();
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteCustomer( int id )
    {
        try {
            Optional<Customer> customerOptional = this.customerService.findById( id );
            if( customerOptional.isPresent() ) {
                Integer idInformation = customerOptional.get().getPersonalInformation().getIdInformation();

                this.customerService.delete( customerOptional.get().getIdCustomer() );
                this.informationService.delete( idInformation );
            }

            return customerOptional.isPresent();
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }
}