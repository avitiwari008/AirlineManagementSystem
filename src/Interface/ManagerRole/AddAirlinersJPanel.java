/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManagerRole;

import Business.AirlinerDirectory;
import Business.TravelAgent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.Airliner;
import Business.AirlinerSchedule;
import java.awt.CardLayout;
import java.awt.Component;

/**
 *
 * @author aviti
 */
public class AddAirlinersJPanel extends javax.swing.JPanel {
private JPanel RightJPanel;
private TravelAgent travelagent;
private AirlinerSchedule airlinerschedule;

    /**
     * Creates new form AddAirliners
     */
   

   public AddAirlinersJPanel(JPanel RightJPanel, TravelAgent travelagent,AirlinerSchedule airlinerschedule) {
        initComponents();
        
        this.RightJPanel=RightJPanel;
        this.travelagent=travelagent;
        this.airlinerschedule=airlinerschedule;
        
        
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
        NewAirliner = new javax.swing.JLabel();
        AirlinerNameField = new javax.swing.JTextField();
        BackBtn = new javax.swing.JButton();
        AddAirlinerBtn = new javax.swing.JButton();
        AirlinerIdTextField = new javax.swing.JTextField();
        AirlinerPhonenumberTextField = new javax.swing.JTextField();
        AirlinerNameLabel = new javax.swing.JLabel();
        AirlinerIdLabel = new javax.swing.JLabel();
        AirlinerPhoneNumberLabel = new javax.swing.JLabel();
        AirlinerDescriptionLabel = new javax.swing.JLabel();
        AirlinerDescriptionTextField = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        NewAirliner.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NewAirliner.setText("New Airliner");

        BackBtn.setText("<<Back Button");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        AddAirlinerBtn.setText("Add Airliner");
        AddAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAirlinerBtnActionPerformed(evt);
            }
        });

        AirlinerNameLabel.setText("AirlinerName");

        AirlinerIdLabel.setText("Airliner ID");

        AirlinerPhoneNumberLabel.setText("Airliner Phone Number");

        AirlinerDescriptionLabel.setText("Airliner Description");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(BackBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                .addComponent(AddAirlinerBtn)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(NewAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AirlinerNameLabel)
                            .addComponent(AirlinerIdLabel)
                            .addComponent(AirlinerPhoneNumberLabel)
                            .addComponent(AirlinerDescriptionLabel))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AirlinerDescriptionTextField)
                            .addComponent(AirlinerNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(AirlinerIdTextField)
                            .addComponent(AirlinerPhonenumberTextField))
                        .addGap(267, 267, 267))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(NewAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AirlinerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AirlinerNameLabel))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AirlinerIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AirlinerIdLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AirlinerPhonenumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AirlinerPhoneNumberLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AirlinerDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AirlinerDescriptionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBtn)
                    .addComponent(AddAirlinerBtn))
                .addGap(32, 32, 32))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void AddAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAirlinerBtnActionPerformed
        // TODO add your handling code here:
        
        
       
        try{    
        int airlinerphonenumber=   Integer.parseInt(AirlinerPhonenumberTextField.getText());
        
       int airlinerId=Integer.parseInt(AirlinerIdTextField.getText());
        
        String airlinerName=AirlinerNameField.getText();
        
        String airlinerDesc=AirlinerDescriptionTextField.getText();
        
        if(airlinerName.isEmpty()==true || airlinerDesc.isEmpty()==true ){
        throw new Exception();
        }
        else{
        
           
            Airliner airliner = travelagent.getAirlinerDirectory().addAirliners();
            
            airliner.setAirlinerName(airlinerName);
            airliner.setAirlinerID(airlinerId);
            airliner.setAirlinerPhonenumber(airlinerphonenumber);
            airliner.setAirlinerDescription(airlinerDesc);
            
            JOptionPane.showMessageDialog(null, "Airliner Added Successfully");
        }
    }                                         
catch(Exception e){

e.getMessage();
JOptionPane.showMessageDialog(null, "Please enter correct values");

}
        
        
    }//GEN-LAST:event_AddAirlinerBtnActionPerformed

    
    
    private void backAction() {
        RightJPanel.remove(this);
        Component[] componentArray = RightJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageAirlinersJPanel manageAirlinersJPanel = (ManageAirlinersJPanel) component;
        manageAirlinersJPanel.populate();
        CardLayout layout = (CardLayout) RightJPanel.getLayout();
        layout.previous(RightJPanel);
    }
    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        
            
        
        
         
        
        backAction();
        
    }//GEN-LAST:event_BackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAirlinerBtn;
    private javax.swing.JLabel AirlinerDescriptionLabel;
    private javax.swing.JTextField AirlinerDescriptionTextField;
    private javax.swing.JLabel AirlinerIdLabel;
    private javax.swing.JTextField AirlinerIdTextField;
    private javax.swing.JTextField AirlinerNameField;
    private javax.swing.JLabel AirlinerNameLabel;
    private javax.swing.JLabel AirlinerPhoneNumberLabel;
    private javax.swing.JTextField AirlinerPhonenumberTextField;
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel NewAirliner;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
