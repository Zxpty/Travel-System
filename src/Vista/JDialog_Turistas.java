package Vista;

import Control.ArbolTuristas;
import Control.Nodo_Turistas;
import DAOs.TuristasDAO;
import Modelo.Turistas;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class JDialog_Turistas extends javax.swing.JDialog {

    private ArbolTuristas objArbolTuristas = new ArbolTuristas();
    TableRowSorter<TableModel> tableR;
    DefaultTableModel defT = new DefaultTableModel();

    public JDialog_Turistas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        actualizar();
    }

    public void limpiar() {
        txt_Apellido.setText("");
        txt_DireccionTurista.setText("");
        txt_NombreTurista.setText("");
        txt_TelefonoTurista.setText("");
        txt_id.setText("");
    }

    public void actualizar() {
        TuristasDAO.ConsultarLista(objArbolTuristas);
        objArbolTuristas.listar(tbl_Turista);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_NombreTurista = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Apellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_DireccionTurista = new javax.swing.JTextField();
        txt_TelefonoTurista = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Turista = new javax.swing.JTable();
        lbl_Registrar = new javax.swing.JLabel();
        lbl_Editar = new javax.swing.JLabel();
        lbl_Eliminar = new javax.swing.JLabel();
        lbl_Buscar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_Filtro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 541, 720));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(733, 720));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrrar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel3.setText("¡REGISTRE SUS DATOS!");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 430, 40));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(199, 199, 199));
        jLabel4.setText("Complete sus informacion. ¡Por favor!");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 410, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setText("ID CLIENTE :");

        txt_id.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 57, 86)));

        txt_NombreTurista.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_NombreTurista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_NombreTurista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 57, 86)));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("NOMBRES :");

        txt_Apellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_Apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Apellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 57, 86)));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setText("APELLIDOS :");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setText("DIRECCIÓN :");

        txt_DireccionTurista.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_DireccionTurista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_DireccionTurista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 57, 86)));

        txt_TelefonoTurista.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_TelefonoTurista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_TelefonoTurista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 57, 86)));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setText("TELEFONO :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(166, 166, 166)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(164, 164, 164)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(87, 87, 87))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_id)
                        .addGap(80, 80, 80)
                        .addComponent(txt_NombreTurista)
                        .addGap(69, 69, 69)
                        .addComponent(txt_Apellido))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(167, 167, 167)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(320, 320, 320))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_DireccionTurista)
                        .addGap(80, 80, 80)
                        .addComponent(txt_TelefonoTurista)
                        .addGap(230, 230, 230)))
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NombreTurista, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_DireccionTurista, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TelefonoTurista, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 670, 200));

        tbl_Turista.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tbl_Turista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_Turista);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 310, 660, 200));

        lbl_Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        lbl_Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_RegistrarMouseClicked(evt);
            }
        });
        jPanel3.add(lbl_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, -1, -1));

        lbl_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        lbl_Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_EditarMouseClicked(evt);
            }
        });
        jPanel3.add(lbl_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 60, -1));

        lbl_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        lbl_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_EliminarMouseClicked(evt);
            }
        });
        jPanel3.add(lbl_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 50, -1));

        lbl_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jPanel3.add(lbl_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel14.setText("    Buscar");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 690, 60, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel15.setText("Registrar");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel16.setText("   Editar");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, 60, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel17.setText("  Eliminar");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 610, 60, -1));

        txt_Filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_FiltroKeyReleased(evt);
            }
        });
        jPanel3.add(txt_Filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, 130, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lbl_RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegistrarMouseClicked
        try {
            int id = Integer.parseInt(txt_id.getText());
            String nombre = txt_NombreTurista.getText().toUpperCase();
            String apellidos = txt_Apellido.getText().toUpperCase();
            String direccion = txt_DireccionTurista.getText().toUpperCase();
            String telefono = txt_TelefonoTurista.getText();
            Object[] registro = {id, nombre, apellidos, direccion, telefono};
            Turistas elemento = new Turistas(registro);
            TuristasDAO.Insertar(elemento);
            Nodo_Turistas raiz = objArbolTuristas.Agregar(objArbolTuristas.getRaiz(), elemento);
            objArbolTuristas.setRaiz(raiz);
            objArbolTuristas.listar(tbl_Turista);
            limpiar();
            txt_id.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente los datos.");
        }

    }//GEN-LAST:event_lbl_RegistrarMouseClicked

    private void lbl_EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_EditarMouseClicked
        try {
            JOptionPane.showMessageDialog(null, "Solo se Editara los otros datos menos el codigo del Turista", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
            int cod = Integer.parseInt(JOptionPane.showInputDialog("Elija el codigo a editar"));
            //int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo Codigo para el Turista").toUpperCase());
            String nombre = JOptionPane.showInputDialog("Inserte un nuevo nombre para el turista").toUpperCase();
            String apellido = JOptionPane.showInputDialog("Inserte el nuevo Apellido al turista").toUpperCase();
            String direccion = JOptionPane.showInputDialog("Inserte una nueva direccion al turista").toUpperCase();
            String telefono = JOptionPane.showInputDialog("Ingrese el nuevo numero de telefono").toUpperCase();
            Nodo_Turistas raiz = objArbolTuristas.BuscarCodigo(cod);
            raiz.getElemento().setCodigoTurista(cod);
            raiz.getElemento().setNombreTurista(nombre);
            raiz.getElemento().setApellidoTurista(apellido);
            raiz.getElemento().setDireccionTurista(direccion);
            raiz.getElemento().setTelefonoTurista(telefono);
            TuristasDAO.Actualizar(raiz.getElemento());
            objArbolTuristas.setRaiz(raiz);
            TuristasDAO.ConsultarLista(objArbolTuristas);
            objArbolTuristas.listar(tbl_Turista);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente los datos.");
        }
    }//GEN-LAST:event_lbl_EditarMouseClicked

    private void lbl_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_EliminarMouseClicked
        int fila = tbl_Turista.getSelectedRow();
        if (fila != -1) {
            int id = Integer.parseInt(tbl_Turista.getValueAt(fila, 0).toString());
            //String nom = tbl_Turista.getValueAt(fila, 1).toString();
            //String apelli = tbl_Turista.getValueAt(fila, 2).toString();
            //String direc = tbl_Turista.getValueAt(fila, 3).toString();
            //String telef = tbl_Turista.getValueAt(fila, 4).toString();
            int rpta = JOptionPane.showConfirmDialog(null, "¿Está seguro de querrer eliminar este Turista?\nAdvertencia: Se eliminará toda información a la que esté ligada.", "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION);
            if (rpta == JOptionPane.YES_OPTION) {
                Turistas elemento = new Turistas();
                elemento.setCodigoTurista(id);
                Nodo_Turistas raiz = objArbolTuristas.Eliminar(objArbolTuristas.getRaiz(), id);
                objArbolTuristas.setRaiz(raiz);
                TuristasDAO.EliminarTodo(id);
                TuristasDAO.Eliminar(elemento);
                objArbolTuristas.listar(tbl_Turista);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un elemento de la tabla.");
        }

    }//GEN-LAST:event_lbl_EliminarMouseClicked

    private void txt_FiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FiltroKeyReleased
        String filtro = txt_Filtro.getText().toUpperCase();
        objArbolTuristas.filtro(tbl_Turista, filtro);
    }//GEN-LAST:event_txt_FiltroKeyReleased

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
            java.util.logging.Logger.getLogger(JDialog_Turistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_Turistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_Turistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_Turistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_Turistas dialog = new JDialog_Turistas(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Buscar;
    private javax.swing.JLabel lbl_Editar;
    private javax.swing.JLabel lbl_Eliminar;
    private javax.swing.JLabel lbl_Registrar;
    private javax.swing.JTable tbl_Turista;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_DireccionTurista;
    private javax.swing.JTextField txt_Filtro;
    private javax.swing.JTextField txt_NombreTurista;
    private javax.swing.JTextField txt_TelefonoTurista;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
