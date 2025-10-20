package vista;

import rol_escolar.Estudiante;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import javax.swing.*;

public class TablaEstudiantes extends javax.swing.JFrame {

    public TablaEstudiantes(ArrayList<Estudiante> estudiantes) {
        initComponents();
        this.setTitle("Listado General de Estudiantes");
        // Llamar al método para llenar la tabla
        cargarTabla(estudiantes); 
        this.setLocationRelativeTo(null); // Centrar la ventana
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        estudiantesTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        estudiantesTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(estudiantesTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    private void cargarTabla(ArrayList<Estudiante> estudiantes) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String[] nombresColumnas = {
            "Matrícula", "Nombre", "Telefono", "Email", "F. Nacimiento", "F. Ingreso", "Carrera", "Becado", "Promedio", "Materias"
        };
        
        DefaultTableModel modelo = new DefaultTableModel(nombresColumnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        for (Estudiante est : estudiantes) {
            Object[] fila = new Object[10]; 
            fila[0] = est.getCodigoMatricula();
            fila[1] = est.getNombre() + " " + est.getPaterno() + " " + est.getMaterno();
            fila[2] = est.getTelefono();
            fila[3] = est.getEmail();
            fila[4] = dateFormat.format(est.getFecha_nacimiento());
            fila[5] = dateFormat.format(est.getFecha_ingreso());
            fila[6] = est.getCarrera();
            fila[7] = est.getBecado();
            fila[8] = est.getPromedio_actual();
            fila[9] = est.getStringMaterias();
            
            modelo.addRow(fila);
        }
        
        estudiantesTabla.setModel(modelo);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable estudiantesTabla;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
