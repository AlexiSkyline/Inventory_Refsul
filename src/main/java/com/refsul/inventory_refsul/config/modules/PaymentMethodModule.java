package com.refsul.inventory_refsul.config.modules;

import com.refsul.inventory_refsul.controllers.PaymentMethodController;
import com.refsul.inventory_refsul.models.PaymentMethod;
import com.refsul.inventory_refsul.repository.implementsRepository.PaymentMethodRepositoryImpl;
import com.refsul.inventory_refsul.repository.interfaces.CrudRepository;
import com.refsul.inventory_refsul.services.implementService.PaymentMethodServiceImpl;
import com.refsul.inventory_refsul.services.interfaces.PaymentMethodService;
import com.refsul.inventory_refsul.view.internalsFrame.UIPaymentMethod;
import dagger.Module;
import dagger.Provides;

@Module
public class PaymentMethodModule {
    @Provides CrudRepository<PaymentMethod> providePaymentMethodRepository() {
        return new PaymentMethodRepositoryImpl();
    }

    @Provides PaymentMethodService providePaymentMethodService(CrudRepository<PaymentMethod> paymentMethodCrudRepository) {
        return new PaymentMethodServiceImpl(paymentMethodCrudRepository);
    }

    @Provides PaymentMethodController providePaymentMethodController(PaymentMethodService paymentMethodService) {
        return new PaymentMethodController(paymentMethodService);
    }

    @Provides UIPaymentMethod provideUIPaymentMethod(PaymentMethodController paymentMethodController) {
        return new UIPaymentMethod(paymentMethodController);
    }
}