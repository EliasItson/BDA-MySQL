/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package presentacion;

/**
 *
 * @author Ryzen 5
 */
public class AbrirCuenta extends javax.swing.JDialog {

    /**
     * Creates new form AbrirCuenta
     */
    public AbrirCuenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
    }
    
    public AbrirCuenta(java.awt.Frame parent, String title, boolean modal) {
        super(parent, title, modal);
        initComponents();
        this.setResizable(false);
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
        userLabel = new javax.swing.JLabel();
        userLabel1 = new javax.swing.JLabel();
        userLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        loginBtn1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(70, 73, 75));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        userLabel.setForeground(new java.awt.Color(180, 180, 180));
        userLabel.setText("Cuenta Nueva");
        jPanel1.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 160, 20));

        userLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userLabel1.setForeground(new java.awt.Color(180, 180, 180));
        userLabel1.setText("Numero de cuenta:");
        jPanel1.add(userLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 170, 20));

        userLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userLabel2.setForeground(new java.awt.Color(180, 180, 180));
        userLabel2.setText("Cliente:");
        jPanel1.add(userLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 80, 20));

        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 83, 85), 1, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 220, 20));

        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 83, 85), 1, true));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 220, 20));

        loginBtn.setBackground(new java.awt.Color(77, 79, 81));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(180, 180, 180));
        loginBtn.setText("Abrir Cuenta");
        loginBtn.setToolTipText("");
        loginBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 102, 104), 2));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 110, 30));

        loginBtn1.setBackground(new java.awt.Color(77, 79, 81));
        loginBtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginBtn1.setForeground(new java.awt.Color(180, 180, 180));
        loginBtn1.setText("Regresar");
        loginBtn1.setToolTipText("");
        loginBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 102, 104), 2));
        loginBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 100, 30));

        jSeparator1.setBackground(new java.awt.Color(90, 92, 94));
        jSeparator1.setForeground(new java.awt.Color(120, 122, 124));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 103, 480, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void loginBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtn1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_loginBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(AbrirCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbrirCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbrirCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbrirCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AbrirCuenta dialog = new AbrirCuenta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton loginBtn1;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    private javax.swing.JLabel userLabel2;
    // End of variables declaration//GEN-END:variables
}
