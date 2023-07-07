package Vista;

import Control.ArbolSucursales;
import Control.Nodo_Sucursales;
import DAOs.SucursalesDAO;
import Modelo.Sucursales;
import javax.swing.JOptionPane;

public class JDialog_Sucursales extends javax.swing.JDialog {
    
    private ArbolSucursales objArbolSucursales = new ArbolSucursales();
    JDialog_ConsultarSucursal objConsultarSucursal = new JDialog_ConsultarSucursal(null, false);
    
    public JDialog_Sucursales(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        objConsultarSucursal.llenar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_CodigoSucursal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_DireccionSucursal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_TelefonoSucursal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_Consultar = new javax.swing.JButton();
        btn_Registrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_CodigoSucursal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_CodigoSucursal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 57, 86)));
        jPanel1.add(txt_CodigoSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 500, 50));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(37, 57, 86));
        jLabel5.setText("CODIGO SUCURSAL :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        txt_DireccionSucursal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_DireccionSucursal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 57, 86)));
        jPanel1.add(txt_DireccionSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 500, 50));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(37, 57, 86));
        jLabel6.setText("DIRECCION SUCURSAL :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        txt_TelefonoSucursal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_TelefonoSucursal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 57, 86)));
        jPanel1.add(txt_TelefonoSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 500, 50));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(37, 57, 86));
        jLabel7.setText("TELEFONO SUCURSAL :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        btn_Consultar.setBackground(new java.awt.Color(37, 57, 86));
        btn_Consultar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Consultar.setText("CONSULTAR");
        btn_Consultar.setBorder(null);
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 500, 50));

        btn_Registrar.setBackground(new java.awt.Color(37, 57, 86));
        btn_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Registrar.setText("REGISTRAR");
        btn_Registrar.setBorder(null);
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 500, 50));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRO DE SUCURSAL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrrar.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sucursal.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarActionPerformed
        objConsultarSucursal.setVisible(true);
        objConsultarSucursal.setObjArbolSucursales(objArbolSucursales);
        SucursalesDAO.ConsultarLista(objArbolSucursales);
        objConsultarSucursal.llenar();
    }//GEN-LAST:event_btn_ConsultarActionPerformed

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        try {
            int cod = Integer.parseInt(txt_CodigoSucursal.getText());
            String direccion = txt_DireccionSucursal.getText();
            String telefono = txt_TelefonoSucursal.getText();
            Object[] registro = {cod, direccion, telefono};
            Sucursales elemento = new Sucursales(registro);
            SucursalesDAO.Insertar(elemento);
            Nodo_Sucursales raiz = objArbolSucursales.Agregar(objArbolSucursales.getRaiz(), elemento);
            objArbolSucursales.setRaiz(raiz);
            //objArbolSucursales.listar(tbl_TablaSucursal);
            SucursalesDAO.ConsultarLista(objArbolSucursales);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente los datos.");
        }
            
    }//GEN-LAST:event_btn_RegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(JDialog_Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_Sucursales dialog = new JDialog_Sucursales(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_CodigoSucursal;
    private javax.swing.JTextField txt_DireccionSucursal;
    private javax.swing.JTextField txt_TelefonoSucursal;
    // End of variables declaration//GEN-END:variables
}
