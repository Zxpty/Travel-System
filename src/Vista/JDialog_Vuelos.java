package Vista;

import Control.ArbolVuelos;
import Control.Nodo_Vuelos;
import DAOs.VuelosDAO;
import Modelo.Vuelos;
import java.sql.Time;
import javax.swing.JOptionPane;

public class JDialog_Vuelos extends javax.swing.JDialog {

    private ArbolVuelos objArbolVuelos = new ArbolVuelos();
    
    public JDialog_Vuelos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.setResizable(false);
        VuelosDAO.ConsultarLista(objArbolVuelos);
        objArbolVuelos.listar(jTable1);
    }
    
    public void Limpiar(){
        txt_Destino.setText(""); txt_NumeroVuelo.setText("");
        txt_Origen.setText(""); txt_PlazaTurista.setText("");
        spn_Hora.setValue(0);
        spn_Minuto.setValue(0);
        spn_PlazaTotales.setValue(0);
        txt_PlazaTurista.setText("");
        dtc_FechaVuelo.setDate(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_NumeroVuelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dtc_FechaVuelo = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txt_Origen = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_Destino = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        spn_PlazaTotales = new javax.swing.JSpinner();
        txt_PlazaTurista = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbl_Registrar = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_Editar = new javax.swing.JLabel();
        lbl_Eliminar = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl_Buscar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        spn_Hora = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        spn_Minuto = new javax.swing.JSpinner();
        txt_Filtro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(541, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vuelos.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 541, 720));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel3.setText("¡REGISTRE SU VUELO!");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(199, 199, 199));
        jLabel4.setText("Complete sus informacion de su vuelo. ¡Por favor!");

        txt_NumeroVuelo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_NumeroVuelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 57, 86)));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("NUMERO DE VUELO:");

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setText("FECHA DE VUELO:");

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setText("HORA DE VUELO");

        txt_Origen.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_Origen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 57, 86)));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setText("ORIGEN:");

        txt_Destino.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_Destino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 57, 86)));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel10.setText("DESTINO:");

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel11.setText("PLAZA TOTALES");

        txt_PlazaTurista.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_PlazaTurista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 57, 86)));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel12.setText("PLAZA TURISTA:");

        jTable1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        lbl_Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        lbl_Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_RegistrarMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel15.setText("Registrar");

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel16.setText("   Editar");

        lbl_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        lbl_Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_EditarMouseClicked(evt);
            }
        });

        lbl_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        lbl_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_EliminarMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel17.setText("  Eliminar");

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel14.setText("    Buscar");

        lbl_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrrar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spn_Hora.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        jPanel3.add(spn_Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 45));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(":");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 30, 40));

        spn_Minuto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPanel3.add(spn_Minuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 0, 60, 45));

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
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_PlazaTurista, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_NumeroVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_Origen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(dtc_FechaVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(txt_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11)
                                    .addComponent(spn_PlazaTotales)
                                    .addComponent(jLabel8)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(69, 69, 69))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_Registrar)
                                .addGap(100, 100, 100)
                                .addComponent(lbl_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(lbl_Eliminar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(102, 102, 102)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(43, 43, 43))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl_Buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_NumeroVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dtc_FechaVuelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spn_PlazaTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Origen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_PlazaTurista, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Registrar)
                    .addComponent(lbl_Editar)
                    .addComponent(lbl_Eliminar))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Buscar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(10, 10, 10)
                .addComponent(jLabel14)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lbl_RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegistrarMouseClicked
        try {
            int NumeroVuelo = Integer.parseInt(txt_NumeroVuelo.getText());
            java.util.Date X = dtc_FechaVuelo.getDate();
            java.sql.Date FechaVuelo = new java.sql.Date(X.getTime());
            int Hora = Integer.parseInt(spn_Hora.getValue().toString());
            int Minuto = Integer.parseInt(spn_Minuto.getValue().toString());
            Time HoraVuelo = Time.valueOf(Hora+":"+Minuto+":00");
            String Origen = txt_Origen.getText().toUpperCase();
            String Destino = txt_Destino.getText().toUpperCase();
            int PlazaTotales = Integer.parseInt(spn_PlazaTotales.getValue().toString());
            int PlazaTuristas = Integer.parseInt(txt_PlazaTurista.getText());
            Vuelos objVuelos = new Vuelos(new Object[]{NumeroVuelo, FechaVuelo, HoraVuelo, Origen, Destino, PlazaTotales, PlazaTuristas});
            VuelosDAO.Insertar(objVuelos);
            Nodo_Vuelos Raiz = objArbolVuelos.Agregar(objArbolVuelos.getRaiz(), objVuelos);
            objArbolVuelos.setRaiz(Raiz);
            VuelosDAO.ConsultarLista(objArbolVuelos);
            objArbolVuelos.listar(jTable1);
            Limpiar();
            txt_NumeroVuelo.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente los datos.");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fecha.");
        }
    }//GEN-LAST:event_lbl_RegistrarMouseClicked

    private void lbl_EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_EditarMouseClicked
        try {
            JOptionPane.showMessageDialog(null, "Solo se Editara los otros datos menos el codigo del Turista y se tomarán en cuenta los datos del registro.", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
            int cod = Integer.parseInt(JOptionPane.showInputDialog("Elija el codigo a editar"));
            Nodo_Vuelos raiz = objArbolVuelos.BuscarCodigo(cod);
            if (raiz != null){
                java.util.Date X = dtc_FechaVuelo.getDate();
                java.sql.Date FechaVuelo = new java.sql.Date(X.getTime());
                int Hora = Integer.parseInt(spn_Hora.getValue().toString());
                int Minuto = Integer.parseInt(spn_Minuto.getValue().toString());
                Time HoraVuelo = Time.valueOf(Hora+":"+Minuto+":00");
                String Origen = txt_Origen.getText().toUpperCase();
                String Destino = txt_Destino.getText().toUpperCase();
                int PlazaTotales = Integer.parseInt(spn_PlazaTotales.getValue().toString());
                int PlazaTuristas = Integer.parseInt(txt_PlazaTurista.getText());
                raiz.getElemento().setFechaVuelo(FechaVuelo.toString());
                raiz.getElemento().setHoraVuelo(HoraVuelo.toString());
                raiz.getElemento().setOrigenVuelo(Origen);
                raiz.getElemento().setDestinoVuelo(Destino);
                raiz.getElemento().setPlazasTotales(PlazaTotales);
                raiz.getElemento().setPlazasTurista(PlazaTuristas);
                VuelosDAO.Actualizar(raiz.getElemento());
                objArbolVuelos.setRaiz(raiz);
                VuelosDAO.ConsultarLista(objArbolVuelos);
                objArbolVuelos.listar(jTable1);
            } else {
                JOptionPane.showMessageDialog(this, "No se ha encontrado los datos del vuelo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente los datos.");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fecha.");
        }
    }//GEN-LAST:event_lbl_EditarMouseClicked

    private void lbl_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_EliminarMouseClicked
        int fila = jTable1.getSelectedRow();
        if (fila != -1) {
            int id = Integer.parseInt(jTable1.getValueAt(fila, 0).toString());
            int rpta = JOptionPane.showConfirmDialog(null, "¿Está seguro de querrer eliminar este Vuelo?\nAdvertencia: Se eliminará toda información a la que esté ligada.", "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION);
            if (rpta == JOptionPane.YES_OPTION) {
                Vuelos elemento = new Vuelos();
                elemento.setNumeroVuelo(id);
                Nodo_Vuelos raiz = objArbolVuelos.Eliminar(objArbolVuelos.getRaiz(), id);
                objArbolVuelos.setRaiz(raiz);
                VuelosDAO.EliminarTodo(id);
                VuelosDAO.Eliminar(elemento);
                objArbolVuelos.listar(jTable1);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un elemento de la lista.");
        }
    }//GEN-LAST:event_lbl_EliminarMouseClicked

    private void txt_FiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FiltroKeyReleased
        String filtro = txt_Filtro.getText().toUpperCase();
        objArbolVuelos.filtro(jTable1, filtro);
    }//GEN-LAST:event_txt_FiltroKeyReleased

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(JDialog_Vuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_Vuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_Vuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_Vuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_Vuelos dialog = new JDialog_Vuelos(new javax.swing.JFrame(), true);
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
    private com.toedter.calendar.JDateChooser dtc_FechaVuelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_Buscar;
    private javax.swing.JLabel lbl_Editar;
    private javax.swing.JLabel lbl_Eliminar;
    private javax.swing.JLabel lbl_Registrar;
    private javax.swing.JSpinner spn_Hora;
    private javax.swing.JSpinner spn_Minuto;
    private javax.swing.JSpinner spn_PlazaTotales;
    private javax.swing.JTextField txt_Destino;
    private javax.swing.JTextField txt_Filtro;
    private javax.swing.JTextField txt_NumeroVuelo;
    private javax.swing.JTextField txt_Origen;
    private javax.swing.JTextField txt_PlazaTurista;
    // End of variables declaration//GEN-END:variables
}
