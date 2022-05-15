
package database.transactions;

import database.DbVeriMerkezi;
import database.IBilgiController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HesapBilgileri extends DbVeriMerkezi implements IBilgiController {

    //Singleton   
    private static HesapBilgileri hesapBilgileri = null;

    public static HesapBilgileri getInstance() {       //Hesap bilgilerini döndüren method

        if (hesapBilgileri == null) {
            hesapBilgileri = new HesapBilgileri();
        }
        return hesapBilgileri;
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(super.kullaniciId == 0);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void girisYap(String musteriKimlik) {
        this.kullaniciyiAl(musteriKimlik);
        this.bakiyeAl();
        this.faturalariAl();
    }

    //Kullanıcı hesap bilgilerini alma işlemleri
    private void kullaniciyiAl(String musteriKimlik) {
        String query = "SELECT * FROM kullanicilar"
                + " WHERE "
                + "tc_no = '" + musteriKimlik + "'"
                + " OR "
                + "musteri_no = '" + musteriKimlik + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query); //Yazdığımız query i çalıştırır
            while (rs.next()) {//  sorguyu dolaşır ve bize bir değer dönülmüş ise
                super.kullaniciId = rs.getInt("kullanici_id"); //Veri tabanındaki kullanici_id sütunundaki veriyi VeriMerkezindeki kullaniciId değişkenine aktarır
                super.adSoyad = rs.getNString("ad_soyad");
                super.tcNo = rs.getNString("tc_no");
                super.telNo = rs.getNString("tel_no");
                super.musteriNo = rs.getNString("musteri_no");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Kullanıcı bakiye bilgilerini alma işlemi
    private void bakiyeAl() {
        if (this.bilgilerGecerliMi()) {
            String query = "SELECT * FROM kullanici_bakiye"
                    + " WHERE "
                    + "kullanici_id = '" + super.getKullaniciId() + "'";
            try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(query); //Yazdığımız query i çalıştırır
                while (rs.next()) {//  sorguyu dolaşır ve bize bir değer dönülmüş ise
                    super.bakiye = rs.getDouble("bakiye");
                }
            } catch (SQLException ex) {
                Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //Kullanıcı fatura bilgilerini alma işlemi
    private void faturalariAl(){
    if (this.bilgilerGecerliMi()) {
            String query = "SELECT * FROM kullanici_faturalar"
                    + " WHERE "
                    + "kullanici_id = '" + super.getKullaniciId() + "'";
            try {
                super.statement = super.connection.createStatement();
                ResultSet rs = statement.executeQuery(query); //Yazdığımız query i çalıştırır
                while (rs.next()) {//  sorguyu dolaşır ve bize bir değer dönülmüş ise
                    super.elektrikFaturasi=rs.getDouble("elektrik");
                    super.suFaturasi=rs.getDouble("su");
                    super.dogalgazFaturasi=rs.getDouble("dogalgaz");
                    super.internetFaturasi=rs.getDouble("internet");
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }

}
