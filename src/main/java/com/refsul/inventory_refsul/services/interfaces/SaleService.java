package com.refsul.inventory_refsul.services.interfaces;

import com.refsul.inventory_refsul.models.Sales;

import java.sql.SQLException;

public interface SaleService extends ServiceCrud<Sales>
{
    int getLastId() throws SQLException;
    String getLastFolio() throws SQLException;
}