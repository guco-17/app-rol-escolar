package vista;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        lblTituloInicio = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        inicio = new javax.swing.JMenu();
        RegistroProfesores = new javax.swing.JMenu();
        RegistroAlumnos = new javax.swing.JMenu();
        AlumnosMenu = new javax.swing.JMenuItem();
        RegistroMaterias = new javax.swing.JMenu();
        MateriasMenu = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloInicio.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTituloInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloInicio.setText("SISTEMA ESCOLAR - ROLES");

        inicio.setText("Inicio");
        Menu.add(inicio);

        RegistroProfesores.setText("Registro Profesores");
        Menu.add(RegistroProfesores);

        RegistroAlumnos.setText("Registro Alumnos");

        AlumnosMenu.setText("Alumnos");
        AlumnosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnosMenuActionPerformed(evt);
            }
        });
        RegistroAlumnos.add(AlumnosMenu);

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
            .addComponent(lblTituloInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTituloInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MateriasMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MateriasMenuActionPerformed
        RegistroMaterias registro_materias = new RegistroMaterias();
        registro_materias.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MateriasMenuActionPerformed

    private void AlumnosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnosMenuActionPerformed
        RegistroEstudiantes estudiantes = new RegistroEstudiantes();
        estudiantes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AlumnosMenuActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AlumnosMenu;
    private javax.swing.JMenuItem MateriasMenu;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu RegistroAlumnos;
    private javax.swing.JMenu RegistroMaterias;
    private javax.swing.JMenu RegistroProfesores;
    private javax.swing.JMenu inicio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblTituloInicio;
    // End of variables declaration//GEN-END:variables
}
