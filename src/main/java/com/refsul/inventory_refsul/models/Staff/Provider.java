package com.refsul.inventory_refsul.models.Staff;

public class Provider extends PersonalInformation
{
    private Integer idProvider;

    public Provider() {}

    public Integer getIdProvider() 
    {
        return idProvider;
    }

    public void setIdProvider( Integer idProvider ) 
    {
        this.idProvider = idProvider;
    }
}