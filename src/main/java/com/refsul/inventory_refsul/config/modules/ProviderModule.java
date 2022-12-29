package com.refsul.inventory_refsul.config.modules;

import com.refsul.inventory_refsul.controllers.ProviderController;
import com.refsul.inventory_refsul.models.Provider;
import com.refsul.inventory_refsul.repository.implementsRepository.ProviderRepositoryImpl;
import com.refsul.inventory_refsul.repository.interfaces.CrudRepository;
import com.refsul.inventory_refsul.services.implementService.ProviderServiceImpl;
import com.refsul.inventory_refsul.services.interfaces.PersonalInformationService;
import com.refsul.inventory_refsul.services.interfaces.ProviderService;
import com.refsul.inventory_refsul.view.internalsFrame.UIProvider;
import dagger.Module;
import dagger.Provides;

@Module
public class ProviderModule {
    @Provides
    public CrudRepository<Provider> providerProviderRepository() {
        return new ProviderRepositoryImpl();
    }

    @Provides
    public ProviderService providerService(CrudRepository<Provider> providerCrudRepository) {
        return new ProviderServiceImpl(providerCrudRepository);
    }

    @Provides
    public ProviderController providerController(ProviderService providerService, PersonalInformationService personalInformationService) {
        return new ProviderController(providerService, personalInformationService);
    }

    @Provides
    public UIProvider providerUIProvider(ProviderController providerController) {
        return new UIProvider(providerController);
    }
}