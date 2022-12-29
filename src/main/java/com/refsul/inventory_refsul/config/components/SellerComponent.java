package com.refsul.inventory_refsul.config.components;

import com.refsul.inventory_refsul.config.modules.PersonalInformationModule;
import com.refsul.inventory_refsul.config.modules.SellerModule;
import com.refsul.inventory_refsul.controllers.SellerController;
import com.refsul.inventory_refsul.view.internalsFrame.UISeller;
import dagger.Component;

@Component(modules = {SellerModule.class, PersonalInformationModule.class})
public interface SellerComponent {
    SellerController buildSellerController();
    UISeller buildUISeller();
}