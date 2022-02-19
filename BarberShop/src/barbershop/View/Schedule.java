/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package barbershop.View;

import barbershop.Controller.ScheduleController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author Emanuel
 */
public class Schedule extends javax.swing.JFrame {

    ScheduleController controller;
    /**
     * Creates new form Schedule
     */
    public Schedule() {
        initComponents();
        controller = new ScheduleController(this);
        start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldHour = new javax.swing.JTextField();
        jTextFieldValue = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableScheduling = new javax.swing.JTable();
        jComboBoxService = new javax.swing.JComboBox<>();
        jComboBoxClient = new javax.swing.JComboBox<>();
        jTextFieldID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneObservation = new javax.swing.JTextPane();
        jButtonAddNewSchedule = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextFieldHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 170, -1));
        getContentPane().add(jTextFieldValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 170, -1));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Observation");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Client");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Service");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));
        getContentPane().add(jTextFieldDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 170, -1));

        jLabel8.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Hour");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, -1));

        jTableScheduling.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Client", "Service", "Value", "Date", "Hour", "Observation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableScheduling);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 551, 1000, 350));

        jComboBoxService.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxServiceItemStateChanged(evt);
            }
        });
        jComboBoxService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxServiceActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxService, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 170, -1));

        getContentPane().add(jComboBoxClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 170, -1));
        getContentPane().add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 170, -1));

        jScrollPane1.setViewportView(jTextPaneObservation);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 570, 250));

        jButtonAddNewSchedule.setBackground(new java.awt.Color(153, 255, 153));
        jButtonAddNewSchedule.setText("Schedule");
        jButtonAddNewSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNewScheduleActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAddNewSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 570, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barbershop/View/Images/Agenda-PainelFundo.png"))); // NOI18N
        jLabel2.setToolTipText(null);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, 1050));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barbershop/View/Images/AgendaFundo.png"))); // NOI18N
        jLabel1.setToolTipText(null);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddNewScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNewScheduleActionPerformed
        this.controller.addNewSchedule();
    }//GEN-LAST:event_jButtonAddNewScheduleActionPerformed

    private void jComboBoxServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxServiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxServiceActionPerformed

    private void jComboBoxServiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxServiceItemStateChanged
        this.controller.updateServicePrice();
    }//GEN-LAST:event_jComboBoxServiceItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Schedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddNewSchedule;
    private javax.swing.JComboBox<String> jComboBoxClient;
    private javax.swing.JComboBox<String> jComboBoxService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableScheduling;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldHour;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldValue;
    private javax.swing.JTextPane jTextPaneObservation;
    // End of variables declaration//GEN-END:variables

    private void start() {
        this.controller.updateTable();
        this.controller.updateClient();
        this.controller.updateService();
        this.controller.updateServicePrice();
    }

    public JTable getjTableScheduling() {
        return jTableScheduling;
    }

    public void setjTableScheduling(JTable jTableScheduling) {
        this.jTableScheduling = jTableScheduling;
    }

    public JComboBox<String> getjComboBoxClient() {
        return jComboBoxClient;
    }

    public void setjComboBoxClient(JComboBox<String> jComboBoxClient) {
        this.jComboBoxClient = jComboBoxClient;
    }

    public JComboBox<String> getjComboBoxService() {
        return jComboBoxService;
    }

    public void setjComboBoxService(JComboBox<String> jComboBoxService) {
        this.jComboBoxService = jComboBoxService;
    }

    public JTextField getjTextFieldValue() {
        return jTextFieldValue;
    }

    public void setjTextFieldValue(JTextField jTextFieldValue) {
        this.jTextFieldValue = jTextFieldValue;
    }

    public JTextField getjTextFieldDate() {
        return jTextFieldDate;
    }

    public void setjTextFieldDate(JTextField jTextFieldDate) {
        this.jTextFieldDate = jTextFieldDate;
    }

    public JTextField getjTextFieldHour() {
        return jTextFieldHour;
    }

    public void setjTextFieldHour(JTextField jTextFieldHour) {
        this.jTextFieldHour = jTextFieldHour;
    }

    public JTextField getjTextFieldID() {
        return jTextFieldID;
    }

    public void setjTextFieldID(JTextField jTextFieldID) {
        this.jTextFieldID = jTextFieldID;
    }

    public JTextPane getjTextPaneObservation() {
        return jTextPaneObservation;
    }

    public void setjTextPaneObservation(JTextPane jTextPaneObservation) {
        this.jTextPaneObservation = jTextPaneObservation;
    }




}
