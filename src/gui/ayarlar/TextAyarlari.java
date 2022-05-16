package gui.ayarlar;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TextAyarlari {

    /*Text odaklanma
    ayarları
     */
    public static void setFocus(JTextField textfield, String deger) {
        if (textfield.getText().trim().equals(deger)) {
            textfield.setText("");
        }
    }

    public static void lostFocus(JTextField textfield, String deger) {
        if (textfield.getText().trim().equals("")) {
            textfield.setText(deger);
        }
    }

    /*Sadece sayı karakteri
    girilsin
     */
    public static void setOnlyNumber(JTextField textfield) {
        textfield.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();//klavyeden karakter okuma
                if (!Character.isDigit(c)) {//Girilen karakter sayı değilse
                    e.consume(); //Girilen karakteri devre dışı bırakıyor
                }
            }

        });
    }

    /*Sadece harf karakteri
    girilsin
     */
    public static void setOnlyAlphabetic(JTextField textfield) {
        textfield.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();//klavyeden karakter okuma
                if (!Character.isAlphabetic(c) && c != KeyEvent.VK_SPACE) {//Girilen karakter alfabetik değilse
                    e.consume(); //Girilen karakteri devre dışı bırakıyor
                }
            }

        });
    }

    //Labeldeki iconu/img'yi temizler
    public static void labelBosalt(JLabel label) {
        label.setIcon(null);
    }

    public static void textboxBosalt(JPanel panel) {
        Component[] components = panel.getComponents(); //paneldeki tüm componentleri component dizisine aktarır
        for (Component c : components) { //Component dizimi dolaş
            if (c instanceof JTextField) {//Componentlerden textfieldleri seç
                JTextField textField = (JTextField) c;//Textfieldi ata
                if (!textField.getText().trim().equals("")) { //textfield boş ve aktif ise
                    textField.setText("");
                }

            }
        }

    }

    /*Text limitlerini
    ayarlama
     */
    private static int limit;

    public static void setMaxLimit(JTextField textfield, int lim) {
        limit = lim;
        textfield.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null) {
                    return;
                }
                if ((getLength() + str.length()) <= limit) {
                    super.insertString(offs, str, a); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                }
            }

        });
    }

    public static boolean uzunlukSundanKucukMu(int lenght, String str) {
        return (str.length() < lenght);
    }

    /* 
    Text alanları kontrolü
     */
    public static boolean textAlanlariDolumu(JPanel panel) {
        Component[] components = panel.getComponents(); //paneldeki tüm componentleri component dizisine aktarır
        for (Component c : components) { //Component dizimi dolaş
            if (c instanceof JTextField) {//Componentlerden textfieldleri seç
                JTextField textField = (JTextField) c;//Textfieldi ata
                if (textField.getText().trim().equals("") && textField.isEnabled()) { //textfield boş ve aktif ise
                    return false;
                }

            }
        }
        return true;
    }
}
