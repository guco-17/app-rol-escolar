package vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.EstudianteDAO;
import rol_escolar.Estudiante;

public class RegistroEstudiantes extends javax.swing.JFrame {

    public RegistroEstudiantes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTituloAlumnos = new javax.swing.JLabel();
        lblCodigoMatricula = new javax.swing.JLabel();
        spinnerCodigoMatricula = new javax.swing.JSpinner();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbPaterno = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        lblMaterno = new javax.swing.JLabel();
        txtMaterno = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JFormattedTextField();
        lblFechaIngreso = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JFormattedTextField();
        lblBecado = new javax.swing.JLabel();
        rdbtnSi = new javax.swing.JRadioButton();
        rdbtnNo = new javax.swing.JRadioButton();
        lblCarrera = new javax.swing.JLabel();
        cboCarrera = new javax.swing.JComboBox<>();
        lblPromedioActual = new javax.swing.JLabel();
        txtPromedioActual = new javax.swing.JTextField();
        lblDatos = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregarMateria = new javax.swing.JButton();
        btnEliminarMateria = new javax.swing.JButton();
        lblMateriasEstudiante = new javax.swing.JLabel();
        btnMostrarAlumnos = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        inicio = new javax.swing.JMenu();
        InicioMenu = new javax.swing.JMenuItem();
        RegistroProfesores = new javax.swing.JMenu();
        RegistroAlumnos = new javax.swing.JMenu();
        RegistroMaterias = new javax.swing.JMenu();
        MateriasMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloAlumnos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTituloAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloAlumnos.setText("Registro de Estudiantes - Materias");

        lblCodigoMatricula.setText("Código/Matrícula:");

        lblNombre.setText("Nombre:");

        lbPaterno.setText("Paterno:");

        txtPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaternoActionPerformed(evt);
            }
        });

        lblMaterno.setText("Materno:");

        lblTelefono.setText("Teléfono:");

        lblEmail.setText("Email:");

        lblFechaNacimiento.setText("Fecha Nac.");

        txtFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        lblFechaIngreso.setText("Fecha Ing.");

        txtFechaIngreso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        lblBecado.setText("Becado:");

        rdbtnSi.setText("Si");

        rdbtnNo.setText("No");

        lblCarrera.setText("Carrera:");

        cboCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniería en Sistemas Computacionales", "Ingeniería Industrial", "Quimico Farmacobiólogo", "Ingeniería Física", "Medicina", "Ingeniería Automotriz", "Gastronomía", "Arquitectura", "Ingeniería Civil", "Matemáticas", "Fisioterapia", "Nutrición", "Diseño Industrial", "Comunicación", "Mercadotécnia" }));

        lblPromedioActual.setText("Promedio actual:");

        lblDatos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDatos.setText("DATOS DEL ESTUDIANTE:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregarMateria.setText("Agregar materia");
        btnAgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMateriaActionPerformed(evt);
            }
        });

        btnEliminarMateria.setText("Eliminar Materia");
        btnEliminarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMateriaActionPerformed(evt);
            }
        });

        lblMateriasEstudiante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMateriasEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMateriasEstudiante.setText("Gestionar Materias del Estudiante");

        btnMostrarAlumnos.setText("MOSTRAR ALUMNOS");
        btnMostrarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAlumnosActionPerformed(evt);
            }
        });

        inicio.setText("Inicio");

        InicioMenu.setText("Página Principal");
        InicioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioMenuActionPerformed(evt);
            }
        });
        inicio.add(InicioMenu);

        Menu.add(inicio);

        RegistroProfesores.setText("Registro Profesores");
        Menu.add(RegistroProfesores);

        RegistroAlumnos.setText("Registro Alumnos");
        Menu.add(RegistroAlumnos);

        RegistroMaterias.setText("Registro Materias");

        MateriasMenu.setText("Materias");
        MateriasMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MateriasMenuActionPerformed(evt);
            }
        });
        RegistroMaterias.add(MateriasMenu);

        Menu.add(RegistroMaterias);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTituloAlumnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(30, 30, 30)
                        .addComponent(btnActualizar)
                        .addGap(33, 33, 33)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCodigoMatricula)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spinnerCodigoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombre)
                                .addComponent(lbPaterno))
                            .addGap(8, 8, 8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPaterno)
                                .addComponent(txtNombre)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMaterno)
                                .addComponent(lblTelefono)
                                .addComponent(lblEmail))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail)
                                .addComponent(txtTelefono)
                                .addComponent(txtMaterno)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFechaNacimiento)
                                .addComponent(lblFechaIngreso))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFechaIngreso)
                                .addComponent(txtFechaNacimiento)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblBecado)
                            .addGap(46, 46, 46)
                            .addComponent(rdbtnSi)
                            .addGap(18, 18, 18)
                            .addComponent(rdbtnNo))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCarrera)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboCarrera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPromedioActual)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPromedioActual, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(btnEliminarMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblMateriasEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                        .addComponent(btnMostrarAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTituloAlumnos)
                .addGap(18, 18, 18)
                .addComponent(lblDatos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoMatricula)
                    .addComponent(spinnerCodigoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPaterno)
                            .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaterno)
                            .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMateriasEstudiante)
                        .addGap(16, 16, 16)
                        .addComponent(btnAgregarMateria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarMateria)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNacimiento)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaIngreso)
                    .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBecado)
                    .addComponent(rdbtnSi)
                    .addComponent(rdbtnNo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCarrera)
                            .addComponent(cboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPromedioActual)
                            .addComponent(txtPromedioActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MateriasMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriasMenuActionPerformed
        RegistroMaterias registro_materias = new RegistroMaterias();
        registro_materias.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MateriasMenuActionPerformed

    private void InicioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioMenuActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_InicioMenuActionPerformed

    private void txtPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaternoActionPerformed

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //DECLARAR VARIABLES Y OBTENER SU CONTENIDO DEL FORMULARIO
        int codigoMatricula = (int) spinnerCodigoMatricula.getValue();
        String nombre = txtNombre.getText();
        String paterno = txtPaterno.getText();
        String materno = txtMaterno.getText();
        String telefono = txtTelefono.getText();
        String email = txtEmail.getText();
        String txtNacimiento = txtFechaNacimiento.getText();
        String txtIngreso = txtFechaIngreso.getText();
        String becado = "";
        String carrera = (String) cboCarrera.getSelectedItem();
        String txtPromedio = txtPromedioActual.getText();
        
        //CONVERTIR CADENA DE CARACTERES A FECHA CORTA
        Date fecha_nac = null;
        Date fecha_ing = null;
        try {
            fecha_nac = dateFormat.parse(txtNacimiento);
            fecha_ing = dateFormat.parse(txtIngreso   );
        } catch (ParseException e) {
            System.err.println("Error: " + e);
        }
        
        //ASIGNAR EL VALOR A 'BECADO' SEGÚN QUE RADIOBUTTON ESTÉ SELECCIONADO
        if(rdbtnSi.isSelected() && rdbtnNo.isSelected()){
            JOptionPane.showMessageDialog(this, "Seleccione solo una opción (Si o No).");
        } else if(rdbtnSi.isSelected()){
            becado = rdbtnSi.getText();
        } else {
            becado = rdbtnNo.getText();
        }
        
        //CONVERTIR CADENA DE CARACTERES A FORMATO DOUBLE
        double promedio_actual = Double.parseDouble(txtPromedio);
        
        //VERIFICAR QUE TODOS LOS CAMPOS ESTÉN LLENOS
        if (codigoMatricula == 0 || nombre.isEmpty() || paterno.isEmpty() || materno.isEmpty() || telefono.isEmpty() || email.isEmpty() || txtNacimiento.isEmpty() || txtIngreso.isEmpty()|| becado.isEmpty() || carrera.isEmpty() || txtPromedio.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.");
            return;
        }
        
        //CREAR OBJETO ESTUDIANTE
        Estudiante estudiante = new Estudiante(becado, carrera, promedio_actual, codigoMatricula, nombre, paterno, materno, telefono, email, fecha_nac, fecha_ing);
        EstudianteDAO dao = new EstudianteDAO();
        
        if (dao.registrarEstudiante(estudiante)) {
            JOptionPane.showMessageDialog(this, "Estudiante registrado correctamente.");
            spinnerCodigoMatricula.setValue(0);
            txtNombre.setText(""); 
            txtPaterno.setText(""); 
            txtMaterno.setText(""); 
            txtTelefono.setText(""); 
            txtEmail.setText(""); 
            txtFechaNacimiento.setText("");
            txtFechaIngreso.setText("");
            txtPromedioActual.setText("");
            buttonGroup1.clearSelection();
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar estudiante.");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int codigoMatricula = (int) spinnerCodigoMatricula.getValue();
        String nombre = txtNombre.getText();
        String paterno = txtPaterno.getText();
        String materno = txtMaterno.getText();
        String telefono = txtTelefono.getText();
        String email = txtEmail.getText();
        String txtNacimiento = txtFechaNacimiento.getText();
        String txtIngreso = txtFechaIngreso.getText();
        String becado = "";
        String carrera = (String) cboCarrera.getSelectedItem();
        String txtPromedio = txtPromedioActual.getText();
        
        //CONVERTIR CADENA DE CARACTERES A FECHA CORTA
        Date fecha_nac = null;
        Date fecha_ing = null;
        try {
            fecha_nac = dateFormat.parse(txtNacimiento);
            fecha_ing = dateFormat.parse(txtIngreso   );
        } catch (ParseException e) {
            System.err.println("Error: " + e);
        }
        
        //ASIGNAR EL VALOR A 'BECADO' SEGÚN QUE RADIOBUTTON ESTÉ SELECCIONADO
        if(rdbtnSi.isSelected() && rdbtnNo.isSelected()){
            JOptionPane.showMessageDialog(this, "Seleccione solo una opción (Si o No).");
        } else if(rdbtnSi.isSelected()){
            becado = rdbtnSi.getText();
        } else {
            becado = rdbtnNo.getText();
        }
        
        //CONVERTIR CADENA DE CARACTERES A FORMATO DOUBLE
        double promedio_actual = Double.parseDouble(txtPromedio);
        
        //VERIFICAR QUE TODOS LOS CAMPOS ESTÉN LLENOS
        if (codigoMatricula == 0 || nombre.isEmpty() || paterno.isEmpty() || materno.isEmpty() || telefono.isEmpty() || email.isEmpty() || txtNacimiento.isEmpty() || txtIngreso.isEmpty()|| becado.isEmpty() || carrera.isEmpty() || txtPromedio.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.");
            return;
        }
        
        //CREAR OBJETO ESTUDIANTE
        Estudiante estudiante = new Estudiante(becado, carrera, promedio_actual, codigoMatricula, nombre, paterno, materno, telefono, email, fecha_nac, fecha_ing);
        EstudianteDAO dao = new EstudianteDAO();
        
        if (dao.actualizarEstudiante(estudiante)) {
            JOptionPane.showMessageDialog(this, "Estudiante actualizado correctamente.");
            spinnerCodigoMatricula.setValue(0);
            txtNombre.setText(""); 
            txtPaterno.setText(""); 
            txtMaterno.setText(""); 
            txtTelefono.setText(""); 
            txtEmail.setText(""); 
            txtFechaNacimiento.setText("");
            txtFechaIngreso.setText("");
            txtPromedioActual.setText("");
            buttonGroup1.clearSelection();
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar estudiante.");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        EstudianteDAO dao = new EstudianteDAO();
        int codigo = (int) spinnerCodigoMatricula.getValue();
        
        if (dao.eliminarEstudiante(codigo)) {
            JOptionPane.showMessageDialog(this, "Estudiante con matricula " + codigo + " eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar estudiante");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMateriaActionPerformed
        int codigo = (int) spinnerCodigoMatricula.getValue();
        
        String cveMateria = JOptionPane.showInputDialog(this, "Ingrese la clave de la materia:", JOptionPane.QUESTION_MESSAGE);
        
        if (cveMateria == null || cveMateria.trim().isEmpty()) {
            return;
        }
        
        EstudianteDAO dao = new EstudianteDAO();
        
        if (dao.agregarMateria(codigo, cveMateria.trim())) {
            JOptionPane.showMessageDialog(this, "Materia " + cveMateria.trim() + " agregada a estudiante " + codigo);
        } else {
            JOptionPane.showMessageDialog(this, "Error al agregar materia a estudiante.");
        }
    }//GEN-LAST:event_btnAgregarMateriaActionPerformed

    private void btnEliminarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMateriaActionPerformed
        int codigo = (int) spinnerCodigoMatricula.getValue();
        
        String cveMateria = JOptionPane.showInputDialog(this, "Ingrese la clave de la materia:", JOptionPane.QUESTION_MESSAGE);
        
        if (cveMateria == null || cveMateria.trim().isEmpty()) {
            return;
        }
        
        EstudianteDAO dao = new EstudianteDAO();
        
        if (dao.quitarMateria(codigo, cveMateria.trim())) {
            JOptionPane.showMessageDialog(this, "Materia " + cveMateria.trim() + " eliminada a estudiante " + codigo);
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar materia a estudiante.");
        }
    }//GEN-LAST:event_btnEliminarMateriaActionPerformed

    private void btnMostrarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAlumnosActionPerformed
        EstudianteDAO dao = new EstudianteDAO();
        ArrayList<Estudiante> listaEstudiantes = dao.obtenerEstudiantes();
        if (listaEstudiantes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontraron estudiantes registrados en la base de datos.", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        TablaEstudiantes tablaVentana = new TablaEstudiantes(listaEstudiantes);
        tablaVentana.setVisible(true);
    }//GEN-LAST:event_btnMostrarAlumnosActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem InicioMenu;
    private javax.swing.JMenuItem MateriasMenu;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu RegistroAlumnos;
    private javax.swing.JMenu RegistroMaterias;
    private javax.swing.JMenu RegistroProfesores;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarMateria;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarMateria;
    private javax.swing.JButton btnMostrarAlumnos;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboCarrera;
    private javax.swing.JMenu inicio;
    private javax.swing.JLabel lbPaterno;
    private javax.swing.JLabel lblBecado;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblCodigoMatricula;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblMateriasEstudiante;
    private javax.swing.JLabel lblMaterno;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPromedioActual;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTituloAlumnos;
    private javax.swing.JRadioButton rdbtnNo;
    private javax.swing.JRadioButton rdbtnSi;
    private javax.swing.JSpinner spinnerCodigoMatricula;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtFechaIngreso;
    private javax.swing.JFormattedTextField txtFechaNacimiento;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtPromedioActual;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
