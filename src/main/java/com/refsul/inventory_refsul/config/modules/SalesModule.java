package com.refsul.inventory_refsul.config.modules;

import com.refsul.inventory_refsul.controllers.SalesController;
import com.refsul.inventory_refsul.repository.implementsRepository.SalesRepositoryImpl;
import com.refsul.inventory_refsul.repository.interfaces.SalesRepository;
import com.refsul.inventory_refsul.services.implementService.SaleServiceImpl;
import com.refsul.inventory_refsul.services.interfaces.SaleService;
import dagger.Module;
import dagger.Provides;

@Module
public class SalesModule {
    @Provides SalesRepository provideSalesRepository() {
        return new SalesRepositoryImpl();
    }

    @Provides SaleService provideSaleService(SalesRepository salesRepository) {
        return new SaleServiceImpl(salesRepository);
    }

    @Provides SalesController provideSalesController(SaleService service) {
        return new SalesController(service);
    }
}