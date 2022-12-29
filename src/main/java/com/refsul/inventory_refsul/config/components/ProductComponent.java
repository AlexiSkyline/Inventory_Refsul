package com.refsul.inventory_refsul.config.components;

import com.refsul.inventory_refsul.config.modules.*;
import com.refsul.inventory_refsul.view.internalsFrame.UIProduct;
import dagger.Component;

@Component(modules = {ProductModule.class, UnitMeasurementModule.class,
        BrandModule.class, ProviderModule.class, PersonalInformationModule.class})
public interface ProductComponent {
    UIProduct buildUIProduct();
}
