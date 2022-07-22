package com.refsul.inventory_refsul.repository.interfaces;

import com.refsul.inventory_refsul.models.Sales;

import java.sql.SQLException;

public interface SalesRepository extends CrudRepository<Sales>
{
    int getLastId() throws SQLException;
    String getLastFolio() throws SQLException;
}