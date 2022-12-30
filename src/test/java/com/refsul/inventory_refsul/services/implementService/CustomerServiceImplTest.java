package com.refsul.inventory_refsul.services.implementService;

import com.refsul.inventory_refsul.models.Customer;
import com.refsul.inventory_refsul.repository.interfaces.CrudRepository;
import com.refsul.inventory_refsul.services.implementService.data.CustomerData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith( MockitoExtension.class )
class CustomerServiceImplTest {
    @Mock
    CrudRepository<Customer> repository;

    @InjectMocks
    CustomerServiceImpl service;

    private List<Customer> customersList;


    @BeforeEach
    void setUp() {
        this.customersList = Arrays.asList(CustomerData.CustomerCarlos, CustomerData.CustomerAlexis);
    }

    @Test
    @DisplayName( "Test when using the findAll method in Customer" )
    void findAll() throws SQLException
    {
        when( repository.findAll() ).thenReturn( customersList );
        List<Customer> customersDBMock = service.findAll();

        assertEquals(customersDBMock.size(), customersList.size());
        assertFalse(customersDBMock.isEmpty());

        Customer carlos = customersDBMock.get(0);
        assertEquals(carlos.getIdCustomer(), 1);
        assertSame(carlos.getPersonalInformation().getName(),
                CustomerData.CustomerCarlos.getPersonalInformation().getName());

        Customer alexis = customersDBMock.get(1);
        assertEquals(alexis.getIdCustomer(), 2);
        assertSame(alexis.getPersonalInformation().getName(),
                CustomerData.CustomerAlexis.getPersonalInformation().getName());
    }

    @Test
    @DisplayName( "Test when using the findById method in Customer" )
    void findById() throws SQLException {
        when( repository.findById(anyInt())).thenReturn(Optional.ofNullable(CustomerData.CustomerAlexis));
        Optional<Customer> findAlexis = service.findById(anyInt());
        Customer AlexisInfo = findAlexis.get();

        assertTrue(findAlexis.isPresent());
        assertFalse(findAlexis.isEmpty());
        assertEquals(AlexisInfo.getIdCustomer(), CustomerData.CustomerAlexis.getIdCustomer());
        assertEquals(AlexisInfo.getPersonalInformation().getName(),
                CustomerData.CustomerAlexis.getPersonalInformation().getName());
    }

    @Test
    @DisplayName( "Test for the method Create Customer" )
    void create() throws SQLException {
        Customer newCustomer = CustomerData.CustomerAlexis;
        service.create(newCustomer);
        verify(repository).create(newCustomer);
        verify(repository,times(1)).create(any(Customer.class));
    }

    @Test
    @DisplayName( "Test for the method update Customer" )
    void update() throws SQLException {
        Customer updateCustomer = CustomerData.CustomerAlexis;
        service.update(updateCustomer);
        verify(repository).update(updateCustomer);
        verify(repository,times(1)).update(any(Customer.class));
    }

    @Test
    @DisplayName( "Test for the method delete Customer" )
    void delete() throws SQLException {
        service.delete(anyInt());
        verify(repository).delete(anyInt());
        verify(repository,times(1)).delete(anyInt());
    }
}