package com.refsul.inventory_refsul.repository.interfaces;

import java.sql.SQLException;

public interface PersonalInformationRepository<PersonalInformation> extends CrudRepository<PersonalInformation>
{
    int getLastId() throws SQLException;
}