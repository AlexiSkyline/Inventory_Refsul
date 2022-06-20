package com.refsul.inventory_refsul.models.Business;

public class Brand
{
    private int idBrand;
    private String description;
    private boolean status;

    public int getIdBrand()
    {
        return idBrand;
    }

    public void setIdBrand( int idBrand )
    {
        this.idBrand = idBrand;
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