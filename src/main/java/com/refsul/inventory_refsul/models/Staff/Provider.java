package com.refsul.inventory_refsul.models.Staff;

public class Provider extends PersonalInformation
{
    private int idProvider;

    public Provider() {}

    public int getIdProvider() 
    {
        return idProvider;
    }

    public void setIdProvider( int idProvider ) 
    {
        this.idProvider = idProvider;
    }
}