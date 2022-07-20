package com.refsul.inventory_refsul.models;

public class SaleInformation
{
    private Integer idInformation;
    private Integer quantityProduct;
    private double totalPrice;
    private Integer idSale;
    private Integer idProduct;

    public Integer getIdInformation()
    {
        return idInformation;
    }
    public void setIdInformation( Integer idInformation )
    {
        this.idInformation = idInformation;
    }
    public Integer getQuantityProduct()
    {
        return quantityProduct;
    }
    public void setQuantityProduct( Integer quantityProduct )
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

    public Integer getIdSale()
    {
        return idSale;
    }
    public void setIdSale( Integer idSale )
    {
        this.idSale = idSale;
    }

    public Integer getIdProduct()
    {
        return idProduct;
    }
    public void setIdProduct( Integer idProduct )
    {
        this.idProduct = idProduct;
    }
}