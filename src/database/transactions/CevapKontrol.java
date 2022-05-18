
package database.transactions;

import database.DbVeriMerkezi;
import database.IBilgiController;
import database.ISoruController;
import gui.ayarlar.TextAyarlari;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CevapKontrol extends DbVeriMerkezi implements IBilgiController,ISoruController {
   
    
    private static CevapKontrol cevapKontrol = null;

    public static CevapKontrol getInstance() {       

        if (cevapKontrol == null) {
            cevapKontrol = new CevapKontrol();
        }
        return cevapKontrol;
    }
    
    
    public void soruAl() {
        String query = "select * from sorular order by rand() limit 1";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query); //Yazdığımız query i çalıştırır
            while (rs.next()) {//  sorguyu dolaşır ve bize bir değer dönülmüş ise
                
                super.soru = rs.getString("soru"); 
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public CevapKontrol getCevapKontrol() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public boolean bilgilerGecerliMi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AdminHesapBilgileri getAdminHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
