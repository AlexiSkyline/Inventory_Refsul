package com.refsul.inventory_refsul.models;

public class SalesInformation
{
    private Integer idSalesInformation;
    private Integer quantityProduct;
    private Double totalPrice;
    private Integer idSale;
    private Integer idProduct;

    public Integer getIdSalesInformation()
    {
        return idSalesInformation;
    }

    public void setIdSalesInformation( Integer idSalesInformation )
    {
        this.idSalesInformation = idSalesInformation;
    }

    public Integer getQuantityProduct()
    {
        return quantityProduct;
    }

    public void setQuantityProduct( Integer quantityProduct )
    {
        this.quantityProduct = quantityProduct;
    }

    public Double getTotalPrice()
    {
        return totalPrice;
    }

    public void setTotalPrice( Double totalPrice )
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