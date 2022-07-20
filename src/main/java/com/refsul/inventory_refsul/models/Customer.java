package com.refsul.inventory_refsul.models;

public class Customer
{
    private Integer idCustomer;
    private PersonalInformation personalInformation;

    public Customer() {}

    public Integer getIdCustomer()
    {
        return idCustomer;
    }
    public void setIdCustomer( Integer idCustomer )
    {
        this.idCustomer = idCustomer;
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