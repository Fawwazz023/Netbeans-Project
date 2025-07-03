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
public class komponenAplikasi extends promosiProperti{
    public String namaKomponen;
    public String fungsi;
    
    public komponenAplikasi(){}

    public void setNamaKomponen(String namaKomponen) {
        try {
            if(namaKomponen.equals(null) || namaKomponen.equals("")){
                JOptionPane.showMessageDialog(null, "Nama Komponen wajib diisi");
                this.namaKomponen="-";
            } else {
                this.namaKomponen=namaKomponen;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public void setFungsi(String fungsi) {
        try {
            if(fungsi.equals(null) || fungsi.equals("")){
                JOptionPane.showMessageDialog(null, "Fungsi wajib diisi");
                this.fungsi="-";
            } else {
                this.fungsi=fungsi;
            }
        } catch (Exception salah) {
            JOptionPane.showMessageDialog(null, salah.getMessage());
        }
    }

    public String getNamaKomponen() {
        return namaKomponen;
    }

    public String getFungsi() {
        return fungsi;
    }
    
    public String infoKomponenAplikasi(){
        String pesan = super.infoPromosiProperti()+
                    "\n Nama Komponen : " + getNamaKomponen()+
                    "\n Fungsi : " + getFungsi();
        return pesan;
    }
    
    public void infoKomponenAplikasiPopup(){
    String pesan ="\n Nama Komponen : " + getNamaKomponen()+
                    "\n Fungsi : " + getFungsi();
    JOptionPane.showMessageDialog(null, pesan, "Data Komponen Aplikasi",JOptionPane.INFORMATION_MESSAGE);
    }    
}
