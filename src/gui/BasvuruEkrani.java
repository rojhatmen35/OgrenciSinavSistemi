package gui;

import database.IBilgiController;
import database.transactions.AdminHesapBilgileri;
import database.transactions.HesapBilgileri;
import database.transactions.KullaniciBasvuru;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;

public final class BasvuruEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private KullaniciBasvuru kullaniciBasvuruObject = null;

    public BasvuruEkrani() {
        initComponents();
        getEdits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basvuruEkraniPaneli = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adSoyadText = new javax.swing.JTextField();
        tcNoText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telNoText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        soruComboBox = new javax.swing.JComboBox<>();
        guvenlikCevapText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        basvurButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basvuruEkraniPaneli.setBackground(new java.awt.Color(255, 255, 204));
        basvuruEkraniPaneli.setMinimumSize(new java.awt.Dimension(730, 502));
        basvuruEkraniPaneli.setPreferredSize(new java.awt.Dimension(730, 502));
        basvuruEkraniPaneli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Ad-Soyad:");
        basvuruEkraniPaneli.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 46, 200, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Kişisel Bilgiler");
        basvuruEkraniPaneli.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 0, 200, 40));

        adSoyadText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvuruEkraniPaneli.add(adSoyadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 46, 310, 40));

        tcNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvuruEkraniPaneli.add(tcNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 114, 310, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("T.C. No:");
        basvuruEkraniPaneli.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 114, 200, 40));

        telNoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvuruEkraniPaneli.add(telNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 182, 310, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Güvenlik Sorusu:");
        basvuruEkraniPaneli.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 274, 200, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Güvenlik Sorusu");
        basvuruEkraniPaneli.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 228, 200, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Telefon No:");
        basvuruEkraniPaneli.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 182, 200, 40));

        soruComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        soruComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evcil Hayvanınızın İsmi?", "En Sevdiğiniz Nesne_", "İlkokul Öğretmeninizin Adı Soyadı?", "Yaşamak İstediğiniz Yer?", "Ya da Rastgele Cümle Girin" }));
        basvuruEkraniPaneli.add(soruComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 274, 310, 40));

        guvenlikCevapText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvuruEkraniPaneli.add(guvenlikCevapText, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 326, 313, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Cevap:");
        basvuruEkraniPaneli.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 326, 200, 40));

        basvurButon.setBackground(new java.awt.Color(102, 153, 255));
        basvurButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        basvurButon.setText("Başvur");
        basvurButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        basvurButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                basvurButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                basvurButonMouseExited(evt);
            }
        });
        basvurButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvurButonActionPerformed(evt);
            }
        });
        basvuruEkraniPaneli.add(basvurButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 378, 125, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPaneli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvuruEkraniPaneli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void basvurButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButonMouseEntered
        ButonAyarlari.setBg(basvurButon, Color.yellow);
    }//GEN-LAST:event_basvurButonMouseEntered

    private void basvurButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButonMouseExited
        ButonAyarlari.setOriginalBg(basvurButon);
    }//GEN-LAST:event_basvurButonMouseExited

    private void basvurButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvurButonActionPerformed
        if (this.bilgilerGecerliMi()) {//Bilgiler geçerli ise
            this.basvuruyuGerceklestir();

        } else {
            Dialogs.bosOlamazMesaj(this);
        }
    }//GEN-LAST:event_basvurButonActionPerformed

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);//Ekranı ortalar
        basvuruEkraniPaneli.setFocusable(true);//Panele focuslanır
        TextAyarlari.setOnlyAlphabetic(adSoyadText);
        TextAyarlari.setOnlyNumber(tcNoText);
        TextAyarlari.setOnlyNumber(telNoText);
        TextAyarlari.setMaxLimit(tcNoText, 11);
        TextAyarlari.setMaxLimit(telNoText, 11);

    }

    @Override
    public AdminHesapBilgileri getAdminHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    public KullaniciBasvuru getKullaniciBasvuruObject() {
        if (this.kullaniciBasvuruObject == null) {
            kullaniciBasvuruObject = new KullaniciBasvuru();
        }
        return kullaniciBasvuruObject;
    }

    private void basvuruyuGerceklestir() {
        //Kişisel Bilgiler
        this.getKullaniciBasvuruObject().setAdSoyad(this.adSoyadText.getText().trim());
        this.getKullaniciBasvuruObject().setTcNo(this.tcNoText.getText().trim());
        this.getKullaniciBasvuruObject().setTelNo(this.telNoText.getText().trim());

        //Güvenlik Bilgileri
        this.getKullaniciBasvuruObject().setGuvenlikSorusu(String.valueOf(this.soruComboBox.getSelectedItem()));
        this.getKullaniciBasvuruObject().setGuvenlikCevap(this.guvenlikCevapText.getText().trim());

        //Sistem tarafından verilecek bilgiler
        this.getKullaniciBasvuruObject().setOgrenciNo(this.randomOgrenciNo());
        this.getKullaniciBasvuruObject().setSifre(this.randomSifre());

        if (this.getKullaniciBasvuruObject().basvuruOnaylandiMi()) {
            Dialogs.ozelMesaj(this, "Başvurunuz kabul edilmiştir..\n"
                    + "Ogrenci Numaranız:" + this.getKullaniciBasvuruObject().getOgrenciNo() + "\nŞifreniz:" + this.getKullaniciBasvuruObject().getSifre());
            ActionAyarlari.setVisible(this, new GirisEkrani());
        } else {
            Dialogs.ozelMesaj(this, "Başvurunuz kabul edilmemiştir..\nLütfen bilgileri kontrol ediniz");
        }

    }

    private String randomOgrenciNo() {
        String ogrenciNo;
        do {
            ogrenciNo = String.valueOf(1000000 + (int) (Math.random() * 9000000));
        } while (this.getKullaniciBasvuruObject().musteriNoTablodaVarMi());
        return ogrenciNo;
    }

    private String randomSifre() {
        String sifre;
        sifre = String.valueOf(1000 + (int) (Math.random() * 9000));
        return sifre;
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return TextAyarlari.textAlanlariDolumu(basvuruEkraniPaneli);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasvuruEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adSoyadText;
    private javax.swing.JButton basvurButon;
    private javax.swing.JPanel basvuruEkraniPaneli;
    private javax.swing.JTextField guvenlikCevapText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> soruComboBox;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JTextField telNoText;
    // End of variables declaration//GEN-END:variables
}
