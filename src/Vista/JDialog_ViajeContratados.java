package Vista;

import Control.Arbol_ViajesContratados;
import Control.Nodo_ViajesContratados;
import DAOs.EstanciasDAO;
import DAOs.SucursalesDAO;
import DAOs.TuristasDAO;
import DAOs.ViajesContratadosDAO;
import Modelo.Estancias;
import Modelo.Hoteles;
import Modelo.Sucursales;
import Modelo.Turistas;
import Modelo.ViajesContratados;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class JDialog_ViajeContratados extends javax.swing.JDialog {

    private Arbol_ViajesContratados objArbol_ViajesContratados = new Arbol_ViajesContratados();
    private JDialog_ConsultarContratados objVentana = new JDialog_ConsultarContratados(null, false);
    private HashMap<Integer, Sucursales> objHashSucursales = new HashMap<>();
    private HashMap<Integer, Turistas> objHashTuristas = new HashMap<>();
    private HashMap<Integer, Estancias> objHashEstancias = new HashMap<>();
    private HashMap<Integer, Hoteles> objHashHoteles = new HashMap<>();
    
    public JDialog_ViajeContratados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        TuristasDAO.ConsultarCbo(cbo_CodigoTuristas);
        SucursalesDAO.ConsultarCbo(cbo_CodigoSucursal);
        EstanciasDAO.ConsultarCbo(cbo_CodigoEstancia);
        ViajesContratadosDAO.ConsultarHashSucursales(objHashSucursales);
        ViajesContratadosDAO.ConsultarHashTuristas(objHashTuristas);
        ViajesContratadosDAO.ConsultarHashEstancias(objHashEstancias);
        EstanciasDAO.ConsultarHashHoteles(objHashHoteles);
        limpiar();
    }
    
    public void limpiar(){
        txt_CodigoContratados.setText("");
        cbo_CodigoTuristas.setSelectedIndex(-1);
        cbo_CodigoSucursal.setSelectedIndex(-1);
        cbo_CodigoEstancia.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_CodigoContratados = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbo_CodigoEstancia = new javax.swing.JComboBox<>();
        cbo_CodigoTuristas = new javax.swing.JComboBox<>();
        cbo_CodigoSucursal = new javax.swing.JComboBox<>();
        btn_Consultar_Gurdar = new javax.swing.JButton();
        btn_ConsultarEstancia = new javax.swing.JButton();
        btn_ConsultarTurista = new javax.swing.JButton();
        btn_ConsultarSucursal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VIAJES CONTRATADOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(37, 57, 86));
        jLabel5.setText("CODIGO :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        txt_CodigoContratados.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_CodigoContratados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 57, 86)));
        jPanel1.add(txt_CodigoContratados, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 500, 50));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(37, 57, 86));
        jLabel6.setText("CODIGO TURISTA :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(37, 57, 86));
        jLabel7.setText("CODIGO SUCURSAL:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(37, 57, 86));
        jLabel8.setText("CODIGO ESTANCIA:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrrar.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        cbo_CodigoEstancia.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cbo_CodigoEstancia.setForeground(new java.awt.Color(37, 57, 86));
        cbo_CodigoEstancia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbo_CodigoEstancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 320, 40));

        cbo_CodigoTuristas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cbo_CodigoTuristas.setForeground(new java.awt.Color(37, 57, 86));
        cbo_CodigoTuristas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbo_CodigoTuristas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 320, 40));

        cbo_CodigoSucursal.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cbo_CodigoSucursal.setForeground(new java.awt.Color(37, 57, 86));
        cbo_CodigoSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbo_CodigoSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 320, 40));

        btn_Consultar_Gurdar.setBackground(new java.awt.Color(37, 57, 86));
        btn_Consultar_Gurdar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Consultar_Gurdar.setText("CONSULTAR Y GUARDAR");
        btn_Consultar_Gurdar.setBorder(null);
        btn_Consultar_Gurdar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Consultar_GurdarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Consultar_Gurdar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 500, 50));

        btn_ConsultarEstancia.setBackground(new java.awt.Color(37, 57, 86));
        btn_ConsultarEstancia.setForeground(new java.awt.Color(255, 255, 255));
        btn_ConsultarEstancia.setText("CONSULTAR ESTANCIA");
        btn_ConsultarEstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarEstanciaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ConsultarEstancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 160, 40));

        btn_ConsultarTurista.setBackground(new java.awt.Color(37, 57, 86));
        btn_ConsultarTurista.setForeground(new java.awt.Color(255, 255, 255));
        btn_ConsultarTurista.setText("CONSULTAR TURISTA");
        btn_ConsultarTurista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarTuristaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ConsultarTurista, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 160, 40));

        btn_ConsultarSucursal.setBackground(new java.awt.Color(37, 57, 86));
        btn_ConsultarSucursal.setForeground(new java.awt.Color(255, 255, 255));
        btn_ConsultarSucursal.setText("CONSULTAR SUCURSAL");
        btn_ConsultarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarSucursalActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ConsultarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 160, 40));

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

    private void btn_Consultar_GurdarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Consultar_GurdarActionPerformed
        try {
            int Codigo = Integer.parseInt(txt_CodigoContratados.getText());
            int CodigoTurista = Integer.parseInt(cbo_CodigoTuristas.getSelectedItem().toString());
            int CodigoSucursal = Integer.parseInt(cbo_CodigoSucursal.getSelectedItem().toString());
            int CodigoEstancia = Integer.parseInt(cbo_CodigoEstancia.getSelectedItem().toString());
            ViajesContratados Elemento = new ViajesContratados(new Object[]{Codigo, CodigoTurista, CodigoSucursal, CodigoEstancia});
            ViajesContratadosDAO.Insertar(Elemento);
            Nodo_ViajesContratados Raiz = objArbol_ViajesContratados.Agregar(objArbol_ViajesContratados.getRaiz(), Elemento);
            objArbol_ViajesContratados.setRaiz(Raiz);
            objVentana.setVisible(true);
            objVentana.setObjArbol_ViajesContratados(objArbol_ViajesContratados);
            ViajesContratadosDAO.ConsultarLista(objArbol_ViajesContratados);
            objVentana.Cargar();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente los datos.");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente los datos.");
        }
    }//GEN-LAST:event_btn_Consultar_GurdarActionPerformed

    private void btn_ConsultarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarSucursalActionPerformed
        try {
            int codigoSucursal = Integer.parseInt(cbo_CodigoSucursal.getSelectedItem().toString());
            if (objHashSucursales.isEmpty() == false){
                JDialog_Consultar1 objConsultar = new JDialog_Consultar1(null, false);
                Sucursales X = objHashSucursales.get(codigoSucursal);
                objArbol_ViajesContratados.DatosSucursal(JDialog_Consultar1.jTextArea1, X);
                objConsultar.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_ConsultarSucursalActionPerformed

    private void btn_ConsultarTuristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarTuristaActionPerformed
        try {
            int codigoTurista = Integer.parseInt(cbo_CodigoTuristas.getSelectedItem().toString());
            if (objHashTuristas.isEmpty() == false){
                JDialog_Consultar1 objConsultar = new JDialog_Consultar1(null, false);
                Turistas X = objHashTuristas.get(codigoTurista);
                objArbol_ViajesContratados.DatosTurista(JDialog_Consultar1.jTextArea1, X);
                objConsultar.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_ConsultarTuristaActionPerformed

    private void btn_ConsultarEstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarEstanciaActionPerformed
        try {
            int codigoEstancia = Integer.parseInt(cbo_CodigoEstancia.getSelectedItem().toString());
            if (objHashEstancias.isEmpty() == false){
                JDialog_Consultar1 objConsultar = new JDialog_Consultar1(null, false);
                Estancias X = objHashEstancias.get(codigoEstancia);
                Hoteles Y = objHashHoteles.get(X.getHoteles_CodigoHotel());
                objArbol_ViajesContratados.DatosEstancia(JDialog_Consultar1.jTextArea1, X, Y);
                objConsultar.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_ConsultarEstanciaActionPerformed

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
            java.util.logging.Logger.getLogger(JDialog_ViajeContratados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_ViajeContratados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_ViajeContratados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_ViajeContratados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_ViajeContratados dialog = new JDialog_ViajeContratados(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_ConsultarEstancia;
    private javax.swing.JButton btn_ConsultarSucursal;
    private javax.swing.JButton btn_ConsultarTurista;
    private javax.swing.JButton btn_Consultar_Gurdar;
    private javax.swing.JComboBox<String> cbo_CodigoEstancia;
    private javax.swing.JComboBox<String> cbo_CodigoSucursal;
    private javax.swing.JComboBox<String> cbo_CodigoTuristas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_CodigoContratados;
    // End of variables declaration//GEN-END:variables
}
