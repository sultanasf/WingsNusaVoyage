/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import apps.MainFrame;
import javax.swing.JOptionPane;
import models.Helicopter;
import models.Plane;
import models.implementations.AirlineImp;

/**
 *
 * @author Sultan Firdaus
 */
public class AdminAddAirline extends javax.swing.JPanel {

    private MainFrame mainFrame;

    /**
     * Creates new form AdminAddAirline
     */
    public AdminAddAirline(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
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

        jRadioButton1 = new javax.swing.JRadioButton();
        txtType = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtOrigin = new javax.swing.JTextField();
        txtDestination = new javax.swing.JTextField();
        txtSeat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        classComboBox = new javax.swing.JComboBox<String>();
        vehicleComboBox = new javax.swing.JComboBox<String>();
        jLabel7 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        customLabel = new javax.swing.JLabel();
        txtCustom = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setBackground(new java.awt.Color(0, 0, 51));

        txtType.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("New Airline");

        txtOrigin.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N

        txtDestination.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N

        txtSeat.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        txtSeat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSeatKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Type");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Origin");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Destination");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seat Amount");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Class");

        classComboBox.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        classComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Economy", "Business", "First Class" }));

        vehicleComboBox.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        vehicleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Plane", "Helicopter" }));
        vehicleComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                vehicleComboBoxItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Description");

        txtDescription.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N

        customLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        customLabel.setForeground(new java.awt.Color(255, 255, 255));
        customLabel.setText("Airline");

        txtCustom.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Price");

        txtPrice.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        btnCancel.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(vehicleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDestination, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(txtOrigin, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(classComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(txtSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtType)
                    .addComponent(txtCustom)
                    .addComponent(txtPrice))
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(vehicleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        mainFrame.getAdminDashboard();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            String selectedVehicle = vehicleComboBox.getSelectedItem().toString();
            String classAirline = classComboBox.getSelectedItem().toString();
            String destination = txtDestination.getText();
            String origin = txtOrigin.getText();
            String type = txtType.getText();
            String description = txtDescription.getText();
            String custom = txtCustom.getText();
            int seats = txtSeat.getText().isEmpty() ? 0 : Integer.parseInt(txtSeat.getText());
            int price = txtPrice.getText().isEmpty() ? 0 : Integer.parseInt(txtPrice.getText());

            AirlineImp airline;

            if (destination.isEmpty() || origin.isEmpty() || seats <= 0 || price <= 0 || type.isEmpty()
                    || description.isEmpty() || custom.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Kolom belum diisi");
                return;
            }

            if (selectedVehicle.equals("Plane")) {
                Plane plane = new Plane(type, destination, origin, description);
                plane.setMaskapai(custom);
                airline = plane;
            } else {
                Helicopter helicopter = new Helicopter(type, destination, origin, description);
                helicopter.setPilot(custom);
                airline = helicopter;
            }

            airline.setClassAirline(classAirline);
            airline.setTotalSeats(seats);
            airline.setHarga(price);

            mainFrame.getPlatform().getAirline().add(airline);
            mainFrame.getAdminDashboard();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan price/seat menggunakan angka");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void vehicleComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_vehicleComboBoxItemStateChanged
        String selectedVehicle = vehicleComboBox.getSelectedItem().toString();
        if (selectedVehicle.equals("Plane")) {
            customLabel.setText("Maskapai");
        } else {
            customLabel.setText("Pilot");
        }
    }//GEN-LAST:event_vehicleComboBoxItemStateChanged

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtSeatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeatKeyTyped
        char e = evt.getKeyChar();
        if(!Character.isDigit(e)){
            evt.consume();
        }
    }//GEN-LAST:event_txtSeatKeyTyped

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        char e = evt.getKeyChar();
        if(!Character.isDigit(e)){
            evt.consume();
        }
    }//GEN-LAST:event_txtPriceKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox<String> classComboBox;
    private javax.swing.JLabel customLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField txtCustom;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtOrigin;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSeat;
    private javax.swing.JTextField txtType;
    private javax.swing.JComboBox<String> vehicleComboBox;
    // End of variables declaration//GEN-END:variables
}
