package com.refsul.inventory_refsul.services.implementService;

import com.refsul.inventory_refsul.models.Brand;
import com.refsul.inventory_refsul.repository.interfaces.CrudRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith( MockitoExtension.class )
class BrandServiceImplTest
{
    @Mock
    CrudRepository<Brand> repository;

    @InjectMocks
    BrandServiceImpl service;

    private BrandData brandData = new BrandData();

    private List<Brand> brandsList;
    private List<Brand> brandListEmpty;

    @BeforeEach
    void initMethod() {
        this.brandsList = Arrays.asList(  brandData.audi, brandData.mazada, brandData.toyota );
        this.brandListEmpty = Collections.emptyList();
    }

    @Nested
    @DisplayName( "Test for the method findAllBrand")
    class findAllBrandTest
    {
        @Test
        @DisplayName( "Testing when there are marks" )
        void getAllBrand() throws SQLException
        {
            when( repository.findAll() ).thenReturn( brandsList );
            List<Brand> brandDBMock = service.findAll();

            assertEquals( brandsList.size() , brandDBMock.size() );
            assertTrue( !brandDBMock.isEmpty() );
            assertEquals( brandsList.get(1), brandDBMock.get(1) );
        }

        @Test
        @DisplayName( "Testing when there are no marks" )
        void getListEmpty() throws SQLException
        {
            when( repository.findAll() ).thenReturn( brandListEmpty );
            List<Brand> brandDBMock = service.findAll();

            assertEquals( 0, brandDBMock.size() );
            assertTrue( brandDBMock.isEmpty() );
            assertArrayEquals( brandListEmpty.toArray(), brandDBMock.toArray() );
        }
    }

    @Nested
    @DisplayName( "Test for the method findByIdBrand" )
    class findByIdBrandTest {
        @Test
        @DisplayName( "Searching for existing Brand" )
        void findByIdBrandExisting() throws SQLException
        {
            when( repository.findById( 2 ) ).thenReturn( Optional.ofNullable( brandsList.get(1) ) );
            Optional<Brand> findMazada = service.findById( 2 );
            Brand expectedBrand = brandData.mazada;

            assertTrue( findMazada.isPresent() );
            assertFalse( findMazada.isEmpty() );
            assertTrue( findMazada.get().equals( expectedBrand ) );
            assertEquals( expectedBrand.getIdBrand(), findMazada.get().getIdBrand() );
            assertEquals( expectedBrand.getDescription(), findMazada.get().getDescription() );
        }

        @Test
        @DisplayName( "Search for not existing Brand" )
        void findByIdBrandNotExisting() throws SQLException
        {
            when( repository.findById( anyInt() ) ).thenReturn( Optional.empty() );
            Optional<Brand> anyBrand = service.findById( 10 );

            assertFalse( anyBrand.isPresent() );
            assertTrue( anyBrand.isEmpty() );
        }

        @Test
        @DisplayName( "Search Brand with empty list")
        void findByIdBrandEmptyList() throws SQLException
        {
            when( repository.findById( anyInt() ) ).thenReturn( brandListEmpty.stream().findFirst() );
            Optional<Brand> anyBrand = service.findById( anyInt() );

            assertFalse( anyBrand.isPresent() );
            assertTrue( anyBrand.isEmpty() );
        }
    }

    @Nested
    @DisplayName( "Test for the method CreateBrand" )
    class createBrand
    {
        @Test
        @DisplayName( "Create Brand" )
        void createBrandEmptyList() throws SQLException
        {
            Brand porche = new Brand();
            porche.setDescription( "Porche" );
            doNothing().when( repository ).create( any( Brand.class ) );
            service.create( porche );

            verify( repository, times(1 ) ).create( any( Brand.class ) );
        }
    }

    @Nested
    @DisplayName( "Test for the updateBrand" )
    class updateBrand
    {
        @Test
        @DisplayName( "Update Brand" )
        void createBrandEmptyList() throws SQLException
        {
            Brand updateMazda = brandData.mazada;
            updateMazda.setDescription( "MAZDA" );
            doNothing().when( repository ).update( any( Brand.class ) );
            service.update( updateMazda );

            verify( repository, times(1 ) ).update( any( Brand.class ) );
        }
    }

    @Nested
    @DisplayName( "Test for the deleteBrand" )
    class deleteBrand
    {
        @Test
        @DisplayName( "Update Brand" )
        void createBrandEmptyList() throws SQLException
        {
            doNothing().when( repository ).delete( anyInt() );
            service.delete( 1 );

            verify( repository, times(1 ) ).delete( anyInt() );
        }
    }
}