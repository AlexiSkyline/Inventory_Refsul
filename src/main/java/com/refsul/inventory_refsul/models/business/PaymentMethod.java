package com.refsul.inventory_refsul.models.business;

public class PaymentMethod
{
    private Integer idPaymentMethod;
    private String description;
    private boolean status;

    public Integer getIdPaymentMethod()
    {
        return idPaymentMethod;
    }

    public void setIdPaymentMethod( Integer idPaymentMethod )
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