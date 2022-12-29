package com.refsul.inventory_refsul.config.components;

import com.refsul.inventory_refsul.config.modules.UnitMeasurementModule;
import com.refsul.inventory_refsul.view.internalsFrame.UIUnitMeasurement;
import dagger.Component;

@Component(modules = UnitMeasurementModule.class)
public interface UnitMeasurementComponent {
    UIUnitMeasurement buildUIUnitMeasurement();
}