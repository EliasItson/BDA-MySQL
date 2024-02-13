package presentacion;

import dao.ClienteDAO;
import dao.IClienteDAO;
import dao.IConexionBD;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import modelos.Cliente;
import modelos.Credencial;
import negocio.IClienteNegocio;
import negocio.NegocioException;
import org.mindrot.jbcrypt.BCrypt;

public class SignUp extends javax.swing.JFrame {

    private IClienteNegocio clienteNegocio;
    
    public SignUp(IClienteNegocio clienteNegocio) 
    {
        initComponents();
        this.clienteNegocio = clienteNegocio;
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

        signupPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        domicilioLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        nombreTxtField = new javax.swing.JTextField();
        domicilioTxtField = new javax.swing.JTextField();
        userTxtField = new javax.swing.JTextField();
        passPassField = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        registrarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        fechaDateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicacion Bancaria");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signupPanel.setForeground(new java.awt.Color(60, 63, 65));
        signupPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLabel.setFont(new java.awt.Font("Segoe UI", 0, 68)); // NOI18N
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("Registrar Cliente");
        signupPanel.add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 620, 130));

        nombreLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombreLabel.setText("Nombre completo:");
        signupPanel.add(nombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 160, 20));

        domicilioLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        domicilioLabel.setText("Domicilio:");
        signupPanel.add(domicilioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 80, 20));

        fechaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fechaLabel.setText("Fecha de nacimiento:");
        signupPanel.add(fechaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, 20));

        userLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userLabel.setText("Usuario:");
        signupPanel.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, -1, 20));

        passLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passLabel.setText("Contraseña:");
        signupPanel.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, -1, 20));
        signupPanel.add(nombreTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 240, -1));
        signupPanel.add(domicilioTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 240, -1));
        signupPanel.add(userTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 240, -1));

        passPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passPassFieldActionPerformed(evt);
            }
        });
        signupPanel.add(passPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 240, -1));
        signupPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 203, 780, 10));
        signupPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 240, 10));

        registrarBtn.setText("Registrar");
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });
        signupPanel.add(registrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, -1, -1));

        cancelarBtn.setBackground(new java.awt.Color(60, 63, 65));
        cancelarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelarBtn.setText("Cancelar");
        cancelarBtn.setBorder(null);
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });
        signupPanel.add(cancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, 60, 20));
        signupPanel.add(fechaDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 240, -1));

        getContentPane().add(signupPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passPassFieldActionPerformed

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed
        
        String salt = BCrypt.gensalt();
        String hashedPassword = BCrypt.hashpw(new String(passPassField.getPassword()), salt);
        
        passPassField.setText(null);
        
        Cliente cliente = new Cliente(nombreTxtField.getText(), 
                domicilioTxtField.getText(), 
                fechaDateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                userTxtField.getText(),
                hashedPassword,
                salt);
        
        try
        {
            clienteNegocio.addCliente(cliente);
        }
        catch(NegocioException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Notificacion", JOptionPane.ERROR_MESSAGE);
        }
        
        this.dispose();
        Login loginObj = new Login(clienteNegocio);
        loginObj.setVisible(true);
    }//GEN-LAST:event_registrarBtnActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        this.dispose();
        Login loginObj = new Login(clienteNegocio);
        loginObj.setVisible(true);
    }//GEN-LAST:event_cancelarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JLabel domicilioLabel;
    private javax.swing.JTextField domicilioTxtField;
    private com.toedter.calendar.JDateChooser fechaDateChooser;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTxtField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passPassField;
    private javax.swing.JButton registrarBtn;
    private javax.swing.JPanel signupPanel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTxtField;
    // End of variables declaration//GEN-END:variables
}
