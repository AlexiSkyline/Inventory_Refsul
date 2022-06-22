package com.refsul.inventory_refsul.models.Staff;

public class Customer extends PersonalInformation
{
    private int idCustomer;

    public Customer() {}

    public int getIdCustomer()
    {
        return idCustomer;
    }
    public void setIdCustomer( int idCustomer )
    {
        this.idCustomer = idCustomer;
    }
}