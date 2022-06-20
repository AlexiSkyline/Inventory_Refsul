package com.refsul.inventory_refsul.models.Staff;

public class PersonalInformation
{
    protected int idInformation;
    protected String names;
    protected String lastName;
    protected String rfc;
    protected String address;
    protected String email;
    protected String numberPhone;
    protected boolean status;

    public PersonalInformation() {}

    public int getIdInformation() 
    {
        return idInformation;
    }
    public void setIdInformation( int idInformation ) 
    {
        this.idInformation = idInformation;
    }

    public String getNames() 
    {
        return names;
    }
    public void setNames( String names ) 
    {
        this.names = names;
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

    public String getNumberPhone() {
        return numberPhone;
    }
    public void setNumberPhone( String numberPhone ) 
    {
        this.numberPhone = numberPhone;
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