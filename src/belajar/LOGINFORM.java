/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class LOGINFORM extends javax.swing.JFrame {

    /**
     * Creates new form LOGINFORM
     */
    public LOGINFORM() {
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
        login = new javax.swing.JLabel();
        password1 = new javax.swing.JLabel();
        username1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        login.setText("LOGIN");
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        password1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password1.setForeground(new java.awt.Color(255, 255, 255));
        password1.setText("PASSWORD");
        jPanel1.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        username1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username1.setForeground(new java.awt.Color(255, 255, 255));
        username1.setText("USERNAME");
        jPanel1.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, -1));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 200, 30));

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        jPanel1.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 70, 40));

        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, 40));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 200, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, -1));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Pictures\\login.jpg")); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
 String inputUsername = username.getText();
    String inputPassword = password.getText();

    if (inputUsername.equals("ronaldo") && inputPassword.equals("bilbosimanjuntak")) {
        JOptionPane.showMessageDialog(this, "Login Berhasil sebagai admin");
        admin project = new admin();
        project.setVisible(true);
        this.dispose(); 
    } else {
        if (otherUser(inputUsername, inputPassword)) {
            JOptionPane.showMessageDialog(this, "Login Berhasil sebagai konsumen");
            pelanggan project = new pelanggan();
            project.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Username atau Password Salah");
        }
    }
} 

private boolean otherUser(String username, String password) {
    return (username.equals("konsumen") && password.equals("password_konsumen")); // TODO add your handling code here:
    }//GEN-LAST:event_okActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
System.exit(0);      // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(LOGINFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGINFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGINFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGINFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGINFORM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton cancel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel login;
    private javax.swing.JButton ok;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel password1;
    private javax.swing.JTextField username;
    private javax.swing.JLabel username1;
    // End of variables declaration//GEN-END:variables
}
