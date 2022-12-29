package com.refsul.inventory_refsul.config.components;

import com.refsul.inventory_refsul.config.modules.CustomerModule;
import com.refsul.inventory_refsul.config.modules.PersonalInformationModule;
import com.refsul.inventory_refsul.view.internalsFrame.UICustomer;
import dagger.Component;

@Component(modules = {CustomerModule.class, PersonalInformationModule.class})
public interface CustomerComponent {
    UICustomer buildUISeller();
}
