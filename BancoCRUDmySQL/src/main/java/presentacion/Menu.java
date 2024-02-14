package presentacion;
import javax.swing.JDialog;
import modelos.Cliente;
import negocio.*;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    private IClienteNegocio clienteNegocio;
    private ICuentaNegocio cuentaNegocio;
    private Cliente cliente;
    
    public Menu() 
    {
        initComponents();
        
        this.setResizable(false);
    }
    
    public Menu(IClienteNegocio clienteNegocio, Cliente cliente, ICuentaNegocio cuentaNegocio) 
    {
        initComponents();
        this.clienteNegocio = clienteNegocio;
        this.cliente = cliente;
        this.cuentaNegocio = cuentaNegocio;
        this.setResizable(false);
    }
    
    private void runFirst()
    {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        tableHeaderLabel = new javax.swing.JLabel();
        clienteLabel = new javax.swing.JLabel();
        cuentasTableScrollPane = new javax.swing.JScrollPane();
        cuentasTable = new javax.swing.JTable();
        perInfoPanel = new javax.swing.JPanel();
        nombreLabel = new javax.swing.JLabel();
        domicilioTxtArea = new javax.swing.JTextArea();
        fechaLabel = new javax.swing.JLabel();
        fechaLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        transfBtn = new javax.swing.JButton();
        newCuentaBtn = new javax.swing.JButton();
        cancelCuentaBtn = new javax.swing.JButton();
        depositoBtn = new javax.swing.JButton();
        updateInfoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicacion Bancaria");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(70, 73, 75));
        menuPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLabel.setFont(new java.awt.Font("Segoe UI", 0, 68)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(180, 180, 180));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("Menu");
        menuPanel.add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 620, 130));

        tableHeaderLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tableHeaderLabel.setForeground(new java.awt.Color(180, 180, 180));
        tableHeaderLabel.setText("Cuentas");
        menuPanel.add(tableHeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 70, 20));

        clienteLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clienteLabel.setForeground(new java.awt.Color(180, 180, 180));
        clienteLabel.setText("Cliente");
        menuPanel.add(clienteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 70, 20));

        cuentasTableScrollPane.setBorder(null);

        cuentasTable.setBackground(new java.awt.Color(71, 73, 76));
        cuentasTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 102, 104), 1, true));
        cuentasTable.setForeground(new java.awt.Color(180, 180, 180));
        cuentasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Cuenta", "Saldo", "Abierta Desde"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cuentasTable.setShowGrid(true);
        cuentasTable.getTableHeader().setReorderingAllowed(false);
        cuentasTableScrollPane.setViewportView(cuentasTable);
        if (cuentasTable.getColumnModel().getColumnCount() > 0) {
            cuentasTable.getColumnModel().getColumn(0).setResizable(false);
            cuentasTable.getColumnModel().getColumn(1).setResizable(false);
            cuentasTable.getColumnModel().getColumn(2).setResizable(false);
        }

        menuPanel.add(cuentasTableScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 300));

        perInfoPanel.setBackground(new java.awt.Color(70, 73, 75));
        perInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(100, 102, 104))); // NOI18N

        nombreLabel.setBackground(new java.awt.Color(70, 73, 75));
        nombreLabel.setForeground(new java.awt.Color(180, 180, 180));

        domicilioTxtArea.setEditable(false);
        domicilioTxtArea.setBackground(new java.awt.Color(71, 74, 76));
        domicilioTxtArea.setColumns(20);
        domicilioTxtArea.setForeground(new java.awt.Color(180, 180, 180));
        domicilioTxtArea.setRows(5);
        domicilioTxtArea.setText("\n");

        fechaLabel.setBackground(new java.awt.Color(70, 73, 75));
        fechaLabel.setForeground(new java.awt.Color(180, 180, 180));

        fechaLabel1.setBackground(new java.awt.Color(70, 73, 75));
        fechaLabel1.setForeground(new java.awt.Color(180, 180, 180));

        javax.swing.GroupLayout perInfoPanelLayout = new javax.swing.GroupLayout(perInfoPanel);
        perInfoPanel.setLayout(perInfoPanelLayout);
        perInfoPanelLayout.setHorizontalGroup(
            perInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(perInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fechaLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(domicilioTxtArea, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        perInfoPanelLayout.setVerticalGroup(
            perInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(domicilioTxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fechaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fechaLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        menuPanel.add(perInfoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 290, 210));

        jSeparator2.setBackground(new java.awt.Color(90, 92, 94));
        jSeparator2.setForeground(new java.awt.Color(120, 122, 124));
        menuPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 203, 800, 10));

        jSeparator1.setBackground(new java.awt.Color(90, 92, 94));
        jSeparator1.setForeground(new java.awt.Color(120, 122, 124));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        menuPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 20, 260));

        transfBtn.setForeground(new java.awt.Color(180, 180, 180));
        transfBtn.setText("Transferencia");
        transfBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 102, 104), 1, true));
        transfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfBtnActionPerformed(evt);
            }
        });
        menuPanel.add(transfBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 640, 120, 30));

        newCuentaBtn.setForeground(new java.awt.Color(180, 180, 180));
        newCuentaBtn.setText("Abrir Cuenta");
        newCuentaBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 102, 104), 2, true));
        newCuentaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCuentaBtnActionPerformed(evt);
            }
        });
        menuPanel.add(newCuentaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, 120, 30));

        cancelCuentaBtn.setForeground(new java.awt.Color(180, 180, 180));
        cancelCuentaBtn.setText("Cancelar Cuenta");
        cancelCuentaBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 102, 104), 1, true));
        cancelCuentaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelCuentaBtnActionPerformed(evt);
            }
        });
        menuPanel.add(cancelCuentaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, 120, 30));

        depositoBtn.setForeground(new java.awt.Color(180, 180, 180));
        depositoBtn.setText("Deposito");
        depositoBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 102, 104), 1, true));
        depositoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositoBtnActionPerformed(evt);
            }
        });
        menuPanel.add(depositoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, 120, 30));

        updateInfoBtn.setBackground(new java.awt.Color(70, 73, 75));
        updateInfoBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateInfoBtn.setForeground(new java.awt.Color(180, 180, 180));
        updateInfoBtn.setText("Editar informacion personal");
        updateInfoBtn.setBorder(null);
        updateInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInfoBtnActionPerformed(evt);
            }
        });
        menuPanel.add(updateInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, -1, -1));

        getContentPane().add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void transfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfBtnActionPerformed
        JDialog transferencia = new Transferencia(this, "Transferencia a Cuenta", true);
        transferencia.setVisible(true);
    }//GEN-LAST:event_transfBtnActionPerformed

    private void newCuentaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCuentaBtnActionPerformed
        JDialog abrirCuenta = new AbrirCuenta(this, "Abrir Cuenta Nueva", true, cuentaNegocio, cliente);
        abrirCuenta.setVisible(true);
        
    }//GEN-LAST:event_newCuentaBtnActionPerformed

    private void cancelCuentaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelCuentaBtnActionPerformed
        JDialog cancelarCuenta = new CancelarCuenta(this, "Cancelar Cuenta", true);
        cancelarCuenta.setVisible(true);
    }//GEN-LAST:event_cancelCuentaBtnActionPerformed

    private void depositoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositoBtnActionPerformed
        JDialog deposito = new Deposito(this, "Deposito a Cuenta Cuenta", true);
        deposito.setVisible(true);
    }//GEN-LAST:event_depositoBtnActionPerformed

    private void updateInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInfoBtnActionPerformed
        JDialog actualizarDatos = new ActualizarDatos(this, "Editar Datos Personales", true);
        actualizarDatos.setVisible(true);
    }//GEN-LAST:event_updateInfoBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLaf Dark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelCuentaBtn;
    private javax.swing.JLabel clienteLabel;
    private javax.swing.JTable cuentasTable;
    private javax.swing.JScrollPane cuentasTableScrollPane;
    private javax.swing.JButton depositoBtn;
    private javax.swing.JTextArea domicilioTxtArea;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel fechaLabel1;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton newCuentaBtn;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JPanel perInfoPanel;
    private javax.swing.JLabel tableHeaderLabel;
    private javax.swing.JButton transfBtn;
    private javax.swing.JButton updateInfoBtn;
    // End of variables declaration//GEN-END:variables
}
