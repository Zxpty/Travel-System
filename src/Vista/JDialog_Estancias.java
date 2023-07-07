package Vista;

import Control.Arbol_Estancias;
import Control.Nodo_Estancias;
import DAOs.EstanciasDAO;
import DAOs.HotelesDAO;
import Modelo.Estancias;
import Modelo.Hoteles;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class JDialog_Estancias extends javax.swing.JDialog {
    
    private Arbol_Estancias objArbol_Estancias = new Arbol_Estancias();
    private JDialog_ConsultarEstancias objConsultarEstancias = new JDialog_ConsultarEstancias(null, false);
    private HashMap<Integer, Hoteles> objHash = new HashMap<>();
    
    public JDialog_Estancias(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        HotelesDAO.ConsultarCbo(cbo_CodigoHotel);
        EstanciasDAO.ConsultarLista(objArbol_Estancias);
        EstanciasDAO.ConsultarHashHoteles(objHash);
        cbo_CodigoHotel.setSelectedIndex(-1);
    }
    
    public void limpiar(){
        txt_CodigoEstancia.setText("");
        txt_Pension.setText("");
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        cbo_CodigoHotel.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_CodigoEstancia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Pension = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_Consultar = new javax.swing.JButton();
        btn_Guardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbo_CodigoHotel = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        btn_ConsultarCodigoH = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ESTANCIAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(37, 57, 86));
        jLabel5.setText("CODIGO ESTANCIA:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        txt_CodigoEstancia.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_CodigoEstancia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 57, 86)));
        jPanel1.add(txt_CodigoEstancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 500, 50));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(37, 57, 86));
        jLabel6.setText("PENSION:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        txt_Pension.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_Pension.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 57, 86)));
        jPanel1.add(txt_Pension, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 500, 50));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(37, 57, 86));
        jLabel7.setText("FECHA ENTRADA:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(37, 57, 86));
        jLabel8.setText("FECHA SALIDA:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(37, 57, 86));
        jLabel9.setText("CODIGO HOTEL");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        btn_Consultar.setBackground(new java.awt.Color(37, 57, 86));
        btn_Consultar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Consultar.setText("CONSULTAR");
        btn_Consultar.setBorder(null);
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 500, 40));

        btn_Guardar.setBackground(new java.awt.Color(37, 57, 86));
        btn_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Guardar.setText("REGISTRAR");
        btn_Guardar.setBorder(null);
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 500, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrrar.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        cbo_CodigoHotel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cbo_CodigoHotel.setForeground(new java.awt.Color(37, 57, 86));
        cbo_CodigoHotel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbo_CodigoHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 320, 40));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 230, 50));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 230, 50));

        btn_ConsultarCodigoH.setBackground(new java.awt.Color(37, 57, 86));
        btn_ConsultarCodigoH.setForeground(new java.awt.Color(255, 255, 255));
        btn_ConsultarCodigoH.setText("CONSULTAR CODIGO");
        btn_ConsultarCodigoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarCodigoHActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ConsultarCodigoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 160, 40));

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

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        try {
            int cod = Integer.parseInt(txt_CodigoEstancia.getText());
            String pension = txt_Pension.getText();
            java.util.Date X = jDateChooser1.getDate();
            java.sql.Date Fechaentrada = new java.sql.Date(X.getTime());
            java.util.Date Y = jDateChooser2.getDate();
            java.sql.Date FechaSalida = new java.sql.Date(Y.getTime());
            int codigoHotel = Integer.parseInt(cbo_CodigoHotel.getSelectedItem().toString());
            Object[] Registro = {cod, pension, Fechaentrada, FechaSalida, codigoHotel};
            Estancias elemento = new Estancias(Registro);
            EstanciasDAO.Insertar(elemento);
            Nodo_Estancias raiz = objArbol_Estancias.Agregar(objArbol_Estancias.getRaiz(), elemento);
            objArbol_Estancias.setRaiz(raiz);
            limpiar();
            EstanciasDAO.ConsultarLista(objArbol_Estancias);
            txt_CodigoEstancia.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente los datos.");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione correctamente las fechas.");
        }
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarActionPerformed
        objConsultarEstancias.setVisible(true);
        objConsultarEstancias.setObjArbol_Estancias(objArbol_Estancias);
        EstanciasDAO.ConsultarLista(objArbol_Estancias);
        objConsultarEstancias.llenar();
    }//GEN-LAST:event_btn_ConsultarActionPerformed

    private void btn_ConsultarCodigoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarCodigoHActionPerformed
        try {
            int codigoHotel = Integer.parseInt(cbo_CodigoHotel.getSelectedItem().toString());
            if (objHash.isEmpty() == false){
                JDialog_Consultar1 objConsultar = new JDialog_Consultar1(null, false);
                Hoteles X = objHash.get(codigoHotel);
                objArbol_Estancias.DatosHotel(JDialog_Consultar1.jTextArea1, X);
                objConsultar.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_ConsultarCodigoHActionPerformed

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
            java.util.logging.Logger.getLogger(JDialog_Estancias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_Estancias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_Estancias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_Estancias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_Estancias dialog = new JDialog_Estancias(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_ConsultarCodigoH;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JComboBox<String> cbo_CodigoHotel;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_CodigoEstancia;
    private javax.swing.JTextField txt_Pension;
    // End of variables declaration//GEN-END:variables
}
