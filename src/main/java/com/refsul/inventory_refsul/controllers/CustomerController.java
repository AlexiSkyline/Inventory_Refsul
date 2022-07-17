package com.refsul.inventory_refsul.controllers;

import com.refsul.inventory_refsul.models.staff.Customer;
import com.refsul.inventory_refsul.services.implementService.CustomerServiceImpl;
import com.refsul.inventory_refsul.services.implementService.PersonalInformationServiceImpl;
import com.refsul.inventory_refsul.services.interfaces.CustomerService;
import com.refsul.inventory_refsul.services.interfaces.PersonalInformationService;
import com.refsul.inventory_refsul.services.interfaces.ServiceCrud;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class CustomerController
{
    private CustomerService customerService;
    private PersonalInformationService informationService;

    public CustomerController()
    {
        this.customerService = new CustomerServiceImpl();
        this.informationService = new PersonalInformationServiceImpl();
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
        } catch ( SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Customer> getCustomers() throws SQLException
    {
        return ( List<Customer> ) this.customerService.findAll();
    }

    public boolean updateCustomer( Customer customer )
    {
        try {
            Optional<Customer> customerOptional = this.customerService.findById( customer.getIdCustomer() );
            Integer idCustomer = customerOptional.get().getIdCustomer();

            if( !idCustomer.equals( null ) ) {
                Integer idInformation = customerOptional.get().getPersonalInformation().getIdInformation();
                customer.getPersonalInformation().setIdInformation( idInformation );

                this.informationService.update( customer.getPersonalInformation() );
                this.customerService.update( customer );
            }

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteCustomer( int id )
    {
        try
        {
            Optional<Customer> customerOptional = this.customerService.findById( id );
            Integer idCustomer = customerOptional.get().getIdCustomer();

            if( !idCustomer.equals( null ) ) {
                Integer idInformation = customerOptional.get().getPersonalInformation().getIdInformation();

                this.customerService.delete( customerOptional.get().getIdCustomer() );
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