package com.refsul.inventory_refsul.models.Business;

public class UnitMeasurement
{
    private int idUnitMeasurement;
    private String description;
    private boolean status;

    public int getIdUnitMeasurement()
    {
        return idUnitMeasurement;
    }

    public void setIdUnitMeasurement( int idUnitMeasurement )
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