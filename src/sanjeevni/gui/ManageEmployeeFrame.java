/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevni.gui;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import sanjeevni.dbutil.DBconnection;
import sanjeevni.pojo.UserProfile;

/**
 *
 * @author Admin
 */
public class ManageEmployeeFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManageEmployeeFrame
     */
    public ManageEmployeeFrame() {
        initComponents();
         setLocationRelativeTo(null);
        Toolkit tk=Toolkit.getDefaultToolkit();// this method give object of toolkit
        Image obj=tk.getImage("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Sanjeevni App\\src\\sanjeevni\\icons\\doctor.png");//remember the standard image getImage method take should be either in gif or jpg
        this.setIconImage(obj);
        lblName.setText("HELLO,USER-"+UserProfile.getUserName().toUpperCase());
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblRemoveEmployee = new javax.swing.JLabel();
        lblViewEmployees = new javax.swing.JLabel();
        lblUpdateEmployee = new javax.swing.JLabel();
        lblAddEmployee = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevni/icons/doctor.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 160, 160));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Manager Employee");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 160, 40));

        lblLogout.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout.setText("Logout");
        lblLogout.setOpaque(true);
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        getContentPane().add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 70, -1));

        lblName.setBackground(new java.awt.Color(0, 0, 0));
        lblName.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Hello, User-");
        lblName.setOpaque(true);
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 630, 40));

        lblRemoveEmployee.setBackground(new java.awt.Color(0, 204, 204));
        lblRemoveEmployee.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblRemoveEmployee.setForeground(new java.awt.Color(255, 255, 255));
        lblRemoveEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRemoveEmployee.setText("Remove Employee");
        lblRemoveEmployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblRemoveEmployee.setOpaque(true);
        lblRemoveEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRemoveEmployeeMouseClicked(evt);
            }
        });
        getContentPane().add(lblRemoveEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 220, 40));

        lblViewEmployees.setBackground(new java.awt.Color(0, 204, 204));
        lblViewEmployees.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblViewEmployees.setForeground(new java.awt.Color(255, 255, 255));
        lblViewEmployees.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewEmployees.setText("View Employee");
        lblViewEmployees.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblViewEmployees.setOpaque(true);
        lblViewEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewEmployeesMouseClicked(evt);
            }
        });
        getContentPane().add(lblViewEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 220, 40));

        lblUpdateEmployee.setBackground(new java.awt.Color(0, 204, 204));
        lblUpdateEmployee.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblUpdateEmployee.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdateEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdateEmployee.setText("Update Employee");
        lblUpdateEmployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblUpdateEmployee.setOpaque(true);
        lblUpdateEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpdateEmployeeMouseClicked(evt);
            }
        });
        getContentPane().add(lblUpdateEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 220, 40));

        lblAddEmployee.setBackground(new java.awt.Color(0, 204, 204));
        lblAddEmployee.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblAddEmployee.setForeground(new java.awt.Color(255, 255, 255));
        lblAddEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddEmployee.setText("Add Employee");
        lblAddEmployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAddEmployee.setOpaque(true);
        lblAddEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddEmployeeMouseClicked(evt);
            }
        });
        getContentPane().add(lblAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 220, 40));

        lblBack.setBackground(new java.awt.Color(0, 0, 0));
        lblBack.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setText("Back");
        lblBack.setOpaque(true);
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        getContentPane().add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 530, 70, 30));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 800, 190));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel10.setText("Sanjeevni Application");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevni/icons/HomePageBG1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAddEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddEmployeeMouseClicked
       AddEmployeesFrame addEmpFrame=new AddEmployeesFrame();
       addEmpFrame.setVisible(true);
       this.dispose();

    }//GEN-LAST:event_lblAddEmployeeMouseClicked

    private void lblUpdateEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateEmployeeMouseClicked
        UpdateEmployeeFrame updateEmpFrame=new UpdateEmployeeFrame();
       updateEmpFrame.setVisible(true);
       this.dispose();

    }//GEN-LAST:event_lblUpdateEmployeeMouseClicked

    private void lblViewEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewEmployeesMouseClicked
     ViewEmployeeFrame view=new ViewEmployeeFrame();
       view.setVisible(true);
       this.dispose();

    }//GEN-LAST:event_lblViewEmployeesMouseClicked

    private void lblRemoveEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoveEmployeeMouseClicked
        RemoveEmployeeFrame removeEmpFrame=new RemoveEmployeeFrame();
       removeEmpFrame.setVisible(true);
       this.dispose();

    }//GEN-LAST:event_lblRemoveEmployeeMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
     AdminOptionsFrame fr=new AdminOptionsFrame();
     fr.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
//        int ans=JOptionPane.showConfirmDialog(null,"Are you sure?","Quitting",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
//     if(ans==JOptionPane.YES_OPTION){
//         DBconnection.closeConnection();
//         System.exit(0);
//     }
 LoginFrame obj = new LoginFrame();
 obj.setVisible(true);
 this.dispose();

    }//GEN-LAST:event_lblLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(ManageEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddEmployee;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRemoveEmployee;
    private javax.swing.JLabel lblUpdateEmployee;
    private javax.swing.JLabel lblViewEmployees;
    // End of variables declaration//GEN-END:variables
}
