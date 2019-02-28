/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManagerRole;

import Business.TravelAgent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.Airliner;
import java.awt.CardLayout;
import java.awt.Component;
/**
 *
 * @author aviti
 */
public class ViewAirlinersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAirliners
     */
    private TravelAgent travelAgent;
    private Airliner airline;
    private JPanel RightJPanel;
    

    public ViewAirlinersJPanel(JPanel RightJPanel, Airliner airline, TravelAgent travelagent) {
        initComponents();
        
        this.airline=airline;
        this.travelAgent=travelAgent;
        this.RightJPanel=RightJPanel;
        
        
            AirlinernameTextField.setText(airline.getAirlinerName());
            AirlinerDescTextField.setText(airline.getAirlinerDescription());
            AirlinerPhnTextField.setText(String.valueOf(airline.getAirlinerPhonenumber()));
            AirlinerIDTextField.setText(String.valueOf(airline.getAirlinerID()));
           
        
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
        ViewAirlinersScreen = new javax.swing.JLabel();
        lblRoutingNo = new javax.swing.JLabel();
        AirlinernameTextField = new javax.swing.JTextField();
        lblAccNo = new javax.swing.JLabel();
        AirlinerIDTextField = new javax.swing.JTextField();
        lblBankName = new javax.swing.JLabel();
        AirlinerPhnTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AirlinerDescTextField = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        ViewAirlinersScreen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ViewAirlinersScreen.setText("View Airliners Screen");

        lblRoutingNo.setText("Airliner Name");

        AirlinernameTextField.setEditable(false);

        lblAccNo.setText("Airliner ID");

        AirlinerIDTextField.setEditable(false);

        lblBankName.setText("Airliner Phone Number");

        AirlinerPhnTextField.setEditable(false);

        jLabel1.setText("Description");

        AirlinerDescTextField.setEditable(false);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(ViewAirlinersScreen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(lblRoutingNo)))
                .addContainerGap(240, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(260, 260, 260)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAccNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblBankName)
                                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel1))
                            .addGap(45, 45, 45)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AirlinerIDTextField)
                                .addComponent(AirlinerPhnTextField)
                                .addComponent(AirlinernameTextField)
                                .addComponent(AirlinerDescTextField)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(BackBtn)))
                    .addContainerGap(221, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ViewAirlinersScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblRoutingNo)
                .addContainerGap(316, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(AirlinernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AirlinerIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBankName)
                        .addComponent(AirlinerPhnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(AirlinerDescTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSave)
                        .addComponent(btnUpdate))
                    .addGap(29, 29, 29)
                    .addComponent(BackBtn)
                    .addContainerGap(105, Short.MAX_VALUE)))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
       
            AirlinerPhnTextField.setEditable(true);
            AirlinernameTextField.setEditable(true);
            AirlinerDescTextField.setEnabled(true);
            AirlinerIDTextField.setEnabled(true);
            btnSave.setEnabled(true);
            btnUpdate.setEnabled(false);

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
            AirlinerPhnTextField.setEditable(false);
            AirlinernameTextField.setEditable(false);
            AirlinerDescTextField.setEnabled(false);
            AirlinerIDTextField.setEnabled(false);
            
            
            btnSave.setEnabled(false);
            btnUpdate.setEnabled(true);
        try{
            
            String Airlinername=AirlinernameTextField.getText();
            String AirlinerDescription=AirlinerDescTextField.getText();
            int AirlinerPhonenumber=Integer.parseInt(AirlinerPhnTextField.getText());
            int AirlinerID=(Integer.parseInt(AirlinerIDTextField.getText()));
           
            
            if(Airlinername.isEmpty()==true || AirlinerDescription.isEmpty()==true){
               throw new Exception(); 
                
                        }
            else{
            airline.setAirlinerName(Airlinername);
            airline.setAirlinerDescription(AirlinerDescription);
            airline.setAirlinerID(AirlinerID);
            airline.setAirlinerPhonenumber(AirlinerPhonenumber);
            }
            JOptionPane.showMessageDialog(null, "Account updated successfully"); 
        }
        
                   
        
catch(Exception e){

e.getMessage();
JOptionPane.showMessageDialog(null, "Please enter correct values");

}
    }//GEN-LAST:event_btnSaveActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:

        backAction();
    }//GEN-LAST:event_BackBtnActionPerformed

private void backAction() {
        RightJPanel.remove(this);
        Component[] componentArray = RightJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageAirlinersJPanel manageairliners = (ManageAirlinersJPanel) component;
        manageairliners.populate();
        CardLayout layout = (CardLayout) RightJPanel.getLayout();
        layout.previous(RightJPanel);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AirlinerDescTextField;
    private javax.swing.JTextField AirlinerIDTextField;
    private javax.swing.JTextField AirlinerPhnTextField;
    private javax.swing.JTextField AirlinernameTextField;
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel ViewAirlinersScreen;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAccNo;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblRoutingNo;
    // End of variables declaration//GEN-END:variables
}