package com.refsul.inventory_refsul.models;

public class Brand
{
    private Integer idBrand;
    private String description;
    private boolean status;

    public Integer getIdBrand()
    {
        return idBrand;
    }

    public void setIdBrand( Integer idBrand )
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