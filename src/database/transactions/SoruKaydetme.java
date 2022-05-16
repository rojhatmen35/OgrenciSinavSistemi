package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import gui.ayarlar.TextAyarlari;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SoruKaydetme extends DbConnection implements IBilgiController {

    private String dersinAdi = null, uniteAdi = null, konuAdi = null, soruPath = null,cevap=null;
    private int sinifDuzeyi = 0, uniteNo = 0, konuNo = 0, soruNo = 0, kodNo = 0, sigma = 0;
    
    public boolean kayitOnaylandiMi() {
        if (this.bilgilerGecerliMi()) {
            this.kayitOnayla();
                return true;
        } else {
            return false;
        }

    }
    
    private void kayitOnayla() {
        String query = "INSERT INTO sorular (soru,sinif_duzeyi,"
                + "unite_no,konu_no,soru_no,kod_no,dersin_adi,unite_adi,konu_adi,cevap,sigma)"
                + " VALUES("
                + "'" + this.soruPath + "',"
                + "'" + this.sinifDuzeyi + "',"
                + "'" + this.uniteNo + "',"
                + "'" + this.konuNo + "',"
                + "'" + this.soruNo + "',"
                + "'" + this.kodNo + "',"
                + "'" + this.dersinAdi + "',"
                + "'" + this.uniteAdi + "',"
                + "'" + this.konuAdi + "',"
                + "'" + this.cevap + "',"
                + "'" + this.sigma + "'"
                + ")";

        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.dersinAdi == null
                || this.uniteAdi == null
                || this.konuAdi == null
                || this.cevap == null
                || this.soruPath == null
                || this.sinifDuzeyi == 0
                || this.uniteNo == 0
                || this.konuNo == 0
                || this.soruNo == 0
                || this.kodNo == 0
                );
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AdminHesapBilgileri getAdminHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCevap() {
        return cevap;
    }

    public void setCevap(String cevap) {
        this.cevap = cevap;
    }

    
    
    public String getDersinAdi() {
        return dersinAdi;
    }

    public void setDersinAdi(String dersinAdi) {
        this.dersinAdi = dersinAdi;
    }

    public String getUniteAdi() {
        return uniteAdi;
    }

    public void setUniteAdi(String uniteAdi) {
        this.uniteAdi = uniteAdi;
    }

    public String getKonuAdi() {
        return konuAdi;
    }

    public void setKonuAdi(String konuAdi) {
        this.konuAdi = konuAdi;
    }

    public String getSoruPath() {
        return soruPath;
    }

    public void setSoruPath(String soruPath) {
        this.soruPath = soruPath;
    }

    public int getSinifDuzeyi() {
        return sinifDuzeyi;
    }

    public void setSinifDuzeyi(int sinifDuzeyi) {
        this.sinifDuzeyi = sinifDuzeyi;
    }

    public int getUniteNo() {
        return uniteNo;
    }

    public void setUniteNo(int uniteNo) {
        this.uniteNo = uniteNo;
    }

    public int getKonuNo() {
        return konuNo;
    }

    public void setKonuNo(int konuNo) {
        this.konuNo = konuNo;
    }

    public int getSoruNo() {
        return soruNo;
    }

    public void setSoruNo(int soruNo) {
        this.soruNo = soruNo;
    }

    public int getKodNo() {
        return kodNo;
    }

    public void setKodNo(int kodNo) {
        this.kodNo = kodNo;
    }

    public int getSigma() {
        return sigma;
    }

    public void setSigma(int sigma) {
        this.sigma = sigma;
    }

}
