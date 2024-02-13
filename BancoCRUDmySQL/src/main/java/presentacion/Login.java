package presentacion;

import javax.swing.JOptionPane;
import modelos.Cliente;
import negocio.*;
import org.mindrot.jbcrypt.BCrypt;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private IClienteNegocio clienteNegocio;
    
    public Login(IClienteNegocio clienteNegocio) 
    {
        initComponents();
        this.clienteNegocio = clienteNegocio;
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        userTxtField = new javax.swing.JTextField();
        passPassField = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        loginBtn = new javax.swing.JButton();
        signupBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicacion Bancaria");
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(70, 73, 75));
        loginPanel.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledBackground"));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLabel.setFont(new java.awt.Font("Segoe UI", 0, 68)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(180, 180, 180));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("BANCO");
        loginPanel.add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 380, 130));

        userLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userLabel.setForeground(new java.awt.Color(180, 180, 180));
        userLabel.setText("Usuario:");
        loginPanel.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 70, 20));

        passLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passLabel.setForeground(new java.awt.Color(180, 180, 180));
        passLabel.setText("Contraseña:");
        loginPanel.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, 20));

        userTxtField.setBackground(new java.awt.Color(90, 92, 94));
        userTxtField.setForeground(new java.awt.Color(180, 180, 180));
        userTxtField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 102, 104), 1, true));
        loginPanel.add(userTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 240, -1));

        passPassField.setBackground(new java.awt.Color(90, 92, 94));
        passPassField.setForeground(new java.awt.Color(180, 180, 180));
        passPassField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 102, 104), 1, true));
        passPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passPassFieldActionPerformed(evt);
            }
        });
        loginPanel.add(passPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 240, -1));

        jSeparator2.setBackground(new java.awt.Color(90, 92, 94));
        jSeparator2.setForeground(new java.awt.Color(120, 122, 124));
        loginPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 203, 780, 10));

        jSeparator1.setBackground(new java.awt.Color(90, 92, 94));
        jSeparator1.setForeground(new java.awt.Color(120, 122, 124));
        loginPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 460, 180, -1));

        loginBtn.setBackground(new java.awt.Color(77, 79, 81));
        loginBtn.setForeground(new java.awt.Color(180, 180, 180));
        loginBtn.setText("Ingresar");
        loginBtn.setToolTipText("");
        loginBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 102, 104), 2));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        loginPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 90, 20));

        signupBtn.setBackground(new java.awt.Color(70, 73, 75));
        signupBtn.setForeground(new java.awt.Color(180, 180, 180));
        signupBtn.setText("Registrarse");
        signupBtn.setBorder(null);
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });
        loginPanel.add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 480, 70, -1));

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        
        try
        {
            Cliente cliente = clienteNegocio.getClienteByUser(userTxtField.getText());
            
            if (BCrypt.checkpw(new String(passPassField.getPassword()), cliente.getPassword())) 
            {
                System.out.println("Password is correct. Login successful!");
                
                
                this.dispose();
                Menu menuObj = new Menu(clienteNegocio, cliente);
                menuObj.setVisible(true);
            } 
            else 
            {
                System.out.println("Password is incorrect. Login failed.");
                userTxtField.setText("");
                passPassField.setText("");
                JOptionPane.showMessageDialog(this, "Password is incorrect. Login failed.", "Notificacion", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NegocioException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Notificacion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void passPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passPassFieldActionPerformed

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        this.dispose();
        SignUp signupObj = new SignUp(clienteNegocio);
        signupObj.setVisible(true);
    }//GEN-LAST:event_signupBtnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headerLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passPassField;
    private javax.swing.JButton signupBtn;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTxtField;
    // End of variables declaration//GEN-END:variables
}
