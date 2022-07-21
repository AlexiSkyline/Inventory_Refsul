package com.refsul.inventory_refsul.view.internalsFrame;

import com.refsul.inventory_refsul.controllers.CustomerController;
import com.refsul.inventory_refsul.models.Customer;
import com.refsul.inventory_refsul.models.PersonalInformation;
import com.refsul.inventory_refsul.view.validators.ItemForm;
import com.refsul.inventory_refsul.view.validators.validationOptions.EmailValidator;
import com.refsul.inventory_refsul.view.validators.validationOptions.LengthValidator;
import com.refsul.inventory_refsul.view.validators.validationOptions.NumberValidator;
import com.refsul.inventory_refsul.view.validators.validationOptions.RequiredValidator;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.List;

public class UICustomer extends javax.swing.JInternalFrame {
    CustomerController customerController;
    DefaultTableModel tableModel;
    Customer customer;
    PersonalInformation personalInformation;
    private int idCustomer;

    public UICustomer() throws SQLException {
        initComponents();
        this.setResizable( false );

        this.customerController = new CustomerController();
        this.tableModel = new DefaultTableModel();
        this.customer = new Customer();
        this.personalInformation = new PersonalInformation();
        this.idCustomer = 0;
        
        this.cleanListCustomers();
        this.showListCustomer();

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
        jTextLasName = new javax.swing.JTextField();
        jLabel09 = new javax.swing.JLabel();
        jTextRFC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextAddress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextPhone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        buttonAdd = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonCleanInput = new javax.swing.JButton();
        jPanel03 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
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
        jLabel03.setText("En este apartado usted podrá Agregar nuevos Cliente.");

        jLabel04.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel04.setText("También Editar su información y Eliminar ");

        javax.swing.GroupLayout jPanel01Layout = new javax.swing.GroupLayout(jPanel01);
        jPanel01.setLayout(jPanel01Layout);
        jPanel01Layout.setHorizontalGroup(
            jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel01Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel01)
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel01Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel02))
                    .addGroup(jPanel01Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel03))
                    .addGroup(jPanel01Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel04)))
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

        jLabel08.setText("Apellidos:");

        jLabel09.setText("RFC:");

        jLabel10.setText("Dirección:");

        jTextAddress.setVerifyInputWhenFocusTarget(false);

        jLabel11.setText("Email:");

        jLabel12.setText("Teléfono:");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/help.png"))); // NOI18N

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

        javax.swing.GroupLayout jPanel02Layout = new javax.swing.GroupLayout(jPanel02);
        jPanel02.setLayout(jPanel02Layout);
        jPanel02Layout.setHorizontalGroup(
            jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel02Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel07, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                        .addComponent(jLabel09, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel11))
                .addGap(23, 23, 23)
                .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel05)
                    .addGroup(jPanel02Layout.createSequentialGroup()
                        .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jTextRFC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextName, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel02Layout.createSequentialGroup()
                                .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel02Layout.createSequentialGroup()
                                .addComponent(jLabel08, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextLasName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel02Layout.createSequentialGroup()
                        .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonCleanInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel02Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel06)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel02Layout.createSequentialGroup()
                        .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel07, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel08, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextLasName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel09, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(buttonCleanInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel03.setBackground(new java.awt.Color(255, 255, 255));
        jPanel03.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellidos", "RFC", "Dirección", "Email", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCustomer);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel20.setText("En este apartado podrás Visualizar la lista de Cliente Registrados");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel21.setText("Seleccione una Columna a Editar o Eliminar");

        javax.swing.GroupLayout jPanel03Layout = new javax.swing.GroupLayout(jPanel03);
        jPanel03.setLayout(jPanel03Layout);
        jPanel03Layout.setHorizontalGroup(
            jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel03Layout.createSequentialGroup()
                .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel03Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel03Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(jPanel03Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel21)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel03Layout.setVerticalGroup(
            jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel03Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(2, 2, 2)
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
                    .addComponent(jPanel03, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel02, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        return true;
    }

    private void buttonAddActionPerformed( java.awt.event.ActionEvent evt ) throws SQLException
    {
        this.idCustomer = 0;
        this.buildCustomer();

        if( this.isValidInput() ) {
            if( this.customerController.createCustomer( this.customer ) ) {
                this.completeAddAction();
                JOptionPane.showMessageDialog( null, "Cliente agregado correctamente",
                        "Cliente agregado", JOptionPane.INFORMATION_MESSAGE );
            } else {
                JOptionPane.showMessageDialog( null, "Error al agregar nuevo cliente",
                        "Error al agregar", JOptionPane.WARNING_MESSAGE );
            }
        }
    }

    public void showListCustomer() throws SQLException
    {
        List<Customer> listCustomers = this.customerController.getCustomers();
        this.tableModel = ( DefaultTableModel ) this.tableCustomer.getModel();

        for( Customer customer : listCustomers )
        {
            this.tableModel.addRow( new Object[]{ customer.getIdCustomer(), customer.getPersonalInformation().getName(), customer.getPersonalInformation().getLastName(), customer.getPersonalInformation().getRfc(),
                    customer.getPersonalInformation().getAddress(), customer.getPersonalInformation().getEmail(), customer.getPersonalInformation().getPhoneNumber() } );
        }
    }

    private void tableCustomerMouseClicked( java.awt.event.MouseEvent evt )
    {
        this.disableButtonAdd();
        this.activeButtonUpdateAndDelete();

        int selectedItem = this.tableCustomer.rowAtPoint( evt.getPoint() );
        this.idCustomer = Integer.parseInt( this.tableCustomer.getValueAt( selectedItem, 0 ) + "" );
        this.jTextName.setText( this.tableCustomer.getValueAt( selectedItem, 1 ) + "" );
        this.jTextLasName.setText( this.tableCustomer.getValueAt( selectedItem, 2 ) + "" );
        this.jTextRFC.setText( this.tableCustomer.getValueAt( selectedItem, 3 ) + "" );
        this.jTextAddress.setText( this.tableCustomer.getValueAt( selectedItem, 4 ) + "" );
        this.jTextEmail.setText( this.tableCustomer.getValueAt( selectedItem, 5 ) + "" );
        this.jTextPhone.setText( this.tableCustomer.getValueAt( selectedItem, 6 ) + "" );
    }

    private void buttonUpdateActionPerformed( java.awt.event.ActionEvent evt ) throws SQLException
    {
        this.buildCustomer();
        if( this.isValidInput() ) {
            int confirm = JOptionPane.showConfirmDialog( null, "¿Desea guardar cambios?\n" +
                            "Los datos del cliente se modificaran" , "Actualizando Cliente",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );

            if( confirm == 0 )
            {
                if( this.customerController.updateCustomer( this.customer ) ) {
                    this.completeDeleteOrUpdateAction();
                    JOptionPane.showMessageDialog( null, "Cliente actualizado correctamente",
                            "Cliente actualizado", JOptionPane.INFORMATION_MESSAGE );
                } else {
                    JOptionPane.showMessageDialog( null, "Error al actualizar cliente",
                            "Error al actualizar", JOptionPane.WARNING_MESSAGE );
                }
            }
        }
    }

    private void buttonDeleteActionPerformed( java.awt.event.ActionEvent evt ) throws SQLException
    {
        int confirm = JOptionPane.showConfirmDialog( null, "¿Desea eliminar el cliente?\n" +
                        "El cliente se eliminará permanentemente" , "Eliminar Cliente",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );

        if( confirm == 0 ) {
            this.customerController.deleteCustomer( this.idCustomer );
            this.completeDeleteOrUpdateAction();
            JOptionPane.showMessageDialog( null, "Cliente se elimino correctamente",
                    "Cliente eliminado", JOptionPane.INFORMATION_MESSAGE );
        }
    }

    private void buttonCleanInputActionPerformed( java.awt.event.ActionEvent evt )
    {
        this.cleanFormInput();
        this.disableButtonUpdateAndDelete();
        this.activeButtonAdd();
    }
    
    public void cleanListCustomers()
    {
        this.tableModel = ( DefaultTableModel ) this.tableCustomer.getModel();
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
        this.cleanListCustomers();
        this.showListCustomer();
        this.cleanFormInput();
    }
    private void completeDeleteOrUpdateAction() throws SQLException
    {
        this.cleanListCustomers();
        this.cleanFormInput();
        this.showListCustomer();
        this.disableButtonUpdateAndDelete();
        this.activeButtonAdd();
    }

    private void buildCustomer() {
        this.personalInformation.setIdInformation( 0 );
        this.personalInformation.setName( jTextName.getText() );
        this.personalInformation.setLastName( jTextLasName.getText() );
        this.personalInformation.setRfc( jTextRFC.getText() );
        this.personalInformation.setAddress( jTextAddress.getText() );
        this.personalInformation.setEmail( jTextEmail.getText() );
        this.personalInformation.setPhoneNumber( jTextPhone.getText() );

        this.customer.setIdCustomer( this.idCustomer );

        this.customer.setPersonalInformation( this.personalInformation );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCleanInput;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonUpdate;
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
    javax.swing.JLabel jLabel20;
    javax.swing.JLabel jLabel21;
    javax.swing.JPanel jPanel01;
    javax.swing.JPanel jPanel02;
    javax.swing.JPanel jPanel03;
    javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextAddress;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextLasName;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextPhone;
    private javax.swing.JTextField jTextRFC;
    private javax.swing.JTable tableCustomer;
    // End of variables declaration//GEN-END:variables
}
