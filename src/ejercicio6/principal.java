/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    double v[];
    public principal() {
        initComponents();
        cmdcalcular.setEnabled(false);
        cmdllenadoautomatico.setEnabled(false);
        cmdllenadomanual.setEnabled(false);
        cmdborrar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cmdcrear = new javax.swing.JButton();
        cmdllenadomanual = new javax.swing.JButton();
        cmdllenadoautomatico = new javax.swing.JButton();
        cmdcalcular = new javax.swing.JButton();
        cmdborrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtlongitud = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtresultado1 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtresultado2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("VECTOR SIMETRICO");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 170, 30));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdcrear.setText("Crear");
        cmdcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcrearActionPerformed(evt);
            }
        });
        jPanel4.add(cmdcrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, 30));

        cmdllenadomanual.setText("Llenado Manual");
        cmdllenadomanual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdllenadomanualActionPerformed(evt);
            }
        });
        jPanel4.add(cmdllenadomanual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 30));

        cmdllenadoautomatico.setText("Llenado Automatico");
        cmdllenadoautomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdllenadoautomaticoActionPerformed(evt);
            }
        });
        jPanel4.add(cmdllenadoautomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, 30));

        cmdcalcular.setText("Calcular");
        cmdcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcalcularActionPerformed(evt);
            }
        });
        jPanel4.add(cmdcalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 30));

        cmdborrar.setText("Borrar");
        cmdborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdborrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 180, 230));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos iniciales Vector"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Longitud:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 20));

        txtlongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlongitudActionPerformed(evt);
            }
        });
        txtlongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlongitudKeyTyped(evt);
            }
        });
        jPanel5.add(txtlongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 140, 40));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 220, 70));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado vector"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtresultado1.setEditable(false);
        txtresultado1.setColumns(20);
        txtresultado1.setRows(5);
        jScrollPane1.setViewportView(txtresultado1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 16, 220, 100));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 250, 130));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado operacion"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtresultado2.setEditable(false);
        txtresultado2.setColumns(20);
        txtresultado2.setRows(5);
        jScrollPane2.setViewportView(txtresultado2);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 26, 200, 80));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 240, 120));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcrearActionPerformed
        int longitud;
        if (txtlongitud.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite la longitud", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtlongitud.requestFocusInWindow();
        } else if (Integer.parseInt(txtlongitud.getText()) == 0) {
            JOptionPane.showMessageDialog(this, "La longitud debe ser diferente de 0", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtlongitud.requestFocusInWindow();
            txtlongitud.selectAll();
        } else {
            longitud = Integer.parseInt(txtlongitud.getText());
            v = new double[longitud];
            JOptionPane.showMessageDialog(this, "Vector creado correctamente");
             cmdcrear.setEnabled(false);
            cmdllenadomanual.setEnabled(true);
            cmdllenadoautomatico.setEnabled(true);
            cmdborrar.setEnabled(true);
            txtlongitud.setEnabled(false);
            cmdcalcular.setEnabled(false);
        }
    }//GEN-LAST:event_cmdcrearActionPerformed

    private void cmdllenadomanualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdllenadomanualActionPerformed
        double n;
        for (int i = 0; i < v.length; i++) {
            n = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor en la posicion" + (i + 1)));
            v[i] = n;
        }
        for (int i = 0; i < v.length; i++) {
            txtresultado1.append(v[i] + "\n");
        }
        cmdcrear.setEnabled(false);
        cmdllenadomanual.setEnabled(false);
        cmdllenadoautomatico.setEnabled(false);
        cmdcalcular.setEnabled(true);
        cmdborrar.setEnabled(true);
        txtlongitud.setEditable(false);
    }//GEN-LAST:event_cmdllenadomanualActionPerformed

    private void cmdllenadoautomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdllenadoautomaticoActionPerformed
        double n;
        for (int i = 0; i <v.length; i++) {
            n = (int) (Math.random() * 25 + 1);
            v[i] = n;
        }
        for (int i = 0; i <v.length; i++) {
            txtresultado1.append(v[i] + "\n");
        }
        cmdcrear.setEnabled(false);
        cmdllenadomanual.setEnabled(false);
        cmdllenadoautomatico.setEnabled(false);
        cmdcalcular.setEnabled(true);
        cmdborrar.setEnabled(true);
        txtlongitud.setEditable(false);
    }//GEN-LAST:event_cmdllenadoautomaticoActionPerformed

    private void cmdcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcalcularActionPerformed
        int longitud;
        longitud=Integer.parseInt(txtlongitud.getText());
        int n2 = longitud - 1;
        int contador = 0;
        for (int i = 0; i <v.length/2; i++) {
            if(v[i] == v[n2 - 1]){
                n2--;
            }
        }
        if (contador == (v.length/2)){
            txtresultado2.setText("Es simetrico");
        }else {
            txtresultado2.setText("NO es simetrico");
        }
    }//GEN-LAST:event_cmdcalcularActionPerformed

    private void cmdborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdborrarActionPerformed
        txtresultado1.setText("");
        txtresultado2.setText("");
        txtlongitud.setText("");
        txtlongitud.requestFocusInWindow();
        v = null;
        cmdcrear.setEnabled(true);
        cmdllenadomanual.setEnabled(false);
        cmdllenadoautomatico.setEnabled(false);
        cmdcalcular.setEnabled(false);
        cmdborrar.setEnabled(true);
        txtlongitud.setEnabled(true);
        txtlongitud.setEditable(true);
    }//GEN-LAST:event_cmdborrarActionPerformed

    private void txtlongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlongitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlongitudActionPerformed

    private void txtlongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlongitudKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtlongitudKeyTyped

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdborrar;
    private javax.swing.JButton cmdcalcular;
    private javax.swing.JButton cmdcrear;
    private javax.swing.JButton cmdllenadoautomatico;
    private javax.swing.JButton cmdllenadomanual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtlongitud;
    private javax.swing.JTextArea txtresultado1;
    private javax.swing.JTextArea txtresultado2;
    // End of variables declaration//GEN-END:variables
}
