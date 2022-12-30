package com.refsul.inventory_refsul.services.implementService.data;

import com.refsul.inventory_refsul.models.Brand;

import java.util.Arrays;
import java.util.List;

public class BrandData
{
    public Brand audi = new Brand();
    public Brand mazada = new Brand();
    public Brand toyota = new Brand();

    public BrandData() {
        audi.setIdBrand( 1 );
        audi.setDescription( "Audi" );
        audi.setStatus( true );

        mazada.setIdBrand( 2 );
        mazada.setDescription( "Mazda" );
        mazada.setStatus( true );

        toyota.setIdBrand( 3 );
        toyota.setDescription( "Toyota" );
        toyota.setStatus( true );
    }
}
