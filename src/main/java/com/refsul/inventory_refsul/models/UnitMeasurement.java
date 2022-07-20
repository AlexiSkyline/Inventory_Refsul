package com.refsul.inventory_refsul.models;

public class UnitMeasurement
{
    private Integer idUnitMeasurement;
    private String description;
    private boolean status;

    public Integer getIdUnitMeasurement()
    {
        return idUnitMeasurement;
    }

    public void setIdUnitMeasurement( Integer idUnitMeasurement )
    {
        this.idUnitMeasurement = idUnitMeasurement;
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