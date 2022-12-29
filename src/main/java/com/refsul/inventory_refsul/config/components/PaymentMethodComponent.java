package com.refsul.inventory_refsul.config.components;

import com.refsul.inventory_refsul.config.modules.PaymentMethodModule;
import com.refsul.inventory_refsul.view.internalsFrame.UIPaymentMethod;
import dagger.Component;

@Component(modules = PaymentMethodModule.class)
public interface PaymentMethodComponent {
    UIPaymentMethod buildUIPaymentMethod();
}
