/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package presentacion;

/**
 *
 * @author Ryzen 5
 */
public class ActualizarDatos extends javax.swing.JDialog {

    /**
     * Creates new form AbrirCuenta
     */
    public ActualizarDatos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
    }
    
    public ActualizarDatos(java.awt.Frame parent, String title, boolean modal) {
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

        editarDatosPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        actualizarBtn = new javax.swing.JButton();
        regresarBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        domicilioLabel = new javax.swing.JLabel();
        nombreTxtField = new javax.swing.JTextField();
        domicilioTxtField = new javax.swing.JTextField();
        fechaDateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editarDatosPanel.setBackground(new java.awt.Color(70, 73, 75));
        editarDatosPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(180, 180, 180));
        headerLabel.setText("Editar datos personales");
        editarDatosPanel.add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 260, 30));

        fechaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fechaLabel.setForeground(new java.awt.Color(180, 180, 180));
        fechaLabel.setText("Fecha de Nacimiento:");
        editarDatosPanel.add(fechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 170, 20));

        nombreLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(180, 180, 180));
        nombreLabel.setText("Nombre:");
        editarDatosPanel.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 140, 20));

        actualizarBtn.setBackground(new java.awt.Color(77, 79, 81));
        actualizarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        actualizarBtn.setForeground(new java.awt.Color(180, 180, 180));
        actualizarBtn.setText("Actualizar");
        actualizarBtn.setToolTipText("");
        actualizarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 102, 104), 2));
        actualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBtnActionPerformed(evt);
            }
        });
        editarDatosPanel.add(actualizarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 160, 30));

        regresarBtn.setBackground(new java.awt.Color(77, 79, 81));
        regresarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        regresarBtn.setForeground(new java.awt.Color(180, 180, 180));
        regresarBtn.setText("Regresar");
        regresarBtn.setToolTipText("");
        regresarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 102, 104), 2));
        regresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtnActionPerformed(evt);
            }
        });
        editarDatosPanel.add(regresarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 160, 30));

        jSeparator1.setBackground(new java.awt.Color(90, 92, 94));
        jSeparator1.setForeground(new java.awt.Color(120, 122, 124));
        editarDatosPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 103, 480, 20));

        domicilioLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        domicilioLabel.setForeground(new java.awt.Color(180, 180, 180));
        domicilioLabel.setText("Domicilio");
        editarDatosPanel.add(domicilioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 170, 20));
        editarDatosPanel.add(nombreTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 220, -1));
        editarDatosPanel.add(domicilioTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 220, -1));
        editarDatosPanel.add(fechaDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 220, -1));

        getContentPane().add(editarDatosPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_actualizarBtnActionPerformed

    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_regresarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ActualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ActualizarDatos dialog = new ActualizarDatos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton actualizarBtn;
    private javax.swing.JLabel domicilioLabel;
    private javax.swing.JTextField domicilioTxtField;
    private javax.swing.JPanel editarDatosPanel;
    private com.toedter.calendar.JDateChooser fechaDateChooser;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTxtField;
    private javax.swing.JButton regresarBtn;
    // End of variables declaration//GEN-END:variables
}
