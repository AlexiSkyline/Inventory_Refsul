package com.refsul.inventory_refsul.models.Business;

import java.util.Date;

public class Sale
{
    private int idSale;
    private Date date;
    private String folio;
    private double total;
    private boolean status;
    private int idSeller;
    private int idCustomer;
    private int idPaymentMethod;

    public Sale() {}

    public Sale( int idSale, Date date, String folio, double total, boolean status, int idSeller, int idCustomer, int idPaymentMethod )
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

    public int getIdSale()
    {
        return idSale;
    }

    public void setIdSale( int idSale )
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

    public int getIdSeller()
    {
        return idSeller;
    }

    public void setIdSeller( int idSeller )
    {
        this.idSeller = idSeller;
    }

    public int getIdCustomer()
    {
        return idCustomer;
    }

    public void setIdCustomer( int idCustomer )
    {
        this.idCustomer = idCustomer;
    }

    public int getIdPaymentMethod()
    {
        return idPaymentMethod;
    }

    public void setIdPaymentMethod( int idPaymentMethod )
    {
        this.idPaymentMethod = idPaymentMethod;
    }
}