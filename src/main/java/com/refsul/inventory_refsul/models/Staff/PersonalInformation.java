package com.refsul.inventory_refsul.models.Staff;

public class PersonalInformation
{
    protected Integer idInformation;
    protected String name;
    protected String lastName;
    protected String rfc;
    protected String address;
    protected String email;
    protected String phoneNumber;
    protected boolean status;

    public PersonalInformation() {}

    public Integer getIdInformation() 
    {
        return idInformation;
    }
    public void setIdInformation( Integer idInformation ) 
    {
        this.idInformation = idInformation;
    }

    public String getName()
    {
        return name;
    }
    public void setName( String name )
    {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName( String lastName ) 
    {
        this.lastName = lastName;
    }

    public String getRfc() 
    {
        return rfc;
    }
    public void setRfc( String rfc ) 
    {
        this.rfc = rfc;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress( String address ) 
    {
        this.address = address;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setEmail( String email ) 
    {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber( String phoneNumber )
    {
        this.phoneNumber = phoneNumber;
    }

    public boolean getStatus() 
    {
        return status;
    }
    public void setStatus( boolean status ) 
    {
        this.status = status;
    }
}