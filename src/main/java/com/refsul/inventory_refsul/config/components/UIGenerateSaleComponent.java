package com.refsul.inventory_refsul.config.components;

import com.refsul.inventory_refsul.config.modules.*;
import com.refsul.inventory_refsul.view.internalsFrame.UIGenerateSale;
import dagger.Component;

@Component(modules = {SalesModule.class, CustomerModule.class, SellerModule.class, ProviderModule.class,
        PaymentMethodModule.class, PersonalInformationModule.class, ProductModule.class})
public interface UIGenerateSaleComponent {
    UIGenerateSale buildUIGenerateSale();
}