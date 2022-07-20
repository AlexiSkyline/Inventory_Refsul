package com.refsul.inventory_refsul.models;

public class Seller
{
    private Integer idSeller;
    private String userName;
    private String password;
    private PersonalInformation personalInformation;

    public Seller()
    {}

    public Integer getIdSeller()
    {
        return idSeller;
    }

    public void setIdSeller( Integer idSeller )
    {
        this.idSeller = idSeller;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName( String userName )
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
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