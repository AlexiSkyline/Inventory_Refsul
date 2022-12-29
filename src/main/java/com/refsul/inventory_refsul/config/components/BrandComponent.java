package com.refsul.inventory_refsul.config.components;

import com.refsul.inventory_refsul.config.modules.BrandModule;
import com.refsul.inventory_refsul.view.internalsFrame.UIBrand;
import dagger.Component;

@Component(modules = BrandModule.class)
public interface BrandComponent {
    UIBrand buildUIBrand();
}