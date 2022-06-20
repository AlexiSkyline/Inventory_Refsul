package com.refsul.inventory_refsul.models.Business;

public class SaleInformation
{
    private int idInformation;
    private int quantityProduct;
    private double totalPrice;
    private int idSale;
    private int idProduct;

    public int getIdInformation()
    {
        return idInformation;
    }
    public void setIdInformation( int idInformation )
    {
        this.idInformation = idInformation;
    }
    public int getQuantityProduct()
    {
        return quantityProduct;
    }
    public void setQuantityProduct( int quantityProduct )
    {
        this.quantityProduct = quantityProduct;
    }

    public double getTotalPrice()
    {
        return totalPrice;
    }
    public void setTotalPrice( double totalPrice )
    {
        this.totalPrice = totalPrice;
    }

    public int getIdSale()
    {
        return idSale;
    }
    public void setIdSale( int idSale )
    {
        this.idSale = idSale;
    }

    public int getIdProduct()
    {
        return idProduct;
    }
    public void setIdProduct( int idProduct )
    {
        this.idProduct = idProduct;
    }
}