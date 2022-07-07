package com.refsul.inventory_refsul.View.InternalsFrame;

public class Seller extends javax.swing.JInternalFrame {
    public Seller() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        labelLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        labelRFC = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        labelAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        labelPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        labelUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnAddSeller = new javax.swing.JButton();
        btnUpdateSeller = new javax.swing.JButton();
        btnDeleteSeller = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        tableSeller = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(1016, 930));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 930));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 180));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 131));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Card_Header_Seller.jpg"))); // NOI18N
        jLabel5.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setPreferredSize(new java.awt.Dimension(0, 300));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelName.setForeground(new java.awt.Color(91, 90, 90));
        labelName.setText("Nombres:");
        labelName.setPreferredSize(new java.awt.Dimension(80, 25));
        jPanel3.add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtName.setPreferredSize(new java.awt.Dimension(240, 30));
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        labelLastName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelLastName.setForeground(new java.awt.Color(91, 90, 90));
        labelLastName.setText("Apellidos:");
        labelLastName.setPreferredSize(new java.awt.Dimension(80, 25));
        jPanel3.add(labelLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txtLastName.setPreferredSize(new java.awt.Dimension(240, 30));
        jPanel3.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        labelRFC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelRFC.setForeground(new java.awt.Color(91, 90, 90));
        labelRFC.setText("RFC:");
        labelRFC.setPreferredSize(new java.awt.Dimension(80, 25));
        jPanel3.add(labelRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 80, -1));

        txtRFC.setPreferredSize(new java.awt.Dimension(240, 30));
        jPanel3.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        labelAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelAddress.setForeground(new java.awt.Color(91, 90, 90));
        labelAddress.setText("Dirección:");
        labelAddress.setPreferredSize(new java.awt.Dimension(80, 25));
        jPanel3.add(labelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 80, -1));

        txtAddress.setPreferredSize(new java.awt.Dimension(240, 30));
        jPanel3.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        labelEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(91, 90, 90));
        labelEmail.setText("Email:");
        labelEmail.setPreferredSize(new java.awt.Dimension(80, 25));
        jPanel3.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        txtEmail.setPreferredSize(new java.awt.Dimension(240, 30));
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        labelPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPhoneNumber.setForeground(new java.awt.Color(91, 90, 90));
        labelPhoneNumber.setText("Teléfono: ");
        labelPhoneNumber.setMaximumSize(new java.awt.Dimension(80, 25));
        labelPhoneNumber.setMinimumSize(new java.awt.Dimension(80, 25));
        labelPhoneNumber.setPreferredSize(new java.awt.Dimension(80, 25));
        jPanel3.add(labelPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 80, -1));

        txtPhoneNumber.setPreferredSize(new java.awt.Dimension(240, 30));
        jPanel3.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        labelUserName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelUserName.setForeground(new java.awt.Color(91, 90, 90));
        labelUserName.setText("UserName:");
        labelUserName.setPreferredSize(new java.awt.Dimension(80, 25));
        jPanel3.add(labelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, -1));

        txtUserName.setPreferredSize(new java.awt.Dimension(240, 30));
        jPanel3.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        btnAddSeller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnAddSeller.setText(" Agregar");
        jPanel3.add(btnAddSeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 140, 40));

        btnUpdateSeller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        btnUpdateSeller.setText(" Actualizar");
        jPanel3.add(btnUpdateSeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 140, 40));

        btnDeleteSeller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        btnDeleteSeller.setText(" Eliminar");
        jPanel3.add(btnDeleteSeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 140, 40));

        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clean.png"))); // NOI18N
        btnClean.setText(" Limpiar");
        jPanel3.add(btnClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 140, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Card_Header_Body_Seller.jpg"))); // NOI18N
        jLabel6.setAlignmentY(0.0F);
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1002, -1));

        jPanel4.setPreferredSize(new java.awt.Dimension(0, 250));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableSeller.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellidos", "RFC", "Dirección", "Email", "Teléfono", "Usuario"
            }
        ));
        jScrollPane.setViewportView(tableSeller);

        jPanel4.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 980, 270));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Card_Header_Table_Seller.jpg"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSeller;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnDeleteSeller;
    private javax.swing.JButton btnUpdateSeller;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane;
    public javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelEmail;
    public javax.swing.JLabel labelLastName;
    public javax.swing.JLabel labelName;
    public javax.swing.JLabel labelPhoneNumber;
    public javax.swing.JLabel labelRFC;
    public javax.swing.JLabel labelUserName;
    private javax.swing.JTable tableSeller;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
