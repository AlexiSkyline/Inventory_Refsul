package com.refsul.inventory_refsul.config.modules;

import com.refsul.inventory_refsul.repository.implementsRepository.PersonalInfoRepositoryImpl;
import com.refsul.inventory_refsul.repository.interfaces.PersonalInformationRepository;
import com.refsul.inventory_refsul.services.implementService.PersonalInformationServiceImpl;
import com.refsul.inventory_refsul.services.interfaces.PersonalInformationService;
import dagger.Module;
import dagger.Provides;

@Module
public class PersonalInformationModule {
    @Provides
    public PersonalInformationRepository providePersonalInformationRepository() {
        return new PersonalInfoRepositoryImpl();
    }

    @Provides
    public PersonalInformationService providePersonalInformationService(PersonalInformationRepository personalInformationRepository) {
        return new PersonalInformationServiceImpl(personalInformationRepository);
    }
}