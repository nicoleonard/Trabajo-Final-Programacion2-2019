/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.trabajos.vistas;

import com.toedter.calendar.JDateChooser;
import gui.interfaces.IControladorAMTrabajo;
import gui.interfaces.IControladorTrabajos;
import java.awt.Dialog;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author Nico
 */
public class VentanaAMTrabajo extends JDialog {
    private IControladorAMTrabajo controlador;
    
    
    /**
     * Creates new form VentanaAMTrabajo (para crear un nuevo trabajo o para modificar un trabajo seleccionado)
     */
    public VentanaAMTrabajo(IControladorAMTrabajo controlador, Dialog ventanaPadre,String titulo) {
        super(ventanaPadre, true);
        initComponents();
        this.setTitle(titulo);
        this.controlador = controlador;
        if(this.getTitle().equals(IControladorTrabajos.TRABAJO_NUEVO)){ //si la operacion a realizar es crear un trabajo nuevo deshabilita el campo para la fecha de finalizacion
            this.dcFechaFinalizacion.setEnabled(false);   
        }
        
        if(this.getTitle().equals(IControladorTrabajos.TRABAJO_MODIFICAR)){ //si la operacion a realizar es modificar un trabajo seleccionado deshabilita todos los campos menos el de la fecha de finalizacion
            this.txtTitulo.setEnabled(false);
            this.txtDuracion.setEnabled(false);
            this.dcFechaPresentacion.setEnabled(false);
            this.dcFechaAprobacion.setEnabled(false);
            this.listaAreas.setEnabled(false);
            this.listaAlumnos.setEnabled(false);
            this.listaTutor.setEnabled(false);
            this.listaCotutor.setEnabled(false);
            this.listaJurado.setEnabled(false);
        }
    }


    /**
     * Devuelve el campo txtNombre
     * @return JTextField  - campo txtNombre
     */
    public JTextField verTxtTitulo() {
        return this.txtTitulo;
    }
    
    /**
     * Devuelve el campo txtNombre
     * @return JTextField  - campo txtNombre
     */
    public JTextField verTxtDuracion() {
        return this.txtDuracion;
    }
    
    /**
     * Devuelve un string del campo txtDuracion
     * @return String - campo txtDuracion
     */
    public String stringTxtDuracion(){
        if(this.txtDuracion.getText().isEmpty()){
            return "0";
        }else{
            return this.txtDuracion.getText();
        }
        
    }
    
    /**
     * Devuelve la fecha elegida en el DateChooser
     * @return Date  - campo dcFechaPresentacion
     */
    public LocalDate verFechaPresentacion(){
        if(dcFechaPresentacion.getCalendar()==null){
            return null;
        }
        Date d = dcFechaPresentacion.getCalendar().getTime();
        LocalDate f= d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return f;
    }
    
    /**
     * Devuelve la fecha elegida en el DateChooser
     * @return Date  - campo dcFechaAprobacion
     */
    public LocalDate verFechaAprobacion(){
        if(dcFechaAprobacion.getCalendar()==null){
            return null;
        }
        Date d = dcFechaAprobacion.getCalendar().getTime();
        LocalDate f = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return f;
    }
    
    /**
     * Devuelve la fecha elegida en el DateChooser
     * @return Date  - campo dcFechaAprobacion
     */
    public LocalDate verFechaFinalizacion(){
        if(dcFechaFinalizacion.getCalendar()==null){
            return null;
        }
        Date d = dcFechaFinalizacion.getCalendar().getTime();
        LocalDate f = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return f;
    }
    
    /**
     * Metodos que devuelven las JList
     * @return 
     */
    public JList verListaAreas(){
        return this.listaAreas;
    }
    
    public JList verListaAlumnos(){
        return this.listaAlumnos;
    }
    
    public JList verListaTutor(){
        return this.listaTutor;
    }
    
    public JList verListaCotutor(){
        return this.listaCotutor;
    }
    
    public JList verListaJurado(){
        return this.listaJurado;
    }
    
    /**
     * Metodos que devuelven los JDateChooser
     * @return 
     */
    public JDateChooser verDcFechaFinalizacion(){
        return this.dcFechaFinalizacion;
    }
    
    public JDateChooser verDcFechaPresentacion(){
        return this.dcFechaPresentacion;
    }
    
