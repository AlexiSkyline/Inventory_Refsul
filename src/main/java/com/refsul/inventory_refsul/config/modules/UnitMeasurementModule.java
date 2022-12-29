package com.refsul.inventory_refsul.config.modules;

import com.refsul.inventory_refsul.controllers.UnitMeasurementController;
import com.refsul.inventory_refsul.models.UnitMeasurement;
import com.refsul.inventory_refsul.repository.implementsRepository.UnitMeasurementRepositoryImpl;
import com.refsul.inventory_refsul.repository.interfaces.CrudRepository;
import com.refsul.inventory_refsul.services.implementService.UnitMeasurementServiceImpl;
import com.refsul.inventory_refsul.services.interfaces.UnitMeasurementService;
import com.refsul.inventory_refsul.view.internalsFrame.UIUnitMeasurement;
import dagger.Module;
import dagger.Provides;

@Module
public class UnitMeasurementModule {
    @Provides CrudRepository<UnitMeasurement> provideUnitMeasurementRepository() {
        return new UnitMeasurementRepositoryImpl();
    }

    @Provides UnitMeasurementService provideUnitMeasurementService(CrudRepository<UnitMeasurement> unitMeasurementCrudRepository) {
        return new UnitMeasurementServiceImpl(unitMeasurementCrudRepository);
    }

    @Provides UnitMeasurementController provideUnitMeasurementController(UnitMeasurementService unitMeasurementService) {
        return new UnitMeasurementController(unitMeasurementService);
    }

    @Provides UIUnitMeasurement providerUIUnitMeasurement(UnitMeasurementController unitMeasurementController) {
        return new UIUnitMeasurement(unitMeasurementController);
    }
}