/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class perbandinganMedia extends promosiProperti{
    public String aspek;
    public String nilaiTradisional;
    public String nilaiAR;
    public String kesimpulan;
    
    public perbandinganMedia(){}

    public perbandinganMedia(String aspek, String nilaiTradisional, String nilaiAR, String kesimpulan) {
        this.aspek = aspek;
        this.nilaiTradisional = nilaiTradisional;
        this.nilaiAR = nilaiAR;
        this.kesimpulan = kesimpulan;
    }

    public void setAspek(String aspek) {
        try {
            if(aspek.equals(null) || aspek.equals("")){
                JOptionPane.showMessageDialog(null, "Aspek wajib diisi");
                this.aspek="-";
            } else {
                this.aspek=aspek;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setNilaiTradisional(String nilaiTradisional) {
        try {
            if(nilaiTradisional.equals(null) || nilaiTradisional.equals("")){
                JOptionPane.showMessageDialog(null, "Nilai Tradisional wajib diisi");
                this.nilaiTradisional="-";
            } else {
                this.nilaiTradisional=nilaiTradisional;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setNilaiAR(String nilaiAR) {
        try {
            if(nilaiAR.equals(null) || nilaiAR.equals("")){
                JOptionPane.showMessageDialog(null, "Nilai AR wajib diisi");
                this.nilaiAR="-";
            } else {
                this.nilaiAR=nilaiAR;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setKesimpulan(String kesimpulan) {
        try {
            if(kesimpulan.equals(null) || kesimpulan.equals("")){
                JOptionPane.showMessageDialog(null, "Kesimpulan wajib diisi");
                this.kesimpulan="-";
            } else {
                this.kesimpulan=kesimpulan;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getAspek() {
        return aspek;
    }

    public String getNilaiTradisional() {
        return nilaiTradisional;
    }

    public String getNilaiAR() {
        return nilaiAR;
    }

    public String getKesimpulan() {
        return kesimpulan;
    }
    
    
    public String infoPerbandinganMedia(){
        String pesan = super.infoPromosiProperti()+
                    "\n Aspek : " + getAspek()+
                    "\n Nilai Tradisional : " + getNilaiTradisional()+
                    "\n Nilai AR : " + getNilaiAR()+
                    "\n Kesimpulan : " + getKesimpulan();
        return pesan;
    }
    
    public void infoPerbandinganMediaPopup(){
    String pesan ="\n Aspek : " + getAspek()+
                    "\n Nilai Tradisional : " + getNilaiTradisional()+
                    "\n Nilai AR : " + getNilaiAR()+
                    "\n Kesimpulan : " + getKesimpulan();
    JOptionPane.showMessageDialog(null, pesan, "Data Perbandingan Media",JOptionPane.INFORMATION_MESSAGE);
    }    
}
