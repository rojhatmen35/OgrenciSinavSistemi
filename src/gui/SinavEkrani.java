package gui;

import gui.ayarlar.IDuzenleyici;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public final class SinavEkrani extends javax.swing.JFrame implements IDuzenleyici {
    
    Timer t;
    
    public SinavEkrani() {
        initComponents();
        getEdits();
    }
    
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        sinavEkraniPaneli.setFocusable(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sinavEkraniPaneli = new javax.swing.JPanel();
        baslatButon = new javax.swing.JButton();
        labelTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sinavEkraniPaneli.setBackground(new java.awt.Color(102, 255, 204));
        sinavEkraniPaneli.setMinimumSize(new java.awt.Dimension(898, 652));
        sinavEkraniPaneli.setPreferredSize(new java.awt.Dimension(898, 652));
        sinavEkraniPaneli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        baslatButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        baslatButon.setText("Başlat");
        baslatButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baslatButonActionPerformed(evt);
            }
        });
        sinavEkraniPaneli.add(baslatButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 580, 100, 50));

        labelTime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sinavEkraniPaneli.add(labelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 210, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sinavEkraniPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sinavEkraniPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int k =600;
    private void baslatButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baslatButonActionPerformed
        t = new Timer(600, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelTime.setText(String.valueOf(k));
                k--;
            }
        });
        t.start();
    }//GEN-LAST:event_baslatButonActionPerformed
    
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
            java.util.logging.Logger.getLogger(SinavEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinavEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinavEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinavEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinavEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baslatButon;
    private javax.swing.JLabel labelTime;
    private javax.swing.JPanel sinavEkraniPaneli;
    // End of variables declaration//GEN-END:variables
}
