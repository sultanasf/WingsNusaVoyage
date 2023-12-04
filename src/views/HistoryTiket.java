
package views;

import apps.MainFrame;
import javax.swing.JPanel;
import models.History;
import models.Customer;
import models.implementations.AirlineImp;
import models.implementations.UserImp;
import views.components.CardHistory;

public class HistoryTiket extends javax.swing.JPanel {
    
    private MainFrame mainFrame;
    private UserImp user;

    public HistoryTiket(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
        this.PanelCard.removeAll();
        int currentUser = mainFrame.getCurrentUser();
        this.user = mainFrame.getPlatform().getUserIndex(currentUser);
        getListCard();
    }
    
    public void listCardAirline(JPanel component) {
        this.PanelCard.add(component);
        this.PanelCard.revalidate();
        this.PanelCard.repaint();
    }
    
    public MainFrame getMainFrame() {
        return this.mainFrame;
    }
    
    public void changePanel(JPanel view) {
        this.PanelCard.removeAll();
        this.PanelCard.repaint();
        this.PanelCard.add(view);
        this.PanelCard.validate();
    }
    
    public void getListCard() {
        this.PanelCard.removeAll();
        this.PanelCard.repaint();
        if(user instanceof Customer) {
            Customer customer = (Customer) user;
            if (customer.getHistory() != null) {
                for (AirlineImp airline : customer.getHistory().getListcart()) {
                    getCardHistory(airline);
                }
            }
            this.PanelCard.validate();
        }
    }
    
    public void getCardHistory(AirlineImp airline){
        listCardAirline(new CardHistory(airline,this,user));
    }
//    public void getDetailAirline(AirlineImp airline) {
//        changePanel(new DetailAirline(airline,this));
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelCard = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WingsNusaVoyage");

        jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back-square-1.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 384, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        PanelCard.setLayout(new javax.swing.BoxLayout(PanelCard, javax.swing.BoxLayout.PAGE_AXIS));
        jScrollPane1.setViewportView(PanelCard);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.mainFrame.getCustomerDashboard();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCard;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
