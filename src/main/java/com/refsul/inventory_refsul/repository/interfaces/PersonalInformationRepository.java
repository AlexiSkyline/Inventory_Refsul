package com.refsul.inventory_refsul.repository.interfaces;

import com.refsul.inventory_refsul.models.PersonalInformation;

import java.sql.SQLException;

public interface PersonalInformationRepository extends CrudRepository<PersonalInformation>
{
    int getLastId() throws SQLException;
}