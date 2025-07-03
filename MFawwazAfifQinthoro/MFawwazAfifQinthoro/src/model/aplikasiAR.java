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
public class aplikasiAR extends promosiProperti{
    public String namaAplikasi;
    public String versi;
    public String platform;
    public String fiturUtama;
    public String pengembang;
    
    public aplikasiAR(){}

    public aplikasiAR(String namaAplikasi, String versi, String platform, String fiturUtama, String pengembang) {
        this.namaAplikasi = namaAplikasi;
        this.versi = versi;
        this.platform = platform;
        this.fiturUtama = fiturUtama;
        this.pengembang = pengembang;
    }

    public void setNamaAplikasi(String namaAplikasi) {
        try {
            if(namaAplikasi.equals(null) || namaAplikasi.equals("")){
                JOptionPane.showMessageDialog(null, "Nama Aplikasi wajib diisi");
                this.namaAplikasi="-";
            } else {
                this.namaAplikasi=namaAplikasi;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setVersi(String versi) {
        try {
            if(versi.equals(null) || versi.equals("")){
                JOptionPane.showMessageDialog(null, "Versi wajib diisi");
                this.versi="-";
            } else {
                this.versi=versi;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setPlatform(String platform) {
        try {
            if(platform.equals(null) || platform.equals("")){
                JOptionPane.showMessageDialog(null, "Platform wajib diisi");
                this.platform="-";
            } else {
                this.platform=platform;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setFiturUtama(String fiturUtama) {
        try {
            if(fiturUtama.equals(null) || fiturUtama.equals("")){
                JOptionPane.showMessageDialog(null, "Fitur Utama wajib diisi");
                this.fiturUtama="-";
            } else {
                this.fiturUtama=fiturUtama;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setPengembang(String pengembang) {
        try {
            if(pengembang.equals(null) || pengembang.equals("")){
                JOptionPane.showMessageDialog(null, "Pengembang wajib diisi");
                this.pengembang="-";
            } else {
                this.pengembang=pengembang;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getNamaAplikasi() {
        return namaAplikasi;
    }

    public String getVersi() {
        return versi;
    }

    public String getPlatform() {
        return platform;
    }

    public String getFiturUtama() {
        return fiturUtama;
    }

    public String getPengembang() {
        return pengembang;
    }
    
    public String infoAplikasiAR(){
        String pesan = super.infoPromosiProperti()+
                    "\n Nama Aplikasi : " + getNamaAplikasi()+
                    "\n Versi : " + getVersi()+
                    "\n Platform : " + getPlatform()+
                    "\n Fitur Utama : " + getFiturUtama()+
                    "\n Pengembang : " + getPengembang();
        return pesan;
    }
    
    public void infoAplikasiARPopup(){
    String pesan ="\n Nama Aplikasi : " + getNamaAplikasi()+
                    "\n Versi : " + getVersi()+
                    "\n Platform : " + getPlatform()+
                    "\n Fitur Utama : " + getFiturUtama()+
                    "\n Pengembang : " + getPengembang();
    JOptionPane.showMessageDialog(null, pesan, "Data Aplikasi AR",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
