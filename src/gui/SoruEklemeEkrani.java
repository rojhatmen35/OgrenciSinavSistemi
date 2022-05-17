package gui;

import database.IBilgiController;
import database.transactions.AdminHesapBilgileri;
import database.transactions.HesapBilgileri;
import database.transactions.KullaniciBasvuru;
import database.transactions.SoruKaydetme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public final class SoruEklemeEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private SoruKaydetme soruKaydetmeObject = null;
    public SoruEklemeEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        soruEklemeEkraniPaneli.setFocusable(true);
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return TextAyarlari.textAlanlariDolumu(soruEklemeEkraniPaneli);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AdminHesapBilgileri getAdminHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        soruEklemeEkraniPaneli = new javax.swing.JPanel();
        uniteNoText = new javax.swing.JTextField();
        ekleButon = new javax.swing.JButton();
        sinifDuzeyiText = new javax.swing.JTextField();
        konuNoText = new javax.swing.JTextField();
        soruNoText = new javax.swing.JTextField();
        kodNoText = new javax.swing.JTextField();
        dersAdiText = new javax.swing.JTextField();
        uniteAdiText = new javax.swing.JTextField();
        konuAdiText = new javax.swing.JTextField();
        cevapText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        imagePanel = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        open = new javax.swing.JMenuItem();
        clear = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        soruEklemeEkraniPaneli.setBackground(new java.awt.Color(0, 204, 204));
        soruEklemeEkraniPaneli.setMinimumSize(new java.awt.Dimension(898, 652));
        soruEklemeEkraniPaneli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        soruEklemeEkraniPaneli.add(uniteNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 150, 32));

        ekleButon.setBackground(new java.awt.Color(0, 0, 0));
        ekleButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ekleButon.setForeground(new java.awt.Color(242, 242, 242));
        ekleButon.setText("EKLE");
        ekleButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ekleButonMouseEntered(evt);
            }
        });
        ekleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleButonActionPerformed(evt);
            }
        });
        soruEklemeEkraniPaneli.add(ekleButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 117, 42));
        soruEklemeEkraniPaneli.add(sinifDuzeyiText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 150, 32));

        konuNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konuNoTextActionPerformed(evt);
            }
        });
        soruEklemeEkraniPaneli.add(konuNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 150, 32));

        soruNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soruNoTextActionPerformed(evt);
            }
        });
        soruEklemeEkraniPaneli.add(soruNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 150, 32));
        soruEklemeEkraniPaneli.add(kodNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 150, 32));
        soruEklemeEkraniPaneli.add(dersAdiText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, 150, 32));

        uniteAdiText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniteAdiTextActionPerformed(evt);
            }
        });
        soruEklemeEkraniPaneli.add(uniteAdiText, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 414, 150, 32));
        soruEklemeEkraniPaneli.add(konuAdiText, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 464, 150, 32));
        soruEklemeEkraniPaneli.add(cevapText, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 514, 150, 32));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Cevap:");
        soruEklemeEkraniPaneli.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, 90, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Sınıf Düzeyi:");
        soruEklemeEkraniPaneli.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 90, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Ünite No:");
        soruEklemeEkraniPaneli.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 90, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Konu No:");
        soruEklemeEkraniPaneli.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 90, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Soru No:");
        soruEklemeEkraniPaneli.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 90, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Kod No:");
        soruEklemeEkraniPaneli.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 90, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Dersin Adı:");
        soruEklemeEkraniPaneli.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 90, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Ünite Adı:");
        soruEklemeEkraniPaneli.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 90, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Konu Adı:");
        soruEklemeEkraniPaneli.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 90, 20));

        imagePanel.setBackground(new java.awt.Color(102, 255, 255));
        soruEklemeEkraniPaneli.add(imagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 390));

        jMenu1.setText("File");

        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        jMenu1.add(open);

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jMenu1.add(clear);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(soruEklemeEkraniPaneli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(soruEklemeEkraniPaneli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void konuNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konuNoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_konuNoTextActionPerformed

    private void soruNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soruNoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soruNoTextActionPerformed

    private void uniteAdiTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uniteAdiTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uniteAdiTextActionPerformed

    JLabel label = new JLabel();
    java.io.File f;
    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(jMenu1) == JFileChooser.APPROVE_OPTION) {
           f = fileChooser.getSelectedFile();

            label.setIcon(new ImageIcon(f.toString()));
            label.setHorizontalAlignment(JLabel.CENTER);

            imagePanel.getViewport().add(label);

        }


    }//GEN-LAST:event_openActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        TextAyarlari.labelBosalt(label);
    }//GEN-LAST:event_clearActionPerformed

    private void ekleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButonActionPerformed
        if (this.bilgilerGecerliMi()) {//Bilgiler geçerli ise
            this.basvuruyuGerceklestir();

        } else {
            Dialogs.bosOlamazMesaj(this);
        }
    }//GEN-LAST:event_ekleButonActionPerformed

    private void ekleButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ekleButonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ekleButonMouseEntered

    public SoruKaydetme getSoruKaydetmeObject() {
        if (this.soruKaydetmeObject == null) {
            soruKaydetmeObject = new SoruKaydetme();
        }
        return soruKaydetmeObject;
    }
    
    private void basvuruyuGerceklestir() {
        
        this.getSoruKaydetmeObject().setSinifDuzeyi(Integer.parseInt(this.sinifDuzeyiText.getText().trim()));
        this.getSoruKaydetmeObject().setUniteNo(Integer.parseInt(this.uniteNoText.getText().trim()));
        this.getSoruKaydetmeObject().setKonuNo(Integer.parseInt(this.konuNoText.getText().trim()));  
        this.getSoruKaydetmeObject().setSoruNo(Integer.parseInt(this.soruNoText.getText().trim()));
        this.getSoruKaydetmeObject().setKodNo(Integer.parseInt(this.kodNoText.getText().trim()));
             
        this.getSoruKaydetmeObject().setDersinAdi(this.dersAdiText.getText().trim());
        this.getSoruKaydetmeObject().setUniteAdi(this.uniteAdiText.getText().trim());
        this.getSoruKaydetmeObject().setKonuAdi(this.konuAdiText.getText().trim());
        this.getSoruKaydetmeObject().setCevap(this.cevapText.getText().trim());
        this.getSoruKaydetmeObject().setSoruPath(f.toString());

        if (this.getSoruKaydetmeObject().kayitOnaylandiMi()) {
            Dialogs.ozelMesaj(this, "Kayıt edilmiştir..\n");
            TextAyarlari.labelBosalt(label);
            TextAyarlari.textboxBosalt(soruEklemeEkraniPaneli);
           
        } else {
            Dialogs.ozelMesaj(this, "Başvurunuz kabul edilmemiştir..\nLütfen bilgileri kontrol ediniz");
        }

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
            java.util.logging.Logger.getLogger(SoruEklemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SoruEklemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SoruEklemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SoruEklemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SoruEklemeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cevapText;
    private javax.swing.JMenuItem clear;
    private javax.swing.JTextField dersAdiText;
    private javax.swing.JButton ekleButon;
    private javax.swing.JScrollPane imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField kodNoText;
    private javax.swing.JTextField konuAdiText;
    private javax.swing.JTextField konuNoText;
    private javax.swing.JMenuItem open;
    private javax.swing.JTextField sinifDuzeyiText;
    private javax.swing.JPanel soruEklemeEkraniPaneli;
    private javax.swing.JTextField soruNoText;
    private javax.swing.JTextField uniteAdiText;
    private javax.swing.JTextField uniteNoText;
    // End of variables declaration//GEN-END:variables
}