    public JDateChooser verDcFechaAprobacion(){
        return this.dcFechaAprobacion;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtDuracion = new javax.swing.JTextField();
        dcFechaPresentacion = new com.toedter.calendar.JDateChooser();
        dcFechaAprobacion = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dcFechaFinalizacion = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaJurado = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaCotutor = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTutor = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaAlumnos = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaAreas = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnGuardar.setMnemonic('G');
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClic(evt);
            }
        });

        btnCancelar.setMnemonic('C');
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClic(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del trabajo"));

        jLabel1.setText("Titulo:");

        txtTitulo.setToolTipText("Titulo del trabajo. El campo no puede quedar en blanco.");
        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePresionarTecla(evt);
            }
        });

        txtDuracion.setToolTipText("Duracion en meses del trabajo.");
        txtDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuracionPresionarTecla(evt);
            }
        });

        dcFechaPresentacion.setToolTipText("Fecha en formato dd/MM/aaaa");

        dcFechaAprobacion.setToolTipText("Fecha en formato dd/MM/aaaa");
        dcFechaAprobacion.setDateFormatString("dd/MM/yyyy");

        jLabel2.setText("Duracion:");

        jLabel3.setText("Fecha presentacion:");

        jLabel4.setText("Fecha aprobacion:");

        dcFechaFinalizacion.setToolTipText("Fecha en formato dd/MM/aaaa");

        jLabel9.setText("Fecha finalizacion:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dcFechaFinalizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dcFechaAprobacion, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtTitulo)
                    .addComponent(dcFechaPresentacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcFechaPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcFechaAprobacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcFechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccion de profesores para roles"));

        listaJurado.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaJurado.setToolTipText("Debe seleccionar 3 docentes de la lista para cumplir la funcion de jurado. \nUn docente no puede ser tutor/cotutor y jurado a la vez.");
        jScrollPane3.setViewportView(listaJurado);

        listaCotutor.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaCotutor.setToolTipText("Puede seleccionar docentes de esta lista para la funcion de cotutor. Un docente no puede cumplir el rol de cotutor y tutor/jurado a la vez.");
        jScrollPane2.setViewportView(listaCotutor);

        listaTutor.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaTutor.setToolTipText("Debe seleccionar al menos un docente para la funcion de tutor. Un docente no puede cumplir el rol de tutor y cotutor/jurado a la vez.");
        jScrollPane1.setViewportView(listaTutor);

        jLabel5.setText("Tutor:");

        jLabel6.setText("Cotutor:");

        jLabel7.setText("Jurados:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccion de alumnos"));

        jLabel8.setText("Alumnos:");

        listaAlumnos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaAlumnos.setToolTipText("Seleccione al menos un alumno para participar en el proyecto.");
        jScrollPane4.setViewportView(listaAlumnos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccion de areas"));

        jLabel10.setText("Areas:");

        listaAreas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaAreas.setToolTipText("Seleccione al menos un area de la lista para el trabajo.");
        jScrollPane5.setViewportView(listaAreas);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Los siguientes metodos reciben un evento de la fuente y se lo transmiten al controlador
    private void txtNombrePresionarTecla(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePresionarTecla
        this.controlador.txtTituloPresionarTecla(evt);
    }//GEN-LAST:event_txtNombrePresionarTecla

    private void btnCancelarClic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClic
        this.controlador.btnCancelarClic(evt);
    }//GEN-LAST:event_btnCancelarClic

    private void txtDuracionPresionarTecla(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuracionPresionarTecla
        this.controlador.txtDuracionPresionarTecla(evt);
    }//GEN-LAST:event_txtDuracionPresionarTecla

    private void btnGuardarClic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClic
        this.controlador.btnGuardarClic(evt);
    }//GEN-LAST:event_btnGuardarClic

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private com.toedter.calendar.JDateChooser dcFechaAprobacion;
    private com.toedter.calendar.JDateChooser dcFechaFinalizacion;
    private com.toedter.calendar.JDateChooser dcFechaPresentacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<String> listaAlumnos;
    private javax.swing.JList<String> listaAreas;
    private javax.swing.JList<String> listaCotutor;
    private javax.swing.JList<String> listaJurado;
    private javax.swing.JList<String> listaTutor;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}