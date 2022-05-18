package gui;

import database.ISoruController;
import database.transactions.CevapKontrol;
import database.transactions.SoruKaydetme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public final class SinavEkrani extends javax.swing.JFrame implements IDuzenleyici, ISoruController {

    private CevapKontrol cevapKontrolObject = null;
    Timer t;

    public SinavEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        sinavEkraniPaneli.setFocusable(true);
        ButonAyarlari.butonVisible(bitirButon, false);
        ButonAyarlari.butonVisible(cevaplaButon, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sinavEkraniPaneli = new javax.swing.JPanel();
        baslatButon = new javax.swing.JButton();
        labelTime = new javax.swing.JLabel();
        soruPanel = new javax.swing.JScrollPane();
        bitirButon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cevapText = new javax.swing.JTextField();
        cevaplaButon = new javax.swing.JButton();
        geriIcon = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sinavEkraniPaneli.setBackground(new java.awt.Color(56, 246, 245));
        sinavEkraniPaneli.setMinimumSize(new java.awt.Dimension(898, 652));
        sinavEkraniPaneli.setPreferredSize(new java.awt.Dimension(898, 652));
        sinavEkraniPaneli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        baslatButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        baslatButon.setText("Başlat");
        baslatButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baslatButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baslatButonActionPerformed(evt);
            }
        });
        sinavEkraniPaneli.add(baslatButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 100, 50));

        labelTime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sinavEkraniPaneli.add(labelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 210, 70));
        sinavEkraniPaneli.add(soruPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 880, 400));

        bitirButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bitirButon.setText("Bitir");
        bitirButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bitirButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitirButonActionPerformed(evt);
            }
        });
        sinavEkraniPaneli.add(bitirButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 100, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Cevap:");
        sinavEkraniPaneli.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 80, 30));

        cevapText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        sinavEkraniPaneli.add(cevapText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 90, 30));

        cevaplaButon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cevaplaButon.setText("Cevapla");
        cevaplaButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cevaplaButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cevaplaButonActionPerformed(evt);
            }
        });
        sinavEkraniPaneli.add(cevaplaButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 90, 30));

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/backIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });
        sinavEkraniPaneli.add(geriIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/settingsIcon.png"))); // NOI18N
        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
        });
        sinavEkraniPaneli.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, -1, -1));

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

    int k = 600;
    private void baslatButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baslatButonActionPerformed
        t = new Timer(600, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelTime.setText(String.valueOf(k));
                k--;
            }
        });
        t.start();

        soruGetir();

        ButonAyarlari.butonVisible(baslatButon, false);
        ButonAyarlari.butonVisible(bitirButon, true);
        ButonAyarlari.butonVisible(cevaplaButon, true);

    }//GEN-LAST:event_baslatButonActionPerformed

    private void soruGetir() {

        getCevapKontrol().soruAl();
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(TextAyarlari.binaryUnicodeToString(getCevapKontrol().getSoru())));
        label.setHorizontalAlignment(JLabel.CENTER);
        soruPanel.getViewport().add(label);
    }

    private void bitirButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bitirButonActionPerformed
        ActionAyarlari.setVisible(this, new GirisEkrani());
    }//GEN-LAST:event_bitirButonActionPerformed
    int soruSayisi = 1;
    private void cevaplaButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cevaplaButonActionPerformed
        if (soruSayisi<11) {
            soruGetir();
            soruSayisi++;
        }else{
        Dialogs.ozelMesaj(this, "Sınav Bitmiştir..");
        t.stop();
        }
    }//GEN-LAST:event_cevaplaButonActionPerformed

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this, new GirisEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        ActionAyarlari.setVisible(this, new AyarlarEkrani());
    }//GEN-LAST:event_settingsMouseClicked

    @Override
    public CevapKontrol getCevapKontrol() {
        return CevapKontrol.getInstance();
    }

    public CevapKontrol getCevapKontrolObject() {
        if (this.cevapKontrolObject == null) {
            cevapKontrolObject = new CevapKontrol();
        }
        return cevapKontrolObject;
    }

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
    private javax.swing.JButton bitirButon;
    private javax.swing.JTextField cevapText;
    private javax.swing.JButton cevaplaButon;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel settings;
    private javax.swing.JPanel sinavEkraniPaneli;
    private javax.swing.JScrollPane soruPanel;
    // End of variables declaration//GEN-END:variables
}
