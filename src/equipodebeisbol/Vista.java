package equipodebeisbol;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**@author Jose Ignacio */

public class Vista extends javax.swing.JFrame {

    ListasEnlazadas lista = new ListasEnlazadas();
    Equipo E = new Equipo();
    
    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
        GOHome();
        this.setResizable(false);
        Posicion[] pos = Posicion.values();
        for (int i = 0; i < pos.length; i++){
        cbpos.addItem(String.valueOf(pos[i]));
        }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlback = new javax.swing.JPanel();
        pnlopciones = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        lblAgregar = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        pnlReportes = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        pnlAgregar = new javax.swing.JPanel();
        pnlreportes = new javax.swing.JPanel();
        pnlback2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlback3 = new javax.swing.JPanel();
        pnlOpciones = new javax.swing.JPanel();
        vagregar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtaverage = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbpos = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbubicacion = new javax.swing.JComboBox<>();
        cbjugadores = new javax.swing.JComboBox<>();
        lbldespues = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        lblEliminar = new javax.swing.JLabel();
        txtidentificacion = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        vreportes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        elanzadores = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        ereceptores = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lblmenoraverage = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        ejardinero = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        eprimerabase = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        esegundabase = new javax.swing.JLabel();
        eshortstop = new javax.swing.JLabel();
        lbllanzadores9y12 = new javax.swing.JLabel();
        lbllanzadores13y16 = new javax.swing.JLabel();
        veliminar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbeliminar = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        vhome = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lblbuscar = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        lblOrdenar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlback.setBackground(new java.awt.Color(204, 204, 204));
        pnlback.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlopciones.setBackground(new java.awt.Color(255, 255, 255));

