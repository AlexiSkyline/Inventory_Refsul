package com.refsul.inventory_refsul.models;

public class Provider
{
    private Integer idProvider;
    private PersonalInformation personalInformation;
    public Provider() {}

    public Integer getIdProvider() 
    {
        return idProvider;
    }

    public void setIdProvider( Integer idProvider ) 
    {
        this.idProvider = idProvider;
    }

    public PersonalInformation getPersonalInformation()
    {
        return personalInformation;
    }

    public void setPersonalInformation( PersonalInformation personalInformation )
    {
        this.personalInformation = personalInformation;
    }
}