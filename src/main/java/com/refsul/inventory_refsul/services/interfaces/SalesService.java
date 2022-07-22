package com.refsul.inventory_refsul.services.interfaces;

import com.refsul.inventory_refsul.models.Sales;

import java.sql.SQLException;

public interface SalesService extends ServiceCrud<Sales>
{
    int getLastId() throws SQLException;
    String getLastFolio() throws SQLException;
}