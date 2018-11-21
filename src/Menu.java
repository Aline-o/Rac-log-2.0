/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        FacilDificil = new javax.swing.ButtonGroup();
        jpMenu = new javax.swing.JPanel();
        jrbFacil = new javax.swing.JRadioButton();
        jrbDificil = new javax.swing.JRadioButton();
        jbOkMenu = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        txtRacLog = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpMenu.setBackground(new java.awt.Color(204, 204, 255));

        FacilDificil.add(jrbFacil);
        jrbFacil.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 24)); // NOI18N
        jrbFacil.setText("Fácil");
        jrbFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFacilActionPerformed(evt);
            }
        });

        FacilDificil.add(jrbDificil);
        jrbDificil.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 24)); // NOI18N
        jrbDificil.setText("Difícil");
        jrbDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDificilActionPerformed(evt);
            }
        });

        jbOkMenu.setBackground(new java.awt.Color(153, 255, 153));
        jbOkMenu.setFont(new java.awt.Font("BankGothic Md BT", 0, 36)); // NOI18N
        jbOkMenu.setText("OK");
        jbOkMenu.setEnabled(false);
        jbOkMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOkMenuActionPerformed(evt);
            }
        });

        jbSair.setBackground(new java.awt.Color(255, 153, 153));
        jbSair.setFont(new java.awt.Font("BankGothic Md BT", 0, 36)); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        txtRacLog.setFont(new java.awt.Font("BankGothic Md BT", 1, 100)); // NOI18N
        txtRacLog.setForeground(new java.awt.Color(204, 0, 0));
        txtRacLog.setText("RAC-LOG");

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGap(499, 499, 499)
                        .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpMenuLayout.createSequentialGroup()
                                .addComponent(jbOkMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpMenuLayout.createSequentialGroup()
                                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jrbDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81))))
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(txtRacLog)))
                .addContainerGap(383, Short.MAX_VALUE))
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(txtRacLog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                .addComponent(jrbFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbOkMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jrbFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFacilActionPerformed
        jbOkMenu.setEnabled(true);
    }//GEN-LAST:event_jrbFacilActionPerformed

    private void jrbDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDificilActionPerformed
        jbOkMenu.setEnabled(true);
    }//GEN-LAST:event_jrbDificilActionPerformed

    private void jbOkMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkMenuActionPerformed
       
        Jogo jogo = new Jogo();
        
        if(jrbDificil.isSelected())
            jogo.faseDif();
            
        dispose();
        new Historia().setVisible(true);
        
    }//GEN-LAST:event_jbOkMenuActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSairActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup FacilDificil;
    private javax.swing.JButton jbOkMenu;
    private javax.swing.JButton jbSair;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JRadioButton jrbDificil;
    private javax.swing.JRadioButton jrbFacil;
    private javax.swing.JLabel txtRacLog;
    // End of variables declaration//GEN-END:variables
}
