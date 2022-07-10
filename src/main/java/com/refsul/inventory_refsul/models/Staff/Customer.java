package com.refsul.inventory_refsul.models.Staff;

public class Customer extends PersonalInformation
{
    private Integer idCustomer;

    public Customer() {}

    public Integer getIdCustomer()
    {
        return idCustomer;
    }
    public void setIdCustomer( Integer idCustomer )
    {
        this.idCustomer = idCustomer;
    }
}