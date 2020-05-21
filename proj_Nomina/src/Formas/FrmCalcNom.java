/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class FrmCalcNom extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmCalcNom
     */
    public FrmCalcNom() throws SQLException {
        initComponents();
        loadDeptos();
        loadConceptos();
    }
    public void loadDeptos() throws SQLException
    {
        com.mysql.jdbc.Connection cn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT nombre_departamento FROM departamento");
        cmbDepto.removeAllItems();
        while(rs.next()){
            cmbDepto.addItem(rs.getString(1));
        }
        
    }
    public void loadConceptos() throws SQLException
    {
        com.mysql.jdbc.Connection cn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT nombre_concepto FROM concepto");
        cmbConceptos.removeAllItems();
        while(rs.next()){
            cmbConceptos.addItem(rs.getString(1));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TxtCodNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBEmpleados = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        BtnListar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtCarnet = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtDepto = new javax.swing.JTextField();
        TxtPuesto = new javax.swing.JTextField();
        TxtSueldo = new javax.swing.JTextField();
        BtnCalc = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBConceptos = new javax.swing.JTable();
        BtnFinEmp = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        TxtCodNomEmp = new javax.swing.JTextField();
        cmbConceptos = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtmop = new javax.swing.JTextField();
        rm = new javax.swing.JRadioButton();
        rp = new javax.swing.JRadioButton();
        btnCambioDepto = new javax.swing.JButton();
        cmbDepto = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setTitle("Calcular Nómina");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CALCULAR NOMINAS");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código Nómina:");

        TxtCodNom.setEditable(false);
        TxtCodNom.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Departamento:");

        TBEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carnet", "Nombre", "Departamentol", "Puesto", "Sueldo Base"
            }
        ));
        TBEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBEmpleados);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Listado de Empleados");

        BtnListar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnListar.setText("Listar");
        BtnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnListarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculo Nómina", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Carnet:");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre:");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Departamento:");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Puesto:");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sueldo Base:");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Concepto");

        TxtCarnet.setEditable(false);
        TxtCarnet.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtNombre.setEditable(false);
        TxtNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtDepto.setEditable(false);
        TxtDepto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtPuesto.setEditable(false);
        TxtPuesto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        TxtSueldo.setEditable(false);
        TxtSueldo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        BtnCalc.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnCalc.setText("Calcular");
        BtnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcActionPerformed(evt);
            }
        });

        TBConceptos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        TBConceptos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nomina Empleado", "Código Concepto", "Monto"
            }
        ));
        jScrollPane2.setViewportView(TBConceptos);

        BtnFinEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        BtnFinEmp.setText("Finalizar");
        BtnFinEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFinEmpActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Código Nómina Empleado:");

        TxtCodNomEmp.setEditable(false);
        TxtCodNomEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        cmbConceptos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Monto o Porcentaje");

        txtmop.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        rm.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rm);
        rm.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        rm.setForeground(new java.awt.Color(255, 255, 255));
        rm.setText("Monto");

        rp.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(rp);
        rp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        rp.setForeground(new java.awt.Color(255, 255, 255));
        rp.setText("Porcentaje");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(TxtCodNomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(BtnCalc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnFinEmp))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(TxtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(TxtDepto, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(TxtPuesto, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(TxtSueldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(TxtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(79, 79, 79))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(cmbConceptos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rm)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtmop))
                                    .addComponent(rp))
                                .addGap(38, 38, 38))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbConceptos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnCalc)
                            .addComponent(BtnFinEmp)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(rm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rp)))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TxtCodNomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnCambioDepto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCambioDepto.setText("Finalizar Departamento");
        btnCambioDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioDeptoActionPerformed(evt);
            }
        });

        cmbDepto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCambioDepto)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtCodNom, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(cmbDepto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(8, 8, 8)
                                        .addComponent(BtnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 586, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(TxtCodNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(cmbDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(BtnListar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCambioDepto)
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnListarActionPerformed
       Object[] modelo = new Object[5];
       DefaultTableModel Tmodel = (DefaultTableModel) TBEmpleados.getModel();
       try
       {
           com.mysql.jdbc.Connection cn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
           String sql="select carnet_empleado, nombre_empleado, apellidos_empleado, nombre_departamento, nombre_puesto, sueldo_base from empleado\n" +
            "INNER JOIN departamento on departamento.id_departamento = empleado.fk_departamento\n" +
            "INNER JOIN puesto on puesto.id_puesto = empleado.fk_puesto\n" +
            "WHERE nombre_departamento= ?";
           PreparedStatement pst = cn.prepareStatement(sql);
           pst.setString(1, cmbDepto.getSelectedItem().toString().trim());
           ResultSet rs = pst.executeQuery();
           while(rs.next()){
               modelo[0]=rs.getString("carnet_empleado");
               modelo[1]=rs.getString("nombre_empleado")+" "+rs.getString("apellidos_empleado");
               modelo[2]=rs.getString("nombre_departamento");
               modelo[3]=rs.getString("nombre_puesto");
               modelo[4]=rs.getString("sueldo_base");
               Tmodel.addRow(modelo);
           }
           TBEmpleados.setModel(Tmodel);
       }
       catch(SQLException e)
       {
           JOptionPane.showMessageDialog(null, e.toString());
       }
    }//GEN-LAST:event_BtnListarActionPerformed

    private void TBEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBEmpleadosMouseClicked
        int seleccion = TBEmpleados.rowAtPoint(evt.getPoint());
        TxtCarnet.setText(String.valueOf(TBEmpleados.getValueAt(seleccion, 0)));
        TxtNombre.setText(String.valueOf(TBEmpleados.getValueAt(seleccion, 1)));
        TxtDepto.setText(String.valueOf(TBEmpleados.getValueAt(seleccion, 2)));
        TxtPuesto.setText(String.valueOf(TBEmpleados.getValueAt(seleccion, 3)));
        TxtSueldo.setText(String.valueOf(TBEmpleados.getValueAt(seleccion, 4)));
        TxtCodNomEmp.setText("");
        TxtCodNomEmp.setText(TxtCodNom.getText()+TxtCarnet.getText());
    }//GEN-LAST:event_TBEmpleadosMouseClicked

    private void btnCambioDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioDeptoActionPerformed
        DefaultTableModel modeloClearTEmp = (DefaultTableModel) TBEmpleados.getModel();
        modeloClearTEmp.setRowCount(0);
        TBEmpleados.setModel(modeloClearTEmp);
    }//GEN-LAST:event_btnCambioDeptoActionPerformed

    private void BtnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcActionPerformed
        try
        {
            double valor=0;
            String concepto="";
            if(rm.isSelected()){
                valor=Double.parseDouble(txtmop.getText());
            }
            if(rp.isSelected()){
                valor=Double.parseDouble(TxtSueldo.getText())*(Double.parseDouble(txtmop.getText())/100);
            }
            DefaultTableModel llenado = (DefaultTableModel)TBConceptos.getModel();
            Object[] conceptos = new Object[3];
            com.mysql.jdbc.Connection cn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            PreparedStatement pst = cn.prepareStatement("SELECT id_concepto FROM concepto WHERE nombre_concepto=?");
            pst.setString(1, cmbConceptos.getSelectedItem().toString().trim());
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                concepto=(rs.getString("id_concepto"));
            }
            conceptos[0]=TxtCodNomEmp.getText();
            conceptos[1]=concepto;
            conceptos[2]=valor;
            llenado.addRow(conceptos);
            TBConceptos.setModel(llenado);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BtnCalcActionPerformed

    private void BtnFinEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFinEmpActionPerformed
        try
        {
            com.mysql.jdbc.Connection cn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            PreparedStatement pst1 = cn.prepareStatement("INSERT INTO nomina_empleado VALUES(?,?,?)");
            pst1.setString(1, TxtCodNomEmp.getText().trim());
            pst1.setString(2, TxtCarnet.getText().trim());
            pst1.setString(3, TxtCodNom.getText().trim());
            pst1.executeUpdate();
            if(TBConceptos.getRowCount()>0){
                for(int i=0; i<TBConceptos.getRowCount(); i++){
                    PreparedStatement pst2 = cn.prepareStatement("INSERT INTO detalle_nomina VALUES(?,?,?,?)");
                    pst2.setString(1, "0");
                    pst2.setString(2, (String)TBConceptos.getValueAt(i, 0));
                    pst2.setString(3, (String)TBConceptos.getValueAt(i, 1));
                    pst2.setDouble(4, (Double)TBConceptos.getValueAt(i, 2));
                    pst2.executeUpdate();
                }
            }
            JOptionPane.showMessageDialog(null, "¡REGISTRO REALIZADO!"); 
            
            FrmCalcNT NT = new FrmCalcNT();
            NT.setVisible(true);
            Frm_Principal.Workbench.add(NT);
            FrmCalcNT.TxtCodNom.setText(TxtCodNomEmp.getText());
            FrmCalcNT.TxtSB.setText(TxtSueldo.getText());
            TxtCodNomEmp.setText("");
            TxtCarnet.setText("");
           
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_BtnFinEmpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalc;
    private javax.swing.JButton BtnFinEmp;
    private javax.swing.JButton BtnListar;
    private javax.swing.JTable TBConceptos;
    private javax.swing.JTable TBEmpleados;
    private javax.swing.JTextField TxtCarnet;
    public static javax.swing.JTextField TxtCodNom;
    private javax.swing.JTextField TxtCodNomEmp;
    private javax.swing.JTextField TxtDepto;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtPuesto;
    private javax.swing.JTextField TxtSueldo;
    private javax.swing.JButton btnCambioDepto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbConceptos;
    private javax.swing.JComboBox<String> cmbDepto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rm;
    private javax.swing.JRadioButton rp;
    private javax.swing.JTextField txtmop;
    // End of variables declaration//GEN-END:variables
}
