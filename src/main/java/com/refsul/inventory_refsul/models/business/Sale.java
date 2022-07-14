package com.refsul.inventory_refsul.models.business;

import java.util.Date;

public class Sale
{
    private Integer idSale;
    private Date date;
    private String folio;
    private double total;
    private boolean status;
    private Integer idSeller;
    private Integer idCustomer;
    private Integer idPaymentMethod;

    public Sale() {}

    public Sale( Integer idSale, Date date, String folio, double total, boolean status, Integer idSeller, Integer idCustomer, Integer idPaymentMethod )
    {
        this.idSale = idSale;
        this.date = date;
        this.folio = folio;
        this.total = total;
        this.status = status;
        this.idSeller = idSeller;
        this.idCustomer = idCustomer;
        this.idPaymentMethod = idPaymentMethod;
    }

    public Integer getIdSale()
    {
        return idSale;
    }

    public void setIdSale( Integer idSale )
    {
        this.idSale = idSale;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate( Date date )
    {
        this.date = date;
    }

    public String getFolio()
    {
        return folio;
    }

    public void setFolio( String folio )
    {
        this.folio = folio;
    }

    public double getTotal()
    {
        return total;
    }

    public void setTotal( double total )
    {
        this.total = total;
    }

    public boolean isStatus()
    {
        return status;
    }

    public void setStatus( boolean status )
    {
        this.status = status;
    }

    public Integer getIdSeller()
    {
        return idSeller;
    }

    public void setIdSeller( Integer idSeller )
    {
        this.idSeller = idSeller;
    }

    public Integer getIdCustomer()
    {
        return idCustomer;
    }

    public void setIdCustomer( Integer idCustomer )
    {
        this.idCustomer = idCustomer;
    }

    public Integer getIdPaymentMethod()
    {
        return idPaymentMethod;
    }

    public void setIdPaymentMethod( Integer idPaymentMethod )
    {
        this.idPaymentMethod = idPaymentMethod;
    }
}