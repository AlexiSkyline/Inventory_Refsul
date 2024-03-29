package com.refsul.inventory_refsul.controllers;

import com.refsul.inventory_refsul.models.PaymentMethod;
import com.refsul.inventory_refsul.services.interfaces.PaymentMethodService;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class PaymentMethodController
{
    private final PaymentMethodService service;

    @Inject
    public PaymentMethodController( PaymentMethodService service )
    {
        this.service = service;
    }

    public boolean createPaymentMethod( PaymentMethod paymentMethod )
    {
        try {
            this.service.create( paymentMethod );
            return true;
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public List<PaymentMethod> getPaymentMethods() throws SQLException
    {
        return this.service.findAll();
    }

    public boolean updatePaymentMethod( PaymentMethod paymentMethod )
    {
        try {
            Optional<PaymentMethod> paymentMethodOptional = this.service.findById( paymentMethod.getIdPaymentMethod() );
            if( paymentMethodOptional.isPresent() ) {
                this.service.update( paymentMethod );
            }

            return paymentMethodOptional.isPresent();
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deletePaymentMethod( int id )
    {
        try {
            Optional<PaymentMethod> paymentMethodOptional = this.service.findById( id );
            if( paymentMethodOptional.isPresent() ) {
                this.service.delete( id );
            }

            return paymentMethodOptional.isPresent();
        } catch ( SQLException e ) {
            e.printStackTrace();
            return false;
        }
    }
}