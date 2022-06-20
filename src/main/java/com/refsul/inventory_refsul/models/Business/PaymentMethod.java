package com.refsul.inventory_refsul.models.Business;

public class PaymentMethod
{
    private int idPaymentMethod;
    private String description;
    private boolean status;

    public int getIdPaymentMethod()
    {
        return idPaymentMethod;
    }

    public void setIdPaymentMethod( int idPaymentMethod )
    {
        this.idPaymentMethod = idPaymentMethod;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public boolean isStatus()
    {
        return status;
    }

    public void setStatus( boolean status )
    {
        this.status = status;
    }
}