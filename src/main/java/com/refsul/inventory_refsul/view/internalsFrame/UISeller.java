package com.refsul.inventory_refsul.view.internalsFrame;

import com.refsul.inventory_refsul.controllers.SellerController;
import com.refsul.inventory_refsul.models.PersonalInformation;
import com.refsul.inventory_refsul.models.Seller;
import com.refsul.inventory_refsul.view.validators.ItemForm;
import com.refsul.inventory_refsul.view.validators.validationOptions.EmailValidator;
import com.refsul.inventory_refsul.view.validators.validationOptions.LengthValidator;
import com.refsul.inventory_refsul.view.validators.validationOptions.NumberValidator;
import com.refsul.inventory_refsul.view.validators.validationOptions.RequiredValidator;

import javax.inject.Inject;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.List;

public class UISeller extends javax.swing.JInternalFrame {
    private final SellerController sellerController;
    private DefaultTableModel tableModel;
    private final Seller seller;
    private final PersonalInformation personalInformation;
    private int idSeller;

    @Inject
    public UISeller( SellerController sellerController ) {
        initComponents();
        this.setResizable( false );

        this.sellerController = sellerController;
        this.tableModel = new DefaultTableModel();
        this.seller = new Seller();
        this.personalInformation = new PersonalInformation();
        this.idSeller = 0;
        
        this.cleanListSellers();
        this.showListSellers();

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextRFC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextAddress = new javax.swing.JTextField();
        buttonAdd = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonCleanInput = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextLasName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSeller = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nombre:");

        jTextName.setVerifyInputWhenFocusTarget(false);

        jLabel2.setText("RFC:");

        jLabel4.setText("Usuario:");

        jLabel6.setText("Dirección:");

        jTextAddress.setVerifyInputWhenFocusTarget(false);

        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        buttonAdd.setText("Agregar");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    buttonAddSellerActionPerformed(evt);
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

        jLabel5.setText("Apellidos:");

        jLabel7.setText("Email:");

        jLabel8.setText("Teléfono:");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profesiones-y-trabajos.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel14.setText("Llene todos los campos Para realizar cualquier acción");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel15.setText("Acciónes");

        jLabel18.setText("Password:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextUserName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jTextEmail)
                            .addComponent(jTextRFC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextName, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextLasName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonCleanInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextLasName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonCleanInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LOGO44.gif"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel11.setText("Refaccioraria REFSUL");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel12.setText("En este apartado usted podrá Agregar nuevos Vendedores.");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel13.setText("También Editar su información y Eliminar ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addComponent(jLabel10))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableSeller.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellidos", "RFC", "Dirección", "Email", "Telefono", "Usuario", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSeller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSellerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSeller);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel16.setText("En este apartado podrás Visualizar la lista de Vendedores Registrados");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel17.setText("Seleccione una Columna a Editar o Eliminar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel16))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel17))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(2, 2, 2)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean isValidInput()
    {
        ItemForm nameItem = new ItemForm( "Nombre", this.jTextName.getText() )
                .addValidador( new RequiredValidator() )
                .addValidador( new LengthValidator( 3, 20 ) );

        ItemForm lastNameItem = new ItemForm( "Apellidos", this.jTextLasName.getText() )
                .addValidador( new RequiredValidator() )
                .addValidador( new LengthValidator( 5, 20 ) );

        ItemForm RFCItem = new ItemForm( "RFC", this.jTextRFC.getText() )
                .addValidador( new RequiredValidator() )
                .addValidador( new LengthValidator( 13, 13 ) );

        ItemForm addressItem = new ItemForm( "Dirección", this.jTextAddress.getText() )
                .addValidador( new RequiredValidator() )
                .addValidador( new LengthValidator( 5, 50 ) );

        ItemForm emailItem = new ItemForm( "Email", this.jTextEmail.getText() )
                .addValidador( new RequiredValidator() )
                .addValidador( new LengthValidator( 5, 50 ) )
                .addValidador( new EmailValidator() );

        ItemForm phoneItem = new ItemForm( "Teléfono", this.jTextPhone.getText() )
                .addValidador( new RequiredValidator() )
                .addValidador( new NumberValidator() )
                .addValidador( new LengthValidator( 10, 12 ) );

        ItemForm userNameItem = new ItemForm( "Nombre de Usuario", this.jTextUserName.getText() )
                .addValidador( new RequiredValidator() )
                .addValidador( new LengthValidator( 5, 15 ) );

        ItemForm passwordItem = new ItemForm( "Contraseña", this.jTextPassword.getText() )
                .addValidador( new RequiredValidator() )
                .addValidador( new LengthValidator( 6, 15 ) );

        if( !nameItem.isValid() ) {
            nameItem.printMessage();
            this.jTextName.requestFocus();
            return false;
        }

        if( !lastNameItem.isValid() ) {
            lastNameItem.printMessage();
            this.jTextLasName.requestFocus();
            return false;
        }

        if( !RFCItem.isValid() ) {
            RFCItem.printMessage();
            this.jTextRFC.requestFocus();
            return false;
        }

        if( !addressItem.isValid() ) {
            addressItem.printMessage();
            this.jTextAddress.requestFocus();
            return false;
        }

        if( !emailItem.isValid() ) {
            emailItem.printMessage();
            this.jTextEmail.requestFocus();
            return false;
        }

        if( !phoneItem.isValid() ) {
            phoneItem.printMessage();
            this.jTextPhone.requestFocus();
            return false;
        }

        if( !userNameItem.isValid() ) {
            userNameItem.printMessage();
            this.jTextUserName.requestFocus();
            return false;
        }

        if( !passwordItem.isValid() ) {
            passwordItem.printMessage();
            this.jTextPassword.requestFocus();
            return false;
        }

        return true;
    }

    private void buttonAddSellerActionPerformed( java.awt.event.ActionEvent evt ) throws SQLException
    {
        this.idSeller = 0;
        this.buildSelller();

        if( this.isValidInput() ) {
            if( this.sellerController.createSeller( this.seller ) ) {
                this.completeAddAction();
                JOptionPane.showMessageDialog( null, "Vendedor agregado correctamente",
                        "Vendedor agregado", JOptionPane.INFORMATION_MESSAGE );
            } else {
                JOptionPane.showMessageDialog( null, "Error al agregar nuevo vendedor",
                        "Error al agregar", JOptionPane.WARNING_MESSAGE );
            }
        }
    }

    public void showListSellers()
    {
        List<Seller> listSellers = null;
        try {
            listSellers = this.sellerController.getSellers();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        this.tableModel = ( DefaultTableModel ) this.tableSeller.getModel();

        for( Seller seller : listSellers )
        {
            this.tableModel.addRow( new Object[]{ seller.getIdSeller(), seller.getPersonalInformation().getName(), seller.getPersonalInformation().getLastName(), seller.getPersonalInformation().getRfc(),
                    seller.getPersonalInformation().getAddress(), seller.getPersonalInformation().getEmail(), seller.getPersonalInformation().getPhoneNumber(), seller.getUserName(), seller.getPassword() } );
        }
    }

    private void tableSellerMouseClicked( java.awt.event.MouseEvent evt )
    {
        this.disableButtonAdd();
        this.activeButtonUpdateAndDelete();

        int selectedItem = this.tableSeller.rowAtPoint( evt.getPoint() );
        this.idSeller = Integer.parseInt( this.tableSeller.getValueAt( selectedItem, 0 ) + "" );
        this.jTextName.setText( this.tableSeller.getValueAt( selectedItem, 1 ) + "" );
        this.jTextLasName.setText( this.tableSeller.getValueAt( selectedItem, 2 ) + "" );
        this.jTextRFC.setText( this.tableSeller.getValueAt( selectedItem, 3 ) + "" );
        this.jTextAddress.setText( this.tableSeller.getValueAt( selectedItem, 4 ) + "" );
        this.jTextEmail.setText( this.tableSeller.getValueAt( selectedItem, 5 ) + "" );
        this.jTextPhone.setText( this.tableSeller.getValueAt( selectedItem, 6 ) + "" );
        this.jTextUserName.setText( this.tableSeller.getValueAt( selectedItem, 7 ) + "" );
        this.jTextPassword.setText( this.tableSeller.getValueAt( selectedItem, 8 ) + "" );
    }

    private void buttonUpdateActionPerformed( java.awt.event.ActionEvent evt ) throws SQLException
    {
        this.buildSelller();

        if( this.isValidInput() ) {
            int confirm = JOptionPane.showConfirmDialog( null, "¿Desea guardar cambios?\n" +
                            "Los datos del vendedor se modificaran" , "Actualizando Vendedor",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );

            if( confirm == 0 )
            {
                if( this.sellerController.updateSeller( this.seller ) ) {
                    this.completeDeleteOrUpdateAction();
                    JOptionPane.showMessageDialog( null, "Vendedor actualizado correctamente",
                            "Vendedor actualizado", JOptionPane.INFORMATION_MESSAGE );
                } else {
                    JOptionPane.showMessageDialog( null, "Error al actualizar vendedor",
                            "Error al actualizar", JOptionPane.WARNING_MESSAGE );
                }
            }
        }
    }

    private void buttonDeleteActionPerformed( java.awt.event.ActionEvent evt ) throws SQLException
    {
        int confirm = JOptionPane.showConfirmDialog( null, "¿Desea eliminar el vendedor?\n" +
                        "El vendedor se eliminará permanentemente" , "Eliminar Vendedor",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );

        if( confirm == 0 ) {
            this.sellerController.deleteSeller( this.idSeller );
            this.completeDeleteOrUpdateAction();
            JOptionPane.showMessageDialog( null, "Vendedor se elimino correctamente",
                    "Vendedor eliminado", JOptionPane.INFORMATION_MESSAGE );
        }
    }

    private void buttonCleanInputActionPerformed( java.awt.event.ActionEvent evt )
    {
        this.cleanFormInput();
        this.disableButtonUpdateAndDelete();
        this.activeButtonAdd();
    }
    
    public void cleanListSellers()
    {
        this.tableModel = ( DefaultTableModel ) this.tableSeller.getModel();
        for( int i = this.tableModel.getRowCount() - 1 ; i >= 0 ; i-- )
        {
            this.tableModel.removeRow( i );
        }
    }

    private void cleanFormInput()
    {
        this.jTextName.setText( null );
        this.jTextLasName.setText( null );
        this.jTextRFC.setText( null );
        this.jTextAddress.setText( null );
        this.jTextEmail.setText( null );
        this.jTextPhone.setText( null );
        this.jTextUserName.setText( null );
        this.jTextPassword.setText( null );
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
        this.cleanListSellers();
        this.showListSellers();
        this.cleanFormInput();
    }

    private void completeDeleteOrUpdateAction() throws SQLException
    {
        this.cleanListSellers();
        this.cleanFormInput();
        this.showListSellers();
        this.disableButtonUpdateAndDelete();
        this.activeButtonAdd();
    }

    private void buildSelller() {
        this.personalInformation.setIdInformation( 0 );
        this.personalInformation.setName( jTextName.getText() );
        this.personalInformation.setLastName( jTextLasName.getText() );
        this.personalInformation.setRfc( jTextRFC.getText() );
        this.personalInformation.setAddress( jTextAddress.getText() );
        this.personalInformation.setEmail( jTextEmail.getText() );
        this.personalInformation.setPhoneNumber( jTextPhone.getText() );

        this.seller.setIdSeller( this.idSeller );
        this.seller.setUserName( jTextUserName.getText() );
        this.seller.setPassword( jTextPassword.getText() );

        this.seller.setPersonalInformation( this.personalInformation );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCleanInput;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonUpdate;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel10;
    javax.swing.JLabel jLabel11;
    javax.swing.JLabel jLabel12;
    javax.swing.JLabel jLabel13;
    javax.swing.JLabel jLabel14;
    javax.swing.JLabel jLabel15;
    javax.swing.JLabel jLabel16;
    javax.swing.JLabel jLabel17;
    javax.swing.JLabel jLabel18;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextAddress;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextLasName;
    private javax.swing.JTextField jTextName;
    javax.swing.JPasswordField jTextPassword;
    private javax.swing.JTextField jTextPhone;
    private javax.swing.JTextField jTextRFC;
    private javax.swing.JTextField jTextUserName;
    private javax.swing.JTable tableSeller;
    // End of variables declaration//GEN-END:variables
}
