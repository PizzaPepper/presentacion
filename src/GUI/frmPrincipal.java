package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Equipo 5
 */
public class frmPrincipal extends javax.swing.JFrame {


    /* Inicializa el frmPrincipal y lo centra en la pantalla */
    public frmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Oriya MN", 0, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patolli Game");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        btnJugar.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Jugar.png"))); // NOI18N
        btnJugar.setText("Jugar");
        btnJugar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnJugar.setIconTextGap(20);
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 190, 50));

        btnAyuda.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ayuda.png"))); // NOI18N
        btnAyuda.setText("Como Jugar");
        btnAyuda.setIconTextGap(5);
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 190, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Metodo para que el boton jugar te lleve al frmJugar */
    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        new frmJugar().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        String msg="Patolli es uno de los juegos más antiguos de América prehispánica.\n "
                + "Lo jugaban los teotihuacanos , toltecas , los mayas y los aztecas.\n"
                + "Las reglas son:\n"
                + "-Se permiten de 2 a 4 jugadores máximo.\n"
                + "-Las fichas por jugador van a ser" +
                "configurables de un mínimo de 2 a un máximo de 6.\n"
                + "-En vez de dados se usan cañas.\n"
                + "-Si el jugador cae en una casilla con triángulo se paga doble apuesta.\n"
                + "-Si un jugador se queda sin fichas automáticamente pierde la partida.\n"
                + "-No puede haber dos fichas de diferente color en la misma casilla.\n";
        
        try {
             JOptionPane.showMessageDialog(null, msg);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnAyudaActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnJugar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