        pnlHome.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);
        pnlHome.setLayout(pnlHomeLayout);
        pnlHomeLayout.setHorizontalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        pnlHomeLayout.setVerticalGroup(
            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        lblAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAgregar.setText("AGREGAR");
        lblAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarMouseClicked(evt);
            }
        });

        lblSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        lblSalir.setText("SALIR");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
        });

        pnlReportes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pnlReportes.setText("REPORTES");
        pnlReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlReportesMouseClicked(evt);
            }
        });

        lblHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHome.setText("HOME");
        lblHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });

        pnlAgregar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlAgregarLayout = new javax.swing.GroupLayout(pnlAgregar);
        pnlAgregar.setLayout(pnlAgregarLayout);
        pnlAgregarLayout.setHorizontalGroup(
            pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        pnlAgregarLayout.setVerticalGroup(
            pnlAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        pnlreportes.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlreportesLayout = new javax.swing.GroupLayout(pnlreportes);
        pnlreportes.setLayout(pnlreportesLayout);
        pnlreportesLayout.setHorizontalGroup(
            pnlreportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        pnlreportesLayout.setVerticalGroup(
            pnlreportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlopcionesLayout = new javax.swing.GroupLayout(pnlopciones);
        pnlopciones.setLayout(pnlopcionesLayout);
        pnlopcionesLayout.setHorizontalGroup(
            pnlopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlopcionesLayout.createSequentialGroup()
                .addGroup(pnlopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlopcionesLayout.createSequentialGroup()
                        .addComponent(pnlAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlopcionesLayout.createSequentialGroup()
                        .addComponent(pnlreportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
            .addGroup(pnlopcionesLayout.createSequentialGroup()
                .addComponent(pnlHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlopcionesLayout.setVerticalGroup(
            pnlopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlopcionesLayout.createSequentialGroup()
                .addGroup(pnlopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlopcionesLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(pnlHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlopcionesLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlopcionesLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlopcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlopcionesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pnlreportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlopcionesLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(pnlReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(lblSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pnlback.add(pnlopciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 140, 300));

        pnlback2.setBackground(new java.awt.Color(33, 43, 52));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logol.png"))); // NOI18N

        javax.swing.GroupLayout pnlback2Layout = new javax.swing.GroupLayout(pnlback2);
        pnlback2.setLayout(pnlback2Layout);
        pnlback2Layout.setHorizontalGroup(
            pnlback2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlback2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlback2Layout.setVerticalGroup(
            pnlback2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlback2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pnlback.add(pnlback2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 140));

        pnlback3.setBackground(new java.awt.Color(33, 43, 52));

        javax.swing.GroupLayout pnlback3Layout = new javax.swing.GroupLayout(pnlback3);
        pnlback3.setLayout(pnlback3Layout);
        pnlback3Layout.setHorizontalGroup(
            pnlback3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        pnlback3Layout.setVerticalGroup(
            pnlback3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlback.add(pnlback3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 580, 30));

        pnlOpciones.setBackground(new java.awt.Color(255, 255, 255));
        pnlOpciones.setLayout(new java.awt.CardLayout());

        vagregar.setBackground(new java.awt.Color(255, 255, 255));
        vagregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("AGREGAR");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vagregar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 101, 32));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Edad:");
        vagregar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Posición:");
        vagregar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));
        vagregar.add(txtaverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 118, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Identificación:");
        vagregar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 56, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Nombre:");
        vagregar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 56, -1, -1));
        vagregar.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 60, 118, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Average:");
        vagregar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        vagregar.add(cbpos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 140, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Ubicación:");
        vagregar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        cbubicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cabeza", "Nodo Existente", "Final" }));
        cbubicacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbubicacionItemStateChanged(evt);
            }
        });
        vagregar.add(cbubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 140, 30));

        vagregar.add(cbjugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 140, 30));

        lbldespues.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbldespues.setText("Despues de:");
        vagregar.add(lbldespues, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(33, 43, 52));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        vagregar.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, 30));

        lblEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/quitar-usuario.png"))); // NOI18N
        lblEliminar.setText("ELIMNAR");
        lblEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
        });
        vagregar.add(lblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 130, 40));
        vagregar.add(txtidentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 60, 118, -1));
        vagregar.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 118, -1));

        pnlOpciones.add(vagregar, "card3");

        vreportes.setBackground(new java.awt.Color(255, 255, 255));
        vreportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("REPORTES");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vreportes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 101, 32));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Jugadores entre 9 y 12 años");
        vreportes.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 530, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("AVERAGE");
        jLabel22.setFocusable(false);
        jLabel22.setOpaque(true);
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 100, -1));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("NOMBRE");
        jLabel23.setFocusable(false);
        jLabel23.setOpaque(true);
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, -1));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("NOMBRE");
        jLabel24.setFocusable(false);
        jLabel24.setOpaque(true);
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("IDENTIFICACIÓN");
        jLabel25.setFocusable(false);
        jLabel25.setOpaque(true);
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 110, -1));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("EDAD");
        jLabel26.setFocusable(false);
        jLabel26.setOpaque(true);
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 100, -1));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("POSICION");
        jLabel27.setFocusable(false);
        jLabel27.setOpaque(true);
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 100, -1));

        vreportes.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 530, 20));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setColumnHeaderView(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane2.setViewportView(jPanel6);

        vreportes.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 520, 110));

        elanzadores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        elanzadores.setForeground(new java.awt.Color(255, 0, 0));
        elanzadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elanzadores.setText("0");
        vreportes.add(elanzadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 60, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Lanzadores entre 9 y 12 años:");
        vreportes.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Lanzadores entre 13 y 16 años:");
        vreportes.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Menor average del Equipo:");
        vreportes.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("EDAD PROMEDIO");
        vreportes.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("LANZADOR");
        vreportes.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("RECEPTOR");
        vreportes.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        ereceptores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ereceptores.setForeground(new java.awt.Color(255, 0, 0));
        ereceptores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ereceptores.setText("0");
        vreportes.add(ereceptores, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 60, -1));

        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("SHORTSTOP");
        vreportes.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        lblmenoraverage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblmenoraverage.setForeground(new java.awt.Color(255, 0, 0));
        lblmenoraverage.setText("0");
        vreportes.add(lblmenoraverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("JARDINERO");
        vreportes.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        ejardinero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ejardinero.setForeground(new java.awt.Color(255, 0, 0));
        ejardinero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ejardinero.setText("0");
        vreportes.add(ejardinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 70, -1));

        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("PRIMERA BASE");
        vreportes.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        eprimerabase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eprimerabase.setForeground(new java.awt.Color(255, 0, 0));
        eprimerabase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eprimerabase.setText("0");
        vreportes.add(eprimerabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 80, -1));

        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("SEGUNDA BASE");
        vreportes.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        esegundabase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        esegundabase.setForeground(new java.awt.Color(255, 0, 0));
        esegundabase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        esegundabase.setText("0");
        vreportes.add(esegundabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 80, -1));

        eshortstop.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eshortstop.setForeground(new java.awt.Color(255, 0, 0));
        eshortstop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eshortstop.setText("0");
        vreportes.add(eshortstop, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 60, -1));

        lbllanzadores9y12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbllanzadores9y12.setForeground(new java.awt.Color(255, 0, 0));
        lbllanzadores9y12.setText("0");
        vreportes.add(lbllanzadores9y12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        lbllanzadores13y16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbllanzadores13y16.setForeground(new java.awt.Color(255, 0, 0));
        lbllanzadores13y16.setText("0");
        vreportes.add(lbllanzadores13y16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        pnlOpciones.add(vreportes, "card4");

        veliminar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("ELIMINAR");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Seleccione el Jugador a eliminar.");

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar (1).png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout veliminarLayout = new javax.swing.GroupLayout(veliminar);
        veliminar.setLayout(veliminarLayout);
        veliminarLayout.setHorizontalGroup(
            veliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(veliminarLayout.createSequentialGroup()
                .addGroup(veliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(veliminarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(veliminarLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(veliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(veliminarLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(cbeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13))))
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, veliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(59, 59, 59))
        );
        veliminarLayout.setVerticalGroup(
            veliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(veliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel13)
                .addGap(31, 31, 31)
                .addComponent(cbeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btnEliminar)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pnlOpciones.add(veliminar, "card5");

        vhome.setBackground(new java.awt.Color(255, 255, 255));
        vhome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("AVERAGE");
        jLabel15.setFocusable(false);
        jLabel15.setOpaque(true);
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 100, -1));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("NOMBRE");
        jLabel16.setFocusable(false);
        jLabel16.setOpaque(true);
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("NOMBRE");
        jLabel17.setFocusable(false);
        jLabel17.setOpaque(true);
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("IDENTIFICACIÓN");
        jLabel18.setFocusable(false);
        jLabel18.setOpaque(true);
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 100, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("EDAD");
        jLabel19.setFocusable(false);
        jLabel19.setOpaque(true);
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 100, -1));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("POSICION");
        jLabel20.setFocusable(false);
        jLabel20.setOpaque(true);
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 100, -1));

        vhome.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 530, 20));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setColumnHeaderView(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(jPanel3);

        vhome.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 520, 300));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("HOME");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vhome.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 101, 32));

        lblbuscar.setBackground(new java.awt.Color(255, 255, 255));
        lblbuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblbuscar.setForeground(new java.awt.Color(0, 0, 0));
        lblbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        lblbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbuscarMouseClicked(evt);
            }
        });
        vhome.add(lblbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 40, 32));
        vhome.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 110, -1));

        lblOrdenar.setBackground(new java.awt.Color(255, 255, 255));
        lblOrdenar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblOrdenar.setForeground(new java.awt.Color(0, 0, 0));
        lblOrdenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/orden.png"))); // NOI18N
        lblOrdenar.setText("Ordenar por Average");
        lblOrdenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOrdenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrdenarMouseClicked(evt);
            }
        });
        vhome.add(lblOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 150, 32));

        pnlOpciones.add(vhome, "card2");

        pnlback.add(pnlOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 560, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked
      
    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        GOHome();
    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked
       llamaAgregar();
    }//GEN-LAST:event_lblAgregarMouseClicked

    private void pnlReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReportesMouseClicked
        if (E.getLista().getTam() == 0) {
            JOptionPane.showMessageDialog(rootPane, "AUN NO HAY NADA PARA MOSTRAR");
        } else {
            Llamareportes();
        }
    }//GEN-LAST:event_pnlReportesMouseClicked

    private void cbubicacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbubicacionItemStateChanged
        int op = cbubicacion.getSelectedIndex();
        if (op != 1) {
            cbjugadores.setVisible(false);
            lbldespues.setVisible(false);
        } else {
            cbjugadores.setVisible(true);
            lbldespues.setVisible(true);
        }
    }//GEN-LAST:event_cbubicacionItemStateChanged

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
       veliminar.setVisible(true);
       vagregar.setVisible(false);
    }//GEN-LAST:event_lblEliminarMouseClicked

    public void limpiarcampos() {
        txtidentificacion.setText("");
        txtnombre.setText("");
        txtaverage.setText("");
        txtedad.setText("");
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if (txtaverage.getText().trim().equalsIgnoreCase("") || txtnombre.getText().trim().equalsIgnoreCase("") 
                  || txtaverage.getText().trim().equalsIgnoreCase("") || txtedad.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "LLENE TODOS LOS CAMPOS");
            } else {

                if (Integer.parseInt(txtedad.getText()) <= 0 || Integer.parseInt(txtedad.getText()) > 80) {
                    JOptionPane.showMessageDialog(rootPane, "LA EDAD DEBE SER MAYOR A 0 Y MENOR A 80");
                } else if (Integer.parseInt(txtaverage.getText()) < 0 || Integer.parseInt(txtaverage.getText()) > 100) {

                    JOptionPane.showMessageDialog(rootPane, "EL AVERAGE DEBE ESTAR ENTRE 0 Y 100");
                } else {
                    if (this.cbubicacion.getSelectedIndex() == 1) {

                        if (this.cbjugadores.getItemCount() != 0) {
                            Nodo nodoTemporal = this.E.buscarJugador(this.cbjugadores.getSelectedItem().toString());
                            this.E.agregarJugador(nodoTemporal, new Nodo(new Jugador(txtidentificacion.getText(), txtnombre.getText(), 
                            Integer.parseInt(txtedad.getText()), Posicion.valueOf(cbpos.getSelectedItem().toString()), Float.valueOf(txtaverage.getText()))));
                            JOptionPane.showMessageDialog(rootPane, "JUGADOR AGREGADO");
                            this.limpiarcampos();
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "NO SE HA PODIDO AGREGAR EL JUGADOR");
                        }
                    } else {
                        String pos = (this.cbubicacion.getSelectedIndex() == 0) ? "inicio" : "final";
                        if (this.E.agregarJugador(new Nodo(new Jugador(txtidentificacion.getText(), txtnombre.getText(), Integer.parseInt(txtedad.getText()), 
                                Posicion.valueOf(cbpos.getSelectedItem().toString()), Float.valueOf(txtaverage.getText()))), pos)) {
                            JOptionPane.showMessageDialog(rootPane, "JUGADOR AGREGADO");
                            this.limpiarcampos();
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "LA IDENTIFICACION (" + txtidentificacion.getText() + ") YA SE ENCUENTRA REGISTRADA");
                        }
                    }

                    this.actualizarTabla(this.E.getLista());
                    this.actulizarJCombox(cbjugadores);
                    this.actulizarJCombox(cbeliminar);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "LO SENTIMOS ALGO NO SALIO BIEN");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void lblbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbuscarMouseClicked
        if (this.E.getLista().getTam() == 0) {
            JOptionPane.showMessageDialog(rootPane, "DEBE INGRESAR AL MENOS UN JUGADOR");
        } else {
            if (!(txtbuscar.getText().trim().equalsIgnoreCase(""))) {
                Nodo nodo = this.E.buscarJugador(txtbuscar.getText().trim());

                if (nodo != null) {
                    JOptionPane.showMessageDialog(rootPane, "DATOS DE LA BUSQUEDA \n " + nodo.getJugador().toString());
                } else {
                    JOptionPane.showMessageDialog(rootPane, "JUGADOR NO ENCONTRADO");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "INGRESE EL NOMBRE O LA IDENTIFICACION");
            }
        }
    }//GEN-LAST:event_lblbuscarMouseClicked

    private void lblOrdenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrdenarMouseClicked
        if (this.E.getLista().getTam() == 0) {
            JOptionPane.showMessageDialog(rootPane, "NO SE PUEDE ORGANIZAR LA LISTA");
        } else {
            this.E.ordenarLista();
            this.actualizarTabla(this.E.getLista());
            JOptionPane.showMessageDialog(rootPane, "LISTA ORDENADA POR AVERAGE");
        }

    }//GEN-LAST:event_lblOrdenarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        try {
            if (this.cbeliminar.getItemCount() != 0) {
                this.E.eliminarJugador(this.E.buscarJugador(cbeliminar.getSelectedItem().toString()));
                this.actualizarTabla(this.E.getLista());
                this.actulizarJCombox(cbjugadores);
                this.actulizarJCombox(cbeliminar);
                JOptionPane.showMessageDialog(rootPane, "JUGADOR ELIMINADO CON EXITO");
            } else {
                JOptionPane.showMessageDialog(rootPane, "NO SE PUEDE ELIMINAR, INTENTE DE NUEVO");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "LO SENTIMOS, ALGO NO SALIO BIEN");
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    public void Color2(JPanel v){
    v.setBackground(new java.awt.Color(60,63,65));
    }
    
    public void Color1(JPanel v){
    v.setBackground(new java.awt.Color(255,255,255));
    }
    
    public void GOHome() {
        vhome.setVisible(true);
        vreportes.setVisible(false);
        vagregar.setVisible(false);
        veliminar.setVisible(false);
        Color2(pnlHome);
        Color1(pnlAgregar);
        Color1(pnlreportes);
    }
    
    public void llamaAgregar() {
        vhome.setVisible(false);
        vreportes.setVisible(false);
        vagregar.setVisible(true);
        veliminar.setVisible(false);
        Color2(pnlAgregar);
        Color1(pnlHome);
        Color1(pnlreportes);
        cbjugadores.setVisible(false);
        lbldespues.setVisible(false);
    }
    
    public void actulizarJCombox(javax.swing.JComboBox combo) {
        combo.removeAllItems();
        
       Nodo nodoTemporal = this.E.getLista().getCabeza();
        while (nodoTemporal != null) {
            combo.addItem(nodoTemporal.getJugador().getNombre());
            nodoTemporal = nodoTemporal.getSiguienteNodo();
        }
    }
    
    public void actualizarTabla(ListasEnlazadas lista) {
        this.jPanel3.removeAll();

        Nodo temporal = lista.getCabeza();

        while (temporal != null) {
            this.jPanel3.add(new PanelJugador(temporal.getJugador()));
            temporal = temporal.getSiguienteNodo();
        }

        for (int i = 0; i < 15; i++) {
            JPanel panel = new JPanel();
            panel.setBackground(new java.awt.Color(255, 255, 255));
            this.jPanel3.add(panel);
        }

        this.jPanel3.updateUI();
    }
    
    public void Llamareportes() {
        vhome.setVisible(false);
        vreportes.setVisible(true);
        vagregar.setVisible(false);
        veliminar.setVisible(false);
        Color2(pnlreportes);
        Color1(pnlHome);
        Color1(pnlAgregar);

        this.jPanel6.removeAll();
        
        int Lanzadores9a12 = 0, Lanzadores13a16 = 0, cantLanzadores = 0, cantReceptores = 0, cantPrimeraBase = 0, cantSegundoBase = 0, cantShortstop = 0, cantJardinero = 0;

        float promLanzadores = 0, promReceptores = 0, promPrimeraBase = 0, promSegundoBase = 0, promShortstop = 0, promJardinero = 0;

        Nodo cabeza = E.getLista().getCabeza(), promedioBajo = cabeza;

        while (cabeza != null) {

            if (cabeza.getJugador().getEdad() <= 12 && cabeza.getJugador().getEdad() >= 9) {
                jPanel6.add(new PanelJugador(cabeza.getJugador()));
                if (cabeza.getJugador().getPosicion() == Posicion.LANZADOR) {
                    Lanzadores9a12++;
                }
            } else if (cabeza.getJugador().getEdad() <= 16 && cabeza.getJugador().getEdad() >= 13 && (cabeza.getJugador().getPosicion() == Posicion.LANZADOR)) {
                Lanzadores13a16++;
            }

            if (cabeza.getJugador().getPromedio() < promedioBajo.getJugador().getPromedio()) {
                promedioBajo = cabeza;
            }

            if (null != cabeza.getJugador().getPosicion()) {
                switch (cabeza.getJugador().getPosicion()) {
                    case JARDINERO:
                        promJardinero += cabeza.getJugador().getEdad();
                        cantJardinero++;
                        break;
                    case LANZADOR:
                        promLanzadores += cabeza.getJugador().getEdad();
                        cantLanzadores++;
                        break;
                    case PRIMERABASE:
                        promPrimeraBase += cabeza.getJugador().getEdad();
                        cantPrimeraBase++;
                        break;
                    case RECEPTOR:
                        promReceptores += cabeza.getJugador().getEdad();
                        cantReceptores++;
                        break;
                    case SEGUNDABASE:
                        promSegundoBase += cabeza.getJugador().getEdad();
                        cantSegundoBase++;
                        break;
                    case SHORTSTOP:
                        promShortstop += cabeza.getJugador().getEdad();
                        cantShortstop++;
                        break;
                    default:
                        break;
                }
            }

            cabeza = cabeza.getSiguienteNodo();
        }

        this.elanzadores.setText(String.valueOf(promLanzadores / cantLanzadores));
        this.ereceptores.setText(String.valueOf(promReceptores / cantReceptores));
        this.eshortstop.setText(String.valueOf(promShortstop / cantShortstop));
        this.ejardinero.setText(String.valueOf(promJardinero / cantJardinero));
        this.eprimerabase.setText(String.valueOf(promPrimeraBase / cantPrimeraBase));
        this.esegundabase.setText(String.valueOf(promSegundoBase / cantSegundoBase));

        this.lbllanzadores9y12.setText(String.valueOf(Lanzadores9a12));
        this.lbllanzadores13y16.setText(String.valueOf(Lanzadores13a16));

        this.lblmenoraverage.setText(promedioBajo.getJugador().toString());

        for (int i = 0; i < Lanzadores9a12; i++) {
            JPanel panel = new JPanel();
            panel.setBackground(new java.awt.Color(255, 255, 255));
            this.jPanel6.add(panel);
        }

        this.jPanel6.updateUI();

    }

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbeliminar;
    private javax.swing.JComboBox<String> cbjugadores;
    private javax.swing.JComboBox<String> cbpos;
    private javax.swing.JComboBox<String> cbubicacion;
    private javax.swing.JLabel ejardinero;
    private javax.swing.JLabel elanzadores;
    private javax.swing.JLabel eprimerabase;
    private javax.swing.JLabel ereceptores;
    private javax.swing.JLabel esegundabase;
    private javax.swing.JLabel eshortstop;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblOrdenar;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblbuscar;
    private javax.swing.JLabel lbldespues;
    private javax.swing.JLabel lbllanzadores13y16;
    private javax.swing.JLabel lbllanzadores9y12;
    private javax.swing.JLabel lblmenoraverage;
    private javax.swing.JPanel pnlAgregar;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JLabel pnlReportes;
    private javax.swing.JPanel pnlback;
    private javax.swing.JPanel pnlback2;
    private javax.swing.JPanel pnlback3;
    private javax.swing.JPanel pnlopciones;
    private javax.swing.JPanel pnlreportes;
    private javax.swing.JTextField txtaverage;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtidentificacion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JPanel vagregar;
    private javax.swing.JPanel veliminar;
    private javax.swing.JPanel vhome;
    private javax.swing.JPanel vreportes;
    // End of variables declaration//GEN-END:variables
}
