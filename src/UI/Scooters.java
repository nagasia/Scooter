/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import JAVAS.Scooter;
import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Naga
 */
public class Scooters extends javax.swing.JDialog {

    private int x;
    private int y;
    private boolean editar;
    private Scooter scooters;
    Connection conn;
    Principal p;
    /**
     * Creates new form Scooter
     */
    public Scooters(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.p=(Principal)parent;
        this.conn=p.getConn();
        this.editar=p.getEditar();
        if(editar){
            this.scooters=p.getScooter();
            rellenaCampos();
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

        jPanel_head = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_body = new javax.swing.JPanel();
        jLabel_ok = new javax.swing.JLabel();
        jLabel_cancel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_modelo = new javax.swing.JTextField();
        jTextField_cilindrada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(315, 236));
        setMinimumSize(new java.awt.Dimension(315, 236));
        setUndecorated(true);
        setResizable(false);

        jPanel_head.setBackground(new java.awt.Color(66, 165, 245));
        jPanel_head.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_headMouseDragged(evt);
            }
        });
        jPanel_head.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_headMousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(241, 196, 15));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 71, 161));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Scooters");
        jLabel1.setMaximumSize(new java.awt.Dimension(114, 22));
        jLabel1.setMinimumSize(new java.awt.Dimension(114, 22));
        jLabel1.setPreferredSize(new java.awt.Dimension(114, 22));

        javax.swing.GroupLayout jPanel_headLayout = new javax.swing.GroupLayout(jPanel_head);
        jPanel_head.setLayout(jPanel_headLayout);
        jPanel_headLayout.setHorizontalGroup(
            jPanel_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_headLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_headLayout.setVerticalGroup(
            jPanel_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_headLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel_body.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_body.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 165, 245)));
        jPanel_body.setMaximumSize(new java.awt.Dimension(316, 174));
        jPanel_body.setMinimumSize(new java.awt.Dimension(316, 174));

        jLabel_ok.setBackground(new java.awt.Color(241, 196, 15));
        jLabel_ok.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_ok.setForeground(new java.awt.Color(13, 71, 161));
        jLabel_ok.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ok.setText("Aceptar");
        jLabel_ok.setMaximumSize(new java.awt.Dimension(114, 22));
        jLabel_ok.setMinimumSize(new java.awt.Dimension(114, 22));
        jLabel_ok.setOpaque(true);
        jLabel_ok.setPreferredSize(new java.awt.Dimension(114, 22));
        jLabel_ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_okMouseClicked(evt);
            }
        });

        jLabel_cancel.setBackground(new java.awt.Color(241, 196, 15));
        jLabel_cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_cancel.setForeground(new java.awt.Color(13, 71, 161));
        jLabel_cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_cancel.setText("Cancelar");
        jLabel_cancel.setMaximumSize(new java.awt.Dimension(114, 22));
        jLabel_cancel.setMinimumSize(new java.awt.Dimension(114, 22));
        jLabel_cancel.setOpaque(true);
        jLabel_cancel.setPreferredSize(new java.awt.Dimension(114, 22));
        jLabel_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_cancelMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Modelo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Cilindrada:");

        jTextField_modelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextField_cilindrada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel_bodyLayout = new javax.swing.GroupLayout(jPanel_body);
        jPanel_body.setLayout(jPanel_bodyLayout);
        jPanel_bodyLayout.setHorizontalGroup(
            jPanel_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_bodyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_bodyLayout.createSequentialGroup()
                        .addComponent(jLabel_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_bodyLayout.createSequentialGroup()
                        .addGroup(jPanel_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_cilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        jPanel_bodyLayout.setVerticalGroup(
            jPanel_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_bodyLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_cilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_headMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_headMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_jPanel_headMouseDragged

    private void jPanel_headMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_headMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel_headMousePressed

    private void jLabel_okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_okMouseClicked
        //obtenemos los datos
        String modelo=jTextField_modelo.getText();
        String cilindrada=jTextField_cilindrada.getText();
        
        try {
            PreparedStatement ps=null;
            
            if(editar){//editamos
                ps=conn.prepareStatement(
                        "UPDATE scooter "
                        + "SET modelo=?,cilindrada=? "
                        + "WHERE id="+scooters.getId());
            }
            else{//creamos
                ps=conn.prepareStatement("INSERT INTO scooter(modelo,cilindrada) "
                        + "VALUES(?,?)");
            }
            ps.setString(1,modelo);
            ps.setString(2,cilindrada);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Scooters.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jLabel_okMouseClicked

    private void jLabel_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_cancelMouseClicked
        dispose();
    }//GEN-LAST:event_jLabel_cancelMouseClicked

    //rellenamos los campos
    private void rellenaCampos() {
        jTextField_cilindrada.setText(scooters.getCilindrada());
        jTextField_modelo.setText(scooters.getModelo());
    }

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
            java.util.logging.Logger.getLogger(Scooters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scooters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scooters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scooters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Scooters dialog = new Scooters(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_cancel;
    private javax.swing.JLabel jLabel_ok;
    private javax.swing.JPanel jPanel_body;
    private javax.swing.JPanel jPanel_head;
    private javax.swing.JTextField jTextField_cilindrada;
    private javax.swing.JTextField jTextField_modelo;
    // End of variables declaration//GEN-END:variables


}
