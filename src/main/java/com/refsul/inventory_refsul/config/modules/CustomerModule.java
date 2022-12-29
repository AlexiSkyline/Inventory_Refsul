package com.refsul.inventory_refsul.config.modules;

import com.refsul.inventory_refsul.controllers.CustomerController;
import com.refsul.inventory_refsul.models.Customer;
import com.refsul.inventory_refsul.repository.implementsRepository.CustomerRepositoryImpl;
import com.refsul.inventory_refsul.repository.interfaces.CrudRepository;
import com.refsul.inventory_refsul.services.implementService.CustomerServiceImpl;
import com.refsul.inventory_refsul.services.interfaces.CustomerService;
import com.refsul.inventory_refsul.services.interfaces.PersonalInformationService;
import com.refsul.inventory_refsul.view.internalsFrame.UICustomer;
import dagger.Module;
import dagger.Provides;

@Module
public class CustomerModule {
    @Provides CrudRepository<Customer> provideCustomerRepository() {
        return new CustomerRepositoryImpl();
    }

    @Provides CustomerService provideCustomerService(CrudRepository<Customer> customerCrudRepository) {
        return new CustomerServiceImpl(customerCrudRepository);
    }

    @Provides CustomerController provideCustomerController(CustomerService customerService, PersonalInformationService personalInformationService) {
        return new CustomerController(customerService, personalInformationService);
    }

    @Provides UICustomer provideUICustomer(CustomerController customerController) {
        return new UICustomer(customerController);
    }
}