package com.refsul.inventory_refsul.config.components;

import com.refsul.inventory_refsul.config.modules.PersonalInformationModule;
import com.refsul.inventory_refsul.config.modules.ProviderModule;
import com.refsul.inventory_refsul.view.internalsFrame.UIProvider;
import dagger.Component;

@Component(modules = {ProviderModule.class, PersonalInformationModule.class})
public interface ProviderComponent {
    UIProvider buildUIProvider();
}