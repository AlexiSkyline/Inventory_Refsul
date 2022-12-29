package com.refsul.inventory_refsul.config.modules;

import com.refsul.inventory_refsul.controllers.BrandController;
import com.refsul.inventory_refsul.models.Brand;
import com.refsul.inventory_refsul.repository.implementsRepository.BrandRepositoryImpl;
import com.refsul.inventory_refsul.repository.interfaces.CrudRepository;
import com.refsul.inventory_refsul.services.implementService.BrandServiceImpl;
import com.refsul.inventory_refsul.services.interfaces.BrandService;
import com.refsul.inventory_refsul.view.internalsFrame.UIBrand;
import dagger.Module;
import dagger.Provides;

@Module
public class BrandModule {
    @Provides
    public CrudRepository<Brand> provideBrandRepository() {
        return new BrandRepositoryImpl();
    }

    @Provides
    public BrandService provideBrandService(CrudRepository<Brand> brandCrudRepository) {
        return new BrandServiceImpl(brandCrudRepository);
    }

    @Provides
    public BrandController provideBrandController(BrandService brandService) {
        return new BrandController(brandService);
    }

    @Provides
    public UIBrand provideUIBrand(BrandController brandController) {
        return new UIBrand(brandController);
    }
}
