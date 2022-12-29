package com.refsul.inventory_refsul.config.modules;

import com.refsul.inventory_refsul.controllers.BrandController;
import com.refsul.inventory_refsul.controllers.ProductController;
import com.refsul.inventory_refsul.controllers.ProviderController;
import com.refsul.inventory_refsul.controllers.UnitMeasurementController;
import com.refsul.inventory_refsul.repository.implementsRepository.ProductRepositoryImpl;
import com.refsul.inventory_refsul.repository.interfaces.ProductRepository;
import com.refsul.inventory_refsul.services.implementService.ProductServiceImpl;
import com.refsul.inventory_refsul.services.interfaces.ProductService;
import com.refsul.inventory_refsul.view.internalsFrame.UIProduct;
import dagger.Module;
import dagger.Provides;

@Module
public class ProductModule {
    @Provides ProductRepository provideProductRepository() {
        return new ProductRepositoryImpl();
    }

    @Provides ProductService provideProductService(ProductRepository productRepository) {
        return new ProductServiceImpl(productRepository);
    }

    @Provides ProductController provideProductController(ProductService service) {
        return new ProductController(service);
    }

    @Provides
    UIProduct provideUIProvider(ProductController productController, UnitMeasurementController unitMeasurementController,
                                BrandController brandController, ProviderController providerController) {
        return new UIProduct(productController, unitMeasurementController,
                brandController, providerController);
    }
}