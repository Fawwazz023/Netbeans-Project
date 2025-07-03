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
public class promosiProperti {
    public String idPromosi;
    public String namaPromosi;
    public String jenisPromosi;
    public String targetAudiens;
    public int biayaPromosi;
    public String durasiPromosi;
    
    public promosiProperti(){}

    public promosiProperti(String idPromosi, String namaPromosi, String jenisPromosi, String targetAudiens, int biayaPromosi, String durasiPromosi) {
        this.idPromosi = idPromosi;
        this.namaPromosi = namaPromosi;
        this.jenisPromosi = jenisPromosi;
        this.targetAudiens = targetAudiens;
        this.biayaPromosi = biayaPromosi;
        this.durasiPromosi = durasiPromosi;
    }

    public void setIdPromosi(String idPromosi) {
        try {
            if(idPromosi.equals(null) || idPromosi.equals("")){
                JOptionPane.showMessageDialog(null, "Id Promosi wajib diisi");
                this.idPromosi="-";
            } else {
                this.idPromosi=idPromosi;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setNamaPromosi(String namaPromosi) {
        try {
            if(namaPromosi.equals(null) || namaPromosi.equals("")){
                JOptionPane.showMessageDialog(null, "Nama Promosi wajib diisi");
                this.namaPromosi="-";
            } else {
                this.namaPromosi=namaPromosi;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setJenisPromosi(String jenisPromosi) {
        try {
            if(jenisPromosi.equals(null) || jenisPromosi.equals("")){
                JOptionPane.showMessageDialog(null, "Jenis Promosi wajib diisi");
                this.jenisPromosi="-";
            } else {
                this.jenisPromosi=jenisPromosi;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setTargetAudiens(String targetAudiens) {
        try {
            if(targetAudiens.equals(null) || targetAudiens.equals("")){
                JOptionPane.showMessageDialog(null, "Target Audiens wajib diisi");
                this.targetAudiens="-";
            } else {
                this.targetAudiens=targetAudiens;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setBiayaPromosi(int biayaPromosi) {
        try {
            // area koding benar
            if (biayaPromosi < 0) {
                JOptionPane.showMessageDialog(null, "Biaya Promosi tidak Boleh minus");
                this.biayaPromosi = 0;
            } else {
                this.biayaPromosi = biayaPromosi;
            }
        } catch (Exception salah) {
            // area kode jika salah
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setDurasiPromosi(String durasiPromosi) {
        try {
            if(durasiPromosi.equals(null) || durasiPromosi.equals("")){
                JOptionPane.showMessageDialog(null, "Durasi Promosi wajib diisi");
                this.durasiPromosi="-";
            } else {
                this.durasiPromosi=durasiPromosi;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getIdPromosi() {
        return idPromosi;
    }

    public String getNamaPromosi() {
        return namaPromosi;
    }

    public String getJenisPromosi() {
        return jenisPromosi;
    }

    public String getTargetAudiens() {
        return targetAudiens;
    }

    public int getBiayaPromosi() {
        return biayaPromosi;
    }

    public String getDurasiPromosi() {
        return durasiPromosi;
    }
    
    public String infoPromosiProperti(){
        String pesan ="\n ID Promosi : " + getIdPromosi()+
                    "\n Nama Properti : " + getNamaPromosi()+
                    "\n Jenis Promosi : " + getJenisPromosi()+
                    "\n Target Audiens : " + getTargetAudiens()+
                    "\n Biaya Promosi : " + getBiayaPromosi()+
                    "\n Durasi Promosi : " + getDurasiPromosi();
        return pesan;
    }
    
    public void infoPromosiPropertiPopup(){
    String pesan ="\n ID Promosi : " + getIdPromosi()+
                "\n Nama Properti : " + getNamaPromosi()+
                "\n Jenis Promosi : " + getJenisPromosi()+
                "\n Target Audiens : " + getTargetAudiens()+
                "\n Biaya Promosi : " + getBiayaPromosi()+
                "\n Durasi Promosi : " + getDurasiPromosi();
    JOptionPane.showMessageDialog(null, pesan, "Data Promosi",JOptionPane.INFORMATION_MESSAGE);
    }    
}
