package com.refsul.inventory_refsul.view;

import com.refsul.inventory_refsul.view.internalsFrame.UIBrand;
import com.refsul.inventory_refsul.view.internalsFrame.UIUnitMeasurement;
import com.refsul.inventory_refsul.view.internalsFrame.UIProduct;
import com.refsul.inventory_refsul.view.internalsFrame.UICustomer;
import com.refsul.inventory_refsul.view.internalsFrame.UIProvider;
import com.refsul.inventory_refsul.view.internalsFrame.UISeller;
import com.refsul.inventory_refsul.view.internalsFrame.UIPaymentMethod;
import java.awt.Dimension;
import java.sql.SQLException;
import javax.swing.JInternalFrame;

public class Home extends javax.swing.JFrame {
    public Home() {
        initComponents();
        this.setExtendedState( MAXIMIZED_BOTH );
        this.setResizable( false );
    }
   
    public void showWindows(JInternalFrame child ) {
        jDesktopPaneHome.add( child );
        Dimension size = child.getSize();
        Dimension dimension = jDesktopPaneHome.getSize();
        child.setLocation(( dimension.width - size.width )/2, ( dimension.height - size.height ) / 2);
        child.show();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPaneHome = new javax.swing.JDesktopPane();
        navBar = new javax.swing.JMenuBar();
        optionMenu = new javax.swing.JMenu();
        ItemHelp = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ItemClose = new javax.swing.JMenuItem();
        optionSales = new javax.swing.JMenu();
        ItemMakeSale = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        ItemSalesDetails = new javax.swing.JMenuItem();
        optionStaff = new javax.swing.JMenu();
        ItemSellers = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        ItemProviders = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        ItemCustomers = new javax.swing.JMenuItem();
        optionInventory = new javax.swing.JMenu();
        ItemProducts = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        ItemPaymentMethods = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        ItemUnitsMeasurements = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        ItemBrands = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPaneHomeLayout = new javax.swing.GroupLayout(jDesktopPaneHome);
        jDesktopPaneHome.setLayout(jDesktopPaneHomeLayout);
        jDesktopPaneHomeLayout.setHorizontalGroup(
            jDesktopPaneHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1742, Short.MAX_VALUE)
        );
        jDesktopPaneHomeLayout.setVerticalGroup(
            jDesktopPaneHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 653, Short.MAX_VALUE)
        );

        navBar.setBackground(new java.awt.Color(255, 255, 255));
        navBar.setPreferredSize(new java.awt.Dimension(74, 70));

        optionMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        optionMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        optionMenu.setLabel("  Menu");
        optionMenu.setMargin(new java.awt.Insets(0, 15, 0, 0));
        optionMenu.setMaximumSize(new java.awt.Dimension(130, 32767));

        ItemHelp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ItemHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customer-service.png"))); // NOI18N
        ItemHelp.setText("  Ayuda");
        ItemHelp.setMargin(new java.awt.Insets(10, 15, 10, 10));
        ItemHelp.setPreferredSize(new java.awt.Dimension(200, 50));
        optionMenu.add(ItemHelp);
        optionMenu.add(jSeparator1);

        ItemClose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ItemClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit-door.png"))); // NOI18N
        ItemClose.setText("  Salir");
        ItemClose.setMargin(new java.awt.Insets(10, 15, 10, 10));
        ItemClose.setPreferredSize(new java.awt.Dimension(200, 50));
        optionMenu.add(ItemClose);

        navBar.add(optionMenu);

        optionSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/trolley.png"))); // NOI18N
        optionSales.setText("  Ventas");
        optionSales.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        optionSales.setMargin(new java.awt.Insets(0, 20, 0, 0));
        optionSales.setMaximumSize(new java.awt.Dimension(155, 32767));

        ItemMakeSale.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ItemMakeSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/point-of-sale.png"))); // NOI18N
        ItemMakeSale.setText("  Generar Ventas");
        ItemMakeSale.setMargin(new java.awt.Insets(10, 15, 10, 10));
        ItemMakeSale.setPreferredSize(new java.awt.Dimension(220, 50));
        optionSales.add(ItemMakeSale);
        optionSales.add(jSeparator2);

        ItemSalesDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ItemSalesDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sales.png"))); // NOI18N
        ItemSalesDetails.setText("  Detalles Ventas");
        ItemSalesDetails.setMargin(new java.awt.Insets(10, 15, 10, 10));
        ItemSalesDetails.setPreferredSize(new java.awt.Dimension(200, 50));
        optionSales.add(ItemSalesDetails);
        navBar.add(optionSales);

        optionStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/office-staff.png"))); // NOI18N
        optionStaff.setText("  Personal");
        optionStaff.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        optionStaff.setMargin(new java.awt.Insets(0, 20, 0, 0));
        optionStaff.setMaximumSize(new java.awt.Dimension(165, 32767));

        ItemSellers.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ItemSellers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/avatar.png"))); // NOI18N
        ItemSellers.setText("  Vendedores");
        ItemSellers.setMargin(new java.awt.Insets(10, 15, 10, 10));
        ItemSellers.setPreferredSize(new java.awt.Dimension(200, 50));
        ItemSellers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    ItemSellersActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        optionStaff.add(ItemSellers);
        optionStaff.add(jSeparator4);

        ItemProviders.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ItemProviders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/providers.png"))); // NOI18N
        ItemProviders.setText("  Proveedores");
        ItemProviders.setToolTipText("");
        ItemProviders.setMargin(new java.awt.Insets(10, 15, 10, 10));
        ItemProviders.setPreferredSize(new java.awt.Dimension(200, 50));
        ItemProviders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    ItemProvidersActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        optionStaff.add(ItemProviders);
        optionStaff.add(jSeparator3);

        ItemCustomers.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ItemCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/client.png"))); // NOI18N
        ItemCustomers.setText("  Clientes");
        ItemCustomers.setToolTipText("");
        ItemCustomers.setMargin(new java.awt.Insets(10, 15, 10, 10));
        ItemCustomers.setPreferredSize(new java.awt.Dimension(200, 50));
        ItemCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    ItemCustomersActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        optionStaff.add(ItemCustomers);
        navBar.add(optionStaff);

        optionInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inventory.png"))); // NOI18N
        optionInventory.setText("  Inventario");
        optionInventory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        optionInventory.setMargin(new java.awt.Insets(0, 20, 0, 0));
        optionInventory.setMaximumSize(new java.awt.Dimension(180, 32767));

        ItemProducts.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ItemProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/products.png"))); // NOI18N
        ItemProducts.setText("  Productos");
        ItemProducts.setMargin(new java.awt.Insets(10, 15, 10, 10));
        ItemProducts.setPreferredSize(new java.awt.Dimension(200, 50));
        ItemProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    ItemProductsActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        optionInventory.add(ItemProducts);
        optionInventory.add(jSeparator5);

        ItemPaymentMethods.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ItemPaymentMethods.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/payment Methods.png"))); // NOI18N
        ItemPaymentMethods.setText("  Método de pago");
        ItemPaymentMethods.setMargin(new java.awt.Insets(10, 15, 10, 10));
        ItemPaymentMethods.setPreferredSize(new java.awt.Dimension(260, 50));
        ItemPaymentMethods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    ItemPaymentMethodsActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        optionInventory.add(ItemPaymentMethods);
        optionInventory.add(jSeparator6);

        ItemUnitsMeasurements.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ItemUnitsMeasurements.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unit-m.png"))); // NOI18N
        ItemUnitsMeasurements.setText("  Unidades de medida");
        ItemUnitsMeasurements.setMargin(new java.awt.Insets(10, 15, 10, 10));
        ItemUnitsMeasurements.setPreferredSize(new java.awt.Dimension(200, 50));
        ItemUnitsMeasurements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    ItemUnitsMeasurementsActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        optionInventory.add(ItemUnitsMeasurements);
        optionInventory.add(jSeparator7);

        ItemBrands.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ItemBrands.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/brands.png"))); // NOI18N
        ItemBrands.setText("  Marcas");
        ItemBrands.setMargin(new java.awt.Insets(10, 15, 10, 10));
        ItemBrands.setPreferredSize(new java.awt.Dimension(200, 50));
        ItemBrands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    ItemBrandActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        optionInventory.add(ItemBrands);
        navBar.add(optionInventory);

        setJMenuBar(navBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneHome)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneHome)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemSellersActionPerformed( java.awt.event.ActionEvent evt ) throws SQLException
    {
        UISeller seller = new UISeller();
        this.showWindows( seller );
    }

    private void ItemProvidersActionPerformed( java.awt.event.ActionEvent evt ) throws SQLException
    {
        UIProvider provider = new UIProvider();
        this.showWindows( provider );
    }

    private void ItemCustomersActionPerformed( java.awt.event.ActionEvent evt ) throws SQLException
    {
        UICustomer customer = new UICustomer();
        this.showWindows( customer );
    }

    private void ItemProductsActionPerformed( java.awt.event.ActionEvent evt ) throws SQLException
    {
        UIProduct product = new UIProduct();
        this.showWindows( product );
    }

    private void ItemPaymentMethodsActionPerformed( java.awt.event.ActionEvent evt ) throws SQLException
    {
        UIPaymentMethod paymentMethod = new UIPaymentMethod();
        this.showWindows( paymentMethod );
    }

    private void ItemUnitsMeasurementsActionPerformed( java.awt.event.ActionEvent evt ) throws SQLException
    {
        UIUnitMeasurement unitMeasurement = new UIUnitMeasurement();
        this.showWindows( unitMeasurement );
    }

    private void ItemBrandActionPerformed( java.awt.event.ActionEvent evt ) throws SQLException
    {
        UIBrand brand = new UIBrand();
        this.showWindows( brand );
    }

    private javax.swing.JMenuItem ItemBrands;
    private javax.swing.JMenuItem ItemClose;
    private javax.swing.JMenuItem ItemCustomers;
    private javax.swing.JMenuItem ItemHelp;
    private javax.swing.JMenuItem ItemMakeSale;
    private javax.swing.JMenuItem ItemPaymentMethods;
    private javax.swing.JMenuItem ItemProducts;
    private javax.swing.JMenuItem ItemProviders;
    private javax.swing.JMenuItem ItemSalesDetails;
    private javax.swing.JMenuItem ItemSellers;
    private javax.swing.JMenuItem ItemUnitsMeasurements;
    private javax.swing.JDesktopPane jDesktopPaneHome;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JMenuBar navBar;
    private javax.swing.JMenu optionInventory;
    private javax.swing.JMenu optionMenu;
    private javax.swing.JMenu optionSales;
    private javax.swing.JMenu optionStaff;
}
