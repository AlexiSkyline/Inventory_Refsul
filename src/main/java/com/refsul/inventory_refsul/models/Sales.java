package com.refsul.inventory_refsul.models;

public class Sales
{
    private Integer idSale;
    private String date;
    private String folio;
    private Double total;
    private boolean status;
    private Integer idSeller;
    private Integer idCustomer;
    private Integer idPaymentMethod;

    public Integer getIdSale()
    {
        return idSale;
    }

    public void setIdSale( Integer idSale )
    {
        this.idSale = idSale;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate( String date )
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

    public Double getTotal()
    {
        return total;
    }

    public void setTotal( Double total )
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