/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Isay
 */
public class Empleado extends javax.swing.JFrame {
    static Connection con=null;
    static Statement sta=null;
    static ResultSet re=null;
    DefaultTableModel table = new DefaultTableModel();
    
    /**
     * Creates new form Empleado
     */
    public Empleado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RFC = new javax.swing.JTextField();
        BtnEliminar = new javax.swing.JButton();
        EmpleadoLabel = new javax.swing.JLabel();
        BtnModificar = new javax.swing.JButton();
        RFCLabel = new javax.swing.JLabel();
        BtnMostrar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        NombreLabel = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        ApePatLabel = new javax.swing.JLabel();
        ApePat = new javax.swing.JTextField();
        ApeMatLabel = new javax.swing.JLabel();
        ApeMat = new javax.swing.JTextField();
        DireccionLabel = new javax.swing.JLabel();
        CalleLabel = new javax.swing.JLabel();
        Calle = new javax.swing.JTextField();
        ColLabel = new javax.swing.JLabel();
        Colonia = new javax.swing.JTextField();
        NumeroLabel = new javax.swing.JLabel();
        Numero = new javax.swing.JTextField();
        TeleLabel = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        PobLabel = new javax.swing.JLabel();
        Poblacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        EmpleadoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EmpleadoLabel.setText("Empleado");

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        RFCLabel.setText("RFC");

        BtnMostrar.setText("Mostrar");
        BtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarActionPerformed(evt);
            }
        });

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        NombreLabel.setText("Nombre");

        ApePatLabel.setText("Apellido Paterno");

        ApeMatLabel.setText("Apellido Materno");

        DireccionLabel.setText("Dirección");

        CalleLabel.setText("Calle");

        ColLabel.setText("Colonia");

        NumeroLabel.setText("Número");

        TeleLabel.setText("Teléfono");

        PobLabel.setText("Población");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TeleLabel)
                    .addComponent(NumeroLabel)
                    .addComponent(CalleLabel)
                    .addComponent(DireccionLabel)
                    .addComponent(ApePatLabel)
                    .addComponent(NombreLabel)
                    .addComponent(RFCLabel)
                    .addComponent(ApeMatLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Telefono)
                                    .addComponent(Numero, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Calle)
                                    .addComponent(ApeMat, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ApePat, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(ColLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(Colonia, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(PobLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Poblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnGuardar)
                                .addGap(32, 32, 32)
                                .addComponent(BtnMostrar)
                                .addGap(28, 28, 28)
                                .addComponent(BtnEliminar)
                                .addGap(28, 28, 28)
                                .addComponent(BtnModificar)
                                .addGap(12, 12, 12))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(RFC, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EmpleadoLabel)
                .addGap(202, 202, 202))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(EmpleadoLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RFCLabel)
                    .addComponent(RFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreLabel)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApePatLabel)
                    .addComponent(ApePat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApeMatLabel)
                    .addComponent(ApeMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DireccionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CalleLabel)
                    .addComponent(Calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColLabel)
                    .addComponent(Colonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroLabel)
                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TeleLabel)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PobLabel)
                    .addComponent(Poblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnGuardar)
                        .addComponent(BtnMostrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnEliminar)
                        .addComponent(BtnModificar)))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
        JFrame marco = new JFrame("DialogDemo");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.pack();
        try{
            con=Principal.conexion(con);
            String eliminar = ("delete from Empleado where RFCEmpleado = '" + RFC.getText()+"'");
            PreparedStatement estado = con.prepareStatement(eliminar);
            estado.execute();
             con.close();
            JOptionPane.showMessageDialog(marco, "Registro Eliminado");
        }
        catch (Exception e){
            System.out.println("No se pudo eliminar el registro");
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        // TODO add your handling code here:
        MostrarEmpleado me = new MostrarEmpleado();
        me.setVisible(true);
        me.pack();
    }//GEN-LAST:event_BtnMostrarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        JFrame marco = new JFrame("DialogDemo");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.pack();
        try{
            con=Principal.conexion(con);
            String insertar = "insert into Empleado values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement estado = con.prepareStatement(insertar);
            //cada uno de los campos a ingresar al registro:
            estado.setString(1, RFC.getText());
            estado.setString(3, Nombre.getText());
            estado.setString(4, ApePat.getText());
            estado.setString(5, ApeMat.getText());
            estado.setInt(6, Integer.parseInt(Telefono.getText()));
            estado.setString(7, Calle.getText());
            estado.setString(8, Colonia.getText());
            estado.setInt(9, Integer.parseInt(Numero.getText()));
            estado.setString(2, Poblacion.getText());
            estado.execute();
            estado.close();
            JOptionPane.showMessageDialog(marco, "Registro insertado");
            con.close();
        }
        catch (Exception e){
            System.out.println("No se pudo guardar el registro");
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // TODO add your handling code here:
        JFrame marco = new JFrame("DialogDemo");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.pack();
        try {
            con=Principal.conexion(con);
            //Todos los campos a modificar, en este caso solo modificamos el codigo del cliente
            String modificar = ("update Empleado set RFCEmpleado = '" + RFC.getText()+"'");
            PreparedStatement estado = con.prepareStatement(modificar);
            estado.execute();
            estado.close();
            con.close();
            JOptionPane.showMessageDialog(marco, "Registro Modificado");
        } catch (Exception e){
            System.out.println("No se pudo modificar el registro");
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApeMat;
    private javax.swing.JLabel ApeMatLabel;
    private javax.swing.JTextField ApePat;
    private javax.swing.JLabel ApePatLabel;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnMostrar;
    private javax.swing.JTextField Calle;
    private javax.swing.JLabel CalleLabel;
    private javax.swing.JLabel ColLabel;
    private javax.swing.JTextField Colonia;
    private javax.swing.JLabel DireccionLabel;
    private javax.swing.JLabel EmpleadoLabel;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField Numero;
    private javax.swing.JLabel NumeroLabel;
    private javax.swing.JLabel PobLabel;
    private javax.swing.JTextField Poblacion;
    private javax.swing.JTextField RFC;
    private javax.swing.JLabel RFCLabel;
    private javax.swing.JLabel TeleLabel;
    private javax.swing.JTextField Telefono;
    // End of variables declaration//GEN-END:variables
}
