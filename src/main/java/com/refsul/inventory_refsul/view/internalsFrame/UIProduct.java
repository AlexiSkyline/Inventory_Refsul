package com.refsul.inventory_refsul.view.internalsFrame;

import com.refsul.inventory_refsul.controllers.ProductController;
import com.refsul.inventory_refsul.controllers.ProviderController;
import com.refsul.inventory_refsul.controllers.UnitMeasurementController;
import com.refsul.inventory_refsul.models.Brand;
import com.refsul.inventory_refsul.models.Product;
import com.refsul.inventory_refsul.controllers.BrandController;
import com.refsul.inventory_refsul.models.Provider;
import com.refsul.inventory_refsul.models.UnitMeasurement;
import com.refsul.inventory_refsul.view.validators.ItemForm;
import com.refsul.inventory_refsul.view.validators.validationOptions.LengthValidator;
import com.refsul.inventory_refsul.view.validators.validationOptions.NumberValidator;
import com.refsul.inventory_refsul.view.validators.validationOptions.RequiredValidator;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UIProduct extends javax.swing.JInternalFrame {
    ProductController productController;
    UnitMeasurementController unitMeasurementController;
    BrandController brandController;
    ProviderController providerController;
    DefaultTableModel tableModel;
    Product product;
    List<Provider> providers;
    List<Brand> brands;
    List<UnitMeasurement> unitMeasurements;
    private int idProduct;
    private int idUnitMeasurement;
    private int idBrand;
    private int idProvider;

    public UIProduct() {
        initComponents();
        this.setResizable( false );

        this.productController = new ProductController();
        this.unitMeasurementController = new UnitMeasurementController();
        //this.brandController = brandController;
        //this.providerController = new ProviderController();
        this.tableModel = new DefaultTableModel();
        this.product = new Product();

        this.providers = new ArrayList<>();
        this.brands = new ArrayList<>();
        this.unitMeasurements = new ArrayList<>();

        this.idProduct = 0;
        
        this.cleanListProducts();
        try {
            this.showListProduct();
            this.showUnitMeasurementInCombobox();
            this.showBrandInCombobox();
            this.showProvidersInCombobox();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        this.disableButtonUpdateAndDelete();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel01 = new javax.swing.JPanel();
        jLabel01 = new javax.swing.JLabel();
        jLabel02 = new javax.swing.JLabel();
        jLabel03 = new javax.swing.JLabel();
        jLabel04 = new javax.swing.JLabel();
        jPanel02 = new javax.swing.JPanel();
        jLabel05 = new javax.swing.JLabel();
        jLabel06 = new javax.swing.JLabel();
        jLabel07 = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jLabel08 = new javax.swing.JLabel();
        jTextDescription = new javax.swing.JTextField();
        jLabel09 = new javax.swing.JLabel();
        jTextPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSpinnerStock = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxBrands = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        buttonAdd = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonCleanInput = new javax.swing.JButton();
        jComboBoxProviders = new javax.swing.JComboBox<>();
        jComboBoxUnitMeasurement = new javax.swing.JComboBox<>();
        jPanel03 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jPanel01.setBackground(new java.awt.Color(255, 255, 255));
        jPanel01.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LOGO44.gif"))); // NOI18N

        jLabel02.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel02.setText("Refaccioraria REFSUL");

        jLabel03.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel03.setText("En este apartado usted podrá Agregar nuevos Productos.");

        jLabel04.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel04.setText("También Editar su información y Eliminar ");

        javax.swing.GroupLayout jPanel01Layout = new javax.swing.GroupLayout(jPanel01);
        jPanel01.setLayout(jPanel01Layout);
        jPanel01Layout.setHorizontalGroup(
            jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel01Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel01)
                .addGap(35, 35, 35)
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel01Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel02))
                    .addGroup(jPanel01Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel04))
                    .addComponent(jLabel03))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel01Layout.setVerticalGroup(
            jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel01Layout.createSequentialGroup()
                        .addComponent(jLabel02)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel03)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel04))
                    .addComponent(jLabel01))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel02.setBackground(new java.awt.Color(255, 255, 255));
        jPanel02.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel05.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel05.setText("Llene todos los campos Para realizar cualquier acción");

        jLabel06.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel06.setText("Acciónes");

        jLabel07.setText("Nombre:");

        jTextName.setVerifyInputWhenFocusTarget(false);

        jLabel08.setText("Descripción:");

        jLabel09.setText("Precio:");

        jLabel10.setText("Stock:");

        jLabel11.setText("Unidad:");

        jLabel12.setText("Marca:");

        jComboBoxBrands.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marcas" }));

        jLabel14.setText("Proveedor:");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nuevo-producto.png"))); // NOI18N

        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        buttonAdd.setText("Agregar");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    buttonAddActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        buttonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editar.png"))); // NOI18N
        buttonUpdate.setText("Editar");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    buttonUpdateActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        buttonDelete.setText("Eliminar");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    buttonDeleteActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        buttonCleanInput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clean.png"))); // NOI18N
        buttonCleanInput.setText("Limpiar");
        buttonCleanInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCleanInputActionPerformed(evt);
            }
        });

        jComboBoxProviders.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proveedores" }));

        jComboBoxUnitMeasurement.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidades de Medida" }));

        javax.swing.GroupLayout jPanel02Layout = new javax.swing.GroupLayout(jPanel02);
        jPanel02.setLayout(jPanel02Layout);
        jPanel02Layout.setHorizontalGroup(
            jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel02Layout.createSequentialGroup()
                .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel02Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel07, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(jLabel09, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel02Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel02Layout.createSequentialGroup()
                        .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel05)
                            .addGroup(jPanel02Layout.createSequentialGroup()
                                .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(jTextName)
                                    .addComponent(jComboBoxUnitMeasurement, 0, 170, Short.MAX_VALUE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel08, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel02Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel02Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSpinnerStock)
                                            .addComponent(jComboBoxBrands, 0, 170, Short.MAX_VALUE))))))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel02Layout.createSequentialGroup()
                        .addComponent(jComboBoxProviders, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCleanInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel02Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel06)))
                .addGap(32, 32, 32)
                .addComponent(jLabel13)
                .addGap(29, 29, 29))
        );
        jPanel02Layout.setVerticalGroup(
            jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel02Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel05)
                    .addComponent(jLabel06))
                .addGap(18, 18, 18)
                .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel02Layout.createSequentialGroup()
                        .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel07, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel08, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel09, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinnerStock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jTextDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel02Layout.createSequentialGroup()
                        .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxUnitMeasurement, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxProviders, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel02Layout.createSequentialGroup()
                        .addComponent(jComboBoxBrands, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(buttonCleanInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel03.setBackground(new java.awt.Color(255, 255, 255));
        jPanel03.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Descripción", "Precio", "Stock", "Unidad", "Marca", "Preveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduct);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel20.setText("En este apartado podrás Visualizar la lista de Productos Registrados");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel21.setText("Seleccione una Columna a Editar o Eliminar");

        javax.swing.GroupLayout jPanel03Layout = new javax.swing.GroupLayout(jPanel03);
        jPanel03.setLayout(jPanel03Layout);
        jPanel03Layout.setHorizontalGroup(
            jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel03Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel03Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(299, 299, 299))
            .addGroup(jPanel03Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel03Layout.setVerticalGroup(
            jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel03Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel01, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel02, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean isValidInput()
    {
        ItemForm nameItem = new ItemForm( "Nombre", this.jTextName.getText() )
                .addValidador( new RequiredValidator() )
                .addValidador( new LengthValidator( 3, 15 ) );

        ItemForm descriptionItem = new ItemForm( "Descripción", this.jTextDescription.getText() )
                .addValidador( new RequiredValidator() )
                .addValidador( new LengthValidator( 5, 20 ) );

        ItemForm priceItem = new ItemForm( "Precio", this.jTextPrice.getText() )
                .addValidador( new RequiredValidator() )
                .addValidador( new NumberValidator() );

        ItemForm stockItem = new ItemForm( "Stock", this.jSpinnerStock.getValue().toString() )
                .addValidador( new RequiredValidator() )
                .addValidador( new NumberValidator() );

        String idUnitMeasurement = ( this.jComboBoxUnitMeasurement.getSelectedIndex() == 0 ) ? "" : this.jComboBoxUnitMeasurement.getSelectedItem().toString();
        ItemForm idUnitMeasurementItem = new ItemForm( "Unidad de Medida", idUnitMeasurement )
                .addValidador( new RequiredValidator() );

        String idBrand = ( this.jComboBoxBrands.getSelectedIndex() == 0 ) ? "" : this.jComboBoxBrands.getSelectedItem().toString();
        ItemForm idBrandItem = new ItemForm( "Marca", idBrand )
                .addValidador( new RequiredValidator() );

        String idProvider = ( this.jComboBoxProviders.getSelectedIndex() == 0 ) ? "" : this.jComboBoxProviders.getSelectedItem().toString();
        ItemForm idProviderItem = new ItemForm( "Marca", idProvider )
                .addValidador( new RequiredValidator() );

        if( !nameItem.isValid() ) {
            nameItem.printMessage();
            return false;
        }

        if( !descriptionItem.isValid() ) {
            descriptionItem.printMessage();
            return false;
        }

        if( !priceItem.isValid() ) {
            priceItem.printMessage();
            return false;
        }

        if( !stockItem.isValid() ) {
            stockItem.printMessage();
            return false;
        }

        if( !idUnitMeasurementItem.isValid() ) {
            idUnitMeasurementItem.printMessage();
            return false;
        }

        if( !idBrandItem.isValid() ) {
            idBrandItem.printMessage();
            return false;
        }

        if( !idProviderItem.isValid() ) {
            idProviderItem.printMessage();
            return false;
        }

        return true;
    }

    private void showUnitMeasurementInCombobox() throws SQLException
    {
        List<UnitMeasurement> unitMeasurementsDB = this.unitMeasurementController.getUnitMeasurements();
        this.unitMeasurements = unitMeasurementsDB;
        unitMeasurementsDB.forEach( e -> this.jComboBoxUnitMeasurement.addItem( e.getDescription() ) );
    }

    private void showBrandInCombobox() throws SQLException
    {
        List<Brand> brandsDB = this.brandController.getBrands();
        this.brands = brandsDB;
        brandsDB.forEach( e -> this.jComboBoxBrands.addItem( e.getDescription() ) );
    }

    private void showProvidersInCombobox() throws SQLException
    {
        List<Provider> providersDB = this.providerController.getProviders();
        this.providers = providersDB;
        providersDB.forEach( e -> this.jComboBoxProviders.addItem( e.getPersonalInformation().getName() ) );
    }

    private void buttonAddActionPerformed( java.awt.event.ActionEvent evt ) throws SQLException
    {
        this.idProduct = 0;

        if( this.isValidInput() ) {
            this.buildProduct();
            if( this.productController.createProduct( this.product ) ) {
                this.completeAddAction();
                JOptionPane.showMessageDialog( null, "Producto agregado correctamente",
                        "Producto agregado", JOptionPane.INFORMATION_MESSAGE );
            } else {
                JOptionPane.showMessageDialog( null, "Error al agregar nuevo producto",
                        "Error al agregar", JOptionPane.WARNING_MESSAGE );
            }
        }
    }

    public void showListProduct() throws SQLException
    {
        List<Product> listProducts = this.productController.getProducts();
        this.tableModel = ( DefaultTableModel ) this.tableProduct.getModel();

        for( Product product : listProducts )
        {
            this.tableModel.addRow( new Object[]{ product.getIdProduct(), product.getName(), product.getDescription(), product.getPrice(),
            product.getStock(), product.getUnitMeasurementDescription(), product.getBrandDescription(), product.getProviderName() } );
        }
    }

    private void tableProductMouseClicked( java.awt.event.MouseEvent evt )
    {
        this.disableButtonAdd();
        this.activeButtonUpdateAndDelete();

        int selectedItem = this.tableProduct.rowAtPoint( evt.getPoint() );
        this.idProduct = Integer.parseInt( this.tableProduct.getValueAt( selectedItem, 0 ) + "" );
        this.jTextName.setText( this.tableProduct.getValueAt( selectedItem, 1 ) + "" );
        this.jTextDescription.setText( this.tableProduct.getValueAt( selectedItem, 2 ) + "" );
        this.jTextPrice.setText( this.tableProduct.getValueAt( selectedItem, 3 ) + "" );
        this.jSpinnerStock.setValue( this.tableProduct.getValueAt( selectedItem, 4 ) );
        this.jComboBoxUnitMeasurement.setSelectedItem( this.tableProduct.getValueAt( selectedItem, 5 ) + "" );
        this.jComboBoxBrands.setSelectedItem( this.tableProduct.getValueAt( selectedItem, 6 ) + "" );
        this.jComboBoxProviders.setSelectedItem( this.tableProduct.getValueAt( selectedItem, 7 ) + "" );
    }

    private void buttonUpdateActionPerformed( java.awt.event.ActionEvent evt ) throws SQLException
    {
        if( this.isValidInput() ) {
            this.buildProduct();
            int confirm = JOptionPane.showConfirmDialog( null, "¿Desea guardar cambios?\n" +
                            "Los datos del producto se modificaran" , "Actualizando Producto",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );

            if( confirm == 0 )
            {
                if( this.productController.updateProduct( this.product ) ) {
                    this.completeDeleteOrUpdateAction();
                    JOptionPane.showMessageDialog( null, "Producto actualizado correctamente",
                            "Producto actualizado", JOptionPane.INFORMATION_MESSAGE );
                } else {
                    JOptionPane.showMessageDialog( null, "Error al actualizar producto",
                            "Error al actualizar", JOptionPane.WARNING_MESSAGE );
                }
            }
        }
    }

    private void buttonDeleteActionPerformed( java.awt.event.ActionEvent evt ) throws SQLException
    {
        int confirm = JOptionPane.showConfirmDialog( null, "¿Desea eliminar el producto?\n" +
                        "El producto se eliminará permanentemente" , "Eliminar Producto",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );

        if( confirm == 0 ) {
            this.productController.deleteProduct( this.idProduct );
            this.completeDeleteOrUpdateAction();
            JOptionPane.showMessageDialog( null, "Producto se elimino correctamente",
                    "Producto eliminado", JOptionPane.INFORMATION_MESSAGE );
        }
    }

    private void buttonCleanInputActionPerformed( java.awt.event.ActionEvent evt )
    {
        this.cleanFormInput();
        this.disableButtonUpdateAndDelete();
        this.activeButtonAdd();
    }
    
    public void cleanListProducts()
    {
        this.tableModel = ( DefaultTableModel ) this.tableProduct.getModel();
        for( int i = this.tableModel.getRowCount() - 1 ; i >= 0 ; i-- )
        {
            this.tableModel.removeRow( i );
        }
    }

    private void cleanFormInput()
    {
        this.jTextName.setText( null );
        this.jTextDescription.setText( null );
        this.jTextPrice.setText( null );
        this.jSpinnerStock.setValue( 0 );
        this.jComboBoxUnitMeasurement.setSelectedItem( jComboBoxUnitMeasurement.getItemAt( 0 ) );;
        this.jComboBoxBrands.setSelectedItem( jComboBoxBrands.getItemAt( 0 ) );
        this.jComboBoxProviders.setSelectedItem( jComboBoxProviders.getItemAt( 0 ) );
    }

    private void disableButtonAdd()
    {
        this.buttonAdd.setEnabled( false );
    }

    private void disableButtonUpdateAndDelete()
    {
        this.buttonUpdate.setEnabled( false );
        this.buttonDelete.setEnabled( false );
    }

    private void activeButtonAdd()
    {
        this.buttonAdd.setEnabled( true );
    }

    private void activeButtonUpdateAndDelete()
    {
        this.buttonUpdate.setEnabled( true );
        this.buttonDelete.setEnabled( true );
    }

    private void completeAddAction() throws SQLException
    {
        this.cleanListProducts();
        this.showListProduct();
        this.cleanFormInput();
    }
    private void completeDeleteOrUpdateAction() throws SQLException
    {
        this.cleanListProducts();
        this.cleanFormInput();
        this.showListProduct();
        this.disableButtonUpdateAndDelete();
        this.activeButtonAdd();
    }

    private void buildProduct() {
        this.idUnitMeasurement = this.unitMeasurements.get( this.jComboBoxUnitMeasurement.getSelectedIndex() - 1 ).getIdUnitMeasurement();
        this.idBrand = this.brands.get( this.jComboBoxBrands.getSelectedIndex() - 1 ).getIdBrand();
        this.idProvider = this.providers.get( this.jComboBoxProviders.getSelectedIndex() - 1 ).getIdProvider();

        this.product.setIdProduct( this.idProduct );
        this.product.setName( jTextName.getText() );
        this.product.setDescription( jTextDescription.getText() );
        this.product.setPrice( Double.valueOf( jTextPrice.getText() ) );
        this.product.setStock( ( Integer ) jSpinnerStock.getValue() );
        this.product.setIdUnitMeasurement( this.idUnitMeasurement );
        this.product.setIdBrand( this.idBrand );
        this.product.setIdProvider( this.idProvider );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCleanInput;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonUpdate;
    javax.swing.JComboBox<String> jComboBoxBrands;
    javax.swing.JComboBox<String> jComboBoxProviders;
    javax.swing.JComboBox<String> jComboBoxUnitMeasurement;
    javax.swing.JLabel jLabel01;
    javax.swing.JLabel jLabel02;
    javax.swing.JLabel jLabel03;
    javax.swing.JLabel jLabel04;
    javax.swing.JLabel jLabel05;
    javax.swing.JLabel jLabel06;
    javax.swing.JLabel jLabel07;
    javax.swing.JLabel jLabel08;
    javax.swing.JLabel jLabel09;
    javax.swing.JLabel jLabel10;
    javax.swing.JLabel jLabel11;
    javax.swing.JLabel jLabel12;
    javax.swing.JLabel jLabel13;
    javax.swing.JLabel jLabel14;
    javax.swing.JLabel jLabel20;
    javax.swing.JLabel jLabel21;
    javax.swing.JPanel jPanel01;
    javax.swing.JPanel jPanel02;
    javax.swing.JPanel jPanel03;
    javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerStock;
    private javax.swing.JTextField jTextDescription;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextPrice;
    private javax.swing.JTable tableProduct;
    // End of variables declaration//GEN-END:variables
}
