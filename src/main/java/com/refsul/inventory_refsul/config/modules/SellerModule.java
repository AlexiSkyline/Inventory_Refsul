package com.refsul.inventory_refsul.config.modules;

import com.refsul.inventory_refsul.controllers.SellerController;
import com.refsul.inventory_refsul.repository.implementsRepository.SellerRepositoryImpl;
import com.refsul.inventory_refsul.repository.interfaces.SellerRepository;
import com.refsul.inventory_refsul.services.implementService.SellerServiceImpl;
import com.refsul.inventory_refsul.services.interfaces.PersonalInformationService;
import com.refsul.inventory_refsul.services.interfaces.SellerService;
import com.refsul.inventory_refsul.view.internalsFrame.UISeller;
import dagger.Module;
import dagger.Provides;

@Module
public class SellerModule {
    @Provides
    public SellerRepository provideSellerRepository() {
        return new SellerRepositoryImpl();
    }

    @Provides
    public SellerService provideSellerService(SellerRepository sellerRepository) {
        return new SellerServiceImpl(sellerRepository);
    }

    @Provides
    public SellerController provideSellerController(SellerService sellerService, PersonalInformationService personalInformationService) {
        return new SellerController(sellerService, personalInformationService);
    }

    @Provides
    public UISeller provideUISeller(SellerController sellerController) {
        return new UISeller(sellerController);
    }
}