package com.refsul.inventory_refsul.services.interfaces;

import com.refsul.inventory_refsul.models.PersonalInformation;

import java.sql.SQLException;

public interface PersonalInformationService extends ServiceCrud<PersonalInformation>
{
    int getLastId() throws SQLException;
}