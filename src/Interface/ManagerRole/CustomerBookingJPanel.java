/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManagerRole;

import Business.Airliner;
import Business.AirlinerSchedule;
import Business.TravelAgent;
import Interface.UserInformation.CreateCustomer;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aviti
 */
public class CustomerBookingJPanel extends javax.swing.JPanel {
private JPanel RightJPanel;
private TravelAgent travelAgent;
private AirlinerSchedule airlinerschedule;


    /**
     * Creates new form CustomerBookingJPanel
     */
    

    CustomerBookingJPanel(JPanel RightJPanel, AirlinerSchedule airlinerschedule, TravelAgent travelAgent) {
       
           initComponents();
        this.airlinerschedule=airlinerschedule;
        this.travelAgent=travelAgent;
        this.RightJPanel=RightJPanel;
        
       
        
        
        
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
        GOBTN = new javax.swing.JButton();
        AirlineNameTextField = new javax.swing.JTextField();
        TravelTimeTextField = new javax.swing.JTextField();
        AirlineName = new javax.swing.JLabel();
        TravelTime = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SearchCatalog = new javax.swing.JTable();
        BookBtn = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Search Flights");

        GOBTN.setText("GO>>");
        GOBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOBTNActionPerformed(evt);
            }
        });

        AirlineName.setText("AirlineName");

        TravelTime.setText("Travel Time");

        SearchCatalog.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SearchCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airline Name", "Flight Number", "Departure", "Arrival", "Schedule Takeoff", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(SearchCatalog);

        BookBtn.setText("Book");
        BookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TravelTime)
                            .addComponent(AirlineName))
                        .addGap(182, 182, 182)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AirlineNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TravelTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(GOBTN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BookBtn)
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AirlineName)
                    .addComponent(AirlineNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TravelTime)
                    .addComponent(TravelTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(GOBTN)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BookBtn)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void GOBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOBTNActionPerformed
        // TODO add your handling code here:
        
        ArrayList<AirlinerSchedule>filterresult= new ArrayList<AirlinerSchedule>();
        
        String name=AirlineNameTextField.getText();
        String time=TravelTimeTextField.getText();
        
       for(AirlinerSchedule a :airlinerschedule.getAirlineScheduleDirectory().getAirlinerScheduleDirect()){
     String Airlinename= a.getAirline();
      String td=a.getTimeofDay();
       
       if(name.equalsIgnoreCase(Airlinename)   && time.equalsIgnoreCase(td)){
       
       filterresult.add(a);
     
       DefaultTableModel dtm = (DefaultTableModel)SearchCatalog.getModel();
        dtm.setRowCount(0);
        
        for(AirlinerSchedule B : filterresult){
            Object[] row = new Object[6];
            row[0]=B;
            row[1]=B.getFlightNumber();
            row[2]=B.getDepartureLocation();
            row[3]=B.getArrivalLocation();
            row[4]=B.getTimeofDay();
            row[5]=B.getDate();
            dtm.addRow(row);
        }
       
       
       
       
       }else{
       JOptionPane.showMessageDialog(null,"Flight not found!");
       }
       
       }
              
        
               
        
    }//GEN-LAST:event_GOBTNActionPerformed

    private void BookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookBtnActionPerformed
        // TODO add your handling code here:
        
        
        int selectRow=SearchCatalog.getSelectedRow();
        if(selectRow<0){
        JOptionPane.showMessageDialog(null, "Please Select a Row");
        }else{
         CreateCustomer create = new CreateCustomer(RightJPanel,travelAgent);
        RightJPanel.add("CreateCustomer",create);
        CardLayout layout =(CardLayout)RightJPanel.getLayout();
        layout.next(RightJPanel);
        }
        
    }//GEN-LAST:event_BookBtnActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AirlineName;
    private javax.swing.JTextField AirlineNameTextField;
    private javax.swing.JButton BookBtn;
    private javax.swing.JButton GOBTN;
    private javax.swing.JTable SearchCatalog;
    private javax.swing.JLabel TravelTime;
    private javax.swing.JTextField TravelTimeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
