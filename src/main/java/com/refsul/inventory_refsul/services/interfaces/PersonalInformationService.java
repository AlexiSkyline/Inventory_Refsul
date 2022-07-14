package com.refsul.inventory_refsul.services.interfaces;

import java.sql.SQLException;

public interface PersonalInformationService<PersonalInformation> extends ServiceCrud<PersonalInformation>
{
    int getLastId() throws SQLException;
}