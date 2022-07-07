package com.refsul.inventory_refsul.View.InternalsFrame;

public class UnitMeasurement extends javax.swing.JInternalFrame {
    public UnitMeasurement() {
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
        btnAddUnitM = new javax.swing.JButton();
        btnUpdateUnitM = new javax.swing.JButton();
        btnUnitM = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        tableUnitM = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(1016, 900));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 930));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 180));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 131));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Card_Header_Unit.jpg"))); // NOI18N
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
        labelName.setText("Descripción: ");
        labelName.setPreferredSize(new java.awt.Dimension(80, 25));
        jPanel3.add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, -1));

        txtName.setPreferredSize(new java.awt.Dimension(240, 30));
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 540, 40));

        btnAddUnitM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnAddUnitM.setText(" Agregar");
        jPanel3.add(btnAddUnitM, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 140, 40));

        btnUpdateUnitM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        btnUpdateUnitM.setText(" Actualizar");
        jPanel3.add(btnUpdateUnitM, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 140, 40));

        btnUnitM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        btnUnitM.setText(" Eliminar");
        jPanel3.add(btnUnitM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 140, 40));

        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clean.png"))); // NOI18N
        btnClean.setText(" Limpiar");
        jPanel3.add(btnClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 140, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Card_Header_Body_Unit.jpg"))); // NOI18N
        jLabel6.setAlignmentY(0.0F);
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1002, -1));

        jPanel4.setPreferredSize(new java.awt.Dimension(0, 250));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableUnitM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripción"
            }
        ));
        jScrollPane.setViewportView(tableUnitM);

        jPanel4.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 980, 270));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Card_Header_Table_Unit.jpg"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUnitM;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnUnitM;
    private javax.swing.JButton btnUpdateUnitM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane;
    public javax.swing.JLabel labelName;
    private javax.swing.JTable tableUnitM;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
