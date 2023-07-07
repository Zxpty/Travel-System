package Vista;

import Control.Arbol_VuelosTuristicos;
import Control.Nodo_VuelosTuristas;
import DAOs.EstanciasDAO;
import DAOs.ViajesContratadosDAO;
import DAOs.VuelosDAO;
import DAOs.VuelosTuristicosDAO;
import Modelo.Estancias;
import Modelo.Hoteles;
import Modelo.Sucursales;
import Modelo.Turistas;
import Modelo.ViajesContratados;
import Modelo.Vuelos;
import Modelo.VuelosTurista;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class JDialog_VuelosTuristas extends javax.swing.JDialog {
    
    private Arbol_VuelosTuristicos objVuelosTuristicos = new Arbol_VuelosTuristicos();
    private HashMap<Integer, Vuelos> objHashVuelos = new HashMap<>();
    private HashMap<Integer, ViajesContratados> objHashVC = new HashMap<>();
    private HashMap<Integer, Sucursales> objHashSucursales = new HashMap<>();
    private HashMap<Integer, Turistas> objHashTuristas = new HashMap<>();
    private HashMap<Integer, Estancias> objHashEstancias = new HashMap<>();
    private HashMap<Integer, Hoteles> objHashHoteles = new HashMap<>();
            
    public JDialog_VuelosTuristas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        VuelosDAO.ConsultarCbo(cbo_NumeroVuelo);
        ViajesContratadosDAO.ConsultarCbo(cbo_ViajesContratados);
        VuelosTuristicosDAO.ConsultarLista(objVuelosTuristicos);
        EstanciasDAO.ConsultarHashHoteles(objHashHoteles);
        ViajesContratadosDAO.ConsultarHashEstancias(objHashEstancias);
        ViajesContratadosDAO.ConsultarHashTuristas(objHashTuristas);
        ViajesContratadosDAO.ConsultarHashSucursales(objHashSucursales);
        VuelosTuristicosDAO.ConsultarHashVC(objHashVC);
        VuelosTuristicosDAO.ConsultarHashVuelos(objHashVuelos);
        objVuelosTuristicos.listar(tbl_DatosVuelosTuristas);
    }
    
    private void limpiar(){
        txt_CodigoVuelo.setText("");
        cbo_ClaseVuelo.setSelectedIndex(-1);
        cbo_NumeroVuelo.setSelectedIndex(-1);
        cbo_ViajesContratados.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_CodigoVuelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbo_NumeroVuelo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DatosVuelosTuristas = new javax.swing.JTable();
        cbo_ViajesContratados = new javax.swing.JComboBox<>();
        cbo_ClaseVuelo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lbl_Registrar = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_Editar = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_Eliminar = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbl_Buscar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_Filtro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(541, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VuelosTurisiticos.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel3.setText("¡REGISTRE SUS DATOS!");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(199, 199, 199));
        jLabel4.setText("Complete sus informacion. ¡Por favor!");

        txt_CodigoVuelo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_CodigoVuelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 57, 86)));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("CODIGO DE VUELO:");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setText("CLASE DE VUELO:");

        cbo_NumeroVuelo.setPreferredSize(new java.awt.Dimension(161, 26));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setText("NUMERO DE VUELO:");

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel10.setText("VIAJES CONTRADADOS:");

        tbl_DatosVuelosTuristas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tbl_DatosVuelosTuristas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_DatosVuelosTuristas);

        cbo_ViajesContratados.setPreferredSize(new java.awt.Dimension(161, 26));

        cbo_ClaseVuelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primera Clase", "Clase Ejecutiva", "Clase Economica", "Clase Eco. Premium" }));
        cbo_ClaseVuelo.setSelectedIndex(-1);
        cbo_ClaseVuelo.setPreferredSize(new java.awt.Dimension(161, 26));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrrar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        lbl_Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        lbl_Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_RegistrarMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel15.setText("Registrar");

        lbl_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        lbl_Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_EditarMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel16.setText("   Editar");

        lbl_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        lbl_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_EliminarMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel17.setText("  Eliminar");

        lbl_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel14.setText("    Buscar");

        jButton1.setBackground(new java.awt.Color(37, 57, 86));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CONSULTAR VUELO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(37, 57, 86));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CONSULTAR VIAJE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_Filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_FiltroKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbo_ViajesContratados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addGap(40, 40, 40))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_Registrar)
                        .addGap(100, 100, 100)
                        .addComponent(lbl_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(lbl_Eliminar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(181, 181, 181))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(132, 132, 132))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_CodigoVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbo_ClaseVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbo_NumeroVuelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(275, 275, 275))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl_Buscar)
                        .addGap(7, 7, 7))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_CodigoVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbo_NumeroVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_ViajesContratados, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbo_ClaseVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Registrar)
                            .addComponent(lbl_Editar)
                            .addComponent(lbl_Eliminar))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Buscar)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14)
                        .addGap(5, 5, 5))))
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lbl_RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegistrarMouseClicked
        try {
            int cod = Integer.parseInt(txt_CodigoVuelo.getText());
            String clase = cbo_ClaseVuelo.getSelectedItem().toString().toUpperCase();
            int numvuelo = Integer.parseInt(cbo_NumeroVuelo.getSelectedItem().toString());
            int codviajes = Integer.parseInt(cbo_ViajesContratados.getSelectedItem().toString());
            Object[] registro = {cod, clase, numvuelo, codviajes};
            VuelosTurista elemento = new VuelosTurista(registro);
            VuelosTuristicosDAO.Insertar(elemento);
            Nodo_VuelosTuristas raiz = objVuelosTuristicos.Agregar(objVuelosTuristicos.getRaiz(), elemento);
            objVuelosTuristicos.setRaiz(raiz);
            VuelosTuristicosDAO.ConsultarLista(objVuelosTuristicos);
            objVuelosTuristicos.listar(tbl_DatosVuelosTuristas);
            limpiar();
            txt_CodigoVuelo.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente los datos.");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente los datos.");
        }
    }//GEN-LAST:event_lbl_RegistrarMouseClicked

    private void lbl_EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_EditarMouseClicked
        try {
            JOptionPane.showMessageDialog(null, "Solo se Editara los otros datos menos el codigo del Turista", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
            int cod = Integer.parseInt(JOptionPane.showInputDialog("Elija el codigo a editar"));
            //int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo Codigo para el Turista").toUpperCase());
            Nodo_VuelosTuristas raiz = objVuelosTuristicos.BuscarCodigo(cod);
            if (raiz != null){
                String ClaseVuelo = cbo_ClaseVuelo.getSelectedItem().toString().toUpperCase();
                int NumeroVuelo = Integer.parseInt(cbo_NumeroVuelo.getSelectedItem().toString());
                int ViajesCon = Integer.parseInt(cbo_ViajesContratados.getSelectedItem().toString());
                raiz.getElemento().setClase(ClaseVuelo);
                raiz.getElemento().setVuelos_NumeroVuelo(NumeroVuelo);
                raiz.getElemento().setViajesContratados_CodigoViaje(ViajesCon);
                VuelosTuristicosDAO.Actualizar(raiz.getElemento());
                objVuelosTuristicos.setRaiz(raiz);
                VuelosTuristicosDAO.ConsultarLista(objVuelosTuristicos);
                objVuelosTuristicos.listar(tbl_DatosVuelosTuristas);
            } else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado los datos del vuelo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente los datos.");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente los datos.");
        }
    }//GEN-LAST:event_lbl_EditarMouseClicked

    private void lbl_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_EliminarMouseClicked
        int fila = tbl_DatosVuelosTuristas.getSelectedRow();
        if (fila != -1) {
            int id = Integer.parseInt(tbl_DatosVuelosTuristas.getValueAt(fila, 0).toString());
            //String nom = tbl_Turista.getValueAt(fila, 1).toString();
            //String apelli = tbl_Turista.getValueAt(fila, 2).toString();
            //String direc = tbl_Turista.getValueAt(fila, 3).toString();
            //String telef = tbl_Turista.getValueAt(fila, 4).toString();
            int rpta = JOptionPane.showConfirmDialog(null, "Esta seguro de querrer eliminar este Turista?", "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION);
            if (rpta == JOptionPane.YES_OPTION) {
                VuelosTurista elemento = new VuelosTurista();
                elemento.setCodigoVuelo(id);
                Nodo_VuelosTuristas raiz = objVuelosTuristicos.Eliminar(objVuelosTuristicos.getRaiz(), id);
                objVuelosTuristicos.setRaiz(raiz);
                VuelosTuristicosDAO.Eliminar(elemento);
                objVuelosTuristicos.listar(tbl_DatosVuelosTuristas);
            }
        }
    }//GEN-LAST:event_lbl_EliminarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int numeroVuelo = Integer.parseInt(cbo_NumeroVuelo.getSelectedItem().toString());
            if (objHashVuelos.isEmpty() == false){
                JDialog_Consultar1 objConsultar = new JDialog_Consultar1(null, false);
                Vuelos X = objHashVuelos.get(numeroVuelo);
                objVuelosTuristicos.DatosVuelo(JDialog_Consultar1.jTextArea1, X);
                objConsultar.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int codigoViaje = Integer.parseInt(cbo_ViajesContratados.getSelectedItem().toString());
            if (objHashVC.isEmpty() == false){
                JDialog_Consultar1 objConsultar = new JDialog_Consultar1(null, false);
                ViajesContratados A = objHashVC.get(codigoViaje);
                Estancias B = objHashEstancias.get(A.getEstancias_CodigoEstancia());
                Hoteles C = objHashHoteles.get(B.getHoteles_CodigoHotel());
                Sucursales D = objHashSucursales.get(A.getSucursales_CodigoSucursal());
                Turistas E = objHashTuristas.get(A.getTuristas_CodigoTurista());
                objVuelosTuristicos.DatosVC(JDialog_Consultar1.jTextArea1, A, B, C, D, E);
                objConsultar.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_FiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FiltroKeyReleased
        String filtro = txt_Filtro.getText().toUpperCase();
        objVuelosTuristicos.filtro(tbl_DatosVuelosTuristas, filtro);
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
            java.util.logging.Logger.getLogger(JDialog_VuelosTuristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_VuelosTuristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_VuelosTuristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_VuelosTuristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_VuelosTuristas dialog = new JDialog_VuelosTuristas(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cbo_ClaseVuelo;
    private javax.swing.JComboBox<String> cbo_NumeroVuelo;
    private javax.swing.JComboBox<String> cbo_ViajesContratados;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Buscar;
    private javax.swing.JLabel lbl_Editar;
    private javax.swing.JLabel lbl_Eliminar;
    private javax.swing.JLabel lbl_Registrar;
    private javax.swing.JTable tbl_DatosVuelosTuristas;
    private javax.swing.JTextField txt_CodigoVuelo;
    private javax.swing.JTextField txt_Filtro;
    // End of variables declaration//GEN-END:variables
}
