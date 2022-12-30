package com.refsul.inventory_refsul.services.implementService.data;

import com.refsul.inventory_refsul.models.Customer;
import com.refsul.inventory_refsul.models.PersonalInformation;

public class CustomerData {
    public static Customer CustomerCarlos = new Customer();
    public static Customer CustomerAlexis = new Customer();

    static {
        PersonalInformation personalInformationCarlos = new PersonalInformation();
        personalInformationCarlos.setIdInformation(1);
        personalInformationCarlos.setName("Carlos Manuel");
        personalInformationCarlos.setLastName("Herrera López");
        personalInformationCarlos.setRfc("LOHC221212MK4");
        personalInformationCarlos.setAddress("col.lomas #13");
        personalInformationCarlos.setEmail("carlos@hotmail.com");
        personalInformationCarlos.setPhoneNumber("9671234567");

        PersonalInformation personalInformationAlexis = new PersonalInformation();
        personalInformationAlexis.setIdInformation(2);
        personalInformationAlexis.setName("Alexis");
        personalInformationAlexis.setLastName("López Gómez");
        personalInformationAlexis.setRfc("LOGA221212MK4");
        personalInformationAlexis.setAddress("col.cristal #13");
        personalInformationAlexis.setEmail("Alexis@hotmail.com");
        personalInformationAlexis.setPhoneNumber("9671234599");

        CustomerCarlos.setIdCustomer(1);
        CustomerCarlos.setPersonalInformation(personalInformationCarlos);

        CustomerAlexis.setIdCustomer(2);
        CustomerAlexis.setPersonalInformation(personalInformationAlexis);
    }
}