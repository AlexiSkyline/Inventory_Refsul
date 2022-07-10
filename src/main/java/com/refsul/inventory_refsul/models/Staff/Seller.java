package com.refsul.inventory_refsul.models.Staff;

public class Seller extends PersonalInformation
{
    private Integer idSeller;
    private String userName;
    private String password;

    public Seller() {}

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
}