/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDPROCEDIMIENTOALMACENADO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author PERCASTEGUI
 */
public class INTERFAZ extends javax.swing.JFrame {

    conexion0 con = new conexion0();
    
   Statement st;
   ResultSet rs;
    /**
     * Creates new form INTERFAZ
     */
    public INTERFAZ() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("Apellido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setText("Edad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setText("Nacionalidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 250, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 250, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 250, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 250, -1));

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 210, 30));

        jButton5.setText("Agregar PA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 100, -1));

        jLabel5.setText("Id");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jButton6.setText("Modificar PA");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 100, -1));

        jButton7.setText("Eliminar PA");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Connection c = con.conexion();
       
       String sql="insert into crudprocedimiento (nombre, apellido, edad, nacionalidad) values(?,?,?,?)";
        try {
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, jTextField1.getText().toString());
        ps.setString(2, jTextField2.getText().toString());
        ps.setString(3, jTextField3.getText().toString());
        ps.setString(4, jTextField4.getText().toString());
        int res = ps.executeUpdate();
        if (res>0){
        JOptionPane.showMessageDialog(null, "Registro exitoso");
        }else{
        
        JOptionPane.showMessageDialog(null, "Registro fallido");
        }
        } catch (Exception e) {
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Connection c = con.conexion();
        String sql="select * from crudprocedimiento where id=?";
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, jTextField5.getText().toString());
            rs=  ps.executeQuery();
            if(rs.next()){
            jTextField1.setText(rs.getString("nombre"));
            jTextField2.setText(rs.getString("apellido"));
            jTextField3.setText(rs.getString("edad"));
            jTextField4.setText(rs.getString("nacionalidad"));
            }else{
            JOptionPane.showMessageDialog(null, "   Verifica codigo");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection c = con.conexion();
        
        String sql="UPDATE crudprocedimiento set nombre=?, apellido=?, edad=?, nacionalidad=? wHERE id=?";
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, jTextField1.getText().toString());
             ps.setString(2, jTextField2.getText().toString());
              ps.setString(3, jTextField3.getText().toString());
               ps.setString(4, jTextField4.getText().toString());
               ps.setString(5, jTextField5.getText().toString());
              
               int res = ps.executeUpdate();
               if (res>0){
               JOptionPane.showMessageDialog(null, "Modificacion exitosa");
               }
               else{
                JOptionPane.showMessageDialog(null, "Modificacion fallida");
               }
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Connection c = con.conexion();
       String sql="DELETE FROM crudprocedimiento where id=?";
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, jTextField5.getText().toString());
            int res = ps.executeUpdate();
            if (res>0){
            JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
            }
            else{
            JOptionPane.showMessageDialog(null, "Eliminacion fallida");
            }
        } catch (Exception e) {
        }
       
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         Connection c = con.conexion();
        String sql="call insertar000(?,?,?,?,?)";

        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, jTextField5.getText().toString());
            ps.setString(2, jTextField1.getText().toString());
            ps.setString(3, jTextField2.getText().toString());
            ps.setString(4, jTextField3.getText().toString());
            ps.setString(5, jTextField4.getText().toString());
            int res = ps.executeUpdate();
            if (res>0){
                JOptionPane.showMessageDialog(null, "Registro Procedimiento almacenado exitoso");
            }else{
                JOptionPane.showMessageDialog(null, "Registro Procedimiento almacenado fallido");
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Connection c = con.conexion();
        
        String sql="call modificar0 (?,?,?,?,?)";
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, jTextField1.getText().toString());
             ps.setString(2, jTextField2.getText().toString());
              ps.setString(3, jTextField3.getText().toString());
               ps.setString(4, jTextField4.getText().toString());
               ps.setString(5, jTextField5.getText().toString());
              
               int res = ps.executeUpdate();
               if (res>0){
               JOptionPane.showMessageDialog(null, "Modificacion  PA exitosa");
               }
               else{
                JOptionPane.showMessageDialog(null, "Modificacion PA fallida");
               }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Connection c = con.conexion();
       String sql="call eliminar(?)";
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, jTextField5.getText().toString());
            int res = ps.executeUpdate();
            if (res>0){
            JOptionPane.showMessageDialog(null, "Eliminacion PA exitosa");
            }
            else{
            JOptionPane.showMessageDialog(null, "Eliminacion  PA fallida");
            }
        } catch (Exception e) {
        }
       
        
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(INTERFAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INTERFAZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INTERFAZ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
