package com.refsul.inventory_refsul.models.purchase;

public class Product
{
    private Integer idProduct;
    private String name;
    private String description;
    private Double price;
    private Integer stock;
    private Boolean status;
    private Integer idUnitMeasurement;
    private String unitMeasurementDescription;
    private Integer idBrand;
    private String brandDescription;
    private Integer idProvider;
    private String providerName;

    public Integer getIdProduct()
    {
        return idProduct;
    }

    public void setIdProduct( Integer idProduct )
    {
        this.idProduct = idProduct;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock()
    {
        return stock;
    }

    public void setStock( Integer stock )
    {
        this.stock = stock;
    }

    public Boolean getStatus()
    {
        return status;
    }

    public void setStatus( Boolean status )
    {
        this.status = status;
    }

    public Integer getIdUnitMeasurement()
    {
        return idUnitMeasurement;
    }

    public void setIdUnitMeasurement( Integer idUnitMeasurement )
    {
        this.idUnitMeasurement = idUnitMeasurement;
    }

    public String getUnitMeasurementDescription()
    {
        return unitMeasurementDescription;
    }

    public void setUnitMeasurementDescription( String unitMeasurementDescription )
    {
        this.unitMeasurementDescription = unitMeasurementDescription;
    }

    public Integer getIdBrand()
    {
        return idBrand;
    }

    public void setIdBrand( Integer idBrand )
    {
        this.idBrand = idBrand;
    }

    public String getBrandDescription()
    {
        return brandDescription;
    }

    public void setBrandDescription( String brandDescription )
    {
        this.brandDescription = brandDescription;
    }

    public Integer getIdProvider()
    {
        return idProvider;
    }

    public void setIdProvider( Integer idProvider )
    {
        this.idProvider = idProvider;
    }

    public String getProviderName()
    {
        return providerName;
    }

    public void setProviderName( String providerName )
    {
        this.providerName = providerName;
    }
}